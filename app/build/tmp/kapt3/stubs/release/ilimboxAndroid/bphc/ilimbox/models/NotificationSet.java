package ilimboxAndroid.bphc.ilimbox.models;

import java.lang.System;

/**
 * A data class for notification data
 *
 * @author Harshit Agarwal (18-Jan-2017)
 * @author Abhijeet Viswa
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u00c6\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006\""}, d2 = {"LilimboxAndroid/bphc/ilimbox/models/NotificationSet;", "", "uniqueId", "", "bundleId", "notifTitle", "", "notifContent", "groupKey", "pendingIntent", "Landroid/app/PendingIntent;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;)V", "getBundleId", "()I", "getGroupKey", "()Ljava/lang/String;", "getNotifContent", "getNotifTitle", "getPendingIntent", "()Landroid/app/PendingIntent;", "getUniqueId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_release"})
public final class NotificationSet {
    private final int uniqueId = 0;
    private final int bundleId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String notifTitle = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String notifContent = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String groupKey = null;
    @org.jetbrains.annotations.Nullable()
    private final android.app.PendingIntent pendingIntent = null;
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.bphc.ilimbox.models.NotificationSet.Companion Companion = null;
    
    /**
     * A data class for notification data
     *
     * @author Harshit Agarwal (18-Jan-2017)
     * @author Abhijeet Viswa
     */
    @org.jetbrains.annotations.NotNull()
    public final ilimboxAndroid.bphc.ilimbox.models.NotificationSet copy(int uniqueId, int bundleId, @org.jetbrains.annotations.NotNull()
    java.lang.String notifTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String notifContent, @org.jetbrains.annotations.Nullable()
    java.lang.String groupKey, @org.jetbrains.annotations.Nullable()
    android.app.PendingIntent pendingIntent) {
        return null;
    }
    
    /**
     * A data class for notification data
     *
     * @author Harshit Agarwal (18-Jan-2017)
     * @author Abhijeet Viswa
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A data class for notification data
     *
     * @author Harshit Agarwal (18-Jan-2017)
     * @author Abhijeet Viswa
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A data class for notification data
     *
     * @author Harshit Agarwal (18-Jan-2017)
     * @author Abhijeet Viswa
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public NotificationSet(int uniqueId, int bundleId, @org.jetbrains.annotations.NotNull()
    java.lang.String notifTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String notifContent, @org.jetbrains.annotations.Nullable()
    java.lang.String groupKey, @org.jetbrains.annotations.Nullable()
    android.app.PendingIntent pendingIntent) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getUniqueId() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getBundleId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNotifTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNotifContent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGroupKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.PendingIntent component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.PendingIntent getPendingIntent() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\u0011"}, d2 = {"LilimboxAndroid/bphc/ilimbox/models/NotificationSet$Companion;", "", "()V", "createNotificationSetForDiscussion", "LilimboxAndroid/bphc/ilimbox/models/NotificationSet;", "context", "Landroid/content/Context;", "course", "LilimboxAndroid/bphc/ilimbox/models/course/Course;", "module", "LilimboxAndroid/bphc/ilimbox/models/course/Module;", "discussion", "LilimboxAndroid/bphc/ilimbox/models/forum/Discussion;", "createNotificationSetForModule", "section", "LilimboxAndroid/bphc/ilimbox/models/course/CourseSection;", "createNotificationSetForSiteNews", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Helper method to create [NotificationSet] object for a new module
         */
        @org.jetbrains.annotations.NotNull()
        public final ilimboxAndroid.bphc.ilimbox.models.NotificationSet createNotificationSetForModule(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        ilimboxAndroid.bphc.ilimbox.models.course.Course course, @org.jetbrains.annotations.NotNull()
        ilimboxAndroid.bphc.ilimbox.models.course.CourseSection section, @org.jetbrains.annotations.NotNull()
        ilimboxAndroid.bphc.ilimbox.models.course.Module module) {
            return null;
        }
        
        /**
         * Helper method to create [NotificationSet] object for a new discussion
         */
        @org.jetbrains.annotations.NotNull()
        public final ilimboxAndroid.bphc.ilimbox.models.NotificationSet createNotificationSetForDiscussion(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        ilimboxAndroid.bphc.ilimbox.models.course.Course course, @org.jetbrains.annotations.NotNull()
        ilimboxAndroid.bphc.ilimbox.models.course.Module module, @org.jetbrains.annotations.NotNull()
        ilimboxAndroid.bphc.ilimbox.models.forum.Discussion discussion) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ilimboxAndroid.bphc.ilimbox.models.NotificationSet createNotificationSetForSiteNews(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        ilimboxAndroid.bphc.ilimbox.models.forum.Discussion discussion) {
            return null;
        }
    }
}