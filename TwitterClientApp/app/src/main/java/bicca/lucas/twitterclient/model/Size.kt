package bicca.lucas.twitterclient.model

import com.google.gson.annotations.SerializedName

class Size {

    @SerializedName("w")
    var w: Int?
    @SerializedName("h")
    var h: Int?
    @SerializedName("resize")
    var resize: String?

    init {
        w = null
        h = null
        resize = null
    }
}