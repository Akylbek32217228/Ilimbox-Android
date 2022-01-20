package ilimboxAndroid.ilimbox.models.course

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import java.util.*


open class Content (
        @SerializedName("filename") var fileName: String = "",
        @SerializedName("fileurl")  var fileUrl: String = "",
        @SerializedName("filesize") var fileSize: Int = 0,
        @SerializedName("timecreated") var timeCreated: Long = 0,
        @SerializedName("timemodified") var timeModified: Long = 0,
        var moduleId: Int = 0,
) : RealmObject() {


    fun copy(): Content = Content(fileName, fileUrl, fileSize, timeCreated, timeModified)

    override fun equals(other: Any?): Boolean {
        return other is Content && other.hashCode() == hashCode()
    }

    override fun hashCode(): Int {
        return Objects.hash(fileName, fileUrl, timeModified)
    }
}