package ilimboxAndroid.bphc.ilimbox.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006("}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/FilesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "LilimboxAndroid/bphc/ilimbox/databinding/DownloadsFragmentBinding;", "deletedMessageObserver", "Landroidx/lifecycle/Observer;", "LilimboxAndroid/bphc/ilimbox/models/SingleLiveEvent;", "", "downloadsAdapter", "LilimboxAndroid/bphc/ilimbox/adapters/FilesAdapter;", "downloadsObserver", "", "LilimboxAndroid/bphc/ilimbox/models/Download;", "isListEmptyMessageObserver", "", "isLoadingObserver", "viewModel", "LilimboxAndroid/bphc/ilimbox/viewmodels/FilesViewModel;", "getViewModel", "()LilimboxAndroid/bphc/ilimbox/viewmodels/FilesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onViewCreated", "view", "openFile", "file", "Ljava/io/File;", "showDeleteConfirmationDialog", "Companion", "app_release"})
public final class FilesFragment extends androidx.fragment.app.Fragment {
    private ilimboxAndroid.bphc.ilimbox.databinding.DownloadsFragmentBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private final ilimboxAndroid.bphc.ilimbox.adapters.FilesAdapter downloadsAdapter = null;
    private final androidx.lifecycle.Observer<java.lang.Boolean> isLoadingObserver = null;
    private final androidx.lifecycle.Observer<java.util.List<ilimboxAndroid.bphc.ilimbox.models.Download>> downloadsObserver = null;
    private final androidx.lifecycle.Observer<java.lang.Integer> isListEmptyMessageObserver = null;
    private final androidx.lifecycle.Observer<ilimboxAndroid.bphc.ilimbox.models.SingleLiveEvent<java.lang.Boolean>> deletedMessageObserver = null;
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.bphc.ilimbox.fragments.FilesFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public FilesFragment() {
        super();
    }
    
    private final ilimboxAndroid.bphc.ilimbox.viewmodels.FilesViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @org.jetbrains.annotations.NotNull()
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
    
    private final void openFile(java.io.File file) {
    }
    
    private final void showDeleteConfirmationDialog(java.io.File file) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final ilimboxAndroid.bphc.ilimbox.fragments.FilesFragment newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/FilesFragment$Companion;", "", "()V", "newInstance", "LilimboxAndroid/bphc/ilimbox/fragments/FilesFragment;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final ilimboxAndroid.bphc.ilimbox.fragments.FilesFragment newInstance() {
            return null;
        }
    }
}