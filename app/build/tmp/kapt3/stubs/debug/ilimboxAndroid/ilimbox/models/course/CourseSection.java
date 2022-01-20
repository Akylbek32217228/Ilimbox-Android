package ilimboxAndroid.ilimbox.models.course;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\rJ\u0006\u0010 \u001a\u00020\u0000J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\u0004H\u0016R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0005\u001a\u00020\u00068F@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b\u00a8\u0006&"}, d2 = {"LilimboxAndroid/ilimbox/models/course/CourseSection;", "Lio/realm/RealmObject;", "LilimboxAndroid/ilimbox/interfaces/CourseContent;", "id", "", "name", "", "sectionNum", "summary", "modules", "Lio/realm/RealmList;", "LilimboxAndroid/ilimbox/models/course/Module;", "courseId", "(ILjava/lang/String;ILjava/lang/String;Lio/realm/RealmList;I)V", "getCourseId", "()I", "setCourseId", "(I)V", "getId", "setId", "getModules", "()Lio/realm/RealmList;", "setModules", "(Lio/realm/RealmList;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSectionNum", "setSectionNum", "getSummary", "setSummary", "deepCopy", "equals", "", "other", "", "hashCode", "app_debug"})
public class CourseSection extends io.realm.RealmObject implements ilimboxAndroid.ilimbox.interfaces.CourseContent {
    @com.google.gson.annotations.SerializedName(value = "id")
    @io.realm.annotations.PrimaryKey()
    private int id;
    @com.google.gson.annotations.SerializedName(value = "section")
    private int sectionNum;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "summary")
    private java.lang.String summary;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "modules")
    private io.realm.RealmList<ilimboxAndroid.ilimbox.models.course.Module> modules;
    private int courseId;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    
    public CourseSection() {
        super();
    }
    
    public CourseSection(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int sectionNum, @org.jetbrains.annotations.NotNull()
    java.lang.String summary, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<ilimboxAndroid.ilimbox.models.course.Module> modules, int courseId) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getSectionNum() {
        return 0;
    }
    
    public final void setSectionNum(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummary() {
        return null;
    }
    
    public final void setSummary(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<ilimboxAndroid.ilimbox.models.course.Module> getModules() {
        return null;
    }
    
    public final void setModules(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<ilimboxAndroid.ilimbox.models.course.Module> p0) {
    }
    
    public final int getCourseId() {
        return 0;
    }
    
    public final void setCourseId(int p0) {
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilimboxAndroid.ilimbox.models.course.CourseSection deepCopy() {
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