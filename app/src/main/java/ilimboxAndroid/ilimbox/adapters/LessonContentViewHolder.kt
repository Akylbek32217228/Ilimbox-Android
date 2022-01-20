package ilimboxAndroid.ilimbox.adapters

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.recyclerview.widget.RecyclerView
import ilimboxAndroid.ilimbox.activities.BrowserActivity
import ilimboxAndroid.ilimbox.R
import ilimboxAndroid.ilimbox.databinding.RowLessonContentBinding

@SuppressLint("SetJavaScriptEnabled")
class LessonContentViewHolder(val binding: RowLessonContentBinding) : RecyclerView.ViewHolder(binding.root) {

    var mWebViewClient = myWebViewClient()
    var mWebChromeClient = myWebChromeClient()
    private var mCustomView: View? = null
    private var customViewCallback: WebChromeClient.CustomViewCallback? = null
    init {
        binding.webViewLessonContent.webViewClient = mWebViewClient
        binding.webViewLessonContent.webChromeClient = mWebChromeClient
        binding.webViewLessonContent.settings.javaScriptEnabled = true
        binding.webViewLessonContent.settings.setAppCacheEnabled(true);
        binding.webViewLessonContent.settings.setBuiltInZoomControls(true);
        binding.webViewLessonContent.settings.setSaveFormData(true);
    }

    fun inCustomView(): Boolean {
        return mCustomView != null
    }

    fun hideCustomView() {
        mWebChromeClient?.onHideCustomView()
    }

    protected fun onPause() {
        //super.onPause() //To change body of overridden methods use File | Settings | File Templates.
        binding.webViewLessonContent?.onPause()
    }

    protected fun onResume() {
        //super.onResume() //To change body of overridden methods use File | Settings | File Templates.
        binding.webViewLessonContent?.onResume()
    }

    protected fun onStop() {
        //super.onStop() //To change body of overridden methods use File | Settings | File Templates.
        if (inCustomView()) {
            hideCustomView()
        }
    }

    fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (inCustomView()) {
                hideCustomView()
                return true
            }
            if (mCustomView == null && binding.webViewLessonContent?.canGoBack() == true) {
                binding.webViewLessonContent?.goBack()

                return true
            }
        }
        return onKeyDown(keyCode, event)
    }

    fun encodeToHtml(html : String) : String {
        var oldHtml = html

        oldHtml = oldHtml.replace("%", "%25")
        oldHtml = oldHtml.replace("/", "%2F")
        oldHtml = oldHtml.replace(":", "%3A")
        oldHtml = oldHtml.replace("%2Fwebservice", "")
        return oldHtml
    }

    @SuppressLint("SetJavaScriptEnabled")
    fun bind(summary : String) {

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
            binding.webViewLessonContent.setVisibility(View.GONE)
            /*customViewContainer?.setVisibility(View.VISIBLE)
            customViewContainer?.addView(view)*/
            /*activity.quarters.setVisibility(View.GONE)
            activity.card_view_recycler.visibility = View.GONE
            activity.custom_view_container.addView(view)
            activity.custom_view_container.visibility = View.VISIBLE*/
            customViewCallback = callback
        }

        @SuppressLint("InflateParams")
        override fun getVideoLoadingProgressView(): View? {
            if (mVideoProgressView == null) {
                val inflater = LayoutInflater.from(binding.root.context)
                mVideoProgressView = inflater.inflate(R.layout.video_progress, null)
            }
            return mVideoProgressView
        }

        override fun onHideCustomView() {
            super.onHideCustomView() //To change body of overridden methods use File | Settings | File Templates.
            if (mCustomView == null) return
            binding.webViewLessonContent.setVisibility(View.VISIBLE)
            //customViewContainer?.setVisibility(View.GONE)
            /*activity.quarters.visibility = View.VISIBLE
            activity.card_view_recycler.visibility = View.VISIBLE
            activity.custom_view_container.visibility = View.GONE*/

            // Hide the custom view.
            mCustomView!!.setVisibility(View.GONE)

            // Remove the custom view from its container.
            //customViewContainer?.removeView(mCustomView)
            //activity.custom_view_container.removeView(mCustomView)
            customViewCallback?.onCustomViewHidden()
            mCustomView = null
        }
    }

    inner class myWebViewClient : WebViewClient() {


        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            return if (url != null && (url.startsWith("http://") || url.startsWith("https://"))) {
                val intent = Intent(binding.root.context, BrowserActivity::class.java)
                intent.putExtra("url", url)
                view.context.startActivity(

                    intent
                )
                true
            } else {
                return super.shouldOverrideUrlLoading(
                    view,
                    url
                )
            }
            return super.shouldOverrideUrlLoading(
                view,
                url
            )
            //To change body of overridden methods use File | Settings | File Templates.
        }


        /*override fun shouldInterceptRequest(
            view: WebView?,
            url: String?
        ): WebResourceResponse? {
            if(url!!.contains(".h5p")) {
                val mimeType = "application/h5p"
                val encoding = ""
                LogClass.showTextLog("h5p H5P")
                val input : InputStream = object : InputStream() {
                    override fun read(): Int {
                        return 0
                    }

                }

                val response = WebResourceResponse(mimeType, encoding, input)
                return response
            }
            return super.shouldInterceptRequest(view, url)
        }*/
    }

}