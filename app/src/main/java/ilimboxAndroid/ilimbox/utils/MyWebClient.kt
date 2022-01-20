package ilimboxAndroid.ilimbox.utils

import android.webkit.WebChromeClient


class MyWebClient : WebChromeClient() {
    /*private var mCustomView: View? = null
    private var mCustomViewCallback: CustomViewCallback? = null
    protected var mFullscreenContainer: FrameLayout? = null
    private var mOriginalOrientation = 0
    private var mOriginalSystemUiVisibility = 0
    override fun getDefaultVideoPoster(): Bitmap? {
        return if (this@MainActivity == null) {
            null
        } else BitmapFactory.decodeResource(
            this@MainActivity.getApplicationContext().getResources(), 2130837573
        )
    }

    override fun onHideCustomView() {
        (this@MainActivity.getWindow().getDecorView() as FrameLayout).removeView(mCustomView)
        mCustomView = null
        this@MainActivity.getWindow().getDecorView().setSystemUiVisibility(
            mOriginalSystemUiVisibility
        )
        this@MainActivity.setRequestedOrientation(mOriginalOrientation)
        mCustomViewCallback!!.onCustomViewHidden()
        mCustomViewCallback = null
    }

    override fun onShowCustomView(paramView: View?, paramCustomViewCallback: CustomViewCallback?) {
        if (mCustomView != null) {
            onHideCustomView()
            return
        }
        mCustomView = paramView
        mOriginalSystemUiVisibility =
            this@MainActivity.getWindow().getDecorView().getSystemUiVisibility()
        mOriginalOrientation = this@MainActivity.getRequestedOrientation()
        mCustomViewCallback = paramCustomViewCallback
        (this@MainActivity.getWindow().getDecorView() as FrameLayout).addView(
            mCustomView,
            FrameLayout.LayoutParams(-1, -1)
        )
        this@MainActivity.getWindow().getDecorView().setSystemUiVisibility(3846)
    }*/
}