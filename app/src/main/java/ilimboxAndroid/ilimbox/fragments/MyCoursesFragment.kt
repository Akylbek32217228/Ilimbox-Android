package ilimboxAndroid.ilimbox.fragments

import android.annotation.SuppressLint
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.Spannable
import android.text.SpannableString
import android.text.TextWatcher
import android.text.style.RelativeSizeSpan
import android.util.Log
import android.view.*
import android.view.inputmethod.InputMethodManager
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import ilimboxAndroid.ilimbox.R
import ilimboxAndroid.ilimbox.activities.CourseDetailActivity
import ilimboxAndroid.ilimbox.exceptions.InvalidTokenException
import ilimboxAndroid.ilimbox.helper.CourseDataHandler
import ilimboxAndroid.ilimbox.helper.CourseDownloader
import ilimboxAndroid.ilimbox.helper.CourseRequestHandler
import ilimboxAndroid.ilimbox.interfaces.ClickListener
import ilimboxAndroid.ilimbox.models.course.Course
import ilimboxAndroid.ilimbox.models.course.CourseSection
import ilimboxAndroid.ilimbox.utils.UserUtils
import io.realm.Realm
import kotlinx.android.synthetic.main.fragment_my_courses.*
import kotlinx.android.synthetic.main.row_course.view.*
import kotlinx.android.synthetic.main.row_course_module.*
import kotlinx.coroutines.*
import java.io.IOException
import java.util.*
import kotlin.collections.ArrayList


class MyCoursesFragment : Fragment(), ClassNumberInterface {
    private lateinit var realm: Realm
    private lateinit var courseDataHandler: CourseDataHandler

    private var coursesUpdated = 0
    private var courses: MutableList<Course> = ArrayList()
    private lateinit var mAdapter: Adapter

