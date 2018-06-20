package bicca.lucas.twitterclient.model

import com.google.gson.annotations.SerializedName

class Sizes {

    @SerializedName("thumb")
    lateinit var thumb: Size
    @SerializedName("large")
    lateinit var large: Size
    @SerializedName("medium")
    lateinit var medium: Size
    @SerializedName("small")
    lateinit var small: Size
}