package bicca.lucas.twitterclient.model

import com.google.gson.annotations.SerializedName

class Coordinates {

    @SerializedName("coordinates")
    lateinit var coordinates: Array<Float>
    @SerializedName("type")
    lateinit var type: String
}