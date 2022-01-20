package ilimboxAndroid.ilimbox.core

import android.annotation.SuppressLint
import android.content.Context
import android.content.ContextWrapper
import android.os.Build
import android.provider.Settings
import android.provider.Settings.Secure.ANDROID_ID
import androidx.core.content.edit
import com.google.android.gms.tasks.Tasks
import com.google.firebase.messaging.FirebaseMessaging
import ilimboxAndroid.ilimbox.BuildConfig
import ilimboxAndroid.ilimbox.app.Constants
import ilimboxAndroid.ilimbox.app.MyApplication
import ilimboxAndroid.ilimbox.models.UserAccount
import ilimboxAndroid.ilimbox.network.APIClient
import ilimboxAndroid.ilimbox.network.MoodleServices
import kotlinx.coroutines.*
import okio.IOException
import kotlin.coroutines.*

object PushNotifRegManager {
    private const val PUSH_NOTIF_REG_DATA_KEY = "ilimbox.kg.PUSH_NOTIF_REG_DATA_KEY"

    private val context: ContextWrapper = MyApplication.instance.applicationContext as ContextWrapper
    private val moodleServices: MoodleServices

    private val firebaseToken: String by lazy {
        Tasks.await(FirebaseMessaging.getInstance().token)
    }

    suspend fun registerDevice(): Boolean {
        return withContext(Dispatchers.Default) {
            if (!UserAccount.isLoggedIn || !UserAccount.isNotificationsEnabled) {
                 return@withContext false
            }

            val prevRegData = getPrevRegData()
            val freshRegData = getFreshRegData()

            val (register, deregister) = shouldRegister(prevRegData, freshRegData)
            if (deregister) {
                deregisterDevice()
            }

            if (register) {
                if (registerDeviceOnMoodle(freshRegData)) {
                    commitRegDataToPref(freshRegData)
                    return@withContext true
                } else {
                    return@withContext false
                }
            } else {
                return@withContext true  // We don't need to register
            }
        }
    }


    suspend fun deregisterDevice(): Boolean {
        return withContext(Dispatchers.Default) {
            val regData = getPrevRegData()
            if(deregisterDeviceOnMoodle(regData)) {
                context.getSharedPreferences(PUSH_NOTIF_REG_DATA_KEY, Context.MODE_PRIVATE)
                    .edit()
                    .clear()
                    .apply()
                return@withContext true
            } else {
                return@withContext false
            }
        }
    }


    suspend fun isRegistered(): Boolean =
        !shouldRegister(getPrevRegData(), getFreshRegData()).first

    private suspend fun registerDeviceOnMoodle(regData: PushNotificationRegData): Boolean {
        return withContext(Dispatchers.IO) {
            try {
                moodleServices.registerUserDevice(
                    UserAccount.token,
                    regData.appId,
                    regData.name,
                    regData.model,
                    regData.platform,
                    regData.version,
                    regData.pushId,
                    regData.UUID,
                ).execute()
                return@withContext true
            } catch (e: IOException) {
                return@withContext false
            }
        }
    }

    private suspend fun deregisterDeviceOnMoodle(regData: PushNotificationRegData): Boolean {
        return withContext(Dispatchers.IO) {
            try {
                moodleServices.deregisterUserDevice(
                    UserAccount.token,
                    regData.UUID,
                    regData.appId,
                ).execute()
                return@withContext true
            } catch (e: IOException) {
                return@withContext false
            }
        }
    }

    private fun shouldRegister(
        prevRegData: PushNotificationRegData,
        freshRegData: PushNotificationRegData,
    ): Pair<Boolean, Boolean> {

        var registrationRequired = false
        var deRegistrationRequired = false
        if (prevRegData.pushId != freshRegData.pushId) {
            registrationRequired = true
        }

        if (prevRegData.version.isNotEmpty() && prevRegData.version != freshRegData.version) {
            deRegistrationRequired = true
            registrationRequired = true // if we unregister, we necessarily must re-register
        }

        return Pair(registrationRequired, deRegistrationRequired)
    }

    private fun commitRegDataToPref(regData: PushNotificationRegData) {
       context.getSharedPreferences(PUSH_NOTIF_REG_DATA_KEY, Context.MODE_PRIVATE).edit {
          putString("appId", regData.appId)
          putString("name", regData.name)
          putString("model", regData.name)
          putString("platform", regData.platform)
          putString("version", regData.version)
          putString("pushId", regData.pushId)
          putString("UUID", regData.UUID)
       }
    }

    private fun getPrevRegData(): PushNotificationRegData {
        context.getSharedPreferences(PUSH_NOTIF_REG_DATA_KEY, Context.MODE_PRIVATE).apply {
            return PushNotificationRegData(
                appId = getString("appId", "") ?: "",
                name = getString("name", "") ?: "",
                model = getString("model", "") ?: "",
                platform = getString("platform", "") ?: "",
                version = getString("version", "") ?: "",
                pushId = getString("pushId", "") ?: "",
                UUID = getString("UUID", "") ?: "",
            )
        }
    }

    @SuppressLint("HardwareIds")
    private suspend fun getFreshRegData(): PushNotificationRegData =
        // We switch to IO thread because `firebaseToken` may require
        // a network call for the first time
        withContext(Dispatchers.IO) {
            PushNotificationRegData(
                appId = BuildConfig.APPLICATION_ID,
                name = Build.PRODUCT ?: "",
                model = Build.MODEL ?: "",
                platform = Constants.AIRNOTIFIER_PLATFORM_NAME,
                version = BuildConfig.VERSION_NAME,
                pushId = firebaseToken,
                UUID = Settings.Secure.getString(context.contentResolver, ANDROID_ID),
            )
        }
    //+ "-" + BuildConfig.COMMIT_HASH
    init {
        val retrofit = APIClient.getRetrofitInstance()
        moodleServices = retrofit.create(MoodleServices::class.java)
    }
}

private data class PushNotificationRegData(
    val appId: String,
    val name: String,
    val model: String,
    val platform: String,
    val version: String,
    val pushId: String, // The token itself
    val UUID: String,
)