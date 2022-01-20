package ilimboxAndroid.ilimbox.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0016\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0005J \u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u0016\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0002J\u000e\u0010$\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010&\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u000e\u0010\'\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010(\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010)\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u000e\u0010*\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010+\u001a\u0004\u0018\u00010,J\u0006\u0010-\u001a\u00020\bJ\u000e\u0010.\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010/\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u000e\u00100\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u00101\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"LilimboxAndroid/ilimbox/core/FileManager;", "", "activity", "Landroid/app/Activity;", "courseName", "", "callback", "Lkotlin/Function1;", "", "(Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "baseContentDir", "Ljava/io/File;", "kotlin.jvm.PlatformType", "fileList", "", "onComplete", "Landroid/content/BroadcastReceiver;", "requestedDownloads", "sanitizedCourseName", "deleteExistingDiscussionAttachment", "attachment", "LilimboxAndroid/ilimbox/models/forum/Attachment;", "deleteExistingFile", "fileName", "deleteExistingModuleContent", "content", "LilimboxAndroid/ilimbox/models/course/Content;", "downloadDiscussionAttachment", "description", "downloadFile", "fileUrl", "downloadModuleContent", "module", "LilimboxAndroid/ilimbox/models/course/Module;", "getRelativePath", "filename", "isDiscussionAttachmentDownloaded", "", "isFileDownloaded", "isModuleContentDownloaded", "openDiscussionAttachment", "openFile", "openModuleContent", "registerDownloadReceiver", "Landroid/content/Intent;", "reloadFileList", "shareDiscussionAttachment", "shareFile", "shareModuleContent", "unregisterDownloadReceiver", "app_debug"})
public final class FileManager {
    private final android.app.Activity activity = null;
    private final java.lang.String courseName = null;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> callback = null;
    private final java.lang.String sanitizedCourseName = null;
    private final java.io.File baseContentDir = null;
    private final java.util.List<java.lang.String> fileList = null;
    private final java.util.List<java.lang.String> requestedDownloads = null;
    private final android.content.BroadcastReceiver onComplete = null;
    
    public FileManager(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String courseName, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
        super();
    }
    
    public final void downloadModuleContent(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.models.course.Content content, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.models.course.Module module) {
    }
    
    public final void downloadDiscussionAttachment(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.models.forum.Attachment attachment, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
    }
    
    public final void openModuleContent(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.models.course.Content content) {
    }
    
    public final void openDiscussionAttachment(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.models.forum.Attachment attachment) {
    }
    
    private final void downloadFile(java.lang.String fileUrl, java.lang.String fileName, java.lang.String description) {
    }
    
    private final void openFile(java.lang.String fileName) {
    }
    
    public final void shareModuleContent(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.models.course.Content content) {
    }
    
    public final void shareDiscussionAttachment(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.models.forum.Attachment attachment) {
    }
    
    private final void shareFile(java.lang.String fileName) {
    }
    
    private final void deleteExistingModuleContent(ilimboxAndroid.ilimbox.models.course.Content content) {
    }
    
    private final void deleteExistingDiscussionAttachment(ilimboxAndroid.ilimbox.models.forum.Attachment attachment) {
    }
    
    private final void deleteExistingFile(java.lang.String fileName) {
    }
    
    public final void reloadFileList() {
    }
    
    private final java.lang.String getRelativePath(java.lang.String filename) {
        return null;
    }
    
    public final boolean isModuleContentDownloaded(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.models.course.Content content) {
        return false;
    }
    
    public final boolean isDiscussionAttachmentDownloaded(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.models.forum.Attachment attachment) {
        return false;
    }
    
    private final boolean isFileDownloaded(java.lang.String fileName) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Intent registerDownloadReceiver() {
        return null;
    }
    
    public final void unregisterDownloadReceiver() {
    }
}