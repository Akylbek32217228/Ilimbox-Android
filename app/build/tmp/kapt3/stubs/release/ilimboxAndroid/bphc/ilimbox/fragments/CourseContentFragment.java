package ilimboxAndroid.bphc.ilimbox.fragments;

import java.lang.System;

/**
 * @author Siddhant Kumar Patel, Abhijeet Viswa
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 R2\u00020\u0001:\u0001RB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u00100\u001a\u000201J\b\u00102\u001a\u00020\"H\u0002J\b\u00103\u001a\u00020\"H\u0002J\u0010\u00104\u001a\u0002012\u0006\u00105\u001a\u00020\u0018H\u0002J\u0012\u00106\u001a\u0002012\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0018\u00109\u001a\u0002012\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J&\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010<\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u0010C\u001a\u000201H\u0016J\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u000201H\u0016J\u001a\u0010I\u001a\u0002012\u0006\u0010J\u001a\u00020?2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0012\u0010K\u001a\u0002012\b\b\u0002\u0010L\u001a\u00020\u0018H\u0002J\b\u0010M\u001a\u000201H\u0003J\u0010\u0010N\u001a\u0002012\u0006\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u000201H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u00a8\u0006S"}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/CourseContentFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "LilimboxAndroid/bphc/ilimbox/databinding/FragmentCourseSectionBinding;", "adapter", "LilimboxAndroid/bphc/ilimbox/adapters/CourseContentAdapter;", "binding", "getBinding", "()LilimboxAndroid/bphc/ilimbox/databinding/FragmentCourseSectionBinding;", "courseContents", "", "LilimboxAndroid/bphc/ilimbox/interfaces/CourseContent;", "getCourseContents", "()Ljava/util/List;", "courseDataHandler", "LilimboxAndroid/bphc/ilimbox/helper/CourseDataHandler;", "courseId", "", "getCourseId", "()I", "setCourseId", "(I)V", "courseName", "", "courseSections", "LilimboxAndroid/bphc/ilimbox/models/course/CourseSection;", "empty", "Landroid/widget/TextView;", "fileManager", "LilimboxAndroid/bphc/ilimbox/core/FileManager;", "mSwipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "moduleClickWrapperClickListener", "LilimboxAndroid/bphc/ilimbox/interfaces/ClickListener;", "moduleMoreOptionsClickListener", "moreOptionsViewModel", "LilimboxAndroid/bphc/ilimbox/fragments/MoreOptionsFragment$OptionsViewModel;", "quarterNumber", "realm", "Lio/realm/Realm;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "token", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "clearTextColor", "", "createModuleClickWrapperClickListener", "createModuleMoreOptionsClickListener", "findAndScrollToPosition", "urlStr", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onStart", "onViewCreated", "view", "refreshContent", "contextUrl", "setCourseContentsOnAdapter", "shareModuleLinks", "module", "LilimboxAndroid/bphc/ilimbox/models/course/Module;", "showSectionsOrEmpty", "Companion", "app_release"})
public final class CourseContentFragment extends androidx.fragment.app.Fragment {
    private ilimboxAndroid.bphc.ilimbox.databinding.FragmentCourseSectionBinding _binding;
    private ilimboxAndroid.bphc.ilimbox.core.FileManager fileManager;
    private ilimboxAndroid.bphc.ilimbox.helper.CourseDataHandler courseDataHandler;
    private io.realm.Realm realm;
    private int courseId = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String token = "";
    private java.lang.String courseName;
    private java.util.List<? extends ilimboxAndroid.bphc.ilimbox.models.course.CourseSection> courseSections;
    private android.widget.TextView empty;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout mSwipeRefreshLayout;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private ilimboxAndroid.bphc.ilimbox.adapters.CourseContentAdapter adapter;
    private ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment.OptionsViewModel moreOptionsViewModel;
    private final ilimboxAndroid.bphc.ilimbox.interfaces.ClickListener moduleClickWrapperClickListener = null;
    private final ilimboxAndroid.bphc.ilimbox.interfaces.ClickListener moduleMoreOptionsClickListener = null;
    private int quarterNumber = 1;
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.bphc.ilimbox.fragments.CourseContentFragment.Companion Companion = null;
    private static final java.lang.String TAG = "CourseContentFragment";
    private static final java.lang.String TOKEN_KEY = "token";
    private static final java.lang.String COURSE_ID_KEY = "id";
    private static final java.lang.String CONTEXT_URL_KEY = "contextUrl";
    private java.util.HashMap _$_findViewCache;
    
    public CourseContentFragment() {
        super();
    }
    
    private final ilimboxAndroid.bphc.ilimbox.databinding.FragmentCourseSectionBinding getBinding() {
        return null;
    }
    
    public final int getCourseId() {
        return 0;
    }
    
    public final void setCourseId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final java.util.List<ilimboxAndroid.bphc.ilimbox.interfaces.CourseContent> getCourseContents() {
        return null;
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
    
    public final void clearTextColor() {
    }
    
    private final ilimboxAndroid.bphc.ilimbox.interfaces.ClickListener createModuleMoreOptionsClickListener() {
        return null;
    }
    
    private final ilimboxAndroid.bphc.ilimbox.interfaces.ClickListener createModuleClickWrapperClickListener() {
        return null;
    }
    
    private final void shareModuleLinks(ilimboxAndroid.bphc.ilimbox.models.course.Module module) {
    }
    
    private final void findAndScrollToPosition(java.lang.String urlStr) {
    }
    
    private final void showSectionsOrEmpty() {
    }
    
    private final void refreshContent(java.lang.String contextUrl) {
    }
    
    @androidx.annotation.MainThread()
    private final void setCourseContentsOnAdapter() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final ilimboxAndroid.bphc.ilimbox.fragments.CourseContentFragment newInstance(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int courseId, @org.jetbrains.annotations.NotNull()
    java.lang.String contextUrl) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/CourseContentFragment$Companion;", "", "()V", "CONTEXT_URL_KEY", "", "COURSE_ID_KEY", "TAG", "TOKEN_KEY", "newInstance", "LilimboxAndroid/bphc/ilimbox/fragments/CourseContentFragment;", "token", "courseId", "", "contextUrl", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final ilimboxAndroid.bphc.ilimbox.fragments.CourseContentFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String token, int courseId, @org.jetbrains.annotations.NotNull()
        java.lang.String contextUrl) {
            return null;
        }
    }
}