package bicca.lucas.twitterclient.twitter.api.model

import com.google.gson.annotations.SerializedName

class Hashtag {

    @SerializedName("indices")
    lateinit var indices: Array<Int>
    @SerializedName("text")
    lateinit var text: String
}