    // Activity result launchers
    private val courseDetailActivityLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                mAdapter.filterCoursesByName(courses, searchCourseET.text.toString())
            }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onStart() {
        super.onStart()
        requireActivity().title = "Мои курсы"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        realm = Realm.getDefaultInstance()
        return inflater.inflate(R.layout.fragment_my_courses, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.my_courses_menu, menu)
        for (i in 0 until menu.size()) {
            val item = menu.getItem(i)
            val spanString = SpannableString(menu.getItem(i).title.toString())
            val end = spanString.length
            spanString.setSpan(RelativeSizeSpan(0.7f), 0, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            item.title = spanString
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.mark_all_as_read -> {
                val courses = courseDataHandler.courseList
                CoroutineScope(Dispatchers.Default).launch {
                    val realm = Realm.getDefaultInstance()
                    val courseDataHandler = CourseDataHandler(realm)
                    courseDataHandler.markAllAsRead();
                    realm.close()

                    CoroutineScope(Dispatchers.Main).launch {
                        //Toast.makeText(requireActivity(), "Marked all as read", Toast.LENGTH_SHORT).show()
                        mAdapter.courses = this@MyCoursesFragment.courseDataHandler.courseList
                    }
                }
                true
            }
            else -> false
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        courseDataHandler = CourseDataHandler(realm)
        courses = courseDataHandler.courseList

        val nestedFragment : Fragment = ClassNumberFragment.newInstance(this)
        val transaction : FragmentTransaction = childFragmentManager.beginTransaction()
        transaction.replace(R.id.child_fragment_container, nestedFragment).commit()


        // Set up the adapter
        mAdapter = Adapter(requireActivity(), courses)
        //mAdapter.courses = courses
        mAdapter.filterCoursesByName(courses, "8")
        mAdapter.clickListener = ClickListener { `object`: Any, position: Int ->
            val course = `object` as Course
            val intent = Intent(activity, CourseDetailActivity::class.java)
            intent.putExtra(CourseDetailActivity.INTENT_COURSE_ID_KEY, course.id)
            courseDetailActivityLauncher.launch(intent)
            return@ClickListener true
        }

        mAdapter.downloadClickListener = ClickListener { `object`: Any, position: Int ->
            val course = `object` as Course
            if (course.downloadStatus != -1) return@ClickListener false
            course.downloadStatus = 0
            mAdapter.notifyItemChanged(position)
            val courseDownloader = CourseDownloader(activity, courseDataHandler.getCourseName(course.id))
            courseDownloader.setDownloadCallback(object : CourseDownloader.DownloadCallback {
                override fun onCourseDataDownloaded() {
                    course.downloadedFiles = courseDownloader.getDownloadedContentCount(course.id)
                    course.totalFiles = courseDownloader.getTotalContentCount(course.id)
                    if (course.totalFiles == course.downloadedFiles) {
                        //Toast.makeText(activity, "All files already downloaded", Toast.LENGTH_SHORT).show()
                        course.downloadStatus = -1
                    } else {
                        course.downloadStatus = 1
                    }
                    mAdapter.notifyItemChanged(position)
                }

                override fun onCourseContentDownloaded() {
                    course.downloadedFiles = course.downloadedFiles + 1
                    if (course.downloadedFiles == course.totalFiles) {
                        course.downloadStatus = -1
                        courseDownloader.unregisterReceiver()
                        //todo notification all files downloaded for this course
                    }
                    mAdapter.notifyItemChanged(position)
                }

                override fun onFailure() {
                    /*Toast.makeText(activity, "Check your internet connection", Toast.LENGTH_SHORT)
                            .show()*/
                    course.downloadStatus = -1
                    mAdapter.notifyItemChanged(position)
                    courseDownloader.unregisterReceiver()
                }
            })
            courseDownloader.downloadCourseData(course.id)
            return@ClickListener true
        }

        recyclerView.adapter = mAdapter
        recyclerView.layoutManager = GridLayoutManager(activity, 2)

        searchCourseET.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable) {
                val searchText = s.toString().toLowerCase(Locale.ROOT).trim { it <= ' ' }
                mAdapter.filterCoursesByName(courses, searchText)
                if (searchText.isNotEmpty()) {
                    searchIcon.setImageResource(R.drawable.ic_cancel_black_24dp)
                    searchIcon.setOnClickListener {
                        searchCourseET.setText("")
                        searchIcon.setImageResource(R.drawable.ic_search)
                        searchIcon.setOnClickListener(null)
                        val inputManager = requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE)
                                as? InputMethodManager
                        val currentFocus = requireActivity().currentFocus
                        if (currentFocus != null) {
                            inputManager?.hideSoftInputFromWindow(currentFocus.windowToken,
                                    InputMethodManager.HIDE_NOT_ALWAYS)
                        }
                    }
                } else {
                    searchIcon.setImageResource(R.drawable.ic_search)
                    searchIcon.setOnClickListener(null)
                }
            }
        })

        swipeRefreshLayout.setOnRefreshListener {
            swipeRefreshLayout.isRefreshing = true
            refreshCourses()
        }

        checkEmpty()
    }

    private fun checkEmpty() {
        if (courses.isEmpty()) {
            empty?.visibility = View.VISIBLE
        } else {
            empty?.visibility = View.GONE
        }
    }


    private fun refreshCourses() {
        lifecycleScope.launch {
            launch(Dispatchers.IO) { // lifecycle scope allows cancellation of this scope
                val courseRequestHandler = CourseRequestHandler()
                try {
                    val courseList = courseRequestHandler.fetchCourseListSync()
                    courses.clear()
                    courses.addAll(courseList)
                    Log.i(TAG, "${courseList.size} courses")
                    val realm = Realm.getDefaultInstance() // tie a realm instance to this thread
                    val courseDataHandler = CourseDataHandler(realm)
                    courseDataHandler.replaceCourses(courseList)
                    realm.close()
                    checkEmpty()
                    updateCourseContent()
                } catch (e: Exception) {
                    Log.e(TAG, "", e)
                    withContext(Dispatchers.Main) {
                        //Toast.makeText(requireActivity(), "Error: ${e.message}", Toast.LENGTH_SHORT).show()
                        if (e is InvalidTokenException) {
                            UserUtils.logout()
                            UserUtils.clearBackStackAndLaunchTokenActivity(requireActivity())
                        }
                    }
                } finally {
                    withContext(Dispatchers.Main) {
                        swipeRefreshLayout?.isRefreshing = false
                    }
                }
            }
        }
    }

    private suspend fun updateCourseContent() {
        Log.d("ololo", "updateCourseContent")
        withContext(Dispatchers.IO) {
            Log.i(TAG, "Fetching course contents")
            val courseRequestHandler = CourseRequestHandler()
            val promises = courses.map map@{
                async innerAsync@{
                    val sections: MutableList<CourseSection>
                    try {
                        sections = courseRequestHandler.getCourseDataSync(it.id)
                    } catch (e: IOException) {
                        Log.e(TAG, "IOException when syncing course: ${it.id}}", e)
                        return@innerAsync false
                    }

                    val realm = Realm.getDefaultInstance() // tie a realm instance to this thread
                    val courseDataHandler = CourseDataHandler(realm)
                    val newPartsInSections = courseDataHandler.isolateNewCourseData(it.id, sections)
                    courseDataHandler.replaceCourseData(it.id, sections)

                    realm.close() // let's not forget to do this
                    if (newPartsInSections.isNotEmpty()) {
                        return@innerAsync true
                    }
                    return@innerAsync false
                }
            }

            coursesUpdated = promises.awaitAll().fold(0) { i, x -> if (x) i + 1 else i }

            withContext(Dispatchers.Main) {
                swipeRefreshLayout?.isRefreshing = false
                mAdapter.filterCoursesByName(courses, searchCourseET.text.toString())
                val message: String = if (coursesUpdated == 0) {
                    getString(R.string.upToDate)
                } else {
                    resources.getQuantityString(R.plurals.noOfCoursesUpdated, coursesUpdated,
                            coursesUpdated)
                }
                //Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        realm.close()
    }

    private inner class Adapter constructor(
            val context: Context,
            courseList: List<Course>
    ) : RecyclerView.Adapter<Adapter.MyViewHolder>() {
        private val inflater: LayoutInflater = LayoutInflater.from(context)

        var clickListener: ClickListener? = null
        var downloadClickListener: ClickListener? = null
        var courses: List<Course> = ArrayList()
            set(value) {
                for (i in field.indices) {
                    field[i].downloadStatus = -1
                }
                field = sortCourses(value)
                notifyDataSetChanged()
            }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            return MyViewHolder(inflater.inflate(R.layout.row_course, parent, false))
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.bind(courses[position])
        }

        override fun getItemCount(): Int {
            return courses.size
        }

        private fun sortCourses(courseList: List<Course>): List<Course> {
            return courseList.sortedWith { o1, o2 ->
                if (o1.isFavorite == o2.isFavorite) {
                    o1.shortName.compareTo(o2.shortName)
                } else {
                    if (!o1.isFavorite && o2.isFavorite) 1 else -1
                }
            }
        }


        fun filterCoursesByName(courseList: List<Course>, courseName: String) {
            Log.d("ololo", "filterCoursesByName")
            var filteredCourses: MutableList<Course> = ArrayList()
            if (courseName.isNotEmpty()) {
                for (course in courseList) {
                    if (course.shortName.toLowerCase(Locale.ROOT).contains(courseName)) {
                        filteredCourses.add(course)
                    }
                }
            } else {
                filteredCourses = courseList as MutableList<Course>
            }
            courses = filteredCourses
            notifyDataSetChanged()
        }

        inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(course: Course) {
                val name = course.courseName[1] + " " + course.courseName[2]
                val count = courseDataHandler.getUnreadCount(course.id)
                itemView.course_number.text = course.courseName[0]
                //itemView.course_name.text = name
                /*itemView.unread_count.text = DecimalFormat.getIntegerInstance().format(count.toLong())
                itemView.unread_count.isVisible = count != 0
                itemView.mark_as_read_button.isVisible = count != 0*/
                itemView.favorite_button.setImageResource(if (course.isFavorite) R.drawable.ic_fav_filled else R.drawable.ic_fav_outlined)

                setCourseIcon(course.id)
                

            }

            private fun setCourseIcon(id: Int) {
                when(id) {
                    1057-> itemView.img_course.setImageResource(R.drawable.ic_russian)
                    1056-> itemView.img_course.setImageResource(R.drawable.ic_history)
                    1055-> itemView.img_course.setImageResource(R.drawable.ic_algebra)
                    1054-> itemView.img_course.setImageResource(R.drawable.ic_geography)
                    801-> itemView.img_course.setImageResource(R.drawable.ic_kyrgyz)
                    800-> itemView.img_course.setImageResource(R.drawable.ic_algebra)
                    723-> itemView.img_course.setImageResource(R.drawable.ic_english)
                    36-> itemView.img_course.setImageResource(R.drawable.ic_kyrgyz_history)
                    722-> itemView.img_course.setImageResource(R.drawable.ic_informatics)
                    38-> itemView.img_course.setImageResource(R.drawable.ic_biology)
                    33-> itemView.img_course.setImageResource(R.drawable.ic_physics)
                    1071-> itemView.img_course.setImageResource(R.drawable.ic_english)
                    1070-> itemView.img_course.setImageResource(R.drawable.ic_kyrgyz_history)
                    1069-> itemView.img_course.setImageResource(R.drawable.ic_history)
                    1067-> itemView.img_course.setImageResource(R.drawable.ic_biology)
                    1066-> itemView.img_course.setImageResource(R.drawable.ic_informatics)
                    1064-> itemView.img_course.setImageResource(R.drawable.ic_kyrgyz)
                    1060-> itemView.img_course.setImageResource(R.drawable.ic_geography)
                    1059-> itemView.img_course.setImageResource(R.drawable.ic_algebra)
                    1058-> itemView.img_course.setImageResource(R.drawable.ic_algebra)
                    else -> {
                        itemView.img_course.setImageResource(R.drawable.ic_kyrgyz_history)
                    }

                }


            }

            fun confirmDownloadCourse() {
                MaterialAlertDialogBuilder(context)
                        .setTitle("Confirm Download")
                        .setMessage("Are you sure you want to all the contents of this course?")
                        .setPositiveButton("Yes") { _: DialogInterface?, _: Int ->
                            if (downloadClickListener != null) {
                                val pos = layoutPosition
                                if (!downloadClickListener!!.onClick(this@MyCoursesFragment.courses[pos], pos)) {
                                    /*Toast.makeText(activity, "Download already in progress",
                                            Toast.LENGTH_SHORT).show()*/
                                }
                            }
                        }
                        .setNegativeButton("Cancel", null)
                        .show()
            }

            fun markCourseAsRead() {
                val courseId = courses[layoutPosition].id
                courseDataHandler.markCourseAsRead(courseId)
                notifyItemChanged(layoutPosition)

                //Toast.makeText(activity, "Marked all as read", Toast.LENGTH_SHORT).show()
            }

            fun setFavoriteStatus(position: Int, isFavourite: Boolean) {
                val course = courses[position]
                courseDataHandler.setFavoriteStatus(course.id, isFavourite)
                course.isFavorite = isFavourite
                courses = sortCourses(courses)
                notifyDataSetChanged()
                val toast = if (isFavourite) getString(R.string.added_to_favorites) else getString(R.string.removed_from_favorites)
                //Toast.makeText(activity, toast, Toast.LENGTH_SHORT).show()
            }

            init {
                itemView.course_card.setOnClickListener {
                    if (clickListener != null) {
                        val pos = layoutPosition
                        clickListener!!.onClick(courses[pos], pos)
                    }
                }

                //itemView.mark_as_read_button.setOnClickListener { markCourseAsRead() }
                itemView.favorite_button.setOnClickListener { setFavoriteStatus(layoutPosition, !courses[layoutPosition].isFavorite) }
                itemView.download_image.setOnClickListener { confirmDownloadCourse() }
            }
        }

        init {
            this.courses = courseList
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = MyCoursesFragment()

        @JvmStatic
        val TAG = "MyCoursesFragment"
    }

    override fun setCourses(number: Int) {
        if(mAdapter != null) {
            mAdapter.filterCoursesByName(courses, number.toString())
        }
    }


    override fun onResume() {
        super.onResume()

        if(mAdapter != null) {
            if(courses != null) {
                mAdapter.filterCoursesByName(courses, "8")
            }
        }

    }

}

interface ClassNumberInterface {

    fun setCourses(number : Int)

}
