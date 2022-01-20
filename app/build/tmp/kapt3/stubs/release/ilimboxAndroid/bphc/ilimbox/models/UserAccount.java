package ilimboxAndroid.bphc.ilimbox.models;

import java.lang.System;

/**
 * @author Harshit Agarwal (16-Dec-2016)
 * @author Abhijeet Viswa
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010&\u001a\u00020\'J\u000e\u0010(\u001a\u00020\'2\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R&\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\fR$\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0007\u00a8\u0006)"}, d2 = {"LilimboxAndroid/bphc/ilimbox/models/UserAccount;", "", "()V", "MY_PREFS_NAME", "", "firstName", "getFirstName", "()Ljava/lang/String;", "value", "", "hasMigratedData", "getHasMigratedData", "()Z", "setHasMigratedData", "(Z)V", "b", "isDarkModeEnabled", "setDarkModeEnabled", "isLoggedIn", "isNotificationsEnabled", "setNotificationsEnabled", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "token", "getToken", "userDetail", "LilimboxAndroid/bphc/ilimbox/models/core/UserDetail;", "getUserDetail", "()LilimboxAndroid/bphc/ilimbox/models/core/UserDetail;", "setUserDetail", "(LilimboxAndroid/bphc/ilimbox/models/core/UserDetail;)V", "userID", "", "getUserID", "()I", "username", "getUsername", "clearUser", "", "setUser", "app_release"})
public final class UserAccount {
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.bphc.ilimbox.models.UserAccount INSTANCE = null;
    private static final java.lang.String MY_PREFS_NAME = "crux.bphc.cms.USER_ACCOUNT";
    private static final android.content.SharedPreferences prefs = null;
    private static boolean hasMigratedData = false;
    @org.jetbrains.annotations.Nullable()
    private static ilimboxAndroid.bphc.ilimbox.models.core.UserDetail userDetail;
    
    private UserAccount() {
        super();
    }
    
    public final int getUserID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    public final boolean isLoggedIn() {
        return false;
    }
    
    public final boolean getHasMigratedData() {
        return false;
    }
    
    public final void setHasMigratedData(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ilimboxAndroid.bphc.ilimbox.models.core.UserDetail getUserDetail() {
        return null;
    }
    
    public final void setUserDetail(@org.jetbrains.annotations.Nullable()
    ilimboxAndroid.bphc.ilimbox.models.core.UserDetail p0) {
    }
    
    public final void clearUser() {
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.models.core.UserDetail userDetail) {
    }
    
    public final boolean isNotificationsEnabled() {
        return false;
    }
    
    public final void setNotificationsEnabled(boolean b) {
    }
    
    public final boolean isDarkModeEnabled() {
        return false;
    }
    
    public final void setDarkModeEnabled(boolean b) {
    }
}