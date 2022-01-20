package ilimboxAndroid.ilimbox.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"LilimboxAndroid/ilimbox/utils/CustomLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isScrollEnabled", "", "canScrollHorizontally", "canScrollVertically", "setScrollEnabled", "", "flag", "app_debug"})
public class CustomLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    private boolean isScrollEnabled = false;
    
    public CustomLinearLayoutManager(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    public final void setScrollEnabled(boolean flag) {
    }
    
    @java.lang.Override()
    public boolean canScrollHorizontally() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canScrollVertically() {
        return false;
    }
}