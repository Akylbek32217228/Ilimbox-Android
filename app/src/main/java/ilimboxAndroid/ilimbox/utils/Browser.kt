package ilimboxAndroid.ilimbox.utils

import android.webkit.WebView

import android.webkit.WebViewClient


internal class Browser : WebViewClient() {
    override fun shouldOverrideUrlLoading(paramWebView: WebView, paramString: String): Boolean {
        paramWebView.loadUrl(paramString)
        return true
    }
}