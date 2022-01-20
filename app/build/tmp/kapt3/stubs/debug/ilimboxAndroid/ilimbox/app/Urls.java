package ilimboxAndroid.ilimbox.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"LilimboxAndroid/ilimbox/app/Urls;", "", "()V", "COURSE_URL", "Landroid/net/Uri;", "MOODLE_URL", "SSO_LOGIN_URL", "SSO_URL_SCHEME", "", "getCourseUrl", "courseId", "", "sectionNum", "getFeedbackURL", "username", "id", "getModIdFromUrl", "url", "getProfilePicUrl", "urlString", "getSectionNumFromUrl", "isCourseModuleUrl", "", "isCourseSectionUrl", "isForumDiscussionUrl", "isMoodleUrl", "app_debug"})
public final class Urls {
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.ilimbox.app.Urls INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final android.net.Uri MOODLE_URL = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SSO_URL_SCHEME = "cmsbphc";
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final android.net.Uri SSO_LOGIN_URL = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final android.net.Uri COURSE_URL = null;
    
    private Urls() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.net.Uri getCourseUrl(int courseId, int sectionNum) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getFeedbackURL(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getProfilePicUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String urlString) {
        return null;
    }
    
    public final boolean isMoodleUrl(@org.jetbrains.annotations.NotNull()
    android.net.Uri url) {
        return false;
    }
    
    public final boolean isCourseSectionUrl(@org.jetbrains.annotations.NotNull()
    android.net.Uri url) {
        return false;
    }
    
    public final boolean isCourseModuleUrl(@org.jetbrains.annotations.NotNull()
    android.net.Uri url) {
        return false;
    }
    
    public final boolean isForumDiscussionUrl(@org.jetbrains.annotations.NotNull()
    android.net.Uri url) {
        return false;
    }
    
    public final int getModIdFromUrl(@org.jetbrains.annotations.NotNull()
    android.net.Uri url) {
        return 0;
    }
    
    public final int getSectionNumFromUrl(@org.jetbrains.annotations.NotNull()
    android.net.Uri url) {
        return 0;
    }
}