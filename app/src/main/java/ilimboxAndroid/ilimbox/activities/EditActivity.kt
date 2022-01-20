package ilimboxAndroid.ilimbox.activities

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.database.FirebaseDatabase
import ilimboxAndroid.ilimbox.app.Constants
import ilimboxAndroid.ilimbox.databinding.ActivityEditBinding
import ilimboxAndroid.ilimbox.network.APIClient
import ilimboxAndroid.ilimbox.network.MoodleServices
import kotlinx.android.parcel.Parcelize
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.regex.Pattern

class EditActivity : AppCompatActivity() {

    @Parcelize
    enum class EnrollType : Parcelable {
        PHONE,REGISTRATION,DEFAULT
    }

    lateinit var binding : ActivityEditBinding
    private val moodleServices: MoodleServices = APIClient.getRetrofitInstance().create(
        MoodleServices::class.java)

    var login : String? = ""
    var passwordUID : String? = ""
    var email : String = ""
    var name : String = ""
    var lastName : String = ""


    var enrollType : EnrollType = EnrollType.DEFAULT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)


        enrollType = intent.getParcelableExtra<EnrollType>("enrollType")!!

        setVisibilityView(enrollType!!)

        binding.btnNext.setOnClickListener(View.OnClickListener {
            var canContinue = checkFields(enrollType)
            if(canContinue) {

                when(enrollType) {
                    EnrollType.PHONE -> {
                        email = System.currentTimeMillis().toString() + "@ilimbox.kg"
                        login = intent.getStringExtra("login")
                        passwordUID = intent.getStringExtra("password")
                        name = binding.editName.text.toString()
                        lastName = binding.editLastname.text.toString()
                    }
                    EnrollType.REGISTRATION -> {
                        email = binding.editEmail.text.toString()
                        login = binding.editLogin.text.toString()
                        passwordUID = binding.editPassword.text.toString()
                        name = binding.editName.text.toString()
                        lastName = binding.editLastname.text.toString()
                    }
                }

                lifecycleScope.launch {
                    setViewEnabled(false)

                    val editRequest = moodleServices.createUser(Constants.CREATE_USER_TOKEN,
                        login, passwordUID, name,
                        lastName, email)

                    launch(Dispatchers.IO) { // lifecycle scope allows cancellation of this scope
                        try {
                            val response = editRequest.execute()
                            if(response.code() == 200) {

                                createUserFromFirebaseDB()
                                val intent = Intent(applicationContext, TokenActivity::class.java)
                                intent.putExtra("login", login)
                                intent.putExtra("password", passwordUID)
                                intent.putExtra("isPhone", true)
                                startActivity(intent)
                                finish()
                            }
                        } catch (e: Exception) {
                            Log.d("ololo", "message " + e.message)
                            setViewEnabled(true)
                            //Toast.makeText(baseContext, e.message, Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }

        })

    }

    private fun checkFields(enrollType: EnrollType) : Boolean {
        when(enrollType) {
            EnrollType.PHONE -> {
                if(!binding.editName.text.toString().equals("") && !binding.editLastname.text.toString().equals("")) {
                    return true
                }
            }
            EnrollType.REGISTRATION -> {
                if(!binding.editName.text.toString().equals("") && !binding.editLastname.text.toString().equals("") &&
                        isValidEmailId(binding.editEmail.text.toString()) && !binding.editLogin.text.toString().equals("")
                    && checkPassword(binding.editPassword.text.toString())) {
                    return true
                }
            }
        }
        return false
    }

    private fun checkPassword(password : String): Boolean {
        if(password.length < 6) {
            Toast.makeText(applicationContext, "Пароль должен быть больше 5 символов", Toast.LENGTH_LONG).show()
            return false
        } else {
            return true
        }
    }

    private fun isValidEmailId(email: String): Boolean {
        val isValid =  Pattern.compile(
            "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                    + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                    + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                    + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$"
        ).matcher(email).matches()
        if(!isValid) {
            Toast.makeText(applicationContext, "Введите правильно почту", Toast.LENGTH_LONG).show()
            return false
        } else {
            return true
        }
    }

    private fun setVisibilityView(enrollType: EnrollType) {
        when(enrollType) {
            EnrollType.PHONE -> {
                binding.editLogin.visibility = View.GONE
                binding.editPassword.visibility = View.GONE
            }
            EnrollType.REGISTRATION -> {
                binding.btnNext.setText("Зарегистрировать")
            }
        }
    }

    private fun createUserFromFirebaseDB() {
        val firebaseDatabase = FirebaseDatabase.getInstance()
        val databaseReference = firebaseDatabase.getReference()
        val hashMap = hashMapOf<String, Any?>()
        hashMap.put("createdFromSite", false)
        hashMap.put("createdFromApp", true)
        hashMap.put("updatedPassword", false)


        databaseReference.child("Users")
            .child(passwordUID!!)
            .setValue(hashMap)
            .addOnSuccessListener( OnSuccessListener {
                Log.d("ololo", "Realtime database success")
                val intent = Intent(applicationContext, TokenActivity::class.java)
                intent.putExtra("login", login)
                intent.putExtra("password", passwordUID)
                intent.putExtra("isPhone", true)
                startActivity(intent)
                finish()

            })
            .addOnFailureListener(object : OnFailureListener {
                override fun onFailure(p0: Exception) {
                    Log.d("ololo", "Realtime database fail")
                    setViewEnabled(true)
                }

            })
    }

    private fun setViewEnabled(viewEnabled: Boolean) {
        if(viewEnabled) {
            binding.editProgress.visibility = View.INVISIBLE
            binding.btnNext.isEnabled = true
            binding.editLastname.isEnabled = true
            binding.editName.isEnabled = true
        } else {
            binding.editProgress.visibility = View.VISIBLE
            binding.btnNext.isEnabled = false
            binding.editLastname.isEnabled = false
            binding.editName.isEnabled = false
        }
    }


    override fun onBackPressed() {
        if(enrollType == EnrollType.PHONE) {

        } else if(enrollType == EnrollType.REGISTRATION) {
            super.onBackPressed()
        } else {

        }
    }
}