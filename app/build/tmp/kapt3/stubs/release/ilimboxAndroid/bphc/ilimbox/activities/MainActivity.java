package ilimboxAndroid.bphc.ilimbox.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0014J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u001e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0006J\b\u0010\u001e\u001a\u00020\u000eH\u0002J\b\u0010\u001f\u001a\u00020\u000eH\u0002J\b\u0010 \u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020\u000eH\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"LilimboxAndroid/bphc/ilimbox/activities/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_bottomNavSelectionListener", "Lkotlin/Function1;", "Landroid/view/MenuItem;", "", "get_bottomNavSelectionListener", "()Lkotlin/jvm/functions/Function1;", "_realm", "Lio/realm/Realm;", "courseDataHandler", "LilimboxAndroid/bphc/ilimbox/helper/CourseDataHandler;", "askPermission", "", "clearBackStack", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNewIntent", "intent", "Landroid/content/Intent;", "pushView", "fragment", "Landroidx/fragment/app/Fragment;", "tag", "", "rootFrag", "requestReadStoragePermission", "resolveIntent", "resolveModuleLinkShare", "startDataMigrationIfRequired", "app_release"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private io.realm.Realm _realm;
    private ilimboxAndroid.bphc.ilimbox.helper.CourseDataHandler courseDataHandler;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    private final kotlin.jvm.functions.Function1<android.view.MenuItem, java.lang.Boolean> get_bottomNavSelectionListener() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final void resolveModuleLinkShare() {
    }
    
    private final void resolveIntent() {
    }
    
    private final void askPermission() {
    }
    
    private final void requestReadStoragePermission() {
    }
    
    private final void startDataMigrationIfRequired() {
    }
    
    public final void pushView(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, boolean rootFrag) {
    }
    
    private final void clearBackStack() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}