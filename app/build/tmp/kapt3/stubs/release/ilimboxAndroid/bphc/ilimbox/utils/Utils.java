package ilimboxAndroid.bphc.ilimbox.utils;

import java.lang.System;

/**
 * Set of utility functions that can be used throughout the entire project.
 *
 * Created by abhijeetviswa 21/04/2019
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060 2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006\u00a2\u0006\u0002\u0010#R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"LilimboxAndroid/bphc/ilimbox/utils/Utils;", "", "()V", "hexArray", "", "bytesToHex", "", "bytes", "", "epochToDateTime", "epoch", "", "formatDate", "seconds", "", "humanReadableByteCount", "si", "", "openURLInBrowser", "", "activity", "Landroid/app/Activity;", "url", "showBadTokenDialog", "ctxt", "Landroid/content/Context;", "toTitleCase", "str", "trimWhiteSpace", "", "source", "userDetails", "", "fullName", "username", "(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "app_release"})
public final class Utils {
    @org.jetbrains.annotations.NotNull()
    public static final ilimboxAndroid.bphc.ilimbox.utils.Utils INSTANCE = null;
    private static final char[] hexArray = null;
    
    private Utils() {
        super();
    }
    
    /**
     * Convert `bytes` to human readable format
     *
     * [Source](https://stackoverflow.com/a/3758880/2198399)
     *
     * @param si use SI or binary units
     * @return Human-readable size in SI/binary units
     */
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    public final java.lang.String humanReadableByteCount(long bytes, boolean si) {
        return null;
    }
    
    /**
     * Constructs a DateTime string in the local timezone
     * @param epoch Unix epoch of the instant, in seconds
     * @return DateTime string in the format 10:10:10 AM 18-Nov-2019
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String epochToDateTime(long epoch) {
        return null;
    }
    
    /**
     * Converts a byte array to a hex string. This function
     * was converted from Java to Kotlin. So a lot of type
     * related gymnastics is performed to do a simple mundane
     * task.
     *
     * [Source](https://stackoverflow.com/a/40907652)
     *
     * @return Required Hex string
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String bytesToHex(@org.jetbrains.annotations.NotNull()
    byte[] bytes) {
        return null;
    }
    
    public final void showBadTokenDialog(@org.jetbrains.annotations.Nullable()
    android.content.Context ctxt) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] userDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String fullName, @org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    private final java.lang.String toTitleCase(java.lang.String str) {
        return null;
    }
    
    public final void openURLInBrowser(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    /**
     * Trim trailing and leading whitespace as defined by
     * [Character.isWhiteSpace][Character.isWhitespace].
     * @return Empty string is source is null, otherwise string with all trailing
     * whitespace removed
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.CharSequence trimWhiteSpace(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence source) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDate(int seconds) {
        return null;
    }
}