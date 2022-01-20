package ilimboxAndroid.ilimbox.models.forum

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject


open class Attachment(
        @SerializedName("filename") var fileName: String = "",
        @SerializedName("mimetype") var mimeType: String = "",
        @SerializedName("fileurl") var fileUrl: String = "",
        @SerializedName("filesize") var fileSize: Int = 0,
        @SerializedName("timemodified") var timeModified: Long = 0,
) : RealmObject()

