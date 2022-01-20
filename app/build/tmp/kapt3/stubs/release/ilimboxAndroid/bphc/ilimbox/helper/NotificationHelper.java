package ilimboxAndroid.bphc.ilimbox.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 4, d1 = {"ilimboxAndroid/bphc/ilimbox/helper/NotificationHelper__NotificationHelperKt"})
public final class NotificationHelper {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_CHANNEL_UPDATES_BUNDLE = "channel_content_updates_bundle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_CHANNEL_UPDATES = "channel_content_updates";
    
    public static final void pushCourseSectionNotif(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.NotificationManager notifManager, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.models.course.CourseSection section, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.models.course.Course course) {
    }
    
    public static final void pushModuleNotif(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.NotificationManager notifManager, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.models.course.Module module, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.models.course.CourseSection section, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.models.course.Course course) {
    }
    
    public static final void pushDiscussionNotif(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.NotificationManager notifManager, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.models.forum.Discussion discussion, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.models.course.Module module, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.models.course.Course course) {
    }
    
    public static final void pushSiteNewsNotif(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.NotificationManager notifManager, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.models.forum.Discussion discussion) {
    }
    
    public static final void createLoggedOutNotif(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.NotificationManager notifManager) {
    }
    
    public static final void createNotifFromSet(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.NotificationManager notifManager, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.models.NotificationSet notifSet) {
    }
}