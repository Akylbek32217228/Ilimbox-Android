package ilimboxAndroid.ilimbox.activities

import android.Manifest
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkRequest
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.gson.Gson
import ilimboxAndroid.ilimbox.R
import ilimboxAndroid.ilimbox.background.MigrateDataWorker
import ilimboxAndroid.ilimbox.core.PushNotifRegManager
import ilimboxAndroid.ilimbox.fragments.*
import ilimboxAndroid.ilimbox.helper.CourseDataHandler
import ilimboxAndroid.ilimbox.models.UserAccount
import ilimboxAndroid.ilimbox.models.course.Course
import ilimboxAndroid.ilimbox.utils.UserUtils
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_my_courses.*
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    private lateinit var _realm: Realm
    private lateinit var courseDataHandler: CourseDataHandler

    private val _bottomNavSelectionListener
        get() = listener@{ menuItem: MenuItem ->
            when (menuItem.itemId) {
                R.id.myCoursesFragment -> {
                    pushView(MyCoursesFragment.newInstance(), "My Courses", true)
                    return@listener true
                }
                R.id.searchCourseFragment -> {
                    pushView(SearchCourseForEnrolFragment.newInstance(),
                            "Search Course to Enrol", false)
                    return@listener true
                }
                R.id.downloadsFragment -> {
                    pushView(FilesFragment.newInstance(),
                            getString(R.string.nav_bar_files), false)
                    return@listener true
                }
                R.id.forumFragment -> {
                    pushView(ForumFragment.newInstance(), "Site News", false)
                    return@listener true
                }
                R.id.moreFragment -> {
                    pushView(MoreFragment.newInstance(), "More", false)
                    return@listener true
                }
                else -> return@listener false
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val prefs = getSharedPreferences("MY_PREFS_NAME", MODE_PRIVATE)
        val prefsEditor: SharedPreferences.Editor = prefs.edit()
        var text = arrayOf<String>()

        val gson = Gson()
        val jsonText: String? = prefs.getString("usernames", "")
        if(!jsonText.equals("")) {
            text = gson.fromJson(
                jsonText,
                Array<String>::class.java
            )
            var add : Boolean = true
            for(it in text) {
                if(it.equals(UserAccount.username)) {
                    add = false
                    break
                }
            }

            if(add) {
                val gson = Gson()
                val textList: ArrayList<String> = text.toCollection(ArrayList())
                textList.add(UserAccount.username)
                val jsonText = gson.toJson(textList)
                prefsEditor.putString("usernames", jsonText)
                prefsEditor.apply()
            }

        } else {
            val gson = Gson()
            val textList: List<String> = arrayListOf(UserAccount.username)
            val jsonText = gson.toJson(textList)
            prefsEditor.putString("usernames", jsonText)
            prefsEditor.apply()
        }



        if (!UserAccount.isLoggedIn) {
            UserUtils.clearBackStackAndLaunchTokenActivity(this)
            return
        }

        // Override the splash theme since it sets its own
        // image background
        if (UserAccount.isDarkModeEnabled) {
            setTheme(R.style.AppTheme_NoActionBar_Dark)
        } else {
            setTheme(R.style.AppTheme_NoActionBar)
        }

        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        bottom_nav.setOnNavigationItemSelectedListener(_bottomNavSelectionListener)

        _realm = Realm.getDefaultInstance()
        courseDataHandler = CourseDataHandler(_realm)

        if (savedInstanceState == null) {
            pushView(MyCoursesFragment.newInstance(), "My Courses", true)
        }

        askPermission()

        // Register for push notifs if required
        lifecycleScope.launch {
            var toastResource = 0
            if (UserAccount.isNotificationsEnabled && !PushNotifRegManager.isRegistered()) {
                if (!PushNotifRegManager.registerDevice()) {
                    if (UserAccount.isLoggedIn) { // We failed inspite being logged in
                        toastResource = R.string.push_notif_reg_failure
                    }
                }
            } else if (!UserAccount.isNotificationsEnabled && PushNotifRegManager.isRegistered()) {
                if (!PushNotifRegManager.deregisterDevice()) {
                    toastResource = R.string.push_notif_dereg_failure
                }
            }

            if (toastResource != 0) {
                val context = this@MainActivity
                /*Toast.makeText(
                        context,
                        context.getString(toastResource),
                        Toast.LENGTH_SHORT,
                ).show()*/
            }
        }

        resolveIntent()
        resolveModuleLinkShare()

    }

    override fun onBackPressed() {
        super.onBackPressed()
        bottom_nav.setOnNavigationItemSelectedListener(null) // Remove the listener to prevent an infinite loop
        val frag = supportFragmentManager.findFragmentById(R.id.content_frame)
        bottom_nav.selectedItemId = when (frag) {
            is MyCoursesFragment -> R.id.myCoursesFragment
            is SearchCourseForEnrolFragment -> R.id.searchCourseFragment
            is ForumFragment -> R.id.forumFragment
            is MoreFragment -> R.id.moreFragment
            else -> bottom_nav.selectedItemId
        }
        bottom_nav.setOnNavigationItemSelectedListener(_bottomNavSelectionListener)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        setIntent(intent)
    }

    private fun resolveModuleLinkShare() {
        val intent = intent
        val action = intent.action
        val uri = intent.data
        if (uri != null && action != null && action == "android.intent.action.VIEW") {
            val courses = _realm.copyFromRealm(_realm.where(Course::class.java).findAll())
            var courseId = -1
            val q = uri.getQueryParameter("courseId")
            if (q != null) {
                courseId = q.toInt()
            }
            var isEnrolled = false
            for (course in courses) {
                if (course.id == courseId) {
                    isEnrolled = true
                    break
                }
            }
            if (isEnrolled) {
                val scheme = uri.scheme
                val path = uri.path
                val host = uri.host
                if (scheme != null && host != null && path != null) {
                    val fileUrl = String.format("%s://%s%s+?forcedownload=1&token=%s", scheme, host, path,
                            UserAccount.token)
                    val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(fileUrl))
                    startActivity(browserIntent)
                }
            } else {
                Toast.makeText(this, "You need to be enrolled in " + uri.getQueryParameter("courseName") + " in order to view", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun resolveIntent() {
        if (intent == null) return

        if (!intent.action.equals(Intent.ACTION_MAIN)) {
            return
        }

        val contextUrl = intent.getStringExtra("contexturl") ?: ""
        val courseId = (intent.getStringExtra("courseid") ?: "-1").toInt()
        val customData = intent.getStringExtra("customdata") ?: ""

        if (contextUrl == "" && courseId == -1) return

        val intent = Intent(this, CourseDetailActivity::class.java)
        intent.putExtra(CourseDetailActivity.INTENT_CONTEXT_URL_KEY, contextUrl)
        intent.putExtra(CourseDetailActivity.INTENT_COURSE_ID_KEY, courseId)
        intent.putExtra(CourseDetailActivity.INTENT_CUSTOM_DATA_KEY, customData)

        startActivity(intent)
        finish()

    }

    private fun askPermission() {
        if (ContextCompat.checkSelfPermission(this,
                        Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.READ_EXTERNAL_STORAGE)) {
                MaterialAlertDialogBuilder(this)
                        .setTitle("Permission required")
                        .setMessage("We need permission to move course content")
                        .setPositiveButton("OK") { _, _ ->
                            requestReadStoragePermission()
                        }
                        .show()
            } else {
                requestReadStoragePermission()
            }
        } else {
            startDataMigrationIfRequired()
        }
    }

    private fun requestReadStoragePermission() {
        val askPermission = registerForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
            if (!granted)
                askPermission()
            else
                startDataMigrationIfRequired()
        }
        askPermission.launch(Manifest.permission.READ_EXTERNAL_STORAGE)
    }

    private fun startDataMigrationIfRequired() {
        if (!UserAccount.hasMigratedData) {
            val migrateDataWorkRequest: WorkRequest =
                    OneTimeWorkRequestBuilder<MigrateDataWorker>()
                            .build()
            WorkManager.getInstance(this).enqueue(migrateDataWorkRequest)
        }
    }

    fun pushView(fragment: Fragment, tag: String, rootFrag: Boolean) {
        if (rootFrag) {
            clearBackStack()
        }
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.content_frame, fragment, tag)
        if (!rootFrag) {
            transaction.addToBackStack(null)
        }
        transaction.commit()
    }

    private fun clearBackStack() {
        for (i in 0 until supportFragmentManager.backStackEntryCount) {
            supportFragmentManager.popBackStack()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (this::_realm.isInitialized) {
            _realm.close()
        }
    }
}
