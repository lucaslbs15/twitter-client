package bicca.lucas.twitterclient.twitter.api.model

import com.google.gson.annotations.SerializedName

class Media {

    @SerializedName("id")
    var id: Long = 0
    @SerializedName("display_url")
    lateinit var displayUrl: String
    @SerializedName("expanded_url")
    lateinit var expandedUrl: String
    @SerializedName("id_str")
    lateinit var idStr: String
    @SerializedName("indices")
    lateinit var indices: Array<Int>
    @SerializedName("media_url")
    lateinit var mediaUrl: String
    @SerializedName("media_url_https")
    lateinit var mediaUrlHttps: String
    @SerializedName("sizes")
    lateinit var sizes: Sizes
    @SerializedName("source_status_id")
    var sourceStatusId: Long = 0
    @SerializedName("source_status_id_str")
    lateinit var sourceStatusIdStr: String
    @SerializedName("type")
    lateinit var type: String
    @SerializedName("url")
    lateinit var url: String
}