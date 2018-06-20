package bicca.lucas.twitterclient.twitter.api.model

import com.google.gson.annotations.SerializedName

class Tweet {

    @SerializedName("created_at")
    lateinit var createdAt: String
    @SerializedName("id")
    var id: Long = 0
    @SerializedName("id_str")
    lateinit var idStr: String
    @SerializedName("text")
    lateinit var text: String
    @SerializedName("source")
    lateinit var source: String
    @SerializedName("truncated")
    var truncated: Boolean = false
    @SerializedName("in_reply_to_status_id")
    var inReplyToStatusId: Long = 0
    @SerializedName("in_reply_to_status_id_str")
    lateinit var inReplyToStatusIdStr: String
    @SerializedName("in_reply_to_user_id")
    var inReplayToUserId: Long = 0
    @SerializedName("in_reply_to_user_id_str")
    lateinit var inReplyToUserIdStr: String
    @SerializedName("in_reply_to_screen_name")
    lateinit var inReplyToScreenName: String
    @SerializedName("user")
    lateinit var user: User
    @SerializedName("coordinates")
    lateinit var coordinates: Coordinates
    @SerializedName("place")
    lateinit var place: Place
    @SerializedName("quoted_status_id")
    var quotedStatusId: Long = 0
    @SerializedName("quoted_status_id_str")
    lateinit var quotedStatusIdStr: String
    @SerializedName("is_quote_status")
    var isQuoteStatus: Boolean = false
    @SerializedName("quoted_status")
    lateinit var tweet: Tweet
    @SerializedName("retweeted_status")
    lateinit var retweetedStatus: Tweet
    @SerializedName("quote_count")
    var quoteCount: Int = 0
    @SerializedName("reply_count")
    var replyCount: Int = 0
    @SerializedName("retweet_count")
    var retweetCount: Int = 0
    @SerializedName("favorite_count")
    var favouriteCount: Int = 0
    @SerializedName("entities")
    lateinit var entities: Entities
    @SerializedName("favorited")
    var favorited: Boolean = false
    @SerializedName("retweeted")
    var retweeted: Boolean = false
    @SerializedName("possibly_sensitive")
    var possiblySensitive: Boolean = false
    @SerializedName("filter_level")
    lateinit var filterLevel: String
    @SerializedName("lang")
    lateinit var language: String
}
