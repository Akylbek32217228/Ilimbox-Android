package ilimboxAndroid.bphc.ilimbox.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001c\u0010\u001e\u001a\u00020\u00112\n\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020\u001aH\u0016J\u001c\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015\u00a8\u0006&"}, d2 = {"LilimboxAndroid/bphc/ilimbox/adapters/FilesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LilimboxAndroid/bphc/ilimbox/adapters/FilesAdapter$ViewHolder;", "()V", "context", "Landroid/content/Context;", "value", "", "LilimboxAndroid/bphc/ilimbox/models/Download;", "data", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "onDeleteClickListener", "Lkotlin/Function1;", "Ljava/io/File;", "", "getOnDeleteClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnDeleteClickListener", "(Lkotlin/jvm/functions/Function1;)V", "onRowClickListener", "getOnRowClickListener", "setOnRowClickListener", "getItemCount", "", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"})
public final class FilesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ilimboxAndroid.bphc.ilimbox.adapters.FilesAdapter.ViewHolder> {
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<ilimboxAndroid.bphc.ilimbox.models.Download> data;
    public kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> onRowClickListener;
    public kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> onDeleteClickListener;
    
    public FilesAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ilimboxAndroid.bphc.ilimbox.models.Download> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<ilimboxAndroid.bphc.ilimbox.models.Download> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.io.File, kotlin.Unit> getOnRowClickListener() {
        return null;
    }
    
    public final void setOnRowClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.io.File, kotlin.Unit> getOnDeleteClickListener() {
        return null;
    }
    
    public final void setOnDeleteClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ilimboxAndroid.bphc.ilimbox.adapters.FilesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.adapters.FilesAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"LilimboxAndroid/bphc/ilimbox/adapters/FilesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "LilimboxAndroid/bphc/ilimbox/databinding/RowDownloadBinding;", "(LilimboxAndroid/bphc/ilimbox/adapters/FilesAdapter;LilimboxAndroid/bphc/ilimbox/databinding/RowDownloadBinding;)V", "getBinding", "()LilimboxAndroid/bphc/ilimbox/databinding/RowDownloadBinding;", "app_release"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final ilimboxAndroid.bphc.ilimbox.databinding.RowDownloadBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        ilimboxAndroid.bphc.ilimbox.databinding.RowDownloadBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ilimboxAndroid.bphc.ilimbox.databinding.RowDownloadBinding getBinding() {
            return null;
        }
    }
}