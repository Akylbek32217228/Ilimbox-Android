package ilimboxAndroid.bphc.ilimbox.models.enrol;

import java.lang.System;

/**
 * Model class to represent `contacts` list for a course.
 *
 * @author Siddhant Kumar Patel (17-Dec-2016)
 * @author Abhijeet Viswa
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\bH\u00c6\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\bH\u00d6\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001d"}, d2 = {"LilimboxAndroid/bphc/ilimbox/models/enrol/Contact;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "fullName", "", "(ILjava/lang/String;)V", "getFullName", "()Ljava/lang/String;", "getId", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "flags", "Companion", "app_release"})
public final class Contact implements android.os.Parcelable {
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "fullname")
    private final java.lang.String fullName = null;
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.bphc.ilimbox.models.enrol.Contact.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final android.os.Parcelable.Creator<ilimboxAndroid.bphc.ilimbox.models.enrol.Contact> CREATOR = null;
    
    /**
     * Model class to represent `contacts` list for a course.
     *
     * @author Siddhant Kumar Patel (17-Dec-2016)
     * @author Abhijeet Viswa
     */
    @org.jetbrains.annotations.NotNull()
    public final ilimboxAndroid.bphc.ilimbox.models.enrol.Contact copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName) {
        return null;
    }
    
    /**
     * Model class to represent `contacts` list for a course.
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
     * Model class to represent `contacts` list for a course.
     *
     * @author Siddhant Kumar Patel (17-Dec-2016)
     * @author Abhijeet Viswa
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model class to represent `contacts` list for a course.
     *
     * @author Siddhant Kumar Patel (17-Dec-2016)
     * @author Abhijeet Viswa
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Contact(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName) {
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
    
    public Contact(@org.jetbrains.annotations.NotNull()
    android.os.Parcel source) {
        super();
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"LilimboxAndroid/bphc/ilimbox/models/enrol/Contact$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "LilimboxAndroid/bphc/ilimbox/models/enrol/Contact;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}