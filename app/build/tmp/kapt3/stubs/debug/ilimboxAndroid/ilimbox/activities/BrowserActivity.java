package ilimboxAndroid.ilimbox.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002%&B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00060\u001aR\u00020\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\f\u00a8\u0006\'"}, d2 = {"LilimboxAndroid/ilimbox/activities/BrowserActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "customViewCallback", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "getCustomViewCallback", "()Landroid/webkit/WebChromeClient$CustomViewCallback;", "setCustomViewCallback", "(Landroid/webkit/WebChromeClient$CustomViewCallback;)V", "encoding", "", "getEncoding", "()Ljava/lang/String;", "mCustomView", "Landroid/view/View;", "getMCustomView", "()Landroid/view/View;", "setMCustomView", "(Landroid/view/View;)V", "mWebChromeClient", "LilimboxAndroid/ilimbox/activities/BrowserActivity$myWebChromeClient;", "getMWebChromeClient", "()LilimboxAndroid/ilimbox/activities/BrowserActivity$myWebChromeClient;", "setMWebChromeClient", "(LilimboxAndroid/ilimbox/activities/BrowserActivity$myWebChromeClient;)V", "mWebViewClient", "LilimboxAndroid/ilimbox/activities/BrowserActivity$myWebViewClient;", "getMWebViewClient", "()LilimboxAndroid/ilimbox/activities/BrowserActivity$myWebViewClient;", "setMWebViewClient", "(LilimboxAndroid/ilimbox/activities/BrowserActivity$myWebViewClient;)V", "mimeType", "getMimeType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "myWebChromeClient", "myWebViewClient", "app_debug"})
public final class BrowserActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mimeType = "text/html";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String encoding = "UTF-8";
    @org.jetbrains.annotations.NotNull()
    private ilimboxAndroid.ilimbox.activities.BrowserActivity.myWebViewClient mWebViewClient;
    @org.jetbrains.annotations.NotNull()
    private ilimboxAndroid.ilimbox.activities.BrowserActivity.myWebChromeClient mWebChromeClient;
    @org.jetbrains.annotations.Nullable()
    private android.view.View mCustomView;
    @org.jetbrains.annotations.Nullable()
    private android.webkit.WebChromeClient.CustomViewCallback customViewCallback;
    private java.util.HashMap _$_findViewCache;
    
    public BrowserActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMimeType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEncoding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilimboxAndroid.ilimbox.activities.BrowserActivity.myWebViewClient getMWebViewClient() {
        return null;
    }
    
    public final void setMWebViewClient(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.activities.BrowserActivity.myWebViewClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilimboxAndroid.ilimbox.activities.BrowserActivity.myWebChromeClient getMWebChromeClient() {
        return null;
    }
    
    public final void setMWebChromeClient(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.activities.BrowserActivity.myWebChromeClient p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getMCustomView() {
        return null;
    }
    
    public final void setMCustomView(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.webkit.WebChromeClient.CustomViewCallback getCustomViewCallback() {
        return null;
    }
    
    public final void setCustomViewCallback(@org.jetbrains.annotations.Nullable()
    android.webkit.WebChromeClient.CustomViewCallback p0) {
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"LilimboxAndroid/ilimbox/activities/BrowserActivity$myWebChromeClient;", "Landroid/webkit/WebChromeClient;", "(LilimboxAndroid/ilimbox/activities/BrowserActivity;)V", "mDefaultVideoPoster", "Landroid/graphics/Bitmap;", "mVideoProgressView", "Landroid/view/View;", "getVideoLoadingProgressView", "onHideCustomView", "", "onShowCustomView", "view", "callback", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "requestedOrientation", "", "app_debug"})
    public final class myWebChromeClient extends android.webkit.WebChromeClient {
        private final android.graphics.Bitmap mDefaultVideoPoster = null;
        private android.view.View mVideoProgressView;
        
        public myWebChromeClient() {
            super();
        }
        
        @java.lang.Override()
        public void onShowCustomView(@org.jetbrains.annotations.NotNull()
        android.view.View view, int requestedOrientation, @org.jetbrains.annotations.NotNull()
        android.webkit.WebChromeClient.CustomViewCallback callback) {
        }
        
        @java.lang.Override()
        public void onShowCustomView(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        android.webkit.WebChromeClient.CustomViewCallback callback) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @android.annotation.SuppressLint(value = {"InflateParams"})
        @java.lang.Override()
        public android.view.View getVideoLoadingProgressView() {
            return null;
        }
        
        @java.lang.Override()
        public void onHideCustomView() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u000b"}, d2 = {"LilimboxAndroid/ilimbox/activities/BrowserActivity$myWebViewClient;", "Landroid/webkit/WebViewClient;", "(LilimboxAndroid/ilimbox/activities/BrowserActivity;)V", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "shouldOverrideUrlLoading", "", "app_debug"})
    public final class myWebViewClient extends android.webkit.WebViewClient {
        
        public myWebViewClient() {
            super();
        }
        
        @java.lang.Override()
        public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull()
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return false;
        }
        
        @java.lang.Override()
        public void onPageFinished(@org.jetbrains.annotations.Nullable()
        android.webkit.WebView view, @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
        }
    }
}