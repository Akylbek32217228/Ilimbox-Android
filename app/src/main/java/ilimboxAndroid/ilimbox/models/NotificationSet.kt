package ilimboxAndroid.ilimbox.models

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import ilimboxAndroid.ilimbox.activities.MainActivity
import ilimboxAndroid.ilimbox.app.Constants
import ilimboxAndroid.ilimbox.models.course.Course
import ilimboxAndroid.ilimbox.models.course.CourseSection
import ilimboxAndroid.ilimbox.models.course.Module
import ilimboxAndroid.ilimbox.models.forum.Discussion


data class NotificationSet(
        val uniqueId: Int,
        val bundleId: Int,
        val notifTitle: String,
        val notifContent: String,
        val groupKey: String?,
        val pendingIntent: PendingIntent?
) {
    companion object {
        fun createNotificationSetForModule(context: Context, course: Course, section: CourseSection,
                                           module: Module)
                : NotificationSet {
            val intent = Intent(context, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or
                    Intent.FLAG_ACTIVITY_NEW_TASK
            intent.putExtra("courseId", course.id)
            intent.putExtra("modId", module.id)

            val pendingIntent = PendingIntent.getActivity(
                    context,
                    System.currentTimeMillis().toInt(),
                    intent,
                    PendingIntent.FLAG_UPDATE_CURRENT
            )
            return NotificationSet(module.id, course.id, section.name, module.name,
                    course.shortName, pendingIntent)
        }

        fun createNotificationSetForDiscussion(context: Context, course: Course, module: Module,
                                               discussion: Discussion)
                : NotificationSet {
            val intent = Intent(context, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or
                    Intent.FLAG_ACTIVITY_NEW_TASK
            intent.putExtra("courseId", course.id)
            intent.putExtra("modId", module.id)
            intent.putExtra("forumId", module.instance)
            intent.putExtra("discussionId", discussion.id)

            val pendingIntent = PendingIntent.getActivity(
                    context,
                    System.currentTimeMillis().toInt(),
                    intent,
                    PendingIntent.FLAG_UPDATE_CURRENT
            )
            return NotificationSet(discussion.id, course.id, module.name, discussion.message,
                    course.shortName, pendingIntent)
        }

        fun createNotificationSetForSiteNews(context: Context, discussion: Discussion)
               : NotificationSet {
            val intent = Intent(context, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or
                    Intent.FLAG_ACTIVITY_NEW_TASK
            intent.putExtra("courseId", Constants.SITE_NEWS_COURSE_ID)
            intent.putExtra("forumId", 1)
            intent.putExtra("discussionId", discussion.id)

            val pendingIntent = PendingIntent.getActivity(
                    context,
                    System.currentTimeMillis().toInt(),
                    intent,
                    PendingIntent.FLAG_UPDATE_CURRENT
            )
            return NotificationSet(1, 0, "Site News", discussion.message,
                    "Site News", pendingIntent)
        }
    }
}

