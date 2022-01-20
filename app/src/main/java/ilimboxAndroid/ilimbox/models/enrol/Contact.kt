package ilimboxAndroid.ilimbox.models.enrol

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName


data class Contact(
        @SerializedName("id") val id: Int,
        @SerializedName("fullname") val fullName: String
) : Parcelable {

    constructor(source: Parcel) : this(source.readInt(), source.readString()?: "")


    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeInt(id)
        dest.writeString(fullName)
    }

    companion object {
        @JvmField
        val CREATOR = object : Parcelable.Creator<Contact?> {
            override fun createFromParcel(source: Parcel): Contact? {
                return Contact(source)
            }

            override fun newArray(size: Int): Array<Contact?> {
                return arrayOfNulls(size)
            }
        }
    }
}