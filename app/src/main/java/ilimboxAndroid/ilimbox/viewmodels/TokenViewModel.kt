package ilimboxAndroid.ilimbox.viewmodels

import android.app.Application
import android.content.Context
import android.content.Intent
import android.util.Base64
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.google.firebase.crashlytics.FirebaseCrashlytics
import ilimboxAndroid.ilimbox.app.MyApplication
import ilimboxAndroid.ilimbox.helper.CourseDataHandler
import ilimboxAndroid.ilimbox.helper.CourseRequestHandler
import ilimboxAndroid.ilimbox.models.SingleLiveEvent
import ilimboxAndroid.ilimbox.models.UserAccount
import ilimboxAndroid.ilimbox.models.core.UserDetail
import ilimboxAndroid.ilimbox.models.course.Module
import ilimboxAndroid.ilimbox.network.APIClient
import ilimboxAndroid.ilimbox.network.MoodleServices
import ilimboxAndroid.ilimbox.utils.UserUtils
import ilimboxAndroid.ilimbox.utils.Utils
import io.realm.Realm
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.*

class TokenViewModel(application: Application) : AndroidViewModel(application) {

    private val TAG = javaClass.simpleName

    private val moodleServices: MoodleServices = APIClient.getRetrofitInstance().create(MoodleServices::class.java)

    private val _onErrorMessage: MutableLiveData<SingleLiveEvent<String>> = MutableLiveData()
    val onErrorMessage: LiveData<SingleLiveEvent<String>> = _onErrorMessage

    private val _showBadTokenDialog: MutableLiveData<SingleLiveEvent<Boolean>> = MutableLiveData()
    val showBadTokenDialog: LiveData<SingleLiveEvent<Boolean>> = _showBadTokenDialog

    private val _status: MutableLiveData<Int> = MutableLiveData(NO_STATUS)
    val status: LiveData<Int> = _status

    private val _startMainActivity: MutableLiveData<SingleLiveEvent<Boolean>> = MutableLiveData()
    val startMainActivity: LiveData<SingleLiveEvent<Boolean>> = _startMainActivity

    private val _startIntent: MutableLiveData<SingleLiveEvent<Intent>> = MutableLiveData()
    val startIntent: LiveData<SingleLiveEvent<Intent>> = _startIntent

    private val _startEditIntent: MutableLiveData<SingleLiveEvent<Boolean>> = MutableLiveData()
    val startEditIntent: LiveData<SingleLiveEvent<Boolean>> = _startEditIntent

    fun processIntent(intent: Intent?) {
        if (intent != null && intent.action != null && intent.action == Intent.ACTION_VIEW) {
            val data = intent.data
            if (data != null) {
                val scheme = data.scheme
                if (scheme != null && scheme != "") {
                    _onErrorMessage.postValue(SingleLiveEvent("Invalid token URI Schema."))
                    _showBadTokenDialog.postValue(SingleLiveEvent(true))
                    return
                }
                val hostScheme = "token="
                var host = data.host
                if (host != null) {
                    if (!host.contains(hostScheme)) {
                        _onErrorMessage.postValue(SingleLiveEvent("Invalid token URI Schema."))
                        _showBadTokenDialog.postValue(SingleLiveEvent(true))
                        return
                    }

                    // Clean up the host so that we can extract the token
                    host = host.replace(hostScheme, "")
                    host = host.replace("/?#?$".toRegex(), "")
                    host = String(Base64.decode(host, Base64.DEFAULT))
                    val parts = host.split(":::").toTypedArray()
                    if (parts.size < 2) {
                        _onErrorMessage.postValue(SingleLiveEvent("Invalid token response length"))
                        _showBadTokenDialog.postValue(SingleLiveEvent(true))
                        return
                    }
                    val digest = parts[0].toUpperCase(Locale.ROOT)
                    val token = parts[1]
                    val privateToken = if (parts.size >= 3) parts[2] else ""

                    val launchData = MyApplication.instance.loginLaunchData
                    val signature = launchData["SITE_URL"] + launchData["PASSPORT"]
                    try {
                        if (Utils.bytesToHex(MessageDigest.getInstance("md5")
                                        .digest(signature.toByteArray(StandardCharsets.US_ASCII))) != digest) {
                            _onErrorMessage.postValue(SingleLiveEvent("Invalid token digest"))
                            _showBadTokenDialog.postValue(SingleLiveEvent(true))
                            return
                        }
                    } catch (e: NoSuchAlgorithmException) {
                        _onErrorMessage.postValue(SingleLiveEvent("MD5 not a valid MessageDigest algorithm! :o"))
                    }
                    loginUsingToken(token, privateToken)
                }
            }
        }
    }

