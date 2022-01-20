package ilimboxAndroid.ilimbox.adapters.delegates

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.*
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.webkit.WebViewAssetLoader
import androidx.webkit.WebViewAssetLoader.AssetsPathHandler
import androidx.webkit.WebViewAssetLoader.ResourcesPathHandler
import com.hannesdorfmann.adapterdelegates4.AdapterDelegate
import ilimboxAndroid.ilimbox.activities.BrowserActivity
import ilimboxAndroid.ilimbox.R
import ilimboxAndroid.ilimbox.interfaces.CourseContent
import ilimboxAndroid.ilimbox.models.UserAccount
import ilimboxAndroid.ilimbox.models.course.CourseSection
import ilimboxAndroid.ilimbox.utils.LogClass
import im.delight.android.webview.AdvancedWebView
import kotlinx.android.synthetic.main.fragment_course_section.*
import net.cachapa.expandablelayout.ExpandableLayout
import org.jsoup.Jsoup
import org.jsoup.parser.Parser

class CourseSectionDelegate(val activity: Activity) : AdapterDelegate<List<CourseContent>>() {
    private val inflater: LayoutInflater = activity.layoutInflater

    val assetLoader = WebViewAssetLoader.Builder()
        .addPathHandler("/assets/", AssetsPathHandler(activity.applicationContext))
        .addPathHandler("/res/", ResourcesPathHandler(activity.applicationContext))
        .build()

    override fun isForViewType(items: List<CourseContent>, position: Int): Boolean {
        return items[position] is CourseSection
    }

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return CourseSectionViewHolder(inflater.inflate(R.layout.row_course_section, parent, false))
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onBindViewHolder(items: List<CourseContent>, position: Int,
                                  holder: RecyclerView.ViewHolder, payloads: List<Any>) {

        val vh = holder as CourseSectionViewHolder
        var section = items[position] as CourseSection
        if(section.name.contains("Section")) {
            vh.sectionConstraint.maxHeight = 0
        }
        vh.sectionName.setOnClickListener {
            if(vh.expandable.isExpanded) {
                vh.expandable.collapse()
            } else {
                vh.expandable.expand()
                vh.showContent(section)
            }
        }
        LogClass.showTextLog("Course name " + section.name)

        vh.sectionName.text = section.name

    }

    @SuppressLint("SetJavaScriptEnabled")
    inner class CourseSectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sectionName: TextView = itemView.findViewById(R.id.section_name)
        val sectionConstraint : ConstraintLayout = itemView.findViewById(R.id.section_constraint)
        val expandable : ExpandableLayout = itemView.findViewById(R.id.expandable)
        var webView : AdvancedWebView = itemView.findViewById(R.id.web_view_section)
        var mWebViewClient = myWebViewClient()
        var mWebChromeClient = myWebChromeClient()
        private var mCustomView: View? = null
        private var customViewCallback: WebChromeClient.CustomViewCallback? = null

