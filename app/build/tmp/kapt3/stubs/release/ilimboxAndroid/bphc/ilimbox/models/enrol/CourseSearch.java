package ilimboxAndroid.bphc.ilimbox.models.enrol;

import java.lang.System;

/**
 * Model class to represent response from [ilimboxAndroid.bphc.ilimbox.network.MoodleServices.searchCourses].
 * @author Siddhant Kumar Patel (17-Dec-2016)
 * @author Abhijeet Viswa
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"LilimboxAndroid/bphc/ilimbox/models/enrol/CourseSearch;", "", "total", "", "courses", "", "LilimboxAndroid/bphc/ilimbox/models/enrol/SearchedCourseDetail;", "(ILjava/util/List;)V", "getCourses", "()Ljava/util/List;", "getTotal", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"})
public final class CourseSearch {
    @com.google.gson.annotations.SerializedName(value = "total")
    private final int total = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "courses")
    private final java.util.List<ilimboxAndroid.bphc.ilimbox.models.enrol.SearchedCourseDetail> courses = null;
    
    /**
     * Model class to represent response from [ilimboxAndroid.bphc.ilimbox.network.MoodleServices.searchCourses].
     * @author Siddhant Kumar Patel (17-Dec-2016)
     * @author Abhijeet Viswa
     */
    @org.jetbrains.annotations.NotNull()
    public final ilimboxAndroid.bphc.ilimbox.models.enrol.CourseSearch copy(int total, @org.jetbrains.annotations.NotNull()
    java.util.List<ilimboxAndroid.bphc.ilimbox.models.enrol.SearchedCourseDetail> courses) {
        return null;
    }
    
    /**
     * Model class to represent response from [ilimboxAndroid.bphc.ilimbox.network.MoodleServices.searchCourses].
     * @author Siddhant Kumar Patel (17-Dec-2016)
     * @author Abhijeet Viswa
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Model class to represent response from [ilimboxAndroid.bphc.ilimbox.network.MoodleServices.searchCourses].
     * @author Siddhant Kumar Patel (17-Dec-2016)
     * @author Abhijeet Viswa
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model class to represent response from [ilimboxAndroid.bphc.ilimbox.network.MoodleServices.searchCourses].
     * @author Siddhant Kumar Patel (17-Dec-2016)
     * @author Abhijeet Viswa
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CourseSearch() {
        super();
    }
    
    public CourseSearch(int total, @org.jetbrains.annotations.NotNull()
    java.util.List<ilimboxAndroid.bphc.ilimbox.models.enrol.SearchedCourseDetail> courses) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getTotal() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ilimboxAndroid.bphc.ilimbox.models.enrol.SearchedCourseDetail> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ilimboxAndroid.bphc.ilimbox.models.enrol.SearchedCourseDetail> getCourses() {
        return null;
    }
}