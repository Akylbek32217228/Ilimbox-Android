package ilimboxAndroid.ilimbox.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0015H\u0016J\u0014\u0010#\u001a\u00020\u001d2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"LilimboxAndroid/ilimbox/adapters/CourseContentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "activity", "Landroid/app/Activity;", "contents", "", "LilimboxAndroid/ilimbox/interfaces/CourseContent;", "fileManager", "LilimboxAndroid/ilimbox/core/FileManager;", "clickWrapperListener", "LilimboxAndroid/ilimbox/interfaces/ClickListener;", "moreOptionsClickListener", "(Landroid/app/Activity;Ljava/util/List;LilimboxAndroid/ilimbox/core/FileManager;LilimboxAndroid/ilimbox/interfaces/ClickListener;LilimboxAndroid/ilimbox/interfaces/ClickListener;)V", "getContents", "()Ljava/util/List;", "setContents", "(Ljava/util/List;)V", "delegatesManager", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;", "getItemCount", "", "getItemViewType", "position", "getPositionFromModId", "modId", "getPositionFromSectionNum", "sectionNum", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCourseContents", "app_debug"})
public final class CourseContentAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends ilimboxAndroid.ilimbox.interfaces.CourseContent> contents;
    private final com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager<java.util.List<ilimboxAndroid.ilimbox.interfaces.CourseContent>> delegatesManager = null;
    
    public CourseContentAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends ilimboxAndroid.ilimbox.interfaces.CourseContent> contents, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.core.FileManager fileManager, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.interfaces.ClickListener clickWrapperListener, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.interfaces.ClickListener moreOptionsClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ilimboxAndroid.ilimbox.interfaces.CourseContent> getContents() {
        return null;
    }
    
    public final void setContents(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends ilimboxAndroid.ilimbox.interfaces.CourseContent> p0) {
    }
    
    public final void setCourseContents(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends ilimboxAndroid.ilimbox.interfaces.CourseContent> contents) {
    }
    
    public final int getPositionFromSectionNum(int sectionNum) {
        return 0;
    }
    
    public final int getPositionFromModId(int modId) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
}