package ilimboxAndroid.ilimbox.widgets

import android.content.Context
import androidx.appcompat.app.AlertDialog
import ilimboxAndroid.ilimbox.R
import ilimboxAndroid.ilimbox.models.UserAccount.isDarkModeEnabled
import ilimboxAndroid.ilimbox.models.course.Content
import ilimboxAndroid.ilimbox.models.forum.Attachment
import ilimboxAndroid.ilimbox.utils.Utils.epochToDateTime
import ilimboxAndroid.ilimbox.utils.Utils.humanReadableByteCount

class PropertiesAlertDialog(context: Context, filename: String, fileSize: Int, epoch: Long) {
    private var alertDialog: AlertDialog.Builder = if (isDarkModeEnabled) {
        AlertDialog.Builder(context, R.style.Theme_AppCompat_Dialog_Alert)
    } else {
        AlertDialog.Builder(
            context,
            R.style.Theme_AppCompat_Light_Dialog_Alert
        )
    }

    constructor(context: Context, content: Content) : this(
        context,
        content.fileName,
        content.fileSize,
        content.timeCreated
    )

    constructor(context: Context, attachment: Attachment) : this(
        context,
        attachment.fileName,
        attachment.fileSize,
        attachment.timeModified
    )

    fun show() {
        alertDialog.show()
    }

    init {
        alertDialog.setTitle(filename)

        var properties = "File Size: ${humanReadableByteCount(fileSize.toLong(), false)}"
        properties += "Created: ${epochToDateTime(epoch)}"
        alertDialog.setMessage(properties)
    }
}
