package ilimboxAndroid.ilimbox.models.forum

import androidx.core.text.HtmlCompat
import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Discussion(

        @PrimaryKey @SerializedName("id") var id: Int = 0,


        @SerializedName("discussion")  var discussionId:Int = 0,


        @SerializedName("name")  var name: String = "",


        @SerializedName("timemodified") var timeModified: Int = 0,


        @SerializedName("parent")  var parent:Int = 0,

        subject: String = "" ,

        message: String = "",


        @SerializedName("attachments") var attachments: RealmList<Attachment> = RealmList(),

        @SerializedName("userfullname") var userFullName: String = "",


        @SerializedName("userpictureurl") var userPictureUrl: String = "",


        @SerializedName("pinned") var isPinned:Boolean = false,

        var forumId:Int = 0,
) : RealmObject() {

    var subject: String = subject
        get() {
            return HtmlCompat.fromHtml(field, HtmlCompat.FROM_HTML_MODE_COMPACT).toString()
                    .trim { it < ' ' }
        }
        private set

    @SerializedName("message") var message: String = ""
        get() {
            return HtmlCompat.fromHtml(field, HtmlCompat.FROM_HTML_MODE_COMPACT).toString()
                    .trim { it < ' ' }
        }
        private set
}
