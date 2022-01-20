package ilimboxAndroid.bphc.ilimbox.models.forum;

import java.lang.System;

/**
 * This class represents the custom data sent from Moodle
 * in a push notification.
 *
 * @author Abhijeet Viswa
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0017\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c2\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0010\u0010\u0005\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0012\u0010\u000bR\u001b\u0010\u0014\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0015\u0010\u000b\u00a8\u0006!"}, d2 = {"LilimboxAndroid/bphc/ilimbox/models/forum/NewPostCustomData;", "", "_modId", "", "_instance", "_discussionId", "_postId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "discussionId", "", "getDiscussionId", "()I", "discussionId$delegate", "Lkotlin/Lazy;", "forumId", "getForumId", "forumId$delegate", "modId", "getModId", "modId$delegate", "postId", "getPostId", "postId$delegate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class NewPostCustomData {
    @com.google.gson.annotations.SerializedName(value = "cmid")
    private final java.lang.String _modId = null;
    @com.google.gson.annotations.SerializedName(value = "instance")
    private final java.lang.String _instance = null;
    @com.google.gson.annotations.SerializedName(value = "discussionid")
    private final java.lang.String _discussionId = null;
    @com.google.gson.annotations.SerializedName(value = "postid")
    private final java.lang.String _postId = null;
    
    /**
     * The id of the module this post belongs to
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy modId$delegate = null;
    
    /**
     * The id of the forum this post belongs to
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy forumId$delegate = null;
    
    /**
     * The id of the discussion this post belongs to
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy discussionId$delegate = null;
    
    /**
     * The id of the post itself
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy postId$delegate = null;
    
    /**
     * This class represents the custom data sent from Moodle
     * in a push notification.
     *
     * @author Abhijeet Viswa
     */
    @org.jetbrains.annotations.NotNull()
    public final ilimboxAndroid.bphc.ilimbox.models.forum.NewPostCustomData copy(@org.jetbrains.annotations.NotNull()
    java.lang.String _modId, @org.jetbrains.annotations.NotNull()
    java.lang.String _instance, @org.jetbrains.annotations.NotNull()
    java.lang.String _discussionId, @org.jetbrains.annotations.NotNull()
    java.lang.String _postId) {
        return null;
    }
    
    /**
     * This class represents the custom data sent from Moodle
     * in a push notification.
     *
     * @author Abhijeet Viswa
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * This class represents the custom data sent from Moodle
     * in a push notification.
     *
     * @author Abhijeet Viswa
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * This class represents the custom data sent from Moodle
     * in a push notification.
     *
     * @author Abhijeet Viswa
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public NewPostCustomData() {
        super();
    }
    
    public NewPostCustomData(@org.jetbrains.annotations.NotNull()
    java.lang.String _modId, @org.jetbrains.annotations.NotNull()
    java.lang.String _instance, @org.jetbrains.annotations.NotNull()
    java.lang.String _discussionId, @org.jetbrains.annotations.NotNull()
    java.lang.String _postId) {
        super();
    }
    
    private final java.lang.String component1() {
        return null;
    }
    
    private final java.lang.String component2() {
        return null;
    }
    
    private final java.lang.String component3() {
        return null;
    }
    
    private final java.lang.String component4() {
        return null;
    }
    
    /**
     * The id of the module this post belongs to
     */
    public final int getModId() {
        return 0;
    }
    
    /**
     * The id of the forum this post belongs to
     */
    public final int getForumId() {
        return 0;
    }
    
    /**
     * The id of the discussion this post belongs to
     */
    public final int getDiscussionId() {
        return 0;
    }
    
    /**
     * The id of the post itself
     */
    public final int getPostId() {
        return 0;
    }
}