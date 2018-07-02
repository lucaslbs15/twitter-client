package bicca.lucas.twitterclient.twitter.api.model

import com.google.gson.annotations.SerializedName

class URL {

    @SerializedName("display_url")
    lateinit var displayUrl: String
    @SerializedName("expanded_url")
    lateinit var expandedUrl: String
    @SerializedName("indices")
    lateinit var indices: Array<Int>
    @SerializedName("url")
    lateinit var url: String
}