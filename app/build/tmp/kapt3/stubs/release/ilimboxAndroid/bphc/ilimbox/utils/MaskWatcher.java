package ilimboxAndroid.bphc.ilimbox.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J(\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J(\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004\u00a8\u0006\u0018"}, d2 = {"LilimboxAndroid/bphc/ilimbox/utils/MaskWatcher;", "Landroid/text/TextWatcher;", "mask", "", "(Ljava/lang/String;)V", "isDeleting", "", "isRunning", "getMask", "()Ljava/lang/String;", "setMask", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "beforeTextChanged", "charSequence", "", "start", "", "count", "after", "onTextChanged", "before", "app_release"})
public final class MaskWatcher implements android.text.TextWatcher {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mask;
    private boolean isRunning = false;
    private boolean isDeleting = false;
    
    public MaskWatcher(@org.jetbrains.annotations.NotNull()
    java.lang.String mask) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMask() {
        return null;
    }
    
    public final void setMask(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence charSequence, int start, int count, int after) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence charSequence, int start, int before, int count) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.NotNull()
    android.text.Editable editable) {
    }
}