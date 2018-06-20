package bicca.lucas.twitterclient.model

import com.google.gson.annotations.SerializedName

class UserMention {

    @SerializedName("indices")
    lateinit var indices: Array<Int>
}