package ilimboxAndroid.ilimbox.activities

import android.content.Intent
import android.os.*
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.FirebaseException
import com.google.firebase.FirebaseTooManyRequestsException
import com.google.firebase.auth.*
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.gson.Gson
import ilimboxAndroid.ilimbox.app.Constants
import ilimboxAndroid.ilimbox.databinding.ActivitySmsCodeBinding
import ilimboxAndroid.ilimbox.network.APIClient
import ilimboxAndroid.ilimbox.network.MoodleServices
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit


class SmsCodeActivity : AppCompatActivity() {

    lateinit var binding : ActivitySmsCodeBinding
    val auth = FirebaseAuth.getInstance()
    private val moodleServices: MoodleServices = APIClient.getRetrofitInstance().create(
        MoodleServices::class.java)

    var forceResendingToken : PhoneAuthProvider.ForceResendingToken? = null
    var mVerificationId : String = ""
    //val pd : ProgressDialog? =  ProgressDialog(this)
    var phoneNumber : String = ""
    var phone : String = ""
    var uid : String = ""


    var countdown_timer : CountDownTimer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmsCodeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        phoneNumber = intent.getStringExtra("phone")!!
        binding.etOtp.isEnabled = false

        startPhoneNumberVerification()



        binding.resend.setOnClickListener(View.OnClickListener {
            if(forceResendingToken != null) {
                Toast.makeText(applicationContext, "На ваш номер повторно отправлено смс с кодом", Toast.LENGTH_SHORT).show()
                resendPhoneNumberVerification(phoneNumber, forceResendingToken!!)
            }

        })

