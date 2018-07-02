package bicca.lucas.twitterclient.twitter.api.model

import com.google.gson.annotations.SerializedName

class Size {

    @SerializedName("w")
    var w: Int = 0
    @SerializedName("h")
    var h: Int = 0
    @SerializedName("resize")
    lateinit var resize: String
}