    private fun loginUsingToken(token: String, privateToken: String) {
        //_status.postValue(FETCHING_DETAILS)
        val call = moodleServices.fetchUserDetail(token)
        call.enqueue(object : Callback<UserDetail> {
            override fun onResponse(call: Call<UserDetail>, response: Response<UserDetail>) {
                if (response.isSuccessful) {
                    var userDetail: UserDetail
                    if (response.body().also { userDetail = it!! } != null) {
                        userDetail.token = token
                        userDetail.privateToken = privateToken
                        UserAccount.setUser(userDetail)
                        viewModelScope.launch(Dispatchers.IO) {
                            fetchUserData()
                        }
                        /*if(response.body()?.firstName.equals("") && response.body()?.lastName.equals("")) {
                            _status.postValue(STATUS_ERROR)
                        } else {

                        }*/


                    } else {
                        _status.postValue(STATUS_ERROR)
                    }
                }
            }

            override fun onFailure(call: Call<UserDetail>, t: Throwable) {
                FirebaseCrashlytics.getInstance().recordException(t)
                Log.wtf(TAG, t)
                _status.postValue(STATUS_ERROR)
            }
        })
    }

    private suspend fun fetchUserData() {
        val courseDataHandler = CourseDataHandler(Realm.getDefaultInstance())
        val courseRequestHandler = CourseRequestHandler()

        /* Fetch User's Course List */
        //_status.postValue(PROGRESS_COURSE_LIST)
        val courseList = courseRequestHandler.getCourseList(getApplication() as Context)
        if (courseList == null) {
            if (!UserUtils.isValidToken(UserAccount.token)) {
                UserUtils.logout()
                UserUtils.clearBackStackAndLaunchTokenActivity(getApplication())
            }
            return
        }
        courseDataHandler.replaceCourses(courseList)

        /* Fetch Course Content */
        //_status.postValue(PROGRESS_COURSE_CONTENT)
        val courses = courseDataHandler.courseList
        for (course in courses) {
            val courseSections = courseRequestHandler.getCourseData(course) ?: continue
            for (courseSection in courseSections) {
                val modules: List<Module> = courseSection.modules
                for (module in modules) {
                    if (module.modType === Module.Type.FORUM) {
                        val discussions = courseRequestHandler.getForumDiscussions(module.instance)
                                ?: continue
                        for (d in discussions) {
                            d.forumId = module.instance
                        }
                        courseDataHandler.setForumDiscussions(module.instance, discussions)
                    }
                }
            }
            courseDataHandler.replaceCourseData(course.id, courseSections)
        }

        /* Fetch Site News */
        //_status.postValue(PROGRESS_SITE_NEWS)
        val discussions = courseRequestHandler.getForumDiscussions(1) // 1 is always site news
        if (discussions != null) {
            for (d in discussions) {
                d.forumId = 1
            }
            courseDataHandler.setForumDiscussions(1, discussions)
        }

        checkLoggedIn()
    }

    fun checkLoggedIn() {
        if (UserAccount.isLoggedIn) {
            _startMainActivity.postValue(SingleLiveEvent(true))
        }
    }

    fun onLogin(userName: String, password: String) {
        APIClient.getRetrofitInstance().create(MoodleServices::class.java)
            .postLogin(userName, password)
            .enqueue(object : Callback<UserDetail> {
                override fun onResponse(call: Call<UserDetail>, response: Response<UserDetail>) {
                    val responseData = response.body()

                    if(responseData?.token.equals("")) {
                        Log.d("ololo", "firstname = ${responseData?.firstName}")
                        Log.d("ololo", "lastname = ${responseData?.lastName}")
                        Log.d("ololo", "token = ${responseData?.token}")
                        _status.postValue(INVALID_LOGIN)
                    } else {
                        if (response.isSuccessful) {
                            Log.d("ololo", "TOKENVIEWMODEL USER ID = " + responseData?.userId)
                            responseData?.let { loginUsingToken(responseData.token, it.privateToken) }


                        } else {
                            _status.postValue(STATUS_ERROR)
                        }

                    }
                }

                override fun onFailure(call: Call<UserDetail>, t: Throwable) {
                    FirebaseCrashlytics.getInstance().recordException(t)
                    _status.postValue(STATUS_ERROR)
                }
            })

    }

    companion object {
        const val FETCHING_DETAILS = 0
        const val PROGRESS_COURSE_LIST = 1
        const val PROGRESS_COURSE_CONTENT = 2
        const val PROGRESS_SITE_NEWS = 3
        const val NO_STATUS = 5
        const val STATUS_ERROR = 6
        const val INVALID_LOGIN = 7
    }
}