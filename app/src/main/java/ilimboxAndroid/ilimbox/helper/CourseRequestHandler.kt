package ilimboxAndroid.ilimbox.helper

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import com.google.gson.reflect.TypeToken
import ilimboxAndroid.ilimbox.exceptions.InvalidTokenException
import ilimboxAndroid.ilimbox.models.UserAccount
import ilimboxAndroid.ilimbox.models.course.Content
import ilimboxAndroid.ilimbox.models.course.Course
import ilimboxAndroid.ilimbox.models.course.CourseSection
import ilimboxAndroid.ilimbox.models.forum.Discussion
import ilimboxAndroid.ilimbox.models.forum.ForumData
import ilimboxAndroid.ilimbox.network.APIClient
import ilimboxAndroid.ilimbox.network.MoodleServices
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException
import java.util.*

class CourseRequestHandler {
    val userAccount: UserAccount
    val moodleServices: MoodleServices
    @Throws(IOException::class, RuntimeException::class, InvalidTokenException::class)
    fun fetchCourseListSync(): List<Course> {
        // TODO this function is like #getCourseList(Context context)
        // This method is superior since we don't have to handle Contexts or display messages to the
        // user. Let the caller handle that using a callback they provide.
        Log.d(
            "qwerty",
            " user Token fetchCourseListSync" + userAccount.token + "user account " + userAccount.userID
        )
        val courseCall = moodleServices.fetchCourses(userAccount.token, userAccount.userID)
        return try {
            val response = courseCall.execute()
            if (response.code() != 200) { // Moodle returns 200 for all API calls
                val e = HttpException(response)
                Log.e(TAG, "Response code not 200!", e)
                throw e
            }
            if (response.body() == null) {
                throw RuntimeException("Response body is null")
            }
            val responseString = response.body()!!.string()
            if (responseString.contains("Invalid token")) {
                throw InvalidTokenException()
            }
            val gson = Gson()
            gson.fromJson(responseString, object : TypeToken<List<Course?>?>() {}.type)
        } catch (e: IOException) {
            Log.e(TAG, "IOException when fetching Course List", e)
            throw e
        }
    }

    fun getCourseList(callBack: CallBack<List<Course?>?>?) {
        Log.d(
            "qwerty",
            " user Token getCourseList" + userAccount.token + "user account " + userAccount.userID
        )
        val courseCall = moodleServices.fetchCourses(userAccount.token, userAccount.userID)
        courseCall.enqueue(object : Callback<ResponseBody?> {
            override fun onResponse(call: Call<ResponseBody?>, response: Response<ResponseBody?>) {
                try {
                    if (response.body() == null) {
                        return
                    }
                    val responseString = response.body()!!.string()
                    if (responseString.contains(INVALID_TOKEN)) {
                        callBack?.onFailure(INVALID_TOKEN, Throwable(INVALID_TOKEN))
                        return
                    }
                    if (responseString.contains(ACCESS_EXCEPTION)) {
                        callBack?.onFailure(ACCESS_EXCEPTION, Throwable(ACCESS_EXCEPTION))
                        return
                    }
                    val gson = Gson()

                    // TODO shouldn't crash for empty course list, but it did once
                    // User wasn't registered in any courses. Bug could not be replicated.
                    // Refer to Issue on Github for details.
                    val coursesList = gson
                        .fromJson<List<Course?>>(
                            responseString,
                            object : TypeToken<List<Course?>?>() {}.type
                        )
                    callBack?.onResponse(coursesList)
                } catch (e: IOException) {
                    e.printStackTrace()
                    callBack?.onFailure(e.message, Throwable(e.message))
                } catch (jse: JsonSyntaxException) {
                    callBack?.onFailure(jse.message, Throwable(jse.message))
                }
            }

            override fun onFailure(call: Call<ResponseBody?>, t: Throwable) {
                callBack?.onFailure(NETWORK_ERROR, t)
            }
        })
    }

    fun getCourseList(context: Context?): List<Course>? {
        Log.d(
            "qwerty",
            " user Token getCourseList" + userAccount.token + "user account " + userAccount.userID
        )
        val courseListCall = moodleServices.fetchCourses(userAccount.token, userAccount.userID)
        try {
            val courseListResp = courseListCall.execute() // sync call
            if (courseListResp.code() != 200) {
                return null
            }
            if (courseListResp.body() == null) return null
            val responseString = courseListResp.body()!!.string()
            if (responseString.contains("Invalid token")) {
                return null
            }
            val gson = Gson()
            return gson
                .fromJson(responseString, object : TypeToken<List<Course?>?>() {}.type)
        } catch (e: IOException) {
            if (context != null) {

                //Toast.makeText(context, "Unable to connect to the Internet", Toast.LENGTH_SHORT).show();
            }
        } catch (jse: JsonSyntaxException) {
            //if (context != null)
            //Toast.makeText(context, "Malformed json. Maybe your token was reset!", Toast.LENGTH_SHORT).show();
        }
        return null
    }

