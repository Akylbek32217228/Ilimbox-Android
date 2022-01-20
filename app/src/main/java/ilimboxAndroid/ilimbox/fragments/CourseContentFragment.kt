package ilimboxAndroid.ilimbox.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.TextView
import androidx.annotation.MainThread
import androidx.appcompat.app.AlertDialog
import androidx.core.text.HtmlCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import ilimboxAndroid.ilimbox.R
import ilimboxAndroid.ilimbox.adapters.CourseContentAdapter
import ilimboxAndroid.ilimbox.app.Urls
import ilimboxAndroid.ilimbox.core.FileManager
import ilimboxAndroid.ilimbox.databinding.FragmentCourseSectionBinding
import ilimboxAndroid.ilimbox.fragments.MoreOptionsFragment.OptionsViewModel
import ilimboxAndroid.ilimbox.helper.CourseDataHandler
import ilimboxAndroid.ilimbox.helper.CourseRequestHandler
import ilimboxAndroid.ilimbox.interfaces.ClickListener
import ilimboxAndroid.ilimbox.interfaces.CourseContent
import ilimboxAndroid.ilimbox.models.UserAccount
import ilimboxAndroid.ilimbox.models.course.Content
import ilimboxAndroid.ilimbox.models.course.Course
import ilimboxAndroid.ilimbox.models.course.CourseSection
import ilimboxAndroid.ilimbox.models.course.Module
import ilimboxAndroid.ilimbox.utils.LogClass
import ilimboxAndroid.ilimbox.utils.Utils
import ilimboxAndroid.ilimbox.widgets.PropertiesAlertDialog
import io.realm.Realm
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.IOException
import java.util.*
import kotlin.collections.ArrayList


class CourseContentFragment : Fragment() {
    private var _binding : FragmentCourseSectionBinding? = null
    private val binding get() = _binding!!
    private lateinit var fileManager: FileManager
    private lateinit var courseDataHandler: CourseDataHandler
    private lateinit var realm: Realm

    var courseId: Int = 0
    var token : String = ""
    private lateinit var courseName: String
    private lateinit var courseSections: List<CourseSection>

    private lateinit var empty: TextView
    private lateinit var mSwipeRefreshLayout: SwipeRefreshLayout
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CourseContentAdapter
    private lateinit var moreOptionsViewModel: OptionsViewModel

    private val moduleClickWrapperClickListener = createModuleClickWrapperClickListener()
    private val moduleMoreOptionsClickListener = createModuleMoreOptionsClickListener()

    private val courseContents: List<CourseContent>
        get() {
            val contents = ArrayList<CourseContent>()
            courseSections.stream().filter { courseSection: CourseSection ->
                !(courseSection.modules.isEmpty()
                    && courseSection.summary.isEmpty()
                    && courseSection.name.matches(Regex("^Topic \\d*$")))
            }.forEach { courseSection: CourseSection ->
                contents.add(courseSection)
                contents.addAll(courseSection.modules)
            }
            return contents
        }


    private var quarterNumber = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Show error if invalid courseId
        courseId = arguments?.getInt(COURSE_ID_KEY) ?: -1
        token = arguments?.getString(TOKEN_KEY) ?: ""
        // Initialize realm here instead of onCreateView so that other classes can be initialized
        realm = Realm.getDefaultInstance()

        courseDataHandler = CourseDataHandler(realm)
        courseName = courseDataHandler.getCourseName(courseId)
        //courseSections = courseDataHandler.getCourseData(courseId)
        courseSections = listOf<CourseSection>()

        fileManager = FileManager(requireActivity(), courseName) { setCourseContentsOnAdapter() }
        fileManager.registerDownloadReceiver()

