package ilimboxAndroid.ilimbox.activities

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import ilimboxAndroid.ilimbox.R
import ilimboxAndroid.ilimbox.bording.BordingActivity
import ilimboxAndroid.ilimbox.databinding.ActivityTokenBinding
import ilimboxAndroid.ilimbox.models.SingleLiveEvent
import ilimboxAndroid.ilimbox.models.UserAccount
import ilimboxAndroid.ilimbox.utils.Utils
import ilimboxAndroid.ilimbox.viewmodels.TokenViewModel
import ilimboxAndroid.ilimbox.viewmodels.TokenViewModel.Companion.INVALID_LOGIN
import ilimboxAndroid.ilimbox.viewmodels.TokenViewModel.Companion.STATUS_ERROR


class TokenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTokenBinding
    private val viewModel by viewModels<TokenViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTokenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // reverse condition because SplashTheme is default dark

        val prefs = getSharedPreferences("MY_PREFS_NAME", MODE_PRIVATE)
        val firstTime = prefs.getBoolean("firstTime", true)

        if(firstTime) {
            val editor = getSharedPreferences("MY_PREFS_NAME", MODE_PRIVATE).edit()
            editor.putBoolean("firstTime", false)
            editor.apply()
            startActivity(Intent(this, BordingActivity::class.java))
        }



        binding.btnPhoneLogin.setOnClickListener(View.OnClickListener {
            binding.btnPhoneLogin.setTextColor(resources.getColor(R.color.orange))
            var enrollType = EditActivity.EnrollType.PHONE
            val intent = Intent(this, LoginPhoneActivity::class.java)
            intent.putParcelableExtra("enrollType", enrollType)
            startActivity(intent)

        })

        binding.btnRegistration.setOnClickListener {
            binding.btnRegistration.setTextColor(resources.getColor(R.color.orange))
            var enrollType = EditActivity.EnrollType.REGISTRATION
            val intent = Intent(this, EditActivity::class.java)
            intent.putParcelableExtra("enrollType", enrollType)
            startActivity(intent)

        }

        if (!UserAccount.isDarkModeEnabled) {
            setTheme(R.style.AppTheme)
        }



        binding.login.setOnClickListener {
            setViewEditable(false)

            var canLogin = true
            if(binding.password.text?.length == 0) {
                Toast.makeText(this, "Введите пароль", Toast.LENGTH_SHORT).show()
                setViewEditable(true)
                canLogin = false
            }

            if(canLogin) {
                viewModel.onLogin(binding.userName.text.toString(), binding.password.text.toString())
            }

        }

        viewModel.onErrorMessage.observe(this, onErrorMessageObserver)
        viewModel.showBadTokenDialog.observe(this, showBadTokenDialogObserver)
        viewModel.status.observe(this, statusObserver)
        viewModel.startMainActivity.observe(this,  Observer {
            it.getContentIfNotHandled()?.let {
                if (it) {
                    binding.progressBarLogin.visibility = View.GONE
                    binding.login.isEnabled = true
                    binding.login.text = "Login"
                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("login", intent.getStringExtra("login"))
                    intent.putExtra("password", intent.getStringExtra("password"))
                    startActivity(intent)
                    finish()
                }
            }


        })
        viewModel.startIntent.observe(this, startIntentObserver)
        viewModel.startEditIntent.observe(this, startIntentEdit)


    }

    fun Intent.putParcelableExtra(key : String, value : Parcelable) {
        putExtra(key, value)
    }

    private fun setViewEditable(isEditable: Boolean) {
        if(isEditable) {
            binding.login.isEnabled = true
            binding.login.text = "Login"
            binding.userName.isEnabled = true
            binding.password.isEnabled = true
            binding.btnRegistration.isEnabled = true
            binding.progressBarLogin.visibility = View.INVISIBLE
        } else {
            binding.login.isEnabled = false
            binding.userName.isEnabled = false
            binding.password.isEnabled = false
            binding.btnRegistration.isEnabled = false
            binding.login.text = "Login in progress"
            binding.progressBarLogin.visibility = View.VISIBLE
        }
    }


    override fun onPostResume() {
        super.onPostResume()

        binding.btnRegistration.setTextColor(resources.getColor(R.color.black))
        binding.btnPhoneLogin.setTextColor(resources.getColor(R.color.black))
    }

    private val onErrorMessageObserver = Observer<SingleLiveEvent<String>> { error ->
        error.getContentIfNotHandled()?.let {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
            setViewEditable(true)
        }
    }

    private val showBadTokenDialogObserver = Observer<SingleLiveEvent<Boolean>> { showDialog ->
        showDialog.getContentIfNotHandled()?.let {
            if (it)
                Utils.showBadTokenDialog(this)
        }
    }

    private val statusObserver = Observer<Int> { status ->
        setViewEditable(true)
        if (status == STATUS_ERROR) {
            Toast.makeText(this, "Ошибка", Toast.LENGTH_LONG).show()
        } else if (status == INVALID_LOGIN) {
            Toast.makeText(this, "Пользователь не найден", Toast.LENGTH_LONG).show()
        }
        /*else if (status == FETCHING_DETAILS) {
            Toast.makeText(this, "Fetch details error", Toast.LENGTH_LONG).show()
        } else if (status == PROGRESS_COURSE_LIST) {
            Toast.makeText(this, "Progress course list error", Toast.LENGTH_LONG).show()
        } else if (status == PROGRESS_COURSE_CONTENT) {
            Toast.makeText(this, "Progress course content error", Toast.LENGTH_LONG).show()
        } else if (status == PROGRESS_SITE_NEWS) {
            Toast.makeText(this, "Progress site news error", Toast.LENGTH_LONG).show()
        } else if(status == NO_STATUS) {
            Toast.makeText(this, "No status error", Toast.LENGTH_LONG).show()
        }*/

        with(binding) {
//            if (status == TokenViewModel.NO_STATUS) {
//                submitButton.isEnabled = true
//                loginProgress.isVisible = false
//                loginStatus.isVisible = false
//            } else {
//                submitButton.isEnabled = false
//                loginProgress.isVisible = true
//                loginStatus.isVisible = true
//                loginStatus.text = when (status) {
//                    PROGRESS_COURSE_LIST -> "Fetching your course list"
//                    PROGRESS_COURSE_CONTENT -> "Fetching your courses' contents"
//                    PROGRESS_SITE_NEWS -> "Fetching site news"
//                    else -> "Fetching your details"
//                }
//            }
        }
    }

    /*private val startMainActivityObserver = Observer<SingleLiveEvent<Boolean>> { startActivity ->
        startActivity.getContentIfNotHandled()?.let {
            if (it) {
                binding.progressBarLogin.visibility = View.GONE
                binding.login.isEnabled = true
                binding.login.text = "Login"

                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }
    }*/

    private val startIntentObserver = Observer<SingleLiveEvent<Intent>> { intent ->
        intent.getContentIfNotHandled()?.let {
            startActivity(it)
        }
    }

    private val startIntentEdit = Observer<SingleLiveEvent<Boolean>> { intent ->
        intent.getContentIfNotHandled()?.let {

        }
    }

    override fun onResume() {
        super.onResume()
        var isPhone = intent.getBooleanExtra("isPhone", false)

        Log.d("ololo", "isPhone = " + isPhone)
        setViewEditable(true)
        if(isPhone) {
            val login = intent.getStringExtra("login")
            val password = intent.getStringExtra("password")
            setViewEditable(false)
            binding.login.text = "Login in progress"
            viewModel.onLogin(login!!, password!!)
        }

        viewModel.processIntent(intent)
        viewModel.checkLoggedIn()
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
    }
}