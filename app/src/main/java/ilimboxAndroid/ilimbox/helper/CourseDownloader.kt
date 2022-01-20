package ilimboxAndroid.ilimbox.helper

import android.app.Activity
import android.content.Context
import ilimboxAndroid.ilimbox.core.FileManager
import ilimboxAndroid.ilimbox.helper.CourseRequestHandler.CallBack
import ilimboxAndroid.ilimbox.models.course.CourseSection
import ilimboxAndroid.ilimbox.models.course.Module
import io.realm.Realm

class CourseDownloader(activity: Activity, courseName: String?) {
    private var downloadCallback: DownloadCallback? = null
    private val fileManager: FileManager
    private val realm: Realm
    private val context: Context
    fun setDownloadCallback(downloadCallback: DownloadCallback?) {
        this.downloadCallback = downloadCallback
    }

    fun downloadCourseData(courseId: Int) {
        val courseRequestHandler = CourseRequestHandler()
        val courseDataHandler = CourseDataHandler(realm)
        courseRequestHandler.getCourseData(courseId, object : CallBack<List<CourseSection?>?> {
            override fun onFailure(message: String, t: Throwable) {
                if (downloadCallback != null) downloadCallback!!.onFailure()
            }

            override fun onResponse(sectionList: List<CourseSection?>?) {
                if (sectionList == null) {
                    if (downloadCallback != null) downloadCallback!!.onFailure()
                    return
                }
                courseDataHandler.replaceCourseData(courseId, sectionList)
                if (downloadCallback != null) downloadCallback!!.onCourseDataDownloaded()
                for (section in sectionList) {
                    downloadSection(section!!)
                }
            }
        })
    }

    fun downloadSection(section: CourseSection) {
        fileManager.reloadFileList()
        val modules: List<Module> = section.modules
        for (module in modules) {
            if (!module.isDownloadable) continue
            for (content in module.contents) {
                if (!fileManager.isModuleContentDownloaded(content!!)) {
                    fileManager.downloadModuleContent(content, module)
                }
            }
        }
    }

    fun getDownloadedContentCount(courseID: Int): Int {
        fileManager.reloadFileList()
        var count = 0
        val courseSections = realm.where(
            CourseSection::class.java
        ).equalTo("courseId", courseID).findAll()
        for (section in courseSections) {
            val modules: List<Module> = section.modules
            for (module in modules) {
                if (module.isDownloadable) for (content in module.contents) {
                    if (fileManager.isModuleContentDownloaded(content!!)) {
                        count++
                    }
                }
            }
        }
        return count
    }

    fun getTotalContentCount(courseID: Int): Int {
        fileManager.reloadFileList()
        var count = 0
        val courseSections = realm.where(
            CourseSection::class.java
        ).equalTo("courseId", courseID).findAll()
        for (section in courseSections) {
            val modules: List<Module> = section.modules
            for (module in modules) {
                if (module.isDownloadable) count += module.contents.size
            }
        }
        return count
    }

    fun onDownloadCompleted() {
        if (downloadCallback != null) {
            downloadCallback!!.onCourseContentDownloaded()
        }
    }

    fun unregisterReceiver() {
        fileManager.unregisterDownloadReceiver()
    }

    interface DownloadCallback {
        fun onCourseDataDownloaded()
        fun onCourseContentDownloaded()
        fun onFailure()
    }

    init {
        context = activity
        realm = Realm.getDefaultInstance()
        fileManager = FileManager(activity, courseName!!) { filename: String? ->
            onDownloadCompleted()
            Unit
        }
        fileManager.registerDownloadReceiver()
    }
}