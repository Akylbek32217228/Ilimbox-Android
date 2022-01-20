package ilimboxAndroid.ilimbox.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"LilimboxAndroid/ilimbox/activities/WebViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "webView", "Lim/delight/android/webview/AdvancedWebView;", "getWebView", "()Lim/delight/android/webview/AdvancedWebView;", "setWebView", "(Lim/delight/android/webview/AdvancedWebView;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "SSLTolerentWebViewClient", "app_debug"})
public final class WebViewActivity extends androidx.appcompat.app.AppCompatActivity {
    public im.delight.android.webview.AdvancedWebView webView;
    private java.util.HashMap _$_findViewCache;
    
    public WebViewActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final im.delight.android.webview.AdvancedWebView getWebView() {
        return null;
    }
    
    public final void setWebView(@org.jetbrains.annotations.NotNull()
    im.delight.android.webview.AdvancedWebView p0) {
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"LilimboxAndroid/ilimbox/activities/WebViewActivity$SSLTolerentWebViewClient;", "Landroid/webkit/WebViewClient;", "()V", "onReceivedSslError", "", "view", "Landroid/webkit/WebView;", "handler", "Landroid/webkit/SslErrorHandler;", "error", "Landroid/net/http/SslError;", "app_debug"})
    public static final class SSLTolerentWebViewClient extends android.webkit.WebViewClient {
        
        public SSLTolerentWebViewClient() {
            super();
        }
        
        @java.lang.Override()
        public void onReceivedSslError(@org.jetbrains.annotations.NotNull()
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
        android.webkit.SslErrorHandler handler, @org.jetbrains.annotations.NotNull()
        android.net.http.SslError error) {
        }
    }
}