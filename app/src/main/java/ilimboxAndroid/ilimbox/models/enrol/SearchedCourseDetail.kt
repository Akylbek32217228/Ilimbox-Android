package ilimboxAndroid.ilimbox.models.enrol

import android.os.Parcel
import android.os.Parcelable
import androidx.core.text.HtmlCompat
import com.google.gson.annotations.SerializedName


data class SearchedCourseDetail(
        @SerializedName("id") val id: Int = 0,
        @SerializedName("fullname") val fullName: String = "",
        @SerializedName("displayname") var _displayName: String = "",
        @SerializedName("shortname") var shortName: String = "",
        @SerializedName("categoryid") var categoryId: Int = 0,
        @SerializedName("categoryname") var categoryName: String = "",
        @SerializedName("contacts") val contacts: List<Contact> = emptyList()
) : Parcelable {

    val displayName: String
        get() = HtmlCompat.fromHtml(_displayName, HtmlCompat.FROM_HTML_MODE_COMPACT).toString()
                .trim { it <= ' '}

    private constructor(source: Parcel): this(
        source.readInt(),
        source.readString()?: "",
        source.readString()?: "",
        source.readString()?: "",
        source.readInt(),
        source.readString()?: "",
        arrayListOf<Contact>().apply {
            source.readList(this as List<*>, Contact::class.java.classLoader)
        }
    )

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.apply {
            writeInt(id)
            writeString(fullName)
            writeString(displayName)
            writeString(shortName)
            writeInt(categoryId)
            writeString(categoryName)
            writeList(contacts)
        }
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        @JvmField
        val CREATOR = object : Parcelable.Creator<SearchedCourseDetail?> {
            override fun createFromParcel(source: Parcel): SearchedCourseDetail? {
                return SearchedCourseDetail(source)
            }

            override fun newArray(size: Int): Array<SearchedCourseDetail?> {
                return arrayOfNulls(size)
            }
        }
    }
}