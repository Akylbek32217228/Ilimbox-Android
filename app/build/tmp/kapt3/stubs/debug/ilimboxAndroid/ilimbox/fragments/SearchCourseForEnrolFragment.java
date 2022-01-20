package ilimboxAndroid.ilimbox.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0002./B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u0002J\u0012\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\u001a\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010+\u001a\u00020\u001dH\u0002J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u0017H\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"LilimboxAndroid/ilimbox/fragments/SearchCourseForEnrolFragment;", "Landroidx/fragment/app/Fragment;", "LilimboxAndroid/ilimbox/fragments/ClassNumberInterface;", "()V", "call", "Lretrofit2/Call;", "LilimboxAndroid/ilimbox/models/enrol/CourseSearch;", "containsMore", "", "getContainsMore", "()Z", "setContainsMore", "(Z)V", "editText", "Landroid/widget/EditText;", "empty", "Landroid/widget/TextView;", "mLoading", "mPreviousSearch", "", "moodleServices", "LilimboxAndroid/ilimbox/network/MoodleServices;", "page", "", "searchCourseAdapter", "LilimboxAndroid/ilimbox/fragments/SearchCourseForEnrolFragment$SearchCourseAdapter;", "swipeRefresh", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getSearchCourses", "", "searchString", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onViewCreated", "view", "performSearch", "setCourses", "number", "Companion", "SearchCourseAdapter", "app_debug"})
public final class SearchCourseForEnrolFragment extends androidx.fragment.app.Fragment implements ilimboxAndroid.ilimbox.fragments.ClassNumberInterface {
    private boolean containsMore = true;
    private int page = 0;
    private java.lang.String mPreviousSearch = "";
    private boolean mLoading = false;
    private android.widget.EditText editText;
    private ilimboxAndroid.ilimbox.fragments.SearchCourseForEnrolFragment.SearchCourseAdapter searchCourseAdapter;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefresh;
    private android.widget.TextView empty;
    private ilimboxAndroid.ilimbox.network.MoodleServices moodleServices;
    private retrofit2.Call<ilimboxAndroid.ilimbox.models.enrol.CourseSearch> call;
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.ilimbox.fragments.SearchCourseForEnrolFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public SearchCourseForEnrolFragment() {
        super();
    }
    
    public final boolean getContainsMore() {
        return false;
    }
    
    public final void setContainsMore(boolean p0) {
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
    
    private final void performSearch() {
    }
    
    private final void getSearchCourses(java.lang.String searchString) {
    }
    
    @java.lang.Override()
    public void setCourses(int number) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u000e2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"LilimboxAndroid/ilimbox/fragments/SearchCourseForEnrolFragment$SearchCourseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LilimboxAndroid/ilimbox/fragments/SearchCourseForEnrolFragment$SearchCourseAdapter$SearchCourseViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mClickListener", "LilimboxAndroid/ilimbox/interfaces/ClickListener;", "mCourses", "", "LilimboxAndroid/ilimbox/models/enrol/SearchedCourseDetail;", "mLayoutInflater", "Landroid/view/LayoutInflater;", "addExtraCourses", "", "courses", "", "clearCourses", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClickListener", "clickListener", "SearchCourseViewHolder", "app_debug"})
    static final class SearchCourseAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ilimboxAndroid.ilimbox.fragments.SearchCourseForEnrolFragment.SearchCourseAdapter.SearchCourseViewHolder> {
        private final android.view.LayoutInflater mLayoutInflater = null;
        private java.util.List<ilimboxAndroid.ilimbox.models.enrol.SearchedCourseDetail> mCourses;
        private ilimboxAndroid.ilimbox.interfaces.ClickListener mClickListener;
        
        public SearchCourseAdapter(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        public final void addExtraCourses(@org.jetbrains.annotations.NotNull()
        java.util.List<ilimboxAndroid.ilimbox.models.enrol.SearchedCourseDetail> courses) {
        }
        
        public final void clearCourses() {
        }
        
        public final void setClickListener(@org.jetbrains.annotations.NotNull()
        ilimboxAndroid.ilimbox.interfaces.ClickListener clickListener) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ilimboxAndroid.ilimbox.fragments.SearchCourseForEnrolFragment.SearchCourseAdapter.SearchCourseViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        ilimboxAndroid.ilimbox.fragments.SearchCourseForEnrolFragment.SearchCourseAdapter.SearchCourseViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"LilimboxAndroid/ilimbox/fragments/SearchCourseForEnrolFragment$SearchCourseAdapter$SearchCourseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(LilimboxAndroid/ilimbox/fragments/SearchCourseForEnrolFragment$SearchCourseAdapter;Landroid/view/View;)V", "mSearchCourseDisplayName", "Landroid/widget/TextView;", "getMSearchCourseDisplayName", "()Landroid/widget/TextView;", "app_debug"})
        public final class SearchCourseViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView mSearchCourseDisplayName = null;
            
            public SearchCourseViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View itemView) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getMSearchCourseDisplayName() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"LilimboxAndroid/ilimbox/fragments/SearchCourseForEnrolFragment$Companion;", "", "()V", "newInstance", "LilimboxAndroid/ilimbox/fragments/SearchCourseForEnrolFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ilimboxAndroid.ilimbox.fragments.SearchCourseForEnrolFragment newInstance() {
            return null;
        }
    }
}