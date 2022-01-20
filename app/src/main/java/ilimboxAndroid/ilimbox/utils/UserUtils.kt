package ilimboxAndroid.ilimbox.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log
import ilimboxAndroid.ilimbox.activities.TokenActivity
import ilimboxAndroid.ilimbox.app.Urls
import ilimboxAndroid.ilimbox.core.PushNotifRegManager
import ilimboxAndroid.ilimbox.models.UserAccount
import ilimboxAndroid.ilimbox.network.MoodleServices
import io.realm.Realm
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException


object UserUtils {
    private val TAG = UserUtils::class.java.name

    fun logout() {
        val realm = Realm.getDefaultInstance()
        realm.executeTransactionAsync { r: Realm -> r.deleteAll() }

        // Deregister from push notifications before we logout
        CoroutineScope(Dispatchers.Default).launch {
            PushNotifRegManager.deregisterDevice() // If this fail, user will continue to get push notifs :')
        }
        UserAccount.clearUser()
    }

    fun isValidToken(token: String): Boolean {
        if (token.isEmpty()) return false

        val retrofit = Retrofit.Builder()
            .baseUrl(Urls.MOODLE_URL.toString())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val moodleServices = retrofit.create(MoodleServices::class.java)
        val call = moodleServices.fetchUserDetail(token)
        try {
            val response = call.execute()
            if (!response.isSuccessful) {
                return false
            } else {
                // Moodle returns 200 OK for everything
                response.body() ?: return false
            }
        } catch (e: IOException) {
            Log.wtf(TAG, e)
            return false
        }
        return true
    }

    fun clearBackStackAndLaunchTokenActivity(context: Context) {
        if (context is Activity) {
            context.finishAffinity()
            context.startActivity(Intent(context, TokenActivity::class.java))
            /*Toast.makeText(
                context,
                context.getString(R.string.please_login_to_continue),
                Toast.LENGTH_SHORT
            ).show()*/
        }
    }
}