package ilimboxAndroid.bphc.ilimbox;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\nH\u0002J\b\u0010\'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020$2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010*\u001a\u00020(H\u0016J\u0012\u0010+\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020$H\u0002J\u0010\u00100\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u001c\u0010 \u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000e\u00a8\u00062"}, d2 = {"LilimboxAndroid/bphc/ilimbox/EditActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "LilimboxAndroid/bphc/ilimbox/databinding/ActivityEditBinding;", "getBinding", "()LilimboxAndroid/bphc/ilimbox/databinding/ActivityEditBinding;", "setBinding", "(LilimboxAndroid/bphc/ilimbox/databinding/ActivityEditBinding;)V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "enrollType", "LilimboxAndroid/bphc/ilimbox/EditActivity$EnrollType;", "getEnrollType", "()LilimboxAndroid/bphc/ilimbox/EditActivity$EnrollType;", "setEnrollType", "(LilimboxAndroid/bphc/ilimbox/EditActivity$EnrollType;)V", "lastName", "getLastName", "setLastName", "login", "getLogin", "setLogin", "moodleServices", "LilimboxAndroid/bphc/ilimbox/network/MoodleServices;", "name", "getName", "setName", "passwordUID", "getPasswordUID", "setPasswordUID", "checkFields", "", "checkPassword", "password", "createUserFromFirebaseDB", "", "isValidEmailId", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setViewEnabled", "viewEnabled", "setVisibilityView", "EnrollType", "app_release"})
public final class EditActivity extends androidx.appcompat.app.AppCompatActivity {
    public ilimboxAndroid.bphc.ilimbox.databinding.ActivityEditBinding binding;
    private final ilimboxAndroid.bphc.ilimbox.network.MoodleServices moodleServices = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String login = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String passwordUID = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String email = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastName = "";
    @org.jetbrains.annotations.NotNull()
    private ilimboxAndroid.bphc.ilimbox.EditActivity.EnrollType enrollType = ilimboxAndroid.bphc.ilimbox.EditActivity.EnrollType.DEFAULT;
    private java.util.HashMap _$_findViewCache;
    
    public EditActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilimboxAndroid.bphc.ilimbox.databinding.ActivityEditBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.databinding.ActivityEditBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLogin() {
        return null;
    }
    
    public final void setLogin(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPasswordUID() {
        return null;
    }
    
    public final void setPasswordUID(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilimboxAndroid.bphc.ilimbox.EditActivity.EnrollType getEnrollType() {
        return null;
    }
    
    public final void setEnrollType(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.EditActivity.EnrollType p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean checkFields(ilimboxAndroid.bphc.ilimbox.EditActivity.EnrollType enrollType) {
        return false;
    }
    
    private final boolean checkPassword(java.lang.String password) {
        return false;
    }
    
    private final boolean isValidEmailId(java.lang.String email) {
        return false;
    }
    
    private final void setVisibilityView(ilimboxAndroid.bphc.ilimbox.EditActivity.EnrollType enrollType) {
    }
    
    private final void createUserFromFirebaseDB() {
    }
    
    private final void setViewEnabled(boolean viewEnabled) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u00d6\u0001j\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"LilimboxAndroid/bphc/ilimbox/EditActivity$EnrollType;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "PHONE", "REGISTRATION", "DEFAULT", "app_release"})
    public static enum EnrollType implements android.os.Parcelable {
        /*public static final*/ PHONE /* = new PHONE() */,
        /*public static final*/ REGISTRATION /* = new REGISTRATION() */,
        /*public static final*/ DEFAULT /* = new DEFAULT() */;
        public static final android.os.Parcelable.Creator<ilimboxAndroid.bphc.ilimbox.EditActivity.EnrollType> CREATOR = null;
        
        EnrollType() {
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<ilimboxAndroid.bphc.ilimbox.EditActivity.EnrollType> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final ilimboxAndroid.bphc.ilimbox.EditActivity.EnrollType createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final ilimboxAndroid.bphc.ilimbox.EditActivity.EnrollType[] newArray(int size) {
                return null;
            }
        }
    }
}