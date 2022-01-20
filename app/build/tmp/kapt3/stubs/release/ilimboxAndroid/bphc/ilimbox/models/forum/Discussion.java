package ilimboxAndroid.bphc.ilimbox.models.forum;

import java.lang.System;

/**
 * Model class to represent a Discussion. In Moodle speak, a Discussion is a
 * collection of posts. This class represents the initial post (and possibly,
 * replies to the intial and other posts). A Discussion may be the initial post
 * or a reply to a post. The lack of parent signifies it as the initial post.
 * Discussions can also be infinitely nested. However, this class only represents
 * the root discussion i.e the thread
 *
 * @author Siddhant Kumar Patel (17-Jan-2017)
 * @author Abhijeet Viswa
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0016\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013R$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010 \"\u0004\b!\u0010\"R \u0010\n\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068F@BX\u0087\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010%\"\u0004\b\'\u0010(R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR \u0010\t\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068F@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u001e\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010%\"\u0004\b/\u0010(R\u001e\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010%\"\u0004\b1\u0010(\u00a8\u00062"}, d2 = {"LilimboxAndroid/bphc/ilimbox/models/forum/Discussion;", "Lio/realm/RealmObject;", "id", "", "discussionId", "name", "", "timeModified", "parent", "subject", "message", "attachments", "Lio/realm/RealmList;", "LilimboxAndroid/bphc/ilimbox/models/forum/Attachment;", "userFullName", "userPictureUrl", "isPinned", "", "forumId", "(IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Lio/realm/RealmList;Ljava/lang/String;Ljava/lang/String;ZI)V", "getAttachments", "()Lio/realm/RealmList;", "setAttachments", "(Lio/realm/RealmList;)V", "getDiscussionId", "()I", "setDiscussionId", "(I)V", "getForumId", "setForumId", "getId", "setId", "()Z", "setPinned", "(Z)V", "<set-?>", "getMessage", "()Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "getParent", "setParent", "getSubject", "getTimeModified", "setTimeModified", "getUserFullName", "setUserFullName", "getUserPictureUrl", "setUserPictureUrl", "app_release"})
public class Discussion extends io.realm.RealmObject {
    
    /**
     * The ID of the initial post in this discussion
     */
    @com.google.gson.annotations.SerializedName(value = "id")
    @io.realm.annotations.PrimaryKey()
    private int id;
    
    /**
     * Discussion of the ID. Uniquely identifies a thread of discussions. Used
     * when querying the replies in a thread.
     */
    @com.google.gson.annotations.SerializedName(value = "discussion")
    private int discussionId;
    
    /**
     * The name i.e subject of the thread.
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    
    /**
     * Unix epoch when this was last modified
     */
    @com.google.gson.annotations.SerializedName(value = "timemodified")
    private int timeModified;
    
    /**
     * The parent of this discussion. Equals the `id` if a parent
     * exists. Else, equals to 0.
     */
    @com.google.gson.annotations.SerializedName(value = "parent")
    private int parent;
    
    /**
     * List of attachments of this post
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "attachments")
    private io.realm.RealmList<ilimboxAndroid.bphc.ilimbox.models.forum.Attachment> attachments;
    
    /**
     * Name of the user who made this discussion.
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "userfullname")
    private java.lang.String userFullName;
    
    /**
     * Url to the user's profile picture
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "userpictureurl")
    private java.lang.String userPictureUrl;
    
    /**
     * If the root discussion i.e the thread has been pinned or not.
     */
    @com.google.gson.annotations.SerializedName(value = "pinned")
    private boolean isPinned;
    
    /**
     * The id of the Forum instance that the Discussion is a part of. This is not
     * a part of the [ilimboxAndroid.bphc.ilimbox.network.MoodleServices.getForumDiscussions].
     */
    private int forumId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String subject;
    
    /**
     * The content of this discussion.
     */
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
    io.realm.RealmList<ilimboxAndroid.bphc.ilimbox.models.forum.Attachment> attachments, @org.jetbrains.annotations.NotNull()
    java.lang.String userFullName, @org.jetbrains.annotations.NotNull()
    java.lang.String userPictureUrl, boolean isPinned, int forumId) {
        super();
    }
    
    /**
     * The ID of the initial post in this discussion
     */
    public final int getId() {
        return 0;
    }
    
    /**
     * The ID of the initial post in this discussion
     */
    public final void setId(int p0) {
    }
    
    /**
     * Discussion of the ID. Uniquely identifies a thread of discussions. Used
     * when querying the replies in a thread.
     */
    public final int getDiscussionId() {
        return 0;
    }
    
    /**
     * Discussion of the ID. Uniquely identifies a thread of discussions. Used
     * when querying the replies in a thread.
     */
    public final void setDiscussionId(int p0) {
    }
    
    /**
     * The name i.e subject of the thread.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    /**
     * The name i.e subject of the thread.
     */
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * Unix epoch when this was last modified
     */
    public final int getTimeModified() {
        return 0;
    }
    
    /**
     * Unix epoch when this was last modified
     */
    public final void setTimeModified(int p0) {
    }
    
    /**
     * The parent of this discussion. Equals the `id` if a parent
     * exists. Else, equals to 0.
     */
    public final int getParent() {
        return 0;
    }
    
    /**
     * The parent of this discussion. Equals the `id` if a parent
     * exists. Else, equals to 0.
     */
    public final void setParent(int p0) {
    }
    
    /**
     * List of attachments of this post
     */
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<ilimboxAndroid.bphc.ilimbox.models.forum.Attachment> getAttachments() {
        return null;
    }
    
    /**
     * List of attachments of this post
     */
    public final void setAttachments(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<ilimboxAndroid.bphc.ilimbox.models.forum.Attachment> p0) {
    }
    
    /**
     * Name of the user who made this discussion.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserFullName() {
        return null;
    }
    
    /**
     * Name of the user who made this discussion.
     */
    public final void setUserFullName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * Url to the user's profile picture
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserPictureUrl() {
        return null;
    }
    
    /**
     * Url to the user's profile picture
     */
    public final void setUserPictureUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * If the root discussion i.e the thread has been pinned or not.
     */
    public final boolean isPinned() {
        return false;
    }
    
    /**
     * If the root discussion i.e the thread has been pinned or not.
     */
    public final void setPinned(boolean p0) {
    }
    
    /**
     * The id of the Forum instance that the Discussion is a part of. This is not
     * a part of the [ilimboxAndroid.bphc.ilimbox.network.MoodleServices.getForumDiscussions].
     */
    public final int getForumId() {
        return 0;
    }
    
    /**
     * The id of the Forum instance that the Discussion is a part of. This is not
     * a part of the [ilimboxAndroid.bphc.ilimbox.network.MoodleServices.getForumDiscussions].
     */
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