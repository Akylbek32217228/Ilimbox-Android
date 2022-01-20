package ilimboxAndroid.bphc.ilimbox.widgets;

import java.lang.System;

/**
 * A user interface element that can be collapsed on user input using a
 * [ClickableSpan]. Useful when needing to display variable length
 * descriptions in the UI without having it take over the entire screen.
 *
 * See [CollapsibleTextView][R.styleable.CollapsibleTextView].
 *
 * @author Abhijeet Viswa
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0014J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"LilimboxAndroid/bphc/ilimbox/widgets/CollapsibleTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "collapseText", "", "collapsedLineCount", "", "expandText", "fullText", "", "shouldRemeasure", "", "spanBuilder", "Landroid/text/SpannableStringBuilder;", "state", "LilimboxAndroid/bphc/ilimbox/widgets/CollapsibleTextView$TextState;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setFullText", "TextState", "app_release"})
public final class CollapsibleTextView extends androidx.appcompat.widget.AppCompatTextView {
    private java.lang.CharSequence fullText;
    private java.lang.String collapseText;
    private java.lang.String expandText;
    private int collapsedLineCount;
    private ilimboxAndroid.bphc.ilimbox.widgets.CollapsibleTextView.TextState state = ilimboxAndroid.bphc.ilimbox.widgets.CollapsibleTextView.TextState.COLLAPSED;
    private final android.text.SpannableStringBuilder spanBuilder = null;
    private boolean shouldRemeasure = true;
    private java.util.HashMap _$_findViewCache;
    
    public CollapsibleTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    public final void setFullText(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence fullText) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"LilimboxAndroid/bphc/ilimbox/widgets/CollapsibleTextView$TextState;", "", "(Ljava/lang/String;I)V", "COLLAPSED", "EXPANDED", "app_release"})
    static enum TextState {
        /*public static final*/ COLLAPSED /* = new COLLAPSED() */,
        /*public static final*/ EXPANDED /* = new EXPANDED() */;
        
        TextState() {
        }
    }
}