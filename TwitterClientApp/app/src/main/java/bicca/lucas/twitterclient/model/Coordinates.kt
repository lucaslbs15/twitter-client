package bicca.lucas.twitterclient.model

import com.google.gson.annotations.SerializedName

class Coordinates {

    @SerializedName("coordinates")
    var coordinates: Array<Float>?
    @SerializedName("type")
    var type: String?

    init {
        coordinates = null
        type = null
    }
}