    fun getCourseData(course: Course): List<CourseSection>? {
        val courseCall = moodleServices.fetchCourseContent(userAccount.token, course.id)
        try {
            val response = courseCall.execute()
            if (response.code() != 200) {
                return null
            }
            val responseCourseSections = response.body() ?: return ArrayList()
            //Log.d("ololo", "Response responseCourseSections" + responseCourseSections.get(0).getModules().get(0).getUrl());
            return resolve(responseCourseSections)
        } catch (e: IOException) {
            Log.w(TAG, "IOException while getting course data", e)
        }
        return null
    }

    @Throws(IOException::class)
    fun getCourseDataSync(courseId: Int): List<CourseSection> {
        val courseCall = moodleServices
            .fetchCourseContent(userAccount.token, courseId)
        val response = courseCall.execute()
        val responseCourseSections = response.body() ?: return ArrayList(0)
        return resolve(responseCourseSections)
    }

    fun getCourseData(courseId: Int, callBack: CallBack<List<CourseSection>?>?) {
        val courseCall = moodleServices.fetchCourseContent(userAccount.token, courseId)
        courseCall.enqueue(object : Callback<List<CourseSection>?> {
            override fun onResponse(
                call: Call<List<CourseSection>?>,
                response: Response<List<CourseSection>?>
            ) {
                val responseCourseSections = response.body() ?: return
                val sectionList = resolve(responseCourseSections)
                callBack?.onResponse(sectionList)
            }

            override fun onFailure(call: Call<List<CourseSection>?>, t: Throwable) {
                callBack?.onFailure(t.message, t)
            }
        })
    }

    fun getForumDiscussions(moduleId: Int): List<Discussion>? {
        val callForumData = moodleServices.getForumDiscussions(userAccount.token, moduleId, 0, 0)
        try {
            val response = callForumData.execute()
            if (response.code() != 200) {
                return null
            }
            val (discussions) = response.body() ?: return null
            return discussions
        } catch (e: IOException) {
            Log.w(TAG, "IOException while getting Forum Discussions", e)
        }
        return null
    }

    @Throws(IOException::class)
    fun getForumDicussionsSync(moduleId: Int): List<Discussion> {
        val call = moodleServices.getForumDiscussions(userAccount.token, moduleId, 0, 0)
        val response = call.execute()
        return if (response.body() == null) ArrayList(0) else response.body()!!.discussions
    }

    fun getForumDiscussions(moduleId: Int, callBack: CallBack<List<Discussion?>?>?) {
        val call = moodleServices.getForumDiscussions(userAccount.token, moduleId, 0, 0)
        call.enqueue(object : Callback<ForumData?> {
            override fun onResponse(call: Call<ForumData?>, response: Response<ForumData?>) {
                if (response.body() == null) return
                val discussions: List<Discussion?> = response.body()!!.discussions
                callBack?.onResponse(discussions)
            }

            override fun onFailure(call: Call<ForumData?>, t: Throwable) {
                callBack?.onFailure(NETWORK_ERROR, t)
            }
        })
    }

    //This method resolves the names of files with same names
    private fun resolve(courseSections: List<CourseSection>): List<CourseSection> {
        val contents: MutableList<Content> = ArrayList()
        for (courseSection in courseSections) {
            for (module in courseSection.modules) {
                val currContents: List<Content> = module.contents
                contents.addAll(currContents)
            }
        }
        val set: MutableSet<Content> =
            TreeSet { c1: Content, c2: Content -> c1.fileName.compareTo(c2.fileName) }
        for (c in contents) {
            while (!set.add(c)) {
                changeName(c)
            }
        }
        return courseSections
    }

    private fun changeName(content: Content) {
        val fileName = content.fileName
        var newFileName = fileName

        // new file name will be of the format <original>(count)[.ext]
        val lastIndex = fileName.lastIndexOf('(')
        var countUpdated = false
        if (lastIndex != -1) {
            val fileNum = fileName.substring(lastIndex + 1, fileName.lastIndexOf(')'))
            try {
                var count = fileNum.toInt()
                newFileName = (fileName.substring(0, lastIndex + 1)
                        + ++count
                        + fileName.substring(fileName.lastIndexOf(')')))
                countUpdated = true
            } catch (e: NumberFormatException) {
            }
        }
        if (!countUpdated) {
            val extension = fileName.lastIndexOf('.')
            newFileName = if (extension != -1) {
                fileName.substring(0, extension) + "(1)" +
                        fileName.substring(extension)
            } else {
                "$fileName(1)"
            }
        }
        content.fileName = newFileName
    }

    interface CallBack<T> {
        fun onResponse(responseObject: T)
        fun onFailure(message: String?, t: Throwable?)
    }

    companion object {
        val TAG = CourseRequestHandler::class.java.name
        const val INVALID_TOKEN = "Invalid token"
        const val NETWORK_ERROR = "Network error"
        const val ACCESS_EXCEPTION = "accessexception"
    }

    init {
        userAccount = UserAccount
        val retrofit = APIClient.getRetrofitInstance()
        moodleServices = retrofit.create(MoodleServices::class.java)
    }
}