package ilimboxAndroid.bphc.ilimbox.fragments;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 * Use the [ForumFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u001a\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/ForumFragment;", "Landroidx/fragment/app/Fragment;", "()V", "courseId", "", "courseName", "", "courseRequestHandler", "LilimboxAndroid/bphc/ilimbox/helper/CourseRequestHandler;", "emptyView", "Landroid/widget/TextView;", "forumId", "mAdapter", "LilimboxAndroid/bphc/ilimbox/fragments/ForumFragment$Adapter;", "swipeRefresh", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "webView", "Landroid/webkit/WebView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onViewCreated", "view", "refreshContent", "Adapter", "Companion", "app_release"})
public final class ForumFragment extends androidx.fragment.app.Fragment {
    private int courseId = -1;
    private int forumId = 1;
    private java.lang.String courseName = "";
    private ilimboxAndroid.bphc.ilimbox.helper.CourseRequestHandler courseRequestHandler;
    private ilimboxAndroid.bphc.ilimbox.fragments.ForumFragment.Adapter mAdapter;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefresh;
    private android.widget.TextView emptyView;
    private android.webkit.WebView webView;
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.bphc.ilimbox.fragments.ForumFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COURSE_ID_KEY = "courseId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORUM_ID_KEY = "forumId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COURSE_NAME_KEY = "courseName";
    private java.util.HashMap _$_findViewCache;
    
    public ForumFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
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
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    private final void refreshContent() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u001aB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fJ\u0006\u0010\u0010\u001a\u00020\rJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\r2\u000e\u0010\u0014\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J \u0010\u0016\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/ForumFragment$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LilimboxAndroid/bphc/ilimbox/fragments/ForumFragment$Adapter$ForumViewHolder;", "LilimboxAndroid/bphc/ilimbox/fragments/ForumFragment;", "clickListener", "LilimboxAndroid/bphc/ilimbox/interfaces/ClickListener;", "mDiscussions", "", "LilimboxAndroid/bphc/ilimbox/models/forum/Discussion;", "(LilimboxAndroid/bphc/ilimbox/fragments/ForumFragment;LilimboxAndroid/bphc/ilimbox/interfaces/ClickListener;Ljava/util/List;)V", "getMDiscussions", "()Ljava/util/List;", "addDiscussions", "", "discussions", "", "clearDiscussions", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ForumViewHolder", "app_release"})
    final class Adapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ilimboxAndroid.bphc.ilimbox.fragments.ForumFragment.Adapter.ForumViewHolder> {
        private final ilimboxAndroid.bphc.ilimbox.interfaces.ClickListener clickListener = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ilimboxAndroid.bphc.ilimbox.models.forum.Discussion> mDiscussions = null;
        
        public Adapter(@org.jetbrains.annotations.NotNull()
        ilimboxAndroid.bphc.ilimbox.interfaces.ClickListener clickListener, @org.jetbrains.annotations.NotNull()
        java.util.List<ilimboxAndroid.bphc.ilimbox.models.forum.Discussion> mDiscussions) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ilimboxAndroid.bphc.ilimbox.models.forum.Discussion> getMDiscussions() {
            return null;
        }
        
        public final void addDiscussions(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends ilimboxAndroid.bphc.ilimbox.models.forum.Discussion> discussions) {
        }
        
        public final void clearDiscussions() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ilimboxAndroid.bphc.ilimbox.fragments.ForumFragment.Adapter.ForumViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        ilimboxAndroid.bphc.ilimbox.fragments.ForumFragment.Adapter.ForumViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/ForumFragment$Adapter$ForumViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(LilimboxAndroid/bphc/ilimbox/fragments/ForumFragment$Adapter;Landroid/view/View;)V", "mMessage", "LilimboxAndroid/bphc/ilimbox/widgets/HtmlTextView;", "mModifiedTime", "Landroid/widget/TextView;", "mPinned", "Landroid/widget/ImageView;", "mSubject", "mUserName", "mUserPic", "bind", "", "discussion", "LilimboxAndroid/bphc/ilimbox/models/forum/Discussion;", "app_release"})
        public final class ForumViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            private final android.widget.ImageView mUserPic = null;
            private final android.widget.ImageView mPinned = null;
            private final android.widget.TextView mSubject = null;
            private final android.widget.TextView mUserName = null;
            private final android.widget.TextView mModifiedTime = null;
            private final ilimboxAndroid.bphc.ilimbox.widgets.HtmlTextView mMessage = null;
            
            public ForumViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View itemView) {
                super(null);
            }
            
            public final void bind(@org.jetbrains.annotations.NotNull()
            ilimboxAndroid.bphc.ilimbox.models.forum.Discussion discussion) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/ForumFragment$Companion;", "", "()V", "COURSE_ID_KEY", "", "COURSE_NAME_KEY", "FORUM_ID_KEY", "newInstance", "LilimboxAndroid/bphc/ilimbox/fragments/ForumFragment;", "courseId", "", "forumId", "courseName", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        public final ilimboxAndroid.bphc.ilimbox.fragments.ForumFragment newInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        public final ilimboxAndroid.bphc.ilimbox.fragments.ForumFragment newInstance(int courseId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        public final ilimboxAndroid.bphc.ilimbox.fragments.ForumFragment newInstance(int courseId, int forumId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        public final ilimboxAndroid.bphc.ilimbox.fragments.ForumFragment newInstance(int courseId, int forumId, @org.jetbrains.annotations.NotNull()
        java.lang.String courseName) {
            return null;
        }
    }
}