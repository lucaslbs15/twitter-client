package bicca.lucas.twitterclient.twitter.api

import bicca.lucas.twitterclient.twitter.api.model.Tweet
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface TwitterAPI {

    @Headers("Content-Type: application/json")
    @GET("/1.1/statuses/user_timeline.json")
    fun getUserTimeline(@Header("Authorization") token: String,
                        @Query("count") count: Int,
                        @Query("screen_name") userName: String): Call<List<Tweet>>
}