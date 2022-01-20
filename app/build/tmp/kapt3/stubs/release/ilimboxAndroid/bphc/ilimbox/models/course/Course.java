package ilimboxAndroid.bphc.ilimbox.models.course;

import java.lang.System;

/**
 * @author Harshit Agarwal (16-12-2016)
 * @author Abhijeet Viswa
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B-\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0013\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020\u0006H\u0016R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8F@BX\u0087\u000e\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001e\u0010\t\u001a\u00020\b8F@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u0007\u001a\u00020\b8F@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u001e\u0010\'\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010\u0018\u00a8\u0006/"}, d2 = {"LilimboxAndroid/bphc/ilimbox/models/course/Course;", "Lio/realm/RealmObject;", "course", "LilimboxAndroid/bphc/ilimbox/models/enrol/SearchedCourseDetail;", "(LilimboxAndroid/bphc/ilimbox/models/enrol/SearchedCourseDetail;)V", "id", "", "shortName", "", "fullName", "isFavorite", "", "(ILjava/lang/String;Ljava/lang/String;Z)V", "_courseName", "", "[Ljava/lang/String;", "<set-?>", "courseName", "getCourseName", "()[Ljava/lang/String;", "downloadStatus", "getDownloadStatus", "()I", "setDownloadStatus", "(I)V", "downloadedFiles", "getDownloadedFiles", "setDownloadedFiles", "getFullName", "()Ljava/lang/String;", "setFullName", "(Ljava/lang/String;)V", "getId", "setId", "()Z", "setFavorite", "(Z)V", "getShortName", "setShortName", "totalFiles", "getTotalFiles", "setTotalFiles", "equals", "other", "", "hashCode", "Companion", "app_release"})
public class Course extends io.realm.RealmObject {
    @com.google.gson.annotations.SerializedName(value = "id")
    @io.realm.annotations.PrimaryKey()
    private int id;
    private boolean isFavorite;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "shortname")
    private java.lang.String shortName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "fullname")
    private java.lang.String fullName;
    @io.realm.annotations.Ignore()
    private java.lang.String[] _courseName;
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.Ignore()
    private java.lang.String[] courseName = {};
    @io.realm.annotations.Ignore()
    private int downloadStatus = 0;
    @io.realm.annotations.Ignore()
    private int totalFiles = 0;
    @io.realm.annotations.Ignore()
    private int downloadedFiles = 0;
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.bphc.ilimbox.models.course.Course.Companion Companion = null;
    private static final java.lang.String NAME_REGEX = "([\\w\\d \\-/\'&,]+ \\w\\d\\d\\d) ([\\w\\d \\-/():+\"\'&.,?]+) ([LTP]\\d*)";
    
    public Course() {
        super();
    }
    
    public Course(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String shortName, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName, boolean isFavorite) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final boolean isFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
    
    public final void setShortName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShortName() {
        return null;
    }
    
    public final void setFullName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFullName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getCourseName() {
        return null;
    }
    
    public final int getDownloadStatus() {
        return 0;
    }
    
    public final void setDownloadStatus(int p0) {
    }
    
    public final int getTotalFiles() {
        return 0;
    }
    
    public final void setTotalFiles(int p0) {
    }
    
    public final int getDownloadedFiles() {
        return 0;
    }
    
    public final void setDownloadedFiles(int p0) {
    }
    
    public Course(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.models.enrol.SearchedCourseDetail course) {
        super();
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"LilimboxAndroid/bphc/ilimbox/models/course/Course$Companion;", "", "()V", "NAME_REGEX", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}