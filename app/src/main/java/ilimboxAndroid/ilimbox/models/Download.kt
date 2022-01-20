package ilimboxAndroid.ilimbox.models

import java.io.File

data class Download(
        val file: File,
        val description: String,
        val iconResource: Int
)
