package ilimboxAndroid.ilimbox.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 12\u00020\u00012\u00020\u0002:\u000201B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\"\u001a\u00020\u0014H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u0014H\u0016J\b\u0010(\u001a\u00020\u0014H\u0017J\u001a\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010+\u001a\u00020\u0014H\u0002J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u000eH\u0016J\u0011\u0010.\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00062"}, d2 = {"LilimboxAndroid/ilimbox/fragments/MyCoursesFragment;", "Landroidx/fragment/app/Fragment;", "LilimboxAndroid/ilimbox/fragments/ClassNumberInterface;", "()V", "courseDataHandler", "LilimboxAndroid/ilimbox/helper/CourseDataHandler;", "courseDetailActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "courses", "", "LilimboxAndroid/ilimbox/models/course/Course;", "coursesUpdated", "", "mAdapter", "LilimboxAndroid/ilimbox/fragments/MyCoursesFragment$Adapter;", "realm", "Lio/realm/Realm;", "checkEmpty", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "onStart", "onViewCreated", "view", "refreshCourses", "setCourses", "number", "updateCourseContent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Adapter", "Companion", "app_debug"})
public final class MyCoursesFragment extends androidx.fragment.app.Fragment implements ilimboxAndroid.ilimbox.fragments.ClassNumberInterface {
    private io.realm.Realm realm;
    private ilimboxAndroid.ilimbox.helper.CourseDataHandler courseDataHandler;
    private int coursesUpdated = 0;
    private java.util.List<ilimboxAndroid.ilimbox.models.course.Course> courses;
    private ilimboxAndroid.ilimbox.fragments.MyCoursesFragment.Adapter mAdapter;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> courseDetailActivityLauncher = null;
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.ilimbox.fragments.MyCoursesFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "MyCoursesFragment";
    private java.util.HashMap _$_findViewCache;
    
    public MyCoursesFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
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
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkEmpty() {
    }
    
    private final void refreshCourses() {
    }
    
    private final java.lang.Object updateCourseContent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final ilimboxAndroid.ilimbox.fragments.MyCoursesFragment newInstance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getTAG() {
        return null;
    }
    
    @java.lang.Override()
    public void setCourses(int number) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001+B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\u001d\u001a\u00020\u001e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020\"H\u0016J \u0010#\u001a\u00020\u001e2\u000e\u0010$\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010%\u001a\u00020\"H\u0016J \u0010&\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\"H\u0016J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"LilimboxAndroid/ilimbox/fragments/MyCoursesFragment$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LilimboxAndroid/ilimbox/fragments/MyCoursesFragment$Adapter$MyViewHolder;", "LilimboxAndroid/ilimbox/fragments/MyCoursesFragment;", "context", "Landroid/content/Context;", "courseList", "", "LilimboxAndroid/ilimbox/models/course/Course;", "(LilimboxAndroid/ilimbox/fragments/MyCoursesFragment;Landroid/content/Context;Ljava/util/List;)V", "clickListener", "LilimboxAndroid/ilimbox/interfaces/ClickListener;", "getClickListener", "()LilimboxAndroid/ilimbox/interfaces/ClickListener;", "setClickListener", "(LilimboxAndroid/ilimbox/interfaces/ClickListener;)V", "getContext", "()Landroid/content/Context;", "value", "courses", "getCourses", "()Ljava/util/List;", "setCourses", "(Ljava/util/List;)V", "downloadClickListener", "getDownloadClickListener", "setDownloadClickListener", "inflater", "Landroid/view/LayoutInflater;", "filterCoursesByName", "", "courseName", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "sortCourses", "MyViewHolder", "app_debug"})
    final class Adapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ilimboxAndroid.ilimbox.fragments.MyCoursesFragment.Adapter.MyViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        private final android.view.LayoutInflater inflater = null;
        @org.jetbrains.annotations.Nullable()
        private ilimboxAndroid.ilimbox.interfaces.ClickListener clickListener;
        @org.jetbrains.annotations.Nullable()
        private ilimboxAndroid.ilimbox.interfaces.ClickListener downloadClickListener;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<? extends ilimboxAndroid.ilimbox.models.course.Course> courses;
        
        public Adapter(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ilimboxAndroid.ilimbox.models.course.Course> courseList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final ilimboxAndroid.ilimbox.interfaces.ClickListener getClickListener() {
            return null;
        }
        
        public final void setClickListener(@org.jetbrains.annotations.Nullable()
        ilimboxAndroid.ilimbox.interfaces.ClickListener p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final ilimboxAndroid.ilimbox.interfaces.ClickListener getDownloadClickListener() {
            return null;
        }
        
        public final void setDownloadClickListener(@org.jetbrains.annotations.Nullable()
        ilimboxAndroid.ilimbox.interfaces.ClickListener p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ilimboxAndroid.ilimbox.models.course.Course> getCourses() {
            return null;
        }
        
        public final void setCourses(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends ilimboxAndroid.ilimbox.models.course.Course> value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ilimboxAndroid.ilimbox.fragments.MyCoursesFragment.Adapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        ilimboxAndroid.ilimbox.fragments.MyCoursesFragment.Adapter.MyViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        private final java.util.List<ilimboxAndroid.ilimbox.models.course.Course> sortCourses(java.util.List<? extends ilimboxAndroid.ilimbox.models.course.Course> courseList) {
            return null;
        }
        
        public final void filterCoursesByName(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends ilimboxAndroid.ilimbox.models.course.Course> courseList, @org.jetbrains.annotations.NotNull()
        java.lang.String courseName) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011\u00a8\u0006\u0012"}, d2 = {"LilimboxAndroid/ilimbox/fragments/MyCoursesFragment$Adapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(LilimboxAndroid/ilimbox/fragments/MyCoursesFragment$Adapter;Landroid/view/View;)V", "bind", "", "course", "LilimboxAndroid/ilimbox/models/course/Course;", "confirmDownloadCourse", "markCourseAsRead", "setCourseIcon", "id", "", "setFavoriteStatus", "position", "isFavourite", "", "app_debug"})
        public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            
            public MyViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View itemView) {
                super(null);
            }
            
            public final void bind(@org.jetbrains.annotations.NotNull()
            ilimboxAndroid.ilimbox.models.course.Course course) {
            }
            
            private final void setCourseIcon(int id) {
            }
            
            public final void confirmDownloadCourse() {
            }
            
            public final void markCourseAsRead() {
            }
            
            public final void setFavoriteStatus(int position, boolean isFavourite) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"LilimboxAndroid/ilimbox/fragments/MyCoursesFragment$Companion;", "", "()V", "TAG", "", "getTAG$annotations", "getTAG", "()Ljava/lang/String;", "newInstance", "LilimboxAndroid/ilimbox/fragments/MyCoursesFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final ilimboxAndroid.ilimbox.fragments.MyCoursesFragment newInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void getTAG$annotations() {
        }
    }
}