package ilimboxAndroid.ilimbox.models.core

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("firstname")  val firstName: String,
    @SerializedName("lastname") val lastName: String,
    @SerializedName("id") val id: Int = 0,
    @SerializedName("email") val email : String,
    @SerializedName("username") val username : String = "",
    @SerializedName("password") val password : String = "",
)
