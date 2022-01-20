package ilimboxAndroid.bphc.ilimbox.fragments;

import java.lang.System;

/**
 * This fragment adds support for a BottomSheet to show more options and should
 * be preferred over a normal dialog box.
 *
 * @author Abhijeet Viswa
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/MoreOptionsFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "header", "", "options", "Ljava/util/ArrayList;", "LilimboxAndroid/bphc/ilimbox/fragments/MoreOptionsFragment$Option;", "viewModel", "LilimboxAndroid/bphc/ilimbox/fragments/MoreOptionsFragment$OptionsViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onViewCreated", "view", "Companion", "Option", "OptionViewHolder", "OptionsViewModel", "app_release"})
public final class MoreOptionsFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment.OptionsViewModel viewModel;
    private java.lang.String header;
    private java.util.ArrayList<ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment.Option> options;
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public MoreOptionsFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    /**
     * Create a new instance of the @code `MoreOptionsFragment`
     * @param header The header to be set to the dialog. Set to `null`
     * or an empty string if no header is required.
     * @param options The list of options of that should be shown to the user.
     * @return An instance of `MoreOptionsFragment`
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment newInstance(@org.jetbrains.annotations.NotNull()
    java.lang.String header, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment.Option> options) {
        return null;
    }
    
    /**
     * Wrapper class specifying an option.
     * @property id an integer to identify this option uniquely
     * @property optionText the text to be shown to the user
     * @property drawableIcon drawable resource id to be used as icon for the option
     */
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/MoreOptionsFragment$Option;", "Landroid/os/Parcelable;", "id", "", "optionText", "", "drawableIcon", "(ILjava/lang/String;I)V", "getDrawableIcon", "()I", "getId", "getOptionText", "()Ljava/lang/String;", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"})
    public static final class Option implements android.os.Parcelable {
        private final int id = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String optionText = null;
        private final int drawableIcon = 0;
        public static final android.os.Parcelable.Creator<ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment.Option> CREATOR = null;
        
        public Option(int id, @org.jetbrains.annotations.Nullable()
        java.lang.String optionText, int drawableIcon) {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOptionText() {
            return null;
        }
        
        public final int getDrawableIcon() {
            return 0;
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
        public static final class Creator implements android.os.Parcelable.Creator<ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment.Option> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment.Option createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment.Option[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * `ViewModel` to observe selection events.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0005R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/MoreOptionsFragment$OptionsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_selection", "Landroidx/lifecycle/MutableLiveData;", "LilimboxAndroid/bphc/ilimbox/fragments/MoreOptionsFragment$Option;", "selection", "Landroidx/lifecycle/LiveData;", "getSelection", "()Landroidx/lifecycle/LiveData;", "clearSelection", "", "setSelection", "option", "app_release"})
    public static final class OptionsViewModel extends androidx.lifecycle.ViewModel {
        private androidx.lifecycle.MutableLiveData<ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment.Option> _selection;
        
        public OptionsViewModel() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.LiveData<ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment.Option> getSelection() {
            return null;
        }
        
        public final void setSelection(@org.jetbrains.annotations.Nullable()
        ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment.Option option) {
        }
        
        /**
         * Clear the selection after observing and handling it. Ensure that
         * you deregister yourself before calling this method so that clearing
         * the selection does not cause a callback.
         */
        public final void clearSelection() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/MoreOptionsFragment$OptionViewHolder;", "", "text", "Landroid/widget/TextView;", "icon", "Landroid/widget/ImageView;", "(Landroid/widget/TextView;Landroid/widget/ImageView;)V", "getIcon", "()Landroid/widget/ImageView;", "setIcon", "(Landroid/widget/ImageView;)V", "getText", "()Landroid/widget/TextView;", "setText", "(Landroid/widget/TextView;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"})
    public static final class OptionViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView text;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView icon;
        
        @org.jetbrains.annotations.NotNull()
        public final ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment.OptionViewHolder copy(@org.jetbrains.annotations.NotNull()
        android.widget.TextView text, @org.jetbrains.annotations.NotNull()
        android.widget.ImageView icon) {
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
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public OptionViewHolder(@org.jetbrains.annotations.NotNull()
        android.widget.TextView text, @org.jetbrains.annotations.NotNull()
        android.widget.ImageView icon) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getText() {
            return null;
        }
        
        public final void setText(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIcon() {
            return null;
        }
        
        public final void setIcon(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007\u00a8\u0006\n"}, d2 = {"LilimboxAndroid/bphc/ilimbox/fragments/MoreOptionsFragment$Companion;", "", "()V", "newInstance", "LilimboxAndroid/bphc/ilimbox/fragments/MoreOptionsFragment;", "header", "", "options", "Ljava/util/ArrayList;", "LilimboxAndroid/bphc/ilimbox/fragments/MoreOptionsFragment$Option;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create a new instance of the @code `MoreOptionsFragment`
         * @param header The header to be set to the dialog. Set to `null`
         * or an empty string if no header is required.
         * @param options The list of options of that should be shown to the user.
         * @return An instance of `MoreOptionsFragment`
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String header, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<ilimboxAndroid.bphc.ilimbox.fragments.MoreOptionsFragment.Option> options) {
            return null;
        }
    }
}