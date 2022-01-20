package ilimboxAndroid.ilimbox.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 /2\u00020\u0001:\u0001/B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010#\u001a\u00020$J\u0011\u0010%\u001a\u00020$H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0018\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0002J\u0016\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006J\u0010\u0010-\u001a\u00020$2\b\u0010.\u001a\u0004\u0018\u00010\u000fR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\n0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\n0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\n0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00060"}, d2 = {"LilimboxAndroid/ilimbox/viewmodels/TokenViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG", "", "kotlin.jvm.PlatformType", "_onErrorMessage", "Landroidx/lifecycle/MutableLiveData;", "LilimboxAndroid/ilimbox/models/SingleLiveEvent;", "_showBadTokenDialog", "", "_startEditIntent", "_startIntent", "Landroid/content/Intent;", "_startMainActivity", "_status", "", "moodleServices", "LilimboxAndroid/ilimbox/network/MoodleServices;", "onErrorMessage", "Landroidx/lifecycle/LiveData;", "getOnErrorMessage", "()Landroidx/lifecycle/LiveData;", "showBadTokenDialog", "getShowBadTokenDialog", "startEditIntent", "getStartEditIntent", "startIntent", "getStartIntent", "startMainActivity", "getStartMainActivity", "status", "getStatus", "checkLoggedIn", "", "fetchUserData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginUsingToken", "token", "privateToken", "onLogin", "userName", "password", "processIntent", "intent", "Companion", "app_debug"})
public final class TokenViewModel extends androidx.lifecycle.AndroidViewModel {
    private final java.lang.String TAG = null;
    private final ilimboxAndroid.ilimbox.network.MoodleServices moodleServices = null;
    private final androidx.lifecycle.MutableLiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<java.lang.String>> _onErrorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<java.lang.String>> onErrorMessage = null;
    private final androidx.lifecycle.MutableLiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<java.lang.Boolean>> _showBadTokenDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<java.lang.Boolean>> showBadTokenDialog = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _status = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> status = null;
    private final androidx.lifecycle.MutableLiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<java.lang.Boolean>> _startMainActivity = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<java.lang.Boolean>> startMainActivity = null;
    private final androidx.lifecycle.MutableLiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<android.content.Intent>> _startIntent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<android.content.Intent>> startIntent = null;
    private final androidx.lifecycle.MutableLiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<java.lang.Boolean>> _startEditIntent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<java.lang.Boolean>> startEditIntent = null;
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.ilimbox.viewmodels.TokenViewModel.Companion Companion = null;
    public static final int FETCHING_DETAILS = 0;
    public static final int PROGRESS_COURSE_LIST = 1;
    public static final int PROGRESS_COURSE_CONTENT = 2;
    public static final int PROGRESS_SITE_NEWS = 3;
    public static final int NO_STATUS = 5;
    public static final int STATUS_ERROR = 6;
    public static final int INVALID_LOGIN = 7;
    
    public TokenViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<java.lang.String>> getOnErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<java.lang.Boolean>> getShowBadTokenDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<java.lang.Boolean>> getStartMainActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<android.content.Intent>> getStartIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<java.lang.Boolean>> getStartEditIntent() {
        return null;
    }
    
    public final void processIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final void loginUsingToken(java.lang.String token, java.lang.String privateToken) {
    }
    
    private final java.lang.Object fetchUserData(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void checkLoggedIn() {
    }
    
    public final void onLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"LilimboxAndroid/ilimbox/viewmodels/TokenViewModel$Companion;", "", "()V", "FETCHING_DETAILS", "", "INVALID_LOGIN", "NO_STATUS", "PROGRESS_COURSE_CONTENT", "PROGRESS_COURSE_LIST", "PROGRESS_SITE_NEWS", "STATUS_ERROR", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}