package ilimboxAndroid.ilimbox.models.course

import com.google.gson.annotations.SerializedName

open class CourseContentItem(
    @SerializedName("id")val id : Int,
    @SerializedName("name")val name : String,
    @SerializedName("title")val title : String,
    @SerializedName("link")val link : String,
    @SerializedName("help")val help : String,
    @SerializedName("archetype")val archetype : String,
    @SerializedName("componentname")val componentname : String
)
