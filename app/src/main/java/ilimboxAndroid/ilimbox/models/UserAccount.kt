package ilimboxAndroid.ilimbox.models

import android.content.Context
import ilimboxAndroid.ilimbox.app.MyApplication
import ilimboxAndroid.ilimbox.models.core.UserDetail


object UserAccount {
    private const val MY_PREFS_NAME = "ilimbox.kg.USER_ACCOUNT"

    private val prefs = MyApplication.instance
            .getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE)

    val userID: Int
        get() = prefs.getInt("userid", 0)

    val token: String
        get() = prefs.getString("token", "") ?: ""

    val username: String
        get() = prefs.getString("username", "") ?: ""

    val firstName: String
        get() = prefs.getString("firstname", "") ?: ""

    val isLoggedIn: Boolean
        get() = prefs.getString("token", "")?.isNotEmpty() ?: false

    var hasMigratedData: Boolean = false
        get() = prefs.getBoolean("hasMigratedData", false)
        set(value) {
            prefs.edit()
                    .putBoolean("hasMigratedData", value)
                    .apply()
            field = value
        }

    var userDetail : UserDetail? = null

    fun clearUser() {
        prefs.edit().clear().apply()
    }

    fun setUser(userDetail: UserDetail) {
        this.userDetail = userDetail
        prefs.edit()
                .putString("username", userDetail.username)
                .putString("token", userDetail.token)

                .putString("privateToken", userDetail.privateToken)

                .putString("firstname", userDetail.firstName)
                .putString("lastname", userDetail.lastName)
                .putString("userpictureurl", userDetail.userPictureUrl)
                .putInt("userid", userDetail.userId)
                .apply()
    }

    var isNotificationsEnabled: Boolean
        get() = prefs.getBoolean("notificationEnable", true)
        set(b) {
            prefs.edit()
                    .putBoolean("notificationEnable", b)
                    .apply()
        }

    var isDarkModeEnabled: Boolean
        get() = prefs.getBoolean("darkMode", false)
        set(b) {
            prefs.edit()
                    .putBoolean("darkMode", b)
                    .apply()
        }
}
