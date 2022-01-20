package ilimboxAndroid.ilimbox.activities

import android.annotation.SuppressLint
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import ilimboxAndroid.ilimbox.R
import kotlinx.android.synthetic.main.activity_browser.*

class BrowserActivity : AppCompatActivity() {


    val mimeType = "text/html";
    val  encoding = "UTF-8";


    var mWebViewClient = myWebViewClient()
    var mWebChromeClient = myWebChromeClient()
    var mCustomView: View? = null
    var customViewCallback: WebChromeClient.CustomViewCallback? = null

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browser)

        val url = intent.getStringExtra("url")
        val settings: WebSettings = web_view.settings

        web_view.webViewClient = mWebViewClient
        web_view.webChromeClient = mWebChromeClient
        web_view.settings.javaScriptEnabled = true
        web_view.settings.setAppCacheEnabled(true);
        web_view.settings.setBuiltInZoomControls(true);
        web_view.settings.setSaveFormData(true);
        settings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        web_view.visibility = View.INVISIBLE
        web_view.loadUrl(url!!)

    }

    inner class myWebChromeClient : WebChromeClient() {
        private val mDefaultVideoPoster: Bitmap? = null
        private var mVideoProgressView: View? = null
        override fun onShowCustomView(
            view: View,
            requestedOrientation: Int,
            callback: CustomViewCallback
        ) {
            onShowCustomView(
                view,
                callback
            ) //To change body of overridden methods use File | Settings | File Templates.
        }

        override fun onShowCustomView(view: View, callback: CustomViewCallback) {

            // if a view already exists then immediately terminate the new one
            if (mCustomView != null) {
                callback.onCustomViewHidden()
                return
            }
            mCustomView = view
            customViewCallback = callback
        }

        @SuppressLint("InflateParams")
        override fun getVideoLoadingProgressView(): View? {
            if (mVideoProgressView == null) {
                val inflater = LayoutInflater.from(applicationContext)
                mVideoProgressView = inflater.inflate(R.layout.video_progress, null)
            }
            return mVideoProgressView
        }

        override fun onHideCustomView() {
            super.onHideCustomView() //To change body of overridden methods use File | Settings | File Templates.
            if (mCustomView == null) return

            // Hide the custom view.

            // Remove the custom view from its container.
            //customViewContainer?.removeView(mCustomView)
            customViewCallback?.onCustomViewHidden()
            mCustomView = null
        }
    }

    inner class myWebViewClient : WebViewClient() {


        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            return super.shouldOverrideUrlLoading(
                view,
                url
            )
            //To change body of overridden methods use File | Settings | File Templates.
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            browser_progress.visibility = View.INVISIBLE
            web_view.visibility = View.VISIBLE
        }
    }
}