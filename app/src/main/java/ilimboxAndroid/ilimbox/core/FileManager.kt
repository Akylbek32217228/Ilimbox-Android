package ilimboxAndroid.ilimbox.core

import android.app.Activity
import android.app.DownloadManager
import android.content.*
import android.net.Uri
import android.os.Build
import android.os.Environment
import androidx.core.content.FileProvider
import ilimboxAndroid.ilimbox.BuildConfig
import ilimboxAndroid.ilimbox.app.appendOrSetQueryParameter
import ilimboxAndroid.ilimbox.models.UserAccount.token
import ilimboxAndroid.ilimbox.models.course.Content
import ilimboxAndroid.ilimbox.models.course.Module
import ilimboxAndroid.ilimbox.models.forum.Attachment
import ilimboxAndroid.ilimbox.utils.FileUtils
import java.io.File

class FileManager(
        private val activity: Activity,
        private val courseName: String,
        private val callback: (String) -> Unit,
) {

    private val sanitizedCourseName: String = courseName.replace("/".toRegex(), "_")
    private val baseContentDir = activity.externalMediaDirs[0]

    private val fileList: MutableList<String> = emptyList<String>().toMutableList()
    private val requestedDownloads: MutableList<String> = emptyList<String>().toMutableList()

    private val onComplete: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            reloadFileList()
            for (filename in requestedDownloads) {
                if (isFileDownloaded(filename)) {
                    requestedDownloads.remove(filename)
                    callback.invoke(filename)
                    return
                }
            }
        }
    }

    fun downloadModuleContent(content: Content, module: Module) {
        deleteExistingModuleContent(content)
        downloadFile(content.fileUrl, content.fileName, module.description)
    }

    fun downloadDiscussionAttachment(attachment: Attachment, description: String) {
        deleteExistingDiscussionAttachment(attachment)
        downloadFile(attachment.fileUrl, attachment.fileName, description)
    }

    fun openModuleContent(content: Content) =
            openFile(content.fileName)

    fun openDiscussionAttachment(attachment: Attachment) =
            openFile(attachment.fileName)

    private fun downloadFile(fileUrl: String, fileName: String, description: String) {
        val url = Uri.parse(fileUrl).buildUpon().appendOrSetQueryParameter("token", token).build()
        val destinationUri = Uri.fromFile(File(baseContentDir, getRelativePath(fileName)))

        val request = DownloadManager.Request(url)
        request.setDescription(description)
        request.setTitle(fileName)
        request.setDestinationUri(destinationUri)
        (activity.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager).enqueue(request)
        requestedDownloads.add(fileName)
    }

    private fun openFile(fileName: String) {
        val file = File(baseContentDir, getRelativePath(fileName))
        val fileUri = FileProvider.getUriForFile(activity, "${BuildConfig.APPLICATION_ID}.provider", file)

        val intent = Intent(Intent.ACTION_VIEW)
        intent.setDataAndType(fileUri, FileUtils.getFileMimeType(fileName))
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)

        try {
            activity.startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            intent.setDataAndType(fileUri, "application/*")
            activity.startActivity(
                    Intent.createChooser(
                            intent,
                            "No Application found to open File - $fileName"
                    )
            )
        }
    }

    fun shareModuleContent(content: Content) =
            shareFile(content.fileName)

    fun shareDiscussionAttachment(attachment: Attachment) =
            shareFile(attachment.fileName)

    private fun shareFile(fileName: String) {
        val file = File(baseContentDir, getRelativePath(fileName))
        val fileUri = FileProvider.getUriForFile(
                activity,
                "${BuildConfig.APPLICATION_ID}.provider",
                file
        )

        val sendIntent = Intent()
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.putExtra(Intent.EXTRA_STREAM, fileUri)
        sendIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        sendIntent.type = "application/*"
        try {
            activity.startActivity(Intent.createChooser(sendIntent, "Share File"))
        } catch (e: ActivityNotFoundException) {
            /*Toast.makeText(
                    activity,
                    "No app found to share the file - $fileName",
                    Toast.LENGTH_SHORT
            ).show()*/
        }
    }

    private fun deleteExistingModuleContent(content: Content) = deleteExistingFile(content.fileName)

    private fun deleteExistingDiscussionAttachment(attachment: Attachment) =
            deleteExistingFile(attachment.fileName)

    private fun deleteExistingFile(fileName: String) {
        val file = File(baseContentDir, getRelativePath(fileName))
        if (file.exists()) {
            file.delete()
        }
    }

    fun reloadFileList() {
        fileList.clear()
        val courseDir = File(baseContentDir, getRelativePath(""))
        if (courseDir.isDirectory) {
            val files = courseDir.list()
            if (files != null) {
                fileList.addAll(listOf(*files))
            }
        }
    }

    private fun getRelativePath(filename: String) =
            File.separator + sanitizedCourseName + File.separator + filename

    fun isModuleContentDownloaded(content: Content) = isFileDownloaded(content.fileName)

    fun isDiscussionAttachmentDownloaded(attachment: Attachment) = isFileDownloaded(attachment.fileName)

    private fun isFileDownloaded(fileName: String): Boolean {
        if (fileList.isEmpty()) {
            reloadFileList()
        }
        return fileList.contains(fileName)
    }

    fun registerDownloadReceiver() =
            activity.registerReceiver(onComplete, IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE))

    fun unregisterDownloadReceiver() =
            activity.unregisterReceiver(onComplete)

}