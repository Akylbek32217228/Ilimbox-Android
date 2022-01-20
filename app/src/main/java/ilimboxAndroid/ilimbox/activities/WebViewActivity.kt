package ilimboxAndroid.ilimbox.activities

import android.annotation.SuppressLint
import android.net.http.SslError
import android.os.Bundle
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import ilimboxAndroid.ilimbox.R
import ilimboxAndroid.ilimbox.utils.LogClass
import im.delight.android.webview.AdvancedWebView


class WebViewActivity : AppCompatActivity() {

    lateinit var webView : AdvancedWebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        webView = findViewById(R.id.web_view_activity)
        val urlTest = intent.getStringExtra("url")
        LogClass.showTextLog("url = " + urlTest)
        /*val storage = applicationContext.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        var fileH5p : String?
        for( file in storage!!.list()) {
            fileH5p = file
            LogClass.showTextLog("file = " + file)
        }
        webView.settings.javaScriptEnabled = true
        webView.settings.allowUniversalAccessFromFileURLs = true
        webView.settings.domStorageEnabled = true
        webView.webViewClient = SSLTolerentWebViewClient()
        val string = "<div class=\"h5p-placeholder\" contenteditable=\"false\"><iframe src=\"https://ilimbox.kg/h5p/embed.php?url=https%3A%2F%2Filimbox.kg%2Fwebservice%2Fpluginfile.php%2F2128%2Fcourse%2Fsection%2F1329%2F%25D0%25BF%25D1%2584%25D1%2582%25D0%25B5.h5p?token=7a5364ef0772d4fa18cc4d283537bd72\" class=\"h5p-iframe\" name=\"h5pcontent\" style=\"height:230px; width: 100%; border: 0;\" allowfullscreen=\"allowfullscreen\"></iframe><script src=\"https://ilimbox.kg/h5p/h5plib/v124/joubel/core/js/h5p-resizer.js\"></script></div>"
        LogClass.showTextLog("open html \n" + string)
        for( file in storage!!.list()) {
            LogClass.showTextLog("file = " + file)
        }
        LogClass.showTextLog("path \n" + storage)*/
        webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {

                /*webView.loadUrl("javascript:document.getElementsByName('username').value = 'sagina67'");
                webView.loadUrl("javascript:document.getElementsByName('password').value = 'kinochat'");
                webView.loadUrl("javascript:document.forms['btn btn-primary'].submit()");*/
                //super.onPageFinished(view, url)
            }
        }
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        if(!urlTest.isNullOrEmpty()) {
            webView.loadUrl("https://ilimbox.kg/h5p/embed.php?url=https%3A%2F%2Filimbox.kg%2Fpluginfile.php%2F2128%2Fcourse%2Fsection%2F1329%2F%25D0%25BF%25D0%25BE%25D0%25BB%25D1%2583%25D1%2588%25D0%25BD.h5p")
            /*val postData = "username=${URLEncoder.encode("sagina67", "UTF-8")}" +
                    "&password=${URLEncoder.encode("kinochat", "UTF-8")}"
            webView.postUrl("https://ilimbox.kg/login/index.php", postData.toByteArray())*/
        }


    }

    internal class SSLTolerentWebViewClient : WebViewClient() {
        override fun onReceivedSslError(view: WebView, handler: SslErrorHandler, error: SslError) {
            if (error.toString() === "piglet") handler.cancel() else handler.proceed() // Ignore SSL certificate errors
        }
    }

}