        fun showContent(section : CourseSection) {



            if (section.summary.isNotEmpty()) {
                val mimeType = "text/html";
                val  encoding = "UTF-8";
                var html = section.summary
                html = html.replace("(src=\"[^\"]+)".toRegex(), "$1?token=" + UserAccount.token)
                html = html.replace("(time=[^token]+)".toRegex(), "")
                html = html.replace("(a href=\"[^\"]+)".toRegex(), "$1?token=" + UserAccount.token)
                //html = html.replace("([.]h5p)".toRegex(), "$1?token=" + UserAccount.token)
                val doc = Jsoup.parse(html)

                for(it in doc.allElements) {
                    it.attr("width", "100%")
                }

                for(element in doc.select("div.h5p-placeholder")) {
                    var oldHtml = element.text()
                    oldHtml = oldHtml.replace("%", "%25")
                    oldHtml = oldHtml.replace("/", "%2F")
                    oldHtml = oldHtml.replace(":", "%3A")
                    oldHtml = oldHtml.replace("%2Fwebservice", "")
                    //element.text("<iframe src=\"https://ilimbox.kg/h5p/embed.php?url=" + oldHtml + "?token=" + UserAccount.token + "\" class=\"h5p-iframe\" name=\"h5pcontent\" style=\"height:230px; width: 100%; border: 0;\" allowfullscreen=\"allowfullscreen\"%3E%3C/iframe%3E%3Cscript+src%3D%22https%3A%2F%2Filimbox.kg%2Fh5p%2Fh5plib%2Fv124%2Fjoubel%2Fcore%2Fjs%2Fh5p-resizer.js%22%3E%3C%2Fscript%3E%3C%2Fdiv%3E")
                    element.text("<a href=\"" + "https://ilimbox.kg/h5p/embed.php?url=" + oldHtml + "\" style=\"\" width=\"100%\"><span class=\"text-danger\" style=\"\" width=\"100%\">Задача</span><br width=\"100%\"></a>")
                }

                webView.settings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                html = Parser.unescapeEntities(doc.html(), false)

                webView.visibility = View.VISIBLE

                webView.webViewClient = mWebViewClient
                webView.webChromeClient = mWebChromeClient
                webView.settings.javaScriptEnabled = true
                webView.settings.setAppCacheEnabled(true);
                webView.settings.setBuiltInZoomControls(true);
                webView.settings.setSaveFormData(true)
                webView.settings.allowFileAccess = true
                webView.settings.allowContentAccess = true
                webView.settings.allowFileAccessFromFileURLs = true
                webView.settings.allowUniversalAccessFromFileURLs = true
                webView.settings.domStorageEnabled = true
                val DESKTOP_USER_AGENT =
                    "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2049.0 Safari/537.36"
                webView.settings.userAgentString = DESKTOP_USER_AGENT


                webView.loadDataWithBaseURL("",  html, mimeType, encoding, "")
            } else {
                webView!!.visibility = View.INVISIBLE
            }
        }

        fun inCustomView(): Boolean {
            return mCustomView != null
        }

        fun hideCustomView() {
            mWebChromeClient?.onHideCustomView()
        }

        protected fun onPause() {
            //super.onPause() //To change body of overridden methods use File | Settings | File Templates.
            webView?.onPause()
        }

        protected fun onResume() {
            //super.onResume() //To change body of overridden methods use File | Settings | File Templates.
            webView?.onResume()
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
                if (mCustomView == null && webView?.canGoBack() == true) {
                    webView?.goBack()

                    return true
                }
            }
            return onKeyDown(keyCode, event)
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
                )
            }


            override fun onShowCustomView(view: View, callback: CustomViewCallback) {

                if (mCustomView != null) {
                    callback.onCustomViewHidden()
                    return
                }
                mCustomView = view
                webView?.setVisibility(View.GONE)
                activity.quarters.setVisibility(View.GONE)
                activity.card_view_recycler.visibility = View.GONE
                activity.custom_view_container.addView(view)
                activity.custom_view_container.visibility = View.VISIBLE
                customViewCallback = callback
            }

            @SuppressLint("InflateParams")
            override fun getVideoLoadingProgressView(): View? {
                if (mVideoProgressView == null) {
                    val inflater = LayoutInflater.from(activity.applicationContext)
                    mVideoProgressView = inflater.inflate(R.layout.video_progress, null)
                }
                return mVideoProgressView
            }

            override fun onHideCustomView() {
                super.onHideCustomView() //To change body of overridden methods use File | Settings | File Templates.
                if (mCustomView == null) return
                webView?.setVisibility(View.VISIBLE)
                //customViewContainer?.setVisibility(View.GONE)
                activity.quarters.visibility = View.VISIBLE
                activity.card_view_recycler.visibility = View.VISIBLE
                activity.custom_view_container.visibility = View.GONE

                // Hide the custom view.
                mCustomView!!.setVisibility(View.GONE)

                activity.custom_view_container.removeView(mCustomView)
                customViewCallback?.onCustomViewHidden()
                mCustomView = null
            }
        }

        inner class myWebViewClient : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                return if (url != null && (url.startsWith("http://") || url.startsWith("https://"))) {
                    val intent = Intent(activity.baseContext, BrowserActivity::class.java)
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

        }

    }
}

