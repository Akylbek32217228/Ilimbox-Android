package ilimboxAndroid.bphc.ilimbox.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"LilimboxAndroid/bphc/ilimbox/utils/Browser;", "Landroid/webkit/WebViewClient;", "()V", "shouldOverrideUrlLoading", "", "paramWebView", "Landroid/webkit/WebView;", "paramString", "", "app_release"})
public final class Browser extends android.webkit.WebViewClient {
    
    public Browser() {
        super();
    }
    
    @java.lang.Override()
    public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView paramWebView, @org.jetbrains.annotations.NotNull()
    java.lang.String paramString) {
        return false;
    }
}