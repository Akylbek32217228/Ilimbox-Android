package ilimboxAndroid.bphc.ilimbox.models.enrol;

import java.lang.System;

/**
 * Model class to represent objects in the `courses` list from
 * [ilimboxAndroid.bphc.ilimbox.network.MoodleServices.searchCourses].
 *
 * @author Siddhant Kumar Patel (17-Dec-2016)
 * @author Abhijeet Viswa
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 62\u00020\u0001:\u00016B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004BQ\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0002\u0010\u0010J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003J\t\u0010%\u001a\u00020\bH\u00c6\u0003J\t\u0010&\u001a\u00020\bH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\bH\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003JU\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0001J\b\u0010+\u001a\u00020\u0006H\u0016J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u00d6\u0003J\t\u00100\u001a\u00020\u0006H\u00d6\u0001J\t\u00101\u001a\u00020\bH\u00d6\u0001J\u0018\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0006H\u0016R\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u001e\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014\u00a8\u00067"}, d2 = {"LilimboxAndroid/bphc/ilimbox/models/enrol/SearchedCourseDetail;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "fullName", "", "_displayName", "shortName", "categoryId", "categoryName", "contacts", "", "LilimboxAndroid/bphc/ilimbox/models/enrol/Contact;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "get_displayName", "()Ljava/lang/String;", "set_displayName", "(Ljava/lang/String;)V", "getCategoryId", "()I", "setCategoryId", "(I)V", "getCategoryName", "setCategoryName", "getContacts", "()Ljava/util/List;", "displayName", "getDisplayName", "getFullName", "getId", "getShortName", "setShortName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "flags", "Companion", "app_release"})
public final class SearchedCourseDetail implements android.os.Parcelable {
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "fullname")
    private final java.lang.String fullName = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "displayname")
    private java.lang.String _displayName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "shortname")
    private java.lang.String shortName;
    @com.google.gson.annotations.SerializedName(value = "categoryid")
    private int categoryId;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "categoryname")
    private java.lang.String categoryName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "contacts")
    private final java.util.List<ilimboxAndroid.bphc.ilimbox.models.enrol.Contact> contacts = null;
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.bphc.ilimbox.models.enrol.SearchedCourseDetail.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final android.os.Parcelable.Creator<ilimboxAndroid.bphc.ilimbox.models.enrol.SearchedCourseDetail> CREATOR = null;
    
    /**
     * Model class to represent objects in the `courses` list from
     * [ilimboxAndroid.bphc.ilimbox.network.MoodleServices.searchCourses].
     *
     * @author Siddhant Kumar Patel (17-Dec-2016)
     * @author Abhijeet Viswa
     */
    @org.jetbrains.annotations.NotNull()
    public final ilimboxAndroid.bphc.ilimbox.models.enrol.SearchedCourseDetail copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName, @org.jetbrains.annotations.NotNull()
    java.lang.String _displayName, @org.jetbrains.annotations.NotNull()
    java.lang.String shortName, int categoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String categoryName, @org.jetbrains.annotations.NotNull()
    java.util.List<ilimboxAndroid.bphc.ilimbox.models.enrol.Contact> contacts) {
        return null;
    }
    
    /**
     * Model class to represent objects in the `courses` list from
     * [ilimboxAndroid.bphc.ilimbox.network.MoodleServices.searchCourses].
     *
     * @author Siddhant Kumar Patel (17-Dec-2016)
     * @author Abhijeet Viswa
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Model class to represent objects in the `courses` list from
     * [ilimboxAndroid.bphc.ilimbox.network.MoodleServices.searchCourses].
     *
     * @author Siddhant Kumar Patel (17-Dec-2016)
     * @author Abhijeet Viswa
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model class to represent objects in the `courses` list from
     * [ilimboxAndroid.bphc.ilimbox.network.MoodleServices.searchCourses].
     *
     * @author Siddhant Kumar Patel (17-Dec-2016)
     * @author Abhijeet Viswa
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SearchedCourseDetail() {
        super();
    }
    
    public SearchedCourseDetail(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName, @org.jetbrains.annotations.NotNull()
    java.lang.String _displayName, @org.jetbrains.annotations.NotNull()
    java.lang.String shortName, int categoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String categoryName, @org.jetbrains.annotations.NotNull()
    java.util.List<ilimboxAndroid.bphc.ilimbox.models.enrol.Contact> contacts) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFullName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String get_displayName() {
        return null;
    }
    
    public final void set_displayName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShortName() {
        return null;
    }
    
    public final void setShortName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getCategoryId() {
        return 0;
    }
    
    public final void setCategoryId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategoryName() {
        return null;
    }
    
    public final void setCategoryName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ilimboxAndroid.bphc.ilimbox.models.enrol.Contact> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ilimboxAndroid.bphc.ilimbox.models.enrol.Contact> getContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    private SearchedCourseDetail(android.os.Parcel source) {
        super();
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"LilimboxAndroid/bphc/ilimbox/models/enrol/SearchedCourseDetail$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "LilimboxAndroid/bphc/ilimbox/models/enrol/SearchedCourseDetail;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}