package ilimboxAndroid.ilimbox.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import ilimboxAndroid.ilimbox.R
import ilimboxAndroid.ilimbox.activities.CourseDetailActivity
import ilimboxAndroid.ilimbox.app.Constants.PER_PAGE
import ilimboxAndroid.ilimbox.interfaces.ClickListener
import ilimboxAndroid.ilimbox.models.UserAccount
import ilimboxAndroid.ilimbox.models.enrol.CourseSearch
import ilimboxAndroid.ilimbox.models.enrol.SearchedCourseDetail
import ilimboxAndroid.ilimbox.network.APIClient
import ilimboxAndroid.ilimbox.network.MoodleServices
import kotlinx.android.synthetic.main.fragment_discussion.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*


class SearchCourseForEnrolFragment : Fragment(), ClassNumberInterface {
    var containsMore = true
    private var page = 0
    private var mPreviousSearch = ""
    private var mLoading = false

    private lateinit var editText: EditText
    private lateinit var searchCourseAdapter: SearchCourseAdapter
    private lateinit var swipeRefresh: SwipeRefreshLayout
    private lateinit var empty: TextView
    private lateinit var moodleServices: MoodleServices

    private var call: Call<CourseSearch>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val retrofit = APIClient.getRetrofitInstance()
        moodleServices = retrofit.create(MoodleServices::class.java)
    }

    override fun onStart() {
        super.onStart()
        requireActivity().title = "Войти"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_course, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        empty = view.findViewById(R.id.empty)
        editText = view.findViewById(R.id.course_search_edit_text)
        swipeRefresh = view.findViewById(R.id.swipeRefreshLayout)
        val mButton = view.findViewById<View>(R.id.course_search_button)
        val mRecyclerView = view.findViewById<RecyclerView>(R.id.searched_courses)

        val layoutManager = LinearLayoutManager(activity)
        mRecyclerView.layoutManager = layoutManager
        mRecyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val visibleItemCount = layoutManager.childCount
                val totalItemCount = layoutManager.itemCount
                val pastVisibleItems = layoutManager.findFirstVisibleItemPosition()
                if (!mLoading) {
                    if (visibleItemCount + pastVisibleItems >= totalItemCount) {
                        mLoading = true
                        getSearchCourses(mPreviousSearch)
                    }
                }
            }
        })

        searchCourseAdapter = SearchCourseAdapter(requireActivity())
        mRecyclerView.adapter = searchCourseAdapter
        searchCourseAdapter.setClickListener { `object`: Any?, _: Int ->
            val course = `object` as SearchedCourseDetail?
            val intent = Intent(activity, CourseDetailActivity::class.java)
            intent.putExtra(CourseDetailActivity.INTENT_ENROL_COURSE_KEY, course)
            startActivity(intent)
            true
        }

        swipeRefresh.setOnRefreshListener {
            page = 0
            searchCourseAdapter.clearCourses()
            mLoading = true
            containsMore = true
            getSearchCourses(mPreviousSearch)
        }

        editText.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                performSearch()
                return@setOnEditorActionListener true
            }
            false
        }
        mButton.setOnClickListener { performSearch() }

        swipeRefresh.post(Runnable { swipeRefresh.setRefreshing(true)
            page = 0
            searchCourseAdapter.clearCourses()
            mLoading = true
            containsMore = true
            getSearchCourses(mPreviousSearch)
        })
    }

    private fun performSearch() {
        val searchText = editText.text.toString().trim { it <= ' ' }
        if (searchText.isEmpty()) {
            return
        }

        mPreviousSearch = searchText
        page = 0
        searchCourseAdapter.clearCourses()
        mLoading = true
        containsMore = true

        call?.cancel()
        getSearchCourses(searchText)
    }

    private fun getSearchCourses(searchString: String) {
        empty.visibility = View.GONE
        call = moodleServices.searchCourses(
            UserAccount.token,
            searchString,
            page,
            PER_PAGE
        )
        if (!containsMore) {
            return
        }
        swipeRefresh.isRefreshing = true
        call?.enqueue(object : Callback<CourseSearch> {
            override fun onResponse(call: Call<CourseSearch>, response: Response<CourseSearch>) {
                if (response.body() == null) {
                    if (page == 0) {
                        empty.visibility = View.VISIBLE
                        containsMore = false
                    }
                    return
                }

                val totalResults = response.body()!!.total
                val fetchedResults: Int = (page + 1) * PER_PAGE
                val matchedCourses = response.body()!!.courses

                if (fetchedResults >= totalResults) {
                    containsMore = false
                }

                if (matchedCourses.isEmpty()) {
                    empty.visibility = View.VISIBLE
                    containsMore = false
                }

                if (page == 0) {
                    searchCourseAdapter.clearCourses()
                }

                searchCourseAdapter.addExtraCourses(matchedCourses)
                swipeRefresh.isRefreshing = false
                mLoading = false
                page++
            }

            override fun onFailure(call: Call<CourseSearch?>, t: Throwable) {
                mLoading = false
                swipeRefresh.isRefreshing = false
                /*Toast.makeText(
                    activity,
                    resources.getText(R.string.net_req_failed),
                    Toast.LENGTH_SHORT
                ).show()*/
            }
        })
    }

    private class SearchCourseAdapter(
        context: Context,
    ) : RecyclerView.Adapter<SearchCourseAdapter.SearchCourseViewHolder>() {
        private val mLayoutInflater: LayoutInflater = LayoutInflater.from(context)
        private var mCourses: MutableList<SearchedCourseDetail> = mutableListOf()
        private lateinit var mClickListener: ClickListener


        fun addExtraCourses(courses: List<SearchedCourseDetail>) {
            mCourses.addAll(courses)
            if(mCourses.size != 0) {
                for(it in mCourses) {
                    Log.d("ololo", "course name = " + it.displayName + " course id = " + it.id)
                }
            }
            notifyDataSetChanged()
        }

        fun clearCourses() {
            mCourses.clear()
            notifyDataSetChanged()
        }

        fun setClickListener(clickListener: ClickListener) {
            mClickListener = clickListener
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchCourseViewHolder {
            return SearchCourseViewHolder(
                mLayoutInflater.inflate(R.layout.row_search_course, parent, false)
            )
        }

        override fun onBindViewHolder(holder: SearchCourseViewHolder, position: Int) {
            val course = mCourses[position]
            holder.mSearchCourseDisplayName.text = course.fullName
        }

        override fun getItemCount(): Int  = mCourses.size

        inner class SearchCourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val mSearchCourseDisplayName: TextView =
                itemView.findViewById(R.id.search_course_display_name)

            init {
                mSearchCourseDisplayName.setOnClickListener {
                    val pos = layoutPosition
                    mClickListener.onClick(mCourses[pos], pos)
                }
            }
        }
    }

    companion object {
        fun newInstance(): SearchCourseForEnrolFragment = SearchCourseForEnrolFragment()
    }

    override fun setCourses(number: Int) {

    }
}