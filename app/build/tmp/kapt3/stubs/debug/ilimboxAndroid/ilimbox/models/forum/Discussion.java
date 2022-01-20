package ilimboxAndroid.ilimbox.models.forum;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0016\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013R$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010 \"\u0004\b!\u0010\"R \u0010\n\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068F@BX\u0087\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010%\"\u0004\b\'\u0010(R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR \u0010\t\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068F@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u001e\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010%\"\u0004\b/\u0010(R\u001e\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010%\"\u0004\b1\u0010(\u00a8\u00062"}, d2 = {"LilimboxAndroid/ilimbox/models/forum/Discussion;", "Lio/realm/RealmObject;", "id", "", "discussionId", "name", "", "timeModified", "parent", "subject", "message", "attachments", "Lio/realm/RealmList;", "LilimboxAndroid/ilimbox/models/forum/Attachment;", "userFullName", "userPictureUrl", "isPinned", "", "forumId", "(IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Lio/realm/RealmList;Ljava/lang/String;Ljava/lang/String;ZI)V", "getAttachments", "()Lio/realm/RealmList;", "setAttachments", "(Lio/realm/RealmList;)V", "getDiscussionId", "()I", "setDiscussionId", "(I)V", "getForumId", "setForumId", "getId", "setId", "()Z", "setPinned", "(Z)V", "<set-?>", "getMessage", "()Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "getParent", "setParent", "getSubject", "getTimeModified", "setTimeModified", "getUserFullName", "setUserFullName", "getUserPictureUrl", "setUserPictureUrl", "app_debug"})
public class Discussion extends io.realm.RealmObject {
    @com.google.gson.annotations.SerializedName(value = "id")
    @io.realm.annotations.PrimaryKey()
    private int id;
    @com.google.gson.annotations.SerializedName(value = "discussion")
    private int discussionId;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    @com.google.gson.annotations.SerializedName(value = "timemodified")
    private int timeModified;
    @com.google.gson.annotations.SerializedName(value = "parent")
    private int parent;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "attachments")
    private io.realm.RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> attachments;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "userfullname")
    private java.lang.String userFullName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "userpictureurl")
    private java.lang.String userPictureUrl;
    @com.google.gson.annotations.SerializedName(value = "pinned")
    private boolean isPinned;
    private int forumId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String subject;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "message")
    private java.lang.String message = "";
    
    public Discussion() {
        super();
    }
    
    public Discussion(int id, int discussionId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int timeModified, int parent, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> attachments, @org.jetbrains.annotations.NotNull()
    java.lang.String userFullName, @org.jetbrains.annotations.NotNull()
    java.lang.String userPictureUrl, boolean isPinned, int forumId) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getDiscussionId() {
        return 0;
    }
    
    public final void setDiscussionId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getTimeModified() {
        return 0;
    }
    
    public final void setTimeModified(int p0) {
    }
    
    public final int getParent() {
        return 0;
    }
    
    public final void setParent(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> getAttachments() {
        return null;
    }
    
    public final void setAttachments(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserFullName() {
        return null;
    }
    
    public final void setUserFullName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserPictureUrl() {
        return null;
    }
    
    public final void setUserPictureUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isPinned() {
        return false;
    }
    
    public final void setPinned(boolean p0) {
    }
    
    public final int getForumId() {
        return 0;
    }
    
    public final void setForumId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
}