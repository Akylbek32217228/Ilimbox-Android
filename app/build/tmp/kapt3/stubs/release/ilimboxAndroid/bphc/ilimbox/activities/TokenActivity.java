package ilimboxAndroid.bphc.ilimbox.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\rH\u0014J\b\u0010\u001c\u001a\u00020\u0017H\u0014J\b\u0010\u001d\u001a\u00020\u0017H\u0014J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\nH\u0002J\u001a\u0010 \u001a\u00020\u0017*\u00020\r2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006$"}, d2 = {"LilimboxAndroid/bphc/ilimbox/activities/TokenActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "LilimboxAndroid/bphc/ilimbox/databinding/ActivityTokenBinding;", "onErrorMessageObserver", "Landroidx/lifecycle/Observer;", "LilimboxAndroid/bphc/ilimbox/models/SingleLiveEvent;", "", "showBadTokenDialogObserver", "", "startIntentEdit", "startIntentObserver", "Landroid/content/Intent;", "statusObserver", "", "viewModel", "LilimboxAndroid/bphc/ilimbox/viewmodels/TokenViewModel;", "getViewModel", "()LilimboxAndroid/bphc/ilimbox/viewmodels/TokenViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "onPostResume", "onResume", "setViewEditable", "isEditable", "putParcelableExtra", "key", "value", "Landroid/os/Parcelable;", "app_release"})
public final class TokenActivity extends androidx.appcompat.app.AppCompatActivity {
    private ilimboxAndroid.bphc.ilimbox.databinding.ActivityTokenBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private final androidx.lifecycle.Observer<ilimboxAndroid.bphc.ilimbox.models.SingleLiveEvent<java.lang.String>> onErrorMessageObserver = null;
    private final androidx.lifecycle.Observer<ilimboxAndroid.bphc.ilimbox.models.SingleLiveEvent<java.lang.Boolean>> showBadTokenDialogObserver = null;
    private final androidx.lifecycle.Observer<java.lang.Integer> statusObserver = null;
    private final androidx.lifecycle.Observer<ilimboxAndroid.bphc.ilimbox.models.SingleLiveEvent<android.content.Intent>> startIntentObserver = null;
    private final androidx.lifecycle.Observer<ilimboxAndroid.bphc.ilimbox.models.SingleLiveEvent<java.lang.Boolean>> startIntentEdit = null;
    private java.util.HashMap _$_findViewCache;
    
    public TokenActivity() {
        super();
    }
    
    private final ilimboxAndroid.bphc.ilimbox.viewmodels.TokenViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void putParcelableExtra(@org.jetbrains.annotations.NotNull()
    android.content.Intent $this$putParcelableExtra, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    android.os.Parcelable value) {
    }
    
    private final void setViewEditable(boolean isEditable) {
    }
    
    @java.lang.Override()
    protected void onPostResume() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
}