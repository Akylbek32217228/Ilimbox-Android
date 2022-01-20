package ilimboxAndroid.ilimbox.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u0010%\u001a\u00020\u001eH\u0002J\u0010\u00100\u001a\u00020/2\u0006\u00101\u001a\u000202H\u0002J\u0012\u00103\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u000105H\u0014J\u0010\u00106\u001a\u00020/2\u0006\u00104\u001a\u000205H\u0014J\u0018\u00107\u001a\u00020/2\u0006\u00108\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0016J\u0018\u0010;\u001a\u00020/2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u0018H\u0002J\u0010\u0010=\u001a\u00020/2\u0006\u0010>\u001a\u000202H\u0002J\u0010\u0010?\u001a\u00020/2\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020/H\u0002J\b\u0010C\u001a\u00020/H\u0002J\u0018\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020F2\u0006\u0010+\u001a\u00020\u001eH\u0002J\u0018\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020\u001eH\u0002J\u001a\u0010J\u001a\u00020/*\u00020K2\u0006\u0010L\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020NR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010 \"\u0004\b\'\u0010\"R\u001a\u0010(\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001a\u0010+\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010 \"\u0004\b-\u0010\"\u00a8\u0006O"}, d2 = {"LilimboxAndroid/ilimbox/activities/SmsCodeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "getAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "binding", "LilimboxAndroid/ilimbox/databinding/ActivitySmsCodeBinding;", "getBinding", "()LilimboxAndroid/ilimbox/databinding/ActivitySmsCodeBinding;", "setBinding", "(LilimboxAndroid/ilimbox/databinding/ActivitySmsCodeBinding;)V", "callbacks", "Lcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;", "getCallbacks", "()Lcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;", "countdown_timer", "Landroid/os/CountDownTimer;", "getCountdown_timer", "()Landroid/os/CountDownTimer;", "setCountdown_timer", "(Landroid/os/CountDownTimer;)V", "forceResendingToken", "Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;", "getForceResendingToken", "()Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;", "setForceResendingToken", "(Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;)V", "mVerificationId", "", "getMVerificationId", "()Ljava/lang/String;", "setMVerificationId", "(Ljava/lang/String;)V", "moodleServices", "LilimboxAndroid/ilimbox/network/MoodleServices;", "phone", "getPhone", "setPhone", "phoneNumber", "getPhoneNumber", "setPhoneNumber", "uid", "getUid", "setUid", "checkProfileExist", "", "createFireabaseDBUserData", "isCreatedFromSite", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRestoreInstanceState", "onSaveInstanceState", "outState", "outPersistentState", "Landroid/os/PersistableBundle;", "resendPhoneNumberVerification", "token", "setEnabledView", "isEnabled", "signInWithPhoneAuthCredential", "credential", "Lcom/google/firebase/auth/PhoneAuthCredential;", "startPhoneNumberVerification", "startTimer", "updateUser", "id", "", "verifyPhoneNumberWithCode", "verificationId", "code", "putParcelableExtra", "Landroid/content/Intent;", "key", "value", "Landroid/os/Parcelable;", "app_debug"})
public final class SmsCodeActivity extends androidx.appcompat.app.AppCompatActivity {
    public ilimboxAndroid.ilimbox.databinding.ActivitySmsCodeBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    private final ilimboxAndroid.ilimbox.network.MoodleServices moodleServices = null;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken forceResendingToken;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mVerificationId = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String phoneNumber = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String phone = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String uid = "";
    @org.jetbrains.annotations.Nullable()
    private android.os.CountDownTimer countdown_timer;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks callbacks = null;
    private java.util.HashMap _$_findViewCache;
    
    public SmsCodeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilimboxAndroid.ilimbox.databinding.ActivitySmsCodeBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.databinding.ActivitySmsCodeBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.auth.FirebaseAuth getAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken getForceResendingToken() {
        return null;
    }
    
    public final void setForceResendingToken(@org.jetbrains.annotations.Nullable()
    com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMVerificationId() {
        return null;
    }
    
    public final void setMVerificationId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    public final void setPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUid() {
        return null;
    }
    
    public final void setUid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.os.CountDownTimer getCountdown_timer() {
        return null;
    }
    
    public final void setCountdown_timer(@org.jetbrains.annotations.Nullable()
    android.os.CountDownTimer p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void startTimer() {
    }
    
    private final void startPhoneNumberVerification() {
    }
    
    private final void resendPhoneNumberVerification(java.lang.String phone, com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken token) {
    }
    
    private final void verifyPhoneNumberWithCode(java.lang.String verificationId, java.lang.String code) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState, @org.jetbrains.annotations.NotNull()
    android.os.PersistableBundle outPersistentState) {
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks getCallbacks() {
        return null;
    }
    
    private final void signInWithPhoneAuthCredential(com.google.firebase.auth.PhoneAuthCredential credential) {
    }
    
    private final void setEnabledView(boolean isEnabled) {
    }
    
    private final void checkProfileExist(java.lang.String phone) {
    }
    
    public final void putParcelableExtra(@org.jetbrains.annotations.NotNull()
    android.content.Intent $this$putParcelableExtra, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    android.os.Parcelable value) {
    }
    
    private final void updateUser(int id, java.lang.String uid) {
    }
    
    private final void createFireabaseDBUserData(boolean isCreatedFromSite) {
    }
}