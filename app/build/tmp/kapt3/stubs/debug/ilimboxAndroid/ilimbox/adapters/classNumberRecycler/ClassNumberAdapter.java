package ilimboxAndroid.ilimbox.adapters.classNumberRecycler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0004H\u0016J\u000e\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0004J\u001e\u0010%\u001a\u00020\u000b2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0015j\b\u0012\u0004\u0012\u00020\u0004`\'R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010\u00a8\u0006("}, d2 = {"LilimboxAndroid/ilimbox/adapters/classNumberRecycler/ClassNumberAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LilimboxAndroid/ilimbox/adapters/classNumberRecycler/ClassNumberViewHolder;", "currentClass", "", "classList", "", "width", "height", "onSelect", "Lkotlin/Function2;", "", "(ILjava/util/List;IILkotlin/jvm/functions/Function2;)V", "getClassList", "()Ljava/util/List;", "getCurrentClass", "()I", "setCurrentClass", "(I)V", "getHeight", "mList", "Ljava/util/ArrayList;", "getMList", "()Ljava/util/ArrayList;", "setMList", "(Ljava/util/ArrayList;)V", "getWidth", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCurrentClassNumber", "num", "setList", "list", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class ClassNumberAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ilimboxAndroid.ilimbox.adapters.classNumberRecycler.ClassNumberViewHolder> {
    private int currentClass;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> classList = null;
    private final int width = 0;
    private final int height = 0;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, kotlin.Unit> onSelect = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.Integer> mList;
    
    public ClassNumberAdapter(int currentClass, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> classList, int width, int height, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> onSelect) {
        super();
    }
    
    public final int getCurrentClass() {
        return 0;
    }
    
    public final void setCurrentClass(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getClassList() {
        return null;
    }
    
    public final int getWidth() {
        return 0;
    }
    
    public final int getHeight() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getMList() {
        return null;
    }
    
    public final void setMList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ilimboxAndroid.ilimbox.adapters.classNumberRecycler.ClassNumberViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ilimboxAndroid.ilimbox.adapters.classNumberRecycler.ClassNumberViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setCurrentClassNumber(int num) {
    }
}