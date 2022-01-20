package ilimboxAndroid.ilimbox.models.forum

import com.google.gson.annotations.SerializedName


data class NewPostCustomData(
    @SerializedName("cmid") private val _modId: String = "",

    @SerializedName("instance") private val _instance: String = "",

    @SerializedName("discussionid") private val _discussionId: String = "",

    @SerializedName("postid") private val _postId: String = "",
) {

   val modId: Int by lazy {
      _modId.toIntOrNull() ?: 0
   }

   val forumId: Int by lazy {
      _instance.toIntOrNull() ?: 0
   }

   val discussionId: Int by lazy {
      _discussionId.toIntOrNull() ?: 0
   }

   val postId: Int by lazy {
      _postId.toIntOrNull() ?: 0
   }
}
