package ilimboxAndroid.ilimbox.models.enrol

import com.google.gson.annotations.SerializedName


data class CourseSearch(
        @SerializedName("total") val total: Int = 0,
        @SerializedName("courses") val courses: List<SearchedCourseDetail> = emptyList(),
)