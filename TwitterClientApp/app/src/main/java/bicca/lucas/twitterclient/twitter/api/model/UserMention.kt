package bicca.lucas.twitterclient.twitter.api.model

import com.google.gson.annotations.SerializedName

class UserMention {

    @SerializedName("indices")
    lateinit var indices: Array<Int>
}