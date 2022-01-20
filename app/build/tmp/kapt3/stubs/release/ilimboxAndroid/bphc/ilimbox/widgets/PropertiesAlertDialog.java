package ilimboxAndroid.bphc.ilimbox.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"LilimboxAndroid/bphc/ilimbox/widgets/PropertiesAlertDialog;", "", "context", "Landroid/content/Context;", "content", "LilimboxAndroid/bphc/ilimbox/models/course/Content;", "(Landroid/content/Context;LilimboxAndroid/bphc/ilimbox/models/course/Content;)V", "attachment", "LilimboxAndroid/bphc/ilimbox/models/forum/Attachment;", "(Landroid/content/Context;LilimboxAndroid/bphc/ilimbox/models/forum/Attachment;)V", "filename", "", "fileSize", "", "epoch", "", "(Landroid/content/Context;Ljava/lang/String;IJ)V", "alertDialog", "Landroidx/appcompat/app/AlertDialog$Builder;", "show", "", "app_release"})
public final class PropertiesAlertDialog {
    private androidx.appcompat.app.AlertDialog.Builder alertDialog;
    
    public PropertiesAlertDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String filename, int fileSize, long epoch) {
        super();
    }
    
    public PropertiesAlertDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.models.course.Content content) {
        super();
    }
    
    public PropertiesAlertDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ilimboxAndroid.bphc.ilimbox.models.forum.Attachment attachment) {
        super();
    }
    
    public final void show() {
    }
}