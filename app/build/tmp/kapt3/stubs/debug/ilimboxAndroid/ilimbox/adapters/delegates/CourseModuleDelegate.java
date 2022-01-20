package ilimboxAndroid.ilimbox.adapters.delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001%B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001e\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J4\u0010\u001c\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0002H\u0014J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0014J\u0018\u0010$\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"LilimboxAndroid/ilimbox/adapters/delegates/CourseModuleDelegate;", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;", "", "LilimboxAndroid/ilimbox/interfaces/CourseContent;", "activity", "Landroid/app/Activity;", "fileManager", "LilimboxAndroid/ilimbox/core/FileManager;", "clickWrapperClickListener", "LilimboxAndroid/ilimbox/interfaces/ClickListener;", "moreOptionsClickListener", "(Landroid/app/Activity;LilimboxAndroid/ilimbox/core/FileManager;LilimboxAndroid/ilimbox/interfaces/ClickListener;LilimboxAndroid/ilimbox/interfaces/ClickListener;)V", "inflater", "Landroid/view/LayoutInflater;", "bindClickListeners", "", "vh", "LilimboxAndroid/ilimbox/adapters/delegates/CourseModuleDelegate$CourseModuleViewHolder;", "module", "LilimboxAndroid/ilimbox/models/course/Module;", "position", "", "bindIcons", "bindMoreOptions", "bindNameAndDescription", "isForViewType", "", "items", "onBindViewHolder", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "setLayoutTheme", "CourseModuleViewHolder", "app_debug"})
public final class CourseModuleDelegate extends com.hannesdorfmann.adapterdelegates4.AdapterDelegate<java.util.List<? extends ilimboxAndroid.ilimbox.interfaces.CourseContent>> {
    private final android.app.Activity activity = null;
    private final ilimboxAndroid.ilimbox.core.FileManager fileManager = null;
    private final ilimboxAndroid.ilimbox.interfaces.ClickListener clickWrapperClickListener = null;
    private final ilimboxAndroid.ilimbox.interfaces.ClickListener moreOptionsClickListener = null;
    private final android.view.LayoutInflater inflater = null;
    
    public CourseModuleDelegate(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.core.FileManager fileManager, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.interfaces.ClickListener clickWrapperClickListener, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.interfaces.ClickListener moreOptionsClickListener) {
        super();
    }
    
    @java.lang.Override()
    protected boolean isForViewType(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends ilimboxAndroid.ilimbox.interfaces.CourseContent> items, int position) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    protected void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends ilimboxAndroid.ilimbox.interfaces.CourseContent> items, int position, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> payloads) {
    }
    
    private final void setLayoutTheme(ilimboxAndroid.ilimbox.adapters.delegates.CourseModuleDelegate.CourseModuleViewHolder vh, ilimboxAndroid.ilimbox.models.course.Module module) {
    }
    
    private final void bindClickListeners(ilimboxAndroid.ilimbox.adapters.delegates.CourseModuleDelegate.CourseModuleViewHolder vh, ilimboxAndroid.ilimbox.models.course.Module module, int position) {
    }
    
    private final void bindNameAndDescription(ilimboxAndroid.ilimbox.adapters.delegates.CourseModuleDelegate.CourseModuleViewHolder vh, ilimboxAndroid.ilimbox.models.course.Module module) {
    }
    
    private final void bindIcons(ilimboxAndroid.ilimbox.adapters.delegates.CourseModuleDelegate.CourseModuleViewHolder vh, ilimboxAndroid.ilimbox.models.course.Module module) {
    }
    
    private final void bindMoreOptions(ilimboxAndroid.ilimbox.adapters.delegates.CourseModuleDelegate.CourseModuleViewHolder vh, ilimboxAndroid.ilimbox.models.course.Module module) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006 "}, d2 = {"LilimboxAndroid/ilimbox/adapters/delegates/CourseModuleDelegate$CourseModuleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "clickWrapper", "getClickWrapper", "()Landroid/view/View;", "description", "LilimboxAndroid/ilimbox/widgets/CollapsibleTextView;", "getDescription", "()LilimboxAndroid/ilimbox/widgets/CollapsibleTextView;", "downloadIcon", "Landroid/widget/ImageView;", "getDownloadIcon", "()Landroid/widget/ImageView;", "layoutWrapper", "getLayoutWrapper", "modIcon", "getModIcon", "more", "getMore", "name", "LilimboxAndroid/ilimbox/widgets/HtmlTextView;", "getName", "()LilimboxAndroid/ilimbox/widgets/HtmlTextView;", "nameAndDescriptionDivider", "getNameAndDescriptionDivider", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "app_debug"})
    public static final class CourseModuleViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final ilimboxAndroid.ilimbox.widgets.HtmlTextView name = null;
        @org.jetbrains.annotations.NotNull()
        private final ilimboxAndroid.ilimbox.widgets.CollapsibleTextView description = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView modIcon = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView more = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView downloadIcon = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ProgressBar progressBar = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View nameAndDescriptionDivider = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View layoutWrapper = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View clickWrapper = null;
        
        public CourseModuleViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ilimboxAndroid.ilimbox.widgets.HtmlTextView getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ilimboxAndroid.ilimbox.widgets.CollapsibleTextView getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getModIcon() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMore() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getDownloadIcon() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ProgressBar getProgressBar() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getNameAndDescriptionDivider() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getLayoutWrapper() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getClickWrapper() {
            return null;
        }
    }
}