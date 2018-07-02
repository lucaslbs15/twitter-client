package bicca.lucas.twitterclient.twitter.api.model

import com.google.gson.annotations.SerializedName

open class UserBase {

    @SerializedName("id")
    val id: Long = 0
    @SerializedName("id_str")
    lateinit var idStr: String
    @SerializedName("name")
    lateinit var name: String
    @SerializedName("screen_name")
    lateinit var screenName: String
}