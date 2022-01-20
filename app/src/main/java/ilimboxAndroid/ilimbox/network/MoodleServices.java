package ilimboxAndroid.ilimbox.network;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import ilimboxAndroid.ilimbox.models.core.User;
import ilimboxAndroid.ilimbox.models.core.UserDetail;
import ilimboxAndroid.ilimbox.models.course.CourseContentItems;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ilimboxAndroid.ilimbox.models.course.CourseSection;
import ilimboxAndroid.ilimbox.models.enrol.SelfEnrol;
import ilimboxAndroid.ilimbox.models.forum.ForumData;
import ilimboxAndroid.ilimbox.models.enrol.CourseSearch;


public interface MoodleServices {


    @GET("webservice/rest/server.php?wsfunction=core_webservice_get_site_info&moodlewsrestformat=json")
    Call<UserDetail> fetchUserDetail(@Query("wstoken") String token);


    @GET("webservice/rest/server.php?wsfunction=core_enrol_get_users_courses&moodlewsrestformat=json")
    Call<ResponseBody> fetchCourses(@Query("wstoken") String token, @Query("userid") int userId);

        @GET("webservice/rest/server.php?wsfunction=core_course_get_contents&moodlewsrestformat=json")
    Call<List<CourseSection>> fetchCourseContent(@Query("wstoken") String token, @Query("courseid") int courseId);

    @GET("webservice/rest/server.php?wsfunction=core_course_get_course_content_items&moodlewsrestformat=json")
    Call<CourseContentItems> fetchCourseContentItems(@Query("wstoken") String token, @Query("courseid") int courseId);


    @GET("webservice/rest/server.php?wsfunction=core_course_search_courses&moodlewsrestformat=json&criterianame=search")
    Call<CourseSearch> searchCourses(@Query("wstoken") String token,
                                     @Query("criteriavalue") String courseName,
                                     @Query("page") int page,
                                     @Query("perpage") int numberOfResults);

    @GET("webservice/rest/server.php?wsfunction=enrol_self_enrol_user&moodlewsrestformat=json")
    Call<SelfEnrol> selfEnrolUserInCourse(@Query("wstoken") String token, @Query("courseid") int courseId);

    @GET("webservice/rest/server.php?wsfunction=mod_forum_get_forum_discussions_paginated&moodlewsrestformat=json" +
            "&sortby=timemodified&sortdirection=DESC")
    Call<ForumData> getForumDiscussions(@Query("wstoken") String token,
                                        @Query("forumid") int forumid,
                                        @Query("page") int page,
                                        @Query("perpage") int perpage);

    @GET("webservice/rest/server.php?wsfunction=core_user_add_user_device&moodlewsrestformat=json")
    Call<ResponseBody> registerUserDevice(@Query("wstoken") @NotNull String token,
                                    @Query("appid") @NotNull String appid,
                                    @Query("name") @NotNull String name,
                                    @Query("model") @NotNull String model,
                                    @Query("platform") @NotNull String platform,
                                    @Query("version") @NotNull String version,
                                    @Query("pushid") @NotNull String pushid,
                                    @Query("uuid") @NotNull String uuid);

    @GET("webservice/rest/server.php?wsfunction=core_user_remove_user_device&moodlewsrestformat=json")
    Call<ResponseBody> deregisterUserDevice(@Query("wstoken") @NotNull String token,
                                            @Query("uuid") @NotNull String uuid,
                                            @Query("appid") @NotNull String appId);

    @POST("login/token.php?service=moodle_mobile_app")
    Call<UserDetail> postLogin(@Query("username") @NotNull String username, @Query("password") @NotNull String password);


    @POST("webservice/rest/server.php?wsfunction=core_user_update_users&moodlewsrestformat=json")
    Call<ResponseBody> editProfile(@Query("wstoken") @NotNull String token, @Body @NotNull User[] users);

    @POST("webservice/rest/server.php?wsfunction=core_user_create_users&moodlewsrestformat=json")
    @FormUrlEncoded
    Call<ResponseBody> createUser(@Query("wstoken") @NotNull String token, @Field("users[0][username]")  String username,
                                @Field("users[0][password]") String password,
                                @Field("users[0][firstname]") String firstname,
                                @Field("users[0][lastname]") String lastname,
                                @Field("users[0][email]") String email);

    @POST("webservice/rest/server.php?wsfunction=core_user_update_users&moodlewsrestformat=json")
    @FormUrlEncoded
    Call<ResponseBody> updateUser(@Query("wstoken") @NotNull String token, @Field("users[0][id]")  int id,
                                  @Field("users[0][password]") String password);


    @POST("webservice/rest/server.php?wsfunction=core_user_get_users_by_field&moodlewsrestformat=json")
    @FormUrlEncoded
    Call<List<User>> getUserId(@Query("wstoken") @NotNull String token, @Query("field") @NotNull String username,
                                 @Field("values[0]") @NotNull String value);

}
