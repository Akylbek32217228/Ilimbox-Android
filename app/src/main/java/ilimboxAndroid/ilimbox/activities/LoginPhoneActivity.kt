package ilimboxAndroid.ilimbox.activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.InputFilter
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ilimboxAndroid.ilimbox.databinding.ActivityLoginPhoneBinding
import ilimboxAndroid.ilimbox.utils.MaskWatcher
import ilimboxAndroid.ilimbox.utils.TextDrawable

class LoginPhoneActivity : AppCompatActivity() {

    lateinit var binding : ActivityLoginPhoneBinding
    var maskWatcher : TextWatcher? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginPhoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var code = "+996"
        var mask = "(###) ##-##-##"

        binding.registrationEditText.setCompoundDrawablesWithIntrinsicBounds(TextDrawable(code), null, null, null)
        binding.registrationEditText.compoundDrawablePadding = code.length * 30

        binding.privacyPolicy.setOnClickListener(View.OnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://ilimbox.kg/local/staticpage/view.php?page=data-confidentiality-policy"))
            startActivity(browserIntent)
        })

        maskWatcher = mask.let {
            MaskWatcher(
                it
            )
        }

        binding.registrationEditText.addTextChangedListener(maskWatcher)
        binding.registrationEditText.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(mask.length))

        binding.btnGetCode.setOnClickListener(View.OnClickListener {
            Log.d("ololo", " Number = " + binding.registrationEditText.text.toString().trim())

            if(binding.registrationEditText.text.toString().length < 13) {
                Toast.makeText(applicationContext, "Неправильно набран номер", Toast.LENGTH_SHORT).show()
            } else {
                var numberStr = binding.registrationEditText.text.toString()
                numberStr = numberStr.replace("-", "")
                numberStr = numberStr.replace(")", "")
                numberStr = numberStr.replace("(", "")
                numberStr = numberStr.replace(" ", "")


                val intent = Intent(this, SmsCodeActivity::class.java)
                intent.putExtra("phone",code + numberStr)
                startActivity(intent)
            }

        })
    }

    override fun onBackPressed() {
        super.onBackPressed()



    }

}