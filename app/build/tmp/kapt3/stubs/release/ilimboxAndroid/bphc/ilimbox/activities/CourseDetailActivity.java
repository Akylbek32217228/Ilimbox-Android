package ilimboxAndroid.bphc.ilimbox.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001c\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"LilimboxAndroid/bphc/ilimbox/activities/CourseDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "course", "LilimboxAndroid/bphc/ilimbox/models/course/Course;", "realm", "Lio/realm/Realm;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "resolveIntent", "setCourseContentFragment", "contextUrl", "", "setCourseEnrol", "enrolCourse", "LilimboxAndroid/bphc/ilimbox/models/enrol/SearchedCourseDetail;", "setDiscussionFragment", "forumId", "", "discussionId", "setForumFragment", "Companion", "app_release"})
public final class CourseDetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private io.realm.Realm realm;
    private ilimboxAndroid.bphc.ilimbox.models.course.Course course;
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.bphc.ilimbox.activities.CourseDetailActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COURSE_ENROL_FRAG_TRANSACTION_KEY = "course_enrol_frag";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_CONTEXT_URL_KEY = "contextUrl";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_COURSE_ID_KEY = "courseId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_CUSTOM_DATA_KEY = "customData";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_ENROL_COURSE_KEY = "courseParcel";
    private java.util.HashMap _$_findViewCache;
    
    public CourseDetailActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void resolveIntent() {
    }
    
    private final void setCourseEnrol(ilimboxAndroid.bphc.ilimbox.models.enrol.SearchedCourseDetail enrolCourse) {
    }
    
    private final void setCourseContentFragment(java.lang.String contextUrl) {
    }
    
    private final void setForumFragment(int forumId) {
    }
    
    private final void setDiscussionFragment(int forumId, int discussionId) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"LilimboxAndroid/bphc/ilimbox/activities/CourseDetailActivity$Companion;", "", "()V", "COURSE_ENROL_FRAG_TRANSACTION_KEY", "", "INTENT_CONTEXT_URL_KEY", "INTENT_COURSE_ID_KEY", "INTENT_CUSTOM_DATA_KEY", "INTENT_ENROL_COURSE_KEY", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}