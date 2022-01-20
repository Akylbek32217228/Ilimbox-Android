package ilimboxAndroid.ilimbox.app

object Constants {
    const val PER_PAGE = 20 // Number of course search results in a page

    const val LOGIN_LAUNCH_DATA = "LOGIN_LAUNCH_DATA"

    const val AIRNOTIFIER_PLATFORM_NAME = "android-fcm"

    const val CREATE_USER_TOKEN = "e13ea9e95a7e49b4cdec851e469c0a6e"

    /*
     * Site News isn't part of any course. However, internally we assume it to be part of course 0.
     */
    var SITE_NEWS_COURSE_ID = 0
}