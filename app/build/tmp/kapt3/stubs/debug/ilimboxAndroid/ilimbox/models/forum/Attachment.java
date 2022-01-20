package ilimboxAndroid.ilimbox.models.forum;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"LilimboxAndroid/ilimbox/models/forum/Attachment;", "Lio/realm/RealmObject;", "fileName", "", "mimeType", "fileUrl", "fileSize", "", "timeModified", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "getFileSize", "()I", "setFileSize", "(I)V", "getFileUrl", "setFileUrl", "getMimeType", "setMimeType", "getTimeModified", "()J", "setTimeModified", "(J)V", "app_debug"})
public class Attachment extends io.realm.RealmObject {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "filename")
    private java.lang.String fileName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "mimetype")
    private java.lang.String mimeType;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "fileurl")
    private java.lang.String fileUrl;
    @com.google.gson.annotations.SerializedName(value = "filesize")
    private int fileSize;
    @com.google.gson.annotations.SerializedName(value = "timemodified")
    private long timeModified;
    
    public Attachment() {
        super();
    }
    
    public Attachment(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType, @org.jetbrains.annotations.NotNull()
    java.lang.String fileUrl, int fileSize, long timeModified) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFileName() {
        return null;
    }
    
    public final void setFileName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMimeType() {
        return null;
    }
    
    public final void setMimeType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFileUrl() {
        return null;
    }
    
    public final void setFileUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getFileSize() {
        return 0;
    }
    
    public final void setFileSize(int p0) {
    }
    
    public final long getTimeModified() {
        return 0L;
    }
    
    public final void setTimeModified(long p0) {
    }
}