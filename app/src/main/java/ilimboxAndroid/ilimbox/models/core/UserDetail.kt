package ilimboxAndroid.ilimbox.models.core

import com.google.gson.annotations.SerializedName


data class UserDetail (
    @SerializedName("username") val username: String = "",
    @SerializedName("password") val password: String = "",
    @SerializedName("firstname")  val firstName: String = "",
    @SerializedName("lastname") val lastName: String = "",
    @SerializedName("userpictureurl") val userPictureUrl: String = "",
    @SerializedName("userid") val userId: Int = 0,
    @SerializedName("token") var token: String = "",
    @SerializedName("privatetoken") var privateToken: String = "",
)
