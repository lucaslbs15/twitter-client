package bicca.lucas.twitterclient.twitter.api.model

import com.google.gson.annotations.SerializedName

class Entities {

    @SerializedName("hashtags")
    lateinit var hashtags: Array<Hashtag>
    @SerializedName("urls")
    lateinit var urls: Array<URL>
    @SerializedName("user_mentions")
    lateinit var userMentions: Array<UserMention>
    @SerializedName("symbols")
    lateinit var symbols: Array<Symbol>
}