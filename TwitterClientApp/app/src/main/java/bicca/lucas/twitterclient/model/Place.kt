package bicca.lucas.twitterclient.model

import com.google.gson.annotations.SerializedName

class Place {

    @SerializedName("id")
    lateinit var id: String
    @SerializedName("url")
    lateinit var url: String
    @SerializedName("place_type")
    lateinit var placeType: String
    @SerializedName("name")
    lateinit var name: String
    @SerializedName("full_name")
    lateinit var fullName: String
    @SerializedName("country_code")
    lateinit var countryCode: String
    @SerializedName("country")
    lateinit var country: String
}