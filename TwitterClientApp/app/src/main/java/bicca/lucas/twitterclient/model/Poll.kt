package bicca.lucas.twitterclient.model

import com.google.gson.annotations.SerializedName

class Poll {

    @SerializedName("options")
    lateinit var options: Array<Option>
    @SerializedName("end_datetime")
    lateinit var endDatetime: String
    @SerializedName("duration_minutes")
    lateinit var durationMinutes: String
}