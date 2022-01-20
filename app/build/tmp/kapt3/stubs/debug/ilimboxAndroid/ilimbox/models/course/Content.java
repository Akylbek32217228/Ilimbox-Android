package ilimboxAndroid.ilimbox.models.course;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u001e\u001a\u00020\u0000J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020\u0006H\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001b\u00a8\u0006$"}, d2 = {"LilimboxAndroid/ilimbox/models/course/Content;", "Lio/realm/RealmObject;", "fileName", "", "fileUrl", "fileSize", "", "timeCreated", "", "timeModified", "moduleId", "(Ljava/lang/String;Ljava/lang/String;IJJI)V", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "getFileSize", "()I", "setFileSize", "(I)V", "getFileUrl", "setFileUrl", "getModuleId", "setModuleId", "getTimeCreated", "()J", "setTimeCreated", "(J)V", "getTimeModified", "setTimeModified", "copy", "equals", "", "other", "", "hashCode", "app_debug"})
public class Content extends io.realm.RealmObject {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "filename")
    private java.lang.String fileName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "fileurl")
    private java.lang.String fileUrl;
    @com.google.gson.annotations.SerializedName(value = "filesize")
    private int fileSize;
    @com.google.gson.annotations.SerializedName(value = "timecreated")
    private long timeCreated;
    @com.google.gson.annotations.SerializedName(value = "timemodified")
    private long timeModified;
    private int moduleId;
    
    public Content() {
        super();
    }
    
    public Content(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.lang.String fileUrl, int fileSize, long timeCreated, long timeModified, int moduleId) {
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
    
    public final long getTimeCreated() {
        return 0L;
    }
    
    public final void setTimeCreated(long p0) {
    }
    
    public final long getTimeModified() {
        return 0L;
    }
    
    public final void setTimeModified(long p0) {
    }
    
    public final int getModuleId() {
        return 0;
    }
    
    public final void setModuleId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilimboxAndroid.ilimbox.models.course.Content copy() {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
}