        setHasOptionsMenu(true)
    }

    override fun onStart() {
        super.onStart()
        requireActivity().title = courseDataHandler.getCourseNameForActionBarTitle(courseId)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentCourseSectionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        moreOptionsViewModel = ViewModelProvider(requireActivity()).get(OptionsViewModel::class.java)

        empty = view.findViewById(R.id.empty) as TextView
        mSwipeRefreshLayout = view.findViewById(R.id.swipeRefreshLayout)
        mSwipeRefreshLayout.isEnabled = false
        recyclerView = view.findViewById(R.id.recycler_view)
        mSwipeRefreshLayout.post {mSwipeRefreshLayout.isRefreshing = true}
        //courseSections = courseDataHandler.getCourseData(courseId)
        refreshContent()
        /*if (courseSections.isEmpty()) {
            Log.d("ololo", "Is EMPTY")
            mSwipeRefreshLayout.isRefreshing = true

        }*/

        adapter = CourseContentAdapter(requireActivity(), courseContents, fileManager,
                moduleClickWrapperClickListener, moduleMoreOptionsClickListener)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.setItemViewCacheSize(10)

        val contextUrl = requireArguments().getString(CONTEXT_URL_KEY) ?: ""
        if (contextUrl.isNotEmpty()) {
            mSwipeRefreshLayout.isRefreshing = true
            refreshContent(contextUrl) // If there is a url, there may be updates
        }

        mSwipeRefreshLayout.setOnRefreshListener {
            mSwipeRefreshLayout.isRefreshing = true
            refreshContent()
        }
        empty.setOnClickListener {
            mSwipeRefreshLayout.isRefreshing = true
            refreshContent()
        }
        showSectionsOrEmpty()

        binding.textFirstQuarter.setTextColor(resources.getColor(R.color.orange))
        binding.btnFirstQuarter.setOnClickListener(View.OnClickListener {
            quarterNumber = 1
            clearTextColor()
            binding.textFirstQuarter.setTextColor(resources.getColor(R.color.orange))
            mSwipeRefreshLayout.post {mSwipeRefreshLayout.isRefreshing = true}
            refreshContent()
            //refreshContent()
        })

        binding.btnSecondQuarter.setOnClickListener(View.OnClickListener {
            quarterNumber = 2
            clearTextColor()
            binding.textSecondQuarter.setTextColor(resources.getColor(R.color.orange))
            mSwipeRefreshLayout.post {mSwipeRefreshLayout.isRefreshing = true}
            refreshContent()
        })

        binding.btnThirdQuarter.setOnClickListener(View.OnClickListener {
            quarterNumber = 3
            clearTextColor()
            binding.textThirdQuarter.setTextColor(resources.getColor(R.color.orange))
            mSwipeRefreshLayout.post {mSwipeRefreshLayout.isRefreshing = true}
            refreshContent()
        })

        binding.btnForthQuarter.setOnClickListener(View.OnClickListener {
            quarterNumber = 4
            clearTextColor()
            binding.textForthQuarter.setTextColor(resources.getColor(R.color.orange))
            mSwipeRefreshLayout.post {mSwipeRefreshLayout.isRefreshing = true}
            refreshContent()
        })

    }

    fun clearTextColor() {
        binding.textFirstQuarter.setTextColor(resources.getColor(R.color.black))
        binding.textSecondQuarter.setTextColor(resources.getColor(R.color.black))
        binding.textThirdQuarter.setTextColor(resources.getColor(R.color.black))
        binding.textForthQuarter.setTextColor(resources.getColor(R.color.black))
    }

    private fun createModuleMoreOptionsClickListener(): ClickListener {
        LogClass.showTextLog("createModuleMoreOptionsClickListener")
        return ClickListener { `object`: Any, position: Int ->
            val moreOptionsViewModel = moreOptionsViewModel
            val module = `object` as Module
            val content = module.contents.first()

            val downloaded = content != null && fileManager.isModuleContentDownloaded(content)

            /* Set up our options and their handlers */
            val options = ArrayList<MoreOptionsFragment.Option>()
            val observer: Observer<MoreOptionsFragment.Option?> = if (downloaded) {
                options.addAll(listOf(
                        MoreOptionsFragment.Option(0, "View", R.drawable.eye),
                        MoreOptionsFragment.Option(1, "Re-Download", R.drawable.outline_file_download_24),
                        MoreOptionsFragment.Option(2, "Share", R.drawable.ic_share),
                        MoreOptionsFragment.Option(3, "Mark as Unread", R.drawable.eye_off)
                ))
                if (module.modType === Module.Type.RESOURCCE) {
                    options.add(MoreOptionsFragment.Option(4, "Properties", R.drawable.ic_info))
                }
                Observer label@ { option: MoreOptionsFragment.Option? ->
                    if (option == null) return@label
                    when (option.id) {
                        0 -> fileManager.openModuleContent(content!!)
                        1 -> {
                            if (!module.isDownloadable) {
                                return@label
                            }
                            /*Toast.makeText(activity, "Downloading file - " + content!!.fileName,
                                    Toast.LENGTH_SHORT).show()*/
                            fileManager.downloadModuleContent(content!!, module)
                        }
                        2 -> fileManager.shareModuleContent(content!!)
                        3 -> {
                            courseDataHandler.markModuleAsUnread(module);
                            adapter.notifyItemChanged(position)
                        }
                        4 -> PropertiesAlertDialog(requireActivity(), content!!)
                    }
                    moreOptionsViewModel.selection.removeObservers(requireActivity())
                    moreOptionsViewModel.clearSelection()
                }
            } else {
                options.addAll(listOf(
                        MoreOptionsFragment.Option(0, "Download", R.drawable.outline_file_download_24),
                        MoreOptionsFragment.Option(1, "Share", R.drawable.ic_share),
                        MoreOptionsFragment.Option(2, "Mark as Unread", R.drawable.eye_off)
                ))
                if (module.modType === Module.Type.RESOURCCE) {
                    options.add(MoreOptionsFragment.Option(
                            3, "Properties", R.drawable.ic_info))
                }
                Observer label@ { option: MoreOptionsFragment.Option? ->
                    if (option == null) return@label
                    val activity = activity
                    when (option.id) {
                        0 -> if (content != null) {
                            fileManager.downloadModuleContent(content, module)
                        }
                        1 -> shareModuleLinks(module)
                        2 -> {
                            courseDataHandler.markModuleAsUnread(module);
                            adapter.notifyItemChanged(position)
                        }
                        3 -> if (content != null && activity != null) {
                            PropertiesAlertDialog(activity, content).show()
                        }
                    }
                    if (activity != null) {
                        moreOptionsViewModel.selection.removeObservers(activity)
                    }
                    moreOptionsViewModel.clearSelection()
                }
            }

            /* Show the fragment and register the observer */
            val activity = activity
            if (activity != null) {
                val moreOptionsFragment = MoreOptionsFragment.newInstance(module.name, options)
                moreOptionsFragment.show(requireActivity().supportFragmentManager,
                        moreOptionsFragment.tag)
                moreOptionsViewModel.selection.observe(activity, observer)
                courseDataHandler.markModuleAsRead(module);
                adapter.notifyItemChanged(position)
            }
            true
        }
    }

    private fun createModuleClickWrapperClickListener() : ClickListener {

        return ClickListener { `object`: Any, _: Int ->
            LogClass.showTextLog("createModuleClickWrapperClickListener ")
            val module = `object` as Module
            val content = if (!module.contents.isEmpty()) module.contents.first() else null
            LogClass.showTextLog("module description " + module.description)
            LogClass.showTextLog("module description " + module.courseSectionId)
            LogClass.showTextLog("module description " + module.isDownloadable)
            LogClass.showTextLog("module description " + module.url)
            LogClass.showTextLog("createModuleClickWrapperClickListener 2 " + module.url)
            when (module.modType) {
                Module.Type.URL -> if (activity != null && content != null) {
                    Log.d("ololo", "URL")
                    val url = content.fileUrl
                    if (url.isNotEmpty()) {
                        Utils.openURLInBrowser(requireActivity(), url)
                    }
                }
                Module.Type.FORUM, Module.Type.FOLDER -> if (activity != null) {
                    Log.d("ololo", "FORUM")
                    val fragment = if (module.modType === Module.Type.FORUM)
                        ForumFragment.newInstance(courseId, module.instance, courseName)
                    else FolderModuleFragment.newInstance(module.instance, courseName)
                    requireActivity().supportFragmentManager
                            .beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.course_section_enrol_container, fragment, "Announcements")
                            .commit()
                }
                Module.Type.LABEL -> {
                    Log.d("ololo", "LABEL")
                    val desc = module.description
                    if (activity != null && desc.isNotEmpty()) {
                        val alertDialog: AlertDialog.Builder = if (UserAccount.isDarkModeEnabled) {
                            AlertDialog.Builder(requireActivity(), R.style.Theme_AppCompat_Dialog_Alert)
                        } else {
                            AlertDialog.Builder(requireActivity(), R.style.Theme_AppCompat_Light_Dialog_Alert)
                        }
                        val htmlDescription = HtmlCompat.fromHtml(module.description,
                                HtmlCompat.FROM_HTML_MODE_COMPACT)
                        val descriptionWithOutExtraSpace = htmlDescription.toString().trim { it <= ' ' }
                        alertDialog.setMessage(htmlDescription.subSequence(0, descriptionWithOutExtraSpace.length))
                        alertDialog.setNegativeButton("Close", null)
                        alertDialog.show()
                    }
                }
                Module.Type.RESOURCCE -> if (content != null) {
                    Log.d("ololo", "RESOURCCE")
                    if (fileManager.isModuleContentDownloaded(content)) {
                        fileManager.openModuleContent(content)
                    } else {
                        /*Toast.makeText(getActivity(), "Downloading file - " + content.fileName,
                                Toast.LENGTH_SHORT).show()*/
                        fileManager.downloadModuleContent(content, module)
                    }
                }
                Module.Type.QUIZ -> if (content == null) {
                    Utils.openURLInBrowser(requireActivity(), module.url)
                    /*val intent = Intent(requireContext(), WebViewActivity::class.java)
                    intent.putExtra("url", module.url)
                    startActivity(intent)*/
                    /*val intent2 = Intent(context, BrowserActivity::class.java)
                    intent2.putExtra("url", "https://ilimbox.kg/h5p/embed.php?url=https%3A%2F%2Filimbox.kg%2Fwebservice%2Fpluginfile.php%2F2128%2Fcourse%2Fsection%2F1329%2F%25D0%25BF%25D0%25BE%25D0%25BB%25D1%2583%25D1%2588%25D0%25BD.h5p?token=7a5364ef0772d4fa18cc4d283537bd72")
                    startActivity(intent2)*/
                    LogClass.showTextLog("Module URL " + module.url)
                    /*lifecycleScope.launch {
                        LogClass.showTextLog("Course id " + courseId)
                        val moodleServices = APIClient.getRetrofitInstance().create(MoodleServices::class.java)
                        val response = moodleServices.fetchCourseContentItems("e13ea9e95a7e49b4cdec851e469c0a6e", courseId)
                        launch(Dispatchers.IO) {
                            try {
                                val request = response.execute()
                                if(request.code() == 200) {
                                    if(request.body() != null) {
                                        val body = request.body()
                                        for(it in body?.content_items!!) {
                                            LogClass.showTextLog("body first " + it.name)
                                            LogClass.showTextLog("body id " + it.id)
                                            LogClass.showTextLog("body link " + it.link)
                                            LogClass.showTextLog("body title " + it.title)
                                            LogClass.showTextLog("body title " + it.archetype)
                                            LogClass.showTextLog("body title " + it.componentname)
                                            LogClass.showTextLog("body title " + it.help)
                                            LogClass.showTextLog("\n")
                                        }

                                    } else {
                                        LogClass.showTextLog("is empty")
                                    }
                                } else {
                                    LogClass.showTextLog("code not 200 " + request.message())
                                }


                            } catch ( e : Exception) {
                                LogClass.showTextLog("Message" + e.message)
                            }
                        }


                    }*/
                    Log.d("ololo", "Quiz")
                }
                else -> if (activity != null) {
                    Log.d("ololo", "Empty")
                    LogClass.showTextLog("Module content " + module.contents.get(0)?.fileName)
                    Utils.openURLInBrowser(requireActivity(), module.url)
                }
            }
            courseDataHandler.markModuleAsRead(module);
            true
        }
    }

    private fun shareModuleLinks(module: Module) {
        val content = (if (!module.contents.isEmpty()) module.contents.first() else null) ?: return
        val toShare = content.fileUrl.replace("/moodle", "/fileShare/moodle") +
                "&courseName=" + courseName.replace(" ", "%20") + "&courseId=" + courseId
        val sharingIntent = Intent(Intent.ACTION_SEND)
        sharingIntent.type = "text/plain"
        sharingIntent.putExtra(Intent.EXTRA_TEXT, toShare)
        if (context != null) requireContext().startActivity(Intent.createChooser(sharingIntent, null))
    }


    private fun findAndScrollToPosition(urlStr: String) {

        val url = Uri.parse(urlStr)
        var position = 0

        if (Urls.isCourseModuleUrl(url)) {
            val modId = Urls.getModIdFromUrl(url)
            courseDataHandler.getModuleByModId(modId) ?: return
            position = adapter.getPositionFromModId(modId)
        } else if (Urls.isCourseSectionUrl(url)) {
            val sectionNum = Urls.getSectionNumFromUrl(url)
            courseDataHandler.getSectionBySectionNum(courseId, sectionNum) ?: return
            position = adapter.getPositionFromSectionNum(sectionNum)
        }

        recyclerView.smoothScrollToPosition(position)
    }


    private fun showSectionsOrEmpty() {
        if (courseSections.stream().anyMatch { section: CourseSection -> !section.modules.isEmpty() }) {
            empty.visibility = View.GONE
            recyclerView.visibility = View.VISIBLE
            return
        }
        empty.visibility = View.VISIBLE
        recyclerView.visibility = View.GONE
    }

    private fun refreshContent(contextUrl: String = "") {
        CoroutineScope(Dispatchers.IO).launch {
            val courseRequestHandler = CourseRequestHandler()
            var sections = mutableListOf<CourseSection>()
            try {
                sections = courseRequestHandler.getCourseDataSync(courseId)
            } catch (e: IOException) {
                Log.e(TAG, "IOException when syncing course: ${courseId}}", e)
                if (courseSections.isEmpty()) {
                    CoroutineScope(Dispatchers.Main).launch {
                        empty.text = resources.getText(R.string.failed_course_content_refresh)
                        empty.visibility = View.VISIBLE
                        recyclerView.visibility = View.INVISIBLE
                        //Toast.makeText(activity, "Unable to connect to server!", Toast.LENGTH_SHORT).show()
                        mSwipeRefreshLayout.isRefreshing = false
                    }
                }
            }
            var newContent = arrayListOf<CourseSection>()
            var addItem : Boolean = false

            if(quarterNumber == 1) {
                for(it in sections) {
                    if(it.name.equals("I")) {
                        addItem = true
                        continue
                    } else if(it.name.equals("II")) {
                        break
                    }
                    if(addItem) {
                        newContent.add(it)
                    }
                }
                var count = 0
                for(it in sections) {
                    Log.d("ololo", "COUNT = " + count)
                    if(it is CourseSection) {
                        Log.d("ololo", "COURSE SECTION = " + it.name)
                    }
                    if(it is Module) {
                        Log.d("ololo", "COURSE Module = " + it.name)
                    }
                    if(it is Course) {
                        Log.d("ololo", "COURSE Course = " + it.courseName)
                    }
                    if(it is Content) {
                        Log.d("ololo", "COURSE Content = " + it.fileName)
                    }
                    ++count
                }
            } else if(quarterNumber == 2) {
                for(it in sections) {
                    if(it.name.equals("II")) {
                        addItem = true
                        continue
                    } else if(it.name.equals("III")) {
                        break
                    }
                    if(addItem) {
                        newContent.add(it)
                    }
                }
            } else if(quarterNumber == 3) {
                for(it in sections) {
                    if(it.name.equals("III")) {
                        addItem = true
                        continue
                    } else if(it.name.equals("IV")) {
                        break
                    }
                    if(addItem) {
                        newContent.add(it)
                    }
                }
            } else if( quarterNumber == 4) {
                for(it in sections) {
                    if(it.name.equals("IV")) {
                        addItem = true
                        continue
                    }
                    if(addItem) {
                        newContent.add(it)
                    }
                }
            }
            sections = newContent

            val realm = Realm.getDefaultInstance() // tie a realm instance to this thread
            val courseDataHandler = CourseDataHandler(realm)

            courseDataHandler.isolateNewCourseData(courseId, sections) // This marks as unread

            for (courseSection in sections) {
                val modules = courseSection.modules
                for (module in modules) {
                    if (module.modType == Module.Type.FORUM) {
                        val discussions = courseRequestHandler
                                .getForumDicussionsSync(module.instance)
                        for (d in discussions) {
                            d.forumId = module.instance
                        }

                        val newDiscussions = courseDataHandler
                                .setForumDiscussions(module.instance, discussions)
                        if (newDiscussions.size > 0) {
                            courseDataHandler.markModuleAsUnread(module);
                        }
                    }
                }
            }
            courseDataHandler.replaceCourseData(courseId, sections)
            courseSections = sections
            CoroutineScope(Dispatchers.Main).launch {
                setCourseContentsOnAdapter()
                findAndScrollToPosition(contextUrl)
                mSwipeRefreshLayout.isRefreshing = false
                empty.visibility = View.GONE
                recyclerView.visibility = View.VISIBLE
            }
        }
    }

    @MainThread
    private fun setCourseContentsOnAdapter() {
        fileManager.reloadFileList()
        adapter.setCourseContents(courseContents)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.mark_all_as_read) {
            courseDataHandler.markCourseAsRead(courseId)
            courseSections = courseDataHandler.getCourseData(courseId)
            setCourseContentsOnAdapter()
            //Toast.makeText(activity, "Marked all as read", Toast.LENGTH_SHORT).show()
            return true
        }
        if (item.itemId == R.id.action_open_in_browser) {
            Utils.openURLInBrowser(requireActivity(), Urls.getCourseUrl(courseId).toString())
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.course_details_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onDestroy() {
        super.onDestroy()
        fileManager.unregisterDownloadReceiver()
        realm.close()
    }

    companion object {
        private const val TAG = "CourseContentFragment"

        private const val TOKEN_KEY = "token"
        private const val COURSE_ID_KEY = "id"
        private const val CONTEXT_URL_KEY = "contextUrl"

        @JvmStatic
        fun newInstance(token: String, courseId: Int, contextUrl: String): CourseContentFragment {
            val args = Bundle()
            args.putString(TOKEN_KEY, token)
            args.putInt(COURSE_ID_KEY, courseId)
            args.putString(CONTEXT_URL_KEY, contextUrl)

            val courseSectionFragment = CourseContentFragment()
            courseSectionFragment.arguments = args
            return courseSectionFragment
        }
    }
}