        binding.etOtp.addTextChangedListener( object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                if(p0?.toString()?.length == 6) {
                    verifyPhoneNumberWithCode(verificationId = mVerificationId, p0.toString())
                }
            }


        })


    }

    private fun startTimer() {
        binding.resend.setText("Повторно отправить запрос на код можно будет через минуту")

        countdown_timer = object : CountDownTimer(60000, 1000) {
            override fun onFinish() {
                setEnabledView(true)
                binding.timer.visibility = View.INVISIBLE
                binding.resend.setText("Отправить еще раз")
                binding.resend.isEnabled = true
            }

            @RequiresApi(Build.VERSION_CODES.N)
            override fun onTick(progress: Long) {
                binding.timer.setText((progress/1000).toString())

            }
        }
        countdown_timer!!.start()
    }

    private fun startPhoneNumberVerification() {

        val options = PhoneAuthOptions.newBuilder(auth)
            .setPhoneNumber(phoneNumber!!)       // Phone number to verify
            .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
            .setActivity(this)                 // Activity (for callback binding)
            .setCallbacks(callbacks)          // OnVerificationStateChangedCallbacks
            .build()
        PhoneAuthProvider.verifyPhoneNumber(options)
    }

    private fun resendPhoneNumberVerification(phone : String, token : PhoneAuthProvider.ForceResendingToken) {

        val options = PhoneAuthOptions.newBuilder(auth)
            .setPhoneNumber(phone)       // Phone number to verify
            .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
            .setActivity(this)                 // Activity (for callback binding)
            .setCallbacks(callbacks)
            .setForceResendingToken(token)// OnVerificationStateChangedCallbacks
            .build()
        PhoneAuthProvider.verifyPhoneNumber(options)

    }

    private fun verifyPhoneNumberWithCode(verificationId : String, code : String) {
        /*pd!!.setMessage("Verify Code")
        pd!!.show()*/
        val credential : PhoneAuthCredential = PhoneAuthProvider.getCredential(verificationId,code)
        signInWithPhoneAuthCredential(credential)
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)


    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }
    val callbacks = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

        override fun onVerificationCompleted(credential: PhoneAuthCredential) {
            // This callback will be invoked in two situations:
            // 1 - Instant verification. In some cases the phone number can be instantly
            //     verified without needing to send or enter a verification code.
            // 2 - Auto-retrieval. On some devices Google Play services can automatically
            //     detect the incoming verification SMS and perform verification without
            //     user action.
            Log.d("ololo", "onVerificationCompleted:$credential")
            signInWithPhoneAuthCredential(credential)
        }

        override fun onVerificationFailed(e: FirebaseException) {
            // This callback is invoked in an invalid request for verification is made,
            // for instance if the the phone number format is not valid.
            Log.w("ololo", "onVerificationFailed", e)
            Log.d("ololo", "Error\n " + e.message)
            setEnabledView(true)

            if (e is FirebaseAuthInvalidCredentialsException) {
                Toast.makeText(this@SmsCodeActivity, "Недействительный номер", Toast.LENGTH_SHORT).show()
            } else if (e is FirebaseTooManyRequestsException) {
                Toast.makeText(this@SmsCodeActivity, "Набранный код недействителен. Отправьте повторно", Toast.LENGTH_SHORT).show()
            }

            // Show a message and update the UI
        }

        override fun onCodeSent(
            verificationId: String,
            token: PhoneAuthProvider.ForceResendingToken
        ) {
            binding.timer.visibility = View.VISIBLE
            startTimer()
            setEnabledView(true)
            // The SMS verification code has been sent to the provided phone number, we
            // now need to ask the user to enter the code and then construct a credential
            // by combining the code with a verification ID.
            Log.d("ololo", "onCodeSent:$verificationId")

            // Save verification ID and resending token so we can use them later
            mVerificationId = verificationId
            forceResendingToken = token

        }
    }

    private fun signInWithPhoneAuthCredential(credential: PhoneAuthCredential) {
        setEnabledView(false)
        auth.signInWithCredential(credential)
            .addOnSuccessListener(object : OnSuccessListener<AuthResult> {
                override fun onSuccess(p0: AuthResult) {


                    phone = auth.currentUser?.phoneNumber!!
                    uid = auth.currentUser?.uid!!
                    phone = phone!!.replace("+", "")

                    val prefs = getSharedPreferences("MY_PREFS_NAME", MODE_PRIVATE)
                    val gson = Gson()
                    val jsonText: String? = prefs.getString("usernames", "")
                    val text = gson.fromJson(
                        jsonText,
                        Array<String>::class.java
                    )
                    var checkLogin = true
                    for(it in text) {
                        if(it.equals(phone)) {
                            checkLogin = false
                            break
                        }
                    }
                    if(checkLogin) {
                        checkProfileExist(phone!!)
                    } else {
                        val intent = Intent(applicationContext, TokenActivity::class.java)
                        intent.putExtra("login", phone)
                        intent.putExtra("password", uid)
                        intent.putExtra("isPhone", true)
                        startActivity(intent)
                        finish()
                    }


                }

            })
            .addOnFailureListener(object : OnFailureListener{
                override fun onFailure(p0: Exception) {
                    setEnabledView(true)
                    Toast.makeText(applicationContext, "Код набран неправильно", Toast.LENGTH_SHORT).show()
                }

            })
    }

    private fun setEnabledView(isEnabled: Boolean) {
        if(isEnabled) {
            binding.progressSms.visibility = View.INVISIBLE
            binding.resend.isEnabled = false
            binding.etOtp.isEnabled = true
        } else {
            binding.progressSms.visibility = View.VISIBLE
            binding.resend.isEnabled = false
            binding.etOtp.isEnabled = false
        }
    }

    private fun checkProfileExist(phone : String) {
        lifecycleScope.launch {
            val user = moodleServices.getUserId(Constants.CREATE_USER_TOKEN,
                "username", phone)

            launch(Dispatchers.IO) { // lifecycle scope allows cancellation of this scope
                try {
                    val response = user.execute()
                    if(response.code() == 200) {
                        if(!response.body()!!.isEmpty()) {
                            val uid = FirebaseAuth.getInstance().currentUser!!
                                .uid
                            val rootRef = FirebaseDatabase.getInstance().reference
                            val uidRef = rootRef.child("Users").child(uid)
                            val eventListener: ValueEventListener = object : ValueEventListener {
                                override fun onDataChange(dataSnapshot: DataSnapshot) {
                                    if (!dataSnapshot.exists()) {
                                        updateUser(response.body()?.get(0)?.id!!, uid)
                                    } else {
                                        val intent = Intent(applicationContext, TokenActivity::class.java)
                                        intent.putExtra("login", phone)
                                        intent.putExtra("password", auth.uid)
                                        intent.putExtra("isPhone", true)
                                        startActivity(intent)
                                        finish()
                                    }
                                }

                                override fun onCancelled(error: DatabaseError) {
                                    Log.d("ololo", error.message) //Don't ignore potential errors!
                                    setEnabledView(true)
                                    Toast.makeText(baseContext, error.message, Toast.LENGTH_SHORT).show()
                                }
                            }
                            uidRef.addListenerForSingleValueEvent(eventListener)


                        } else {
                            Log.d("ololo", "empty")
                            val intent = Intent(applicationContext, EditActivity::class.java)
                            intent.putParcelableExtra("enrollType", EditActivity.EnrollType.PHONE)
                            intent.putExtra("login", phone)
                            intent.putExtra("password", auth.uid)
                            startActivity(intent)
                            finish()
                        }

                    }
                } catch (e: Exception) {
                    Log.d("ololo", "message " + e.message)
                    setEnabledView(true)
                    runOnUiThread(Runnable {
                        Toast.makeText(baseContext, e.message, Toast.LENGTH_SHORT).show()
                    })

                }
            }
        }
    }

    fun Intent.putParcelableExtra(key : String, value : Parcelable) {
        putExtra(key, value)
    }

    private fun updateUser(id : Int, uid : String) {
        lifecycleScope.launch {
            Log.d("ololo", "user update")
            val editRequest = moodleServices.updateUser("e13ea9e95a7e49b4cdec851e469c0a6e", id ,uid)
            launch(Dispatchers.IO) { // lifecycle scope allows cancellation of this scope
                try {
                    val response = editRequest.execute()
                    if(response.code() == 200) {
                        Log.d("ololo", "user updated")
                        createFireabaseDBUserData(true)
                    }
                } catch (e: Exception) {
                    Log.d("ololo", "message " + e.message)
                    setEnabledView(true)
                    runOnUiThread(Runnable {
                        Toast.makeText(baseContext, e.message, Toast.LENGTH_SHORT).show()
                    })
                    //Toast.makeText(baseContext, e.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun createFireabaseDBUserData(isCreatedFromSite : Boolean) {
        val firebaseDatabase = FirebaseDatabase.getInstance()
        val databaseReference = firebaseDatabase.getReference()
        var hashMap = hashMapOf<String, Any?>()
        Log.d("ololo", "createFireabaseDBUserData")

        if(isCreatedFromSite) {

            hashMap.put("createdFromSite", true)
            hashMap.put("createdFromApp", false)
            hashMap.put("updatedPassword", true)
        } else {
            hashMap.put("createdFromSite", false)
            hashMap.put("createdFromApp", true)
            hashMap.put("updatedPassword", false)
        }
        Log.d("ololo", "auth uid = " + auth.uid.toString())
        databaseReference.child("Users")
            .child(auth.uid!!)
            .setValue(hashMap)
            .addOnSuccessListener {
                Log.d("ololo", "Realtime database success")
                val intent = Intent(applicationContext, TokenActivity::class.java)
                intent.putExtra("login", phone)
                intent.putExtra("password", uid)
                intent.putExtra("isPhone", true)
                startActivity(intent)
                finish()
            }
            .addOnFailureListener(object : OnFailureListener {
                override fun onFailure(p0: Exception) {
                    Log.d("ololo", "Realtime database fail")
                    setEnabledView(true)
                    Toast.makeText(baseContext, p0.message, Toast.LENGTH_SHORT).show()
                }

            })
    }

}