package ilimboxAndroid.ilimbox.models.forum

import com.google.gson.annotations.SerializedName

data class ForumData(
        @SerializedName("discussions") var discussions: List<Discussion> = emptyList()
)
