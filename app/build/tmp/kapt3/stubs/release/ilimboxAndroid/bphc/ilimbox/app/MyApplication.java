package ilimboxAndroid.bphc.ilimbox.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J*\u0010\u0012\u001a\u00020\u00102\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0006R-\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"LilimboxAndroid/bphc/ilimbox/app/MyApplication;", "Landroid/app/Application;", "()V", "loginLaunchData", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getLoginLaunchData", "()Ljava/util/HashMap;", "realmConfiguration", "Lio/realm/RealmConfiguration;", "getRealmConfiguration", "()Lio/realm/RealmConfiguration;", "sharedPref", "Landroid/content/SharedPreferences;", "initRealm", "", "onCreate", "setLoginLaunchData", "Companion", "app_release"})
public final class MyApplication extends android.app.Application {
    private android.content.SharedPreferences sharedPref;
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.bphc.ilimbox.app.MyApplication.Companion Companion = null;
    private static ilimboxAndroid.bphc.ilimbox.app.MyApplication instance;
    
    public MyApplication() {
        super();
    }
    
    private final io.realm.RealmConfiguration getRealmConfiguration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.String> getLoginLaunchData() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initRealm() {
    }
    
    public final void setLoginLaunchData(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> loginLaunchData) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"LilimboxAndroid/bphc/ilimbox/app/MyApplication$Companion;", "", "()V", "<set-?>", "LilimboxAndroid/bphc/ilimbox/app/MyApplication;", "instance", "getInstance", "()LilimboxAndroid/bphc/ilimbox/app/MyApplication;", "setInstance", "(LilimboxAndroid/bphc/ilimbox/app/MyApplication;)V", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Synchronized()
        public final synchronized ilimboxAndroid.bphc.ilimbox.app.MyApplication getInstance() {
            return null;
        }
        
        private final void setInstance(ilimboxAndroid.bphc.ilimbox.app.MyApplication p0) {
        }
    }
}