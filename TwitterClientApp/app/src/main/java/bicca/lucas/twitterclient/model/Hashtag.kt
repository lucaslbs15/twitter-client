package bicca.lucas.twitterclient.model

import com.google.gson.annotations.SerializedName

class Hashtag {

    @SerializedName("indices")
    var indices: Array<Int>?
    @SerializedName("text")
    var text: String?

    init {
        indices = null
        text = null
    }
}