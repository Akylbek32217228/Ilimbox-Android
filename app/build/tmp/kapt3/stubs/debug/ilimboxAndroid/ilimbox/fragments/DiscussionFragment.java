package ilimboxAndroid.ilimbox.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 42\u00020\u0001:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010,\u001a\u00020 H\u0016J\b\u0010-\u001a\u00020 H\u0016J\u001a\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\'2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020\u0011H\u0002J\u0018\u00102\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u00103\u001a\u00020 2\u0006\u0010\b\u001a\u00020\tH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"LilimboxAndroid/ilimbox/fragments/DiscussionFragment;", "Landroidx/fragment/app/Fragment;", "()V", "attachmentContainer", "Landroid/widget/LinearLayout;", "content", "courseId", "", "discussion", "LilimboxAndroid/ilimbox/models/forum/Discussion;", "discussionId", "empty", "Landroid/widget/TextView;", "fileManager", "LilimboxAndroid/ilimbox/core/FileManager;", "forumId", "mCourseName", "", "message", "LilimboxAndroid/ilimbox/widgets/HtmlTextView;", "moreOptionsViewModel", "LilimboxAndroid/ilimbox/fragments/MoreOptionsFragment$OptionsViewModel;", "realm", "Lio/realm/Realm;", "subject", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "timeModified", "userName", "userPic", "Landroid/widget/ImageView;", "downloadAttachment", "", "attachment", "LilimboxAndroid/ilimbox/models/forum/Attachment;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onViewCreated", "view", "oneFileDownloaded", "filename", "refreshContent", "setDiscussion", "Companion", "app_debug"})
public final class DiscussionFragment extends androidx.fragment.app.Fragment {
    private io.realm.Realm realm;
    private ilimboxAndroid.ilimbox.core.FileManager fileManager;
    private ilimboxAndroid.ilimbox.fragments.MoreOptionsFragment.OptionsViewModel moreOptionsViewModel;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout;
    private android.widget.TextView empty;
    private android.widget.LinearLayout content;
    private android.widget.ImageView userPic;
    private android.widget.TextView subject;
    private android.widget.TextView userName;
    private android.widget.TextView timeModified;
    private ilimboxAndroid.ilimbox.widgets.HtmlTextView message;
    private android.widget.LinearLayout attachmentContainer;
    private ilimboxAndroid.ilimbox.models.forum.Discussion discussion;
    private int courseId = 0;
    private int forumId = 0;
    private int discussionId = 0;
    private java.lang.String mCourseName = "";
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.ilimbox.fragments.DiscussionFragment.Companion Companion = null;
    private static final java.lang.String COURSE_ID_KEY = "courseId";
    private static final java.lang.String COURSE_NAME_KEY = "contextUrl";
    private static final java.lang.String FORUM_ID_KEY = "forumId";
    private static final java.lang.String DISCUSSION_ID_KEY = "discussionId";
    private java.util.HashMap _$_findViewCache;
    
    public DiscussionFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.MainThread()
    private final void setDiscussion(ilimboxAndroid.ilimbox.models.forum.Discussion discussion) {
    }
    
    private final void refreshContent(int forumId, int discussionId) {
    }
    
    private final void downloadAttachment(ilimboxAndroid.ilimbox.models.forum.Attachment attachment) {
    }
    
    private final void oneFileDownloaded(java.lang.String filename) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final ilimboxAndroid.ilimbox.fragments.DiscussionFragment newInstance(int courseId, int forumId, int discussionId, @org.jetbrains.annotations.NotNull()
    java.lang.String mCourseName) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"LilimboxAndroid/ilimbox/fragments/DiscussionFragment$Companion;", "", "()V", "COURSE_ID_KEY", "", "COURSE_NAME_KEY", "DISCUSSION_ID_KEY", "FORUM_ID_KEY", "newInstance", "LilimboxAndroid/ilimbox/fragments/DiscussionFragment;", "courseId", "", "forumId", "discussionId", "mCourseName", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final ilimboxAndroid.ilimbox.fragments.DiscussionFragment newInstance(int courseId, int forumId, int discussionId, @org.jetbrains.annotations.NotNull()
        java.lang.String mCourseName) {
            return null;
        }
    }
}