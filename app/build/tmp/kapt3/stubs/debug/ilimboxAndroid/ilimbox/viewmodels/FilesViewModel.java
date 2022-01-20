package ilimboxAndroid.ilimbox.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0011J\u0006\u0010\'\u001a\u00020\tJ\u000e\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020%H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00112\u000e\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u001e\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\u00a8\u0006,"}, d2 = {"LilimboxAndroid/ilimbox/viewmodels/FilesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_application", "_deletedMessage", "Landroidx/lifecycle/MutableLiveData;", "LilimboxAndroid/ilimbox/models/SingleLiveEvent;", "", "_downloads", "", "LilimboxAndroid/ilimbox/models/Download;", "_isListEmptyMessage", "", "_isLoading", "baseContentDir", "Ljava/io/File;", "kotlin.jvm.PlatformType", "value", "currentFile", "setCurrentFile", "(Ljava/io/File;)V", "deletedMessage", "Landroidx/lifecycle/LiveData;", "getDeletedMessage", "()Landroidx/lifecycle/LiveData;", "downloads", "getDownloads", "()Landroidx/lifecycle/MutableLiveData;", "isListEmptyMessage", "isLoading", "<set-?>", "nestingLevel", "getNestingLevel", "()I", "deleteFile", "", "file", "goBackOneDirectory", "goToDirectory", "directoryPath", "", "refreshFileList", "app_debug"})
public final class FilesViewModel extends androidx.lifecycle.AndroidViewModel {
    private final android.app.Application _application = null;
    private final java.io.File baseContentDir = null;
    private int nestingLevel = 0;
    private java.io.File currentFile;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<ilimboxAndroid.ilimbox.models.Download>> _downloads = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<ilimboxAndroid.ilimbox.models.Download>> downloads = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _isListEmptyMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> isListEmptyMessage = null;
    private final androidx.lifecycle.MutableLiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<java.lang.Boolean>> _deletedMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<java.lang.Boolean>> deletedMessage = null;
    
    public FilesViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    public final int getNestingLevel() {
        return 0;
    }
    
    private final void setCurrentFile(java.io.File value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<ilimboxAndroid.ilimbox.models.Download>> getDownloads() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> isListEmptyMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ilimboxAndroid.ilimbox.models.SingleLiveEvent<java.lang.Boolean>> getDeletedMessage() {
        return null;
    }
    
    public final void goToDirectory(@org.jetbrains.annotations.NotNull()
    java.lang.String directoryPath) {
    }
    
    public final boolean goBackOneDirectory() {
        return false;
    }
    
    private final void refreshFileList() {
    }
    
    public final void deleteFile(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
}