package ilimboxAndroid.bphc.ilimbox.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 (2\u00020\u0001:\u0002()B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0007H\u0002J\u001a\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\'\u001a\u00020\u0015H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/FolderModuleFragment;", "Landroidx/fragment/app/Fragment;", "()V", "contents", "", "LilimboxAndroid/bphc/ilimbox/models/course/Content;", "courseName", "", "mAdapter", "LilimboxAndroid/bphc/ilimbox/fragments/FolderModuleFragment$FolderModuleAdapter;", "mFileManager", "LilimboxAndroid/bphc/ilimbox/core/FileManager;", "module", "LilimboxAndroid/bphc/ilimbox/models/course/Module;", "moduleInstance", "", "moreOptionsViewModel", "LilimboxAndroid/bphc/ilimbox/fragments/MoreOptionsFragment$OptionsViewModel;", "realm", "Lio/realm/Realm;", "downloadOrOpenFile", "", "content", "forceDownload", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDownloadComplete", "fileName", "onViewCreated", "view", "updateContents", "Companion", "FolderModuleAdapter", "app_release"})
public final class FolderModuleFragment extends androidx.fragment.app.Fragment {
    private io.realm.Realm realm;
    private ilimboxAndroid.bphc.ilimbox.core.FileManager mFileManager;
    private ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment.OptionsViewModel moreOptionsViewModel;
    private ilimboxAndroid.bphc.ilimbox.fragments.FolderModuleFragment.FolderModuleAdapter mAdapter;
    private int moduleInstance = 0;
    private java.lang.String courseName = "";
    private ilimboxAndroid.bphc.ilimbox.models.course.Module module;
    private java.util.List<? extends ilimboxAndroid.bphc.ilimbox.models.course.Content> contents;
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.bphc.ilimbox.fragments.FolderModuleFragment.Companion Companion = null;
    private static final java.lang.String MODULE_ID_KEY = "moduleID";
    private static final java.lang.String COURSE_NAME_KEY = "courseName";
    private java.util.HashMap _$_findViewCache;
    
    public FolderModuleFragment() {
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
    
    private final void updateContents() {
    }
    
    private final void downloadOrOpenFile(ilimboxAndroid.bphc.ilimbox.models.course.Content content, boolean forceDownload) {
    }
    
    private final void onDownloadComplete(java.lang.String fileName) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J \u0010\u0010\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0014\u0010\u0014\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0015R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/FolderModuleFragment$FolderModuleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LilimboxAndroid/bphc/ilimbox/fragments/FolderModuleFragment$FolderModuleAdapter$FolderModuleViewHolder;", "LilimboxAndroid/bphc/ilimbox/fragments/FolderModuleFragment;", "mClickListener", "LilimboxAndroid/bphc/ilimbox/interfaces/ClickListener;", "contents", "", "LilimboxAndroid/bphc/ilimbox/models/course/Content;", "(LilimboxAndroid/bphc/ilimbox/fragments/FolderModuleFragment;LilimboxAndroid/bphc/ilimbox/interfaces/ClickListener;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setContents", "", "FolderModuleViewHolder", "app_release"})
    final class FolderModuleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ilimboxAndroid.bphc.ilimbox.fragments.FolderModuleFragment.FolderModuleAdapter.FolderModuleViewHolder> {
        private final ilimboxAndroid.bphc.ilimbox.interfaces.ClickListener mClickListener = null;
        private final java.util.List<ilimboxAndroid.bphc.ilimbox.models.course.Content> contents = null;
        
        public FolderModuleAdapter(@org.jetbrains.annotations.NotNull()
        ilimboxAndroid.bphc.ilimbox.interfaces.ClickListener mClickListener, @org.jetbrains.annotations.NotNull()
        java.util.List<ilimboxAndroid.bphc.ilimbox.models.course.Content> contents) {
            super();
        }
        
        public final void setContents(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends ilimboxAndroid.bphc.ilimbox.models.course.Content> contents) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ilimboxAndroid.bphc.ilimbox.fragments.FolderModuleFragment.FolderModuleAdapter.FolderModuleViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        ilimboxAndroid.bphc.ilimbox.fragments.FolderModuleFragment.FolderModuleAdapter.FolderModuleViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/FolderModuleFragment$FolderModuleAdapter$FolderModuleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(LilimboxAndroid/bphc/ilimbox/fragments/FolderModuleFragment$FolderModuleAdapter;Landroid/view/View;)V", "clickWrapper", "Landroid/widget/LinearLayout;", "download", "Landroid/widget/ImageView;", "ellipsis", "fileIcon", "fileName", "Landroid/widget/TextView;", "bind", "", "content", "LilimboxAndroid/bphc/ilimbox/models/course/Content;", "app_release"})
        public final class FolderModuleViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            private final android.widget.TextView fileName = null;
            private final android.widget.ImageView fileIcon = null;
            private final android.widget.ImageView download = null;
            private final android.widget.ImageView ellipsis = null;
            private final android.widget.LinearLayout clickWrapper = null;
            
            public FolderModuleViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View itemView) {
                super(null);
            }
            
            public final void bind(@org.jetbrains.annotations.NotNull()
            ilimboxAndroid.bphc.ilimbox.models.course.Content content) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/FolderModuleFragment$Companion;", "", "()V", "COURSE_NAME_KEY", "", "MODULE_ID_KEY", "newInstance", "LilimboxAndroid/bphc/ilimbox/fragments/FolderModuleFragment;", "moduleId", "", "courseName", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ilimboxAndroid.bphc.ilimbox.fragments.FolderModuleFragment newInstance(int moduleId, @org.jetbrains.annotations.NotNull()
        java.lang.String courseName) {
            return null;
        }
    }
}