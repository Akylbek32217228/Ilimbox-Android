package ilimboxAndroid.bphc.ilimbox.models.course;

import java.lang.System;

/**
 * @author Harshit Agarwal (16-Dec-2016)
 * @author Abhijeet Viswa
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001=Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0006\u00107\u001a\u00020\u0000J\u0013\u00108\u001a\u00020\u00112\b\u00109\u001a\u0004\u0018\u00010:H\u0096\u0002J\b\u0010;\u001a\u00020\u0004H\u0016J\b\u0010<\u001a\u00020,H\u0002R$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u0011\u0010#\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010$\"\u0004\b%\u0010&R\u001e\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001c\"\u0004\b(\u0010\u001eR\u001e\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001e\u0010+\u001a\u00020,8F@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0011\u00101\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b2\u0010\u0018R\u001e\u0010\u0006\u001a\u00020\u00078F@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001e\u00a8\u0006>"}, d2 = {"LilimboxAndroid/bphc/ilimbox/models/course/Module;", "Lio/realm/RealmObject;", "LilimboxAndroid/bphc/ilimbox/interfaces/CourseContent;", "id", "", "instance", "name", "", "url", "modIcon", "modName", "description", "contents", "Lio/realm/RealmList;", "LilimboxAndroid/bphc/ilimbox/models/course/Content;", "courseSectionId", "isUnread", "", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;IZ)V", "getContents", "()Lio/realm/RealmList;", "setContents", "(Lio/realm/RealmList;)V", "getCourseSectionId", "()I", "setCourseSectionId", "(I)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getId", "setId", "getInstance", "setInstance", "isDownloadable", "()Z", "setUnread", "(Z)V", "getModIcon", "setModIcon", "getModName", "setModName", "modType", "LilimboxAndroid/bphc/ilimbox/models/course/Module$Type;", "getModType", "()LilimboxAndroid/bphc/ilimbox/models/course/Module$Type;", "setModType", "(LilimboxAndroid/bphc/ilimbox/models/course/Module$Type;)V", "moduleIcon", "getModuleIcon", "getName", "setName", "getUrl", "setUrl", "deepCopy", "equals", "other", "", "hashCode", "inferModuleTypeFromModuleName", "Type", "app_release"})
public class Module extends io.realm.RealmObject implements ilimboxAndroid.bphc.ilimbox.interfaces.CourseContent {
    @com.google.gson.annotations.SerializedName(value = "id")
    @io.realm.annotations.PrimaryKey()
    private int id;
    @com.google.gson.annotations.SerializedName(value = "instance")
    private int instance;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "url")
    private java.lang.String url;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "modicon")
    private java.lang.String modIcon;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "modname")
    private java.lang.String modName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "description")
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "contents")
    private io.realm.RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Content> contents;
    private int courseSectionId;
    private boolean isUnread;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.Ignore()
    private ilimboxAndroid.bphc.ilimbox.models.course.Module.Type modType = ilimboxAndroid.bphc.ilimbox.models.course.Module.Type.DEFAULT;
    
    public Module() {
        super();
    }
    
    public Module(int id, int instance, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String modIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String modName, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Content> contents, int courseSectionId, boolean isUnread) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getInstance() {
        return 0;
    }
    
    public final void setInstance(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getModIcon() {
        return null;
    }
    
    public final void setModIcon(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getModName() {
        return null;
    }
    
    public final void setModName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Content> getContents() {
        return null;
    }
    
    public final void setContents(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Content> p0) {
    }
    
    public final int getCourseSectionId() {
        return 0;
    }
    
    public final void setCourseSectionId(int p0) {
    }
    
    public final boolean isUnread() {
        return false;
    }
    
    public final void setUnread(boolean p0) {
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setModType(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.models.course.Module.Type p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilimboxAndroid.bphc.ilimbox.models.course.Module.Type getModType() {
        return null;
    }
    
    public final boolean isDownloadable() {
        return false;
    }
    
    public final int getModuleIcon() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilimboxAndroid.bphc.ilimbox.models.course.Module deepCopy() {
        return null;
    }
    
    private final ilimboxAndroid.bphc.ilimbox.models.course.Module.Type inferModuleTypeFromModuleName() {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"LilimboxAndroid/bphc/ilimbox/models/course/Module$Type;", "", "(Ljava/lang/String;I)V", "RESOURCCE", "FORUM", "LABEL", "ASSIGNMENT", "FOLDER", "QUIZ", "URL", "PAGE", "DEFAULT", "BOOK", "app_release"})
    public static enum Type {
        /*public static final*/ RESOURCCE /* = new RESOURCCE() */,
        /*public static final*/ FORUM /* = new FORUM() */,
        /*public static final*/ LABEL /* = new LABEL() */,
        /*public static final*/ ASSIGNMENT /* = new ASSIGNMENT() */,
        /*public static final*/ FOLDER /* = new FOLDER() */,
        /*public static final*/ QUIZ /* = new QUIZ() */,
        /*public static final*/ URL /* = new URL() */,
        /*public static final*/ PAGE /* = new PAGE() */,
        /*public static final*/ DEFAULT /* = new DEFAULT() */,
        /*public static final*/ BOOK /* = new BOOK() */;
        
        Type() {
        }
    }
}