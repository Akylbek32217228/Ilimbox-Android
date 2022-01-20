package ilimboxAndroid.ilimbox.models.course

import com.google.gson.annotations.SerializedName

open class CourseContentItems(
    @SerializedName("content_items")val content_items : List<CourseContentItem>
)
