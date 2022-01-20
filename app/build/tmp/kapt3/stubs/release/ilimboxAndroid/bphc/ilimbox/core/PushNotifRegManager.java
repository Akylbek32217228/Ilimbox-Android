package ilimboxAndroid.bphc.ilimbox.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0011\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0011H\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u0011\u0010\u0019\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u001a\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"LilimboxAndroid/bphc/ilimbox/core/PushNotifRegManager;", "", "()V", "PUSH_NOTIF_REG_DATA_KEY", "", "context", "Landroid/content/ContextWrapper;", "firebaseToken", "getFirebaseToken", "()Ljava/lang/String;", "firebaseToken$delegate", "Lkotlin/Lazy;", "moodleServices", "LilimboxAndroid/bphc/ilimbox/network/MoodleServices;", "commitRegDataToPref", "", "regData", "LilimboxAndroid/bphc/ilimbox/core/PushNotificationRegData;", "deregisterDevice", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deregisterDeviceOnMoodle", "(LilimboxAndroid/bphc/ilimbox/core/PushNotificationRegData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFreshRegData", "getPrevRegData", "isRegistered", "registerDevice", "registerDeviceOnMoodle", "shouldRegister", "Lkotlin/Pair;", "prevRegData", "freshRegData", "app_release"})
public final class PushNotifRegManager {
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.bphc.ilimbox.core.PushNotifRegManager INSTANCE = null;
    private static final java.lang.String PUSH_NOTIF_REG_DATA_KEY = "crux.bphc.cms.PUSH_NOTIF_REG_DATA_KEY";
    private static final android.content.ContextWrapper context = null;
    private static final ilimboxAndroid.bphc.ilimbox.network.MoodleServices moodleServices = null;
    private static final kotlin.Lazy firebaseToken$delegate = null;
    
    private PushNotifRegManager() {
        super();
    }
    
    private final java.lang.String getFirebaseToken() {
        return null;
    }
    
    /**
     * Registers device for push notifications with Moodle.
     * Registration happens only if a user is logged in and has notifications enabled
     * from preferences.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registerDevice(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    /**
     * Deregisters device for push notification from Moodle.
     * This requires a valid user token
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deregisterDevice(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    /**
     * Denotes if the device has been registered for push notification
     * or not. A mismatch between this and [ilimboxAndroid.bphc.ilimbox.models.UserAccount.isNotificationsEnabled]
     * means a (de)registration is in order.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isRegistered(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final java.lang.Object registerDeviceOnMoodle(ilimboxAndroid.bphc.ilimbox.core.PushNotificationRegData regData, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final java.lang.Object deregisterDeviceOnMoodle(ilimboxAndroid.bphc.ilimbox.core.PushNotificationRegData regData, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> shouldRegister(ilimboxAndroid.bphc.ilimbox.core.PushNotificationRegData prevRegData, ilimboxAndroid.bphc.ilimbox.core.PushNotificationRegData freshRegData) {
        return null;
    }
    
    private final void commitRegDataToPref(ilimboxAndroid.bphc.ilimbox.core.PushNotificationRegData regData) {
    }
    
    private final ilimboxAndroid.bphc.ilimbox.core.PushNotificationRegData getPrevRegData() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    private final java.lang.Object getFreshRegData(kotlin.coroutines.Continuation<? super ilimboxAndroid.bphc.ilimbox.core.PushNotificationRegData> continuation) {
        return null;
    }
}