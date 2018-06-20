package bicca.lucas.twitterclient.model

import com.google.gson.annotations.SerializedName

class Option {

    @SerializedName("position")
    var position: Int = 0
    @SerializedName("text")
    lateinit var text: String
}