package bicca.lucas.twitterclient.twitter.api.model

import com.google.gson.annotations.SerializedName

class User : UserBase() {

    @SerializedName("location")
    lateinit var location: String
    @SerializedName("url")
    lateinit var url: String
    @SerializedName("description")
    lateinit var description: String
    @SerializedName("protected")
    var isProtected: Boolean = false
    @SerializedName("followers_count")
    var followersCount: Int = 0
    @SerializedName("friends_count")
    var friendsCount: Int = 0
    @SerializedName("created_at")
    lateinit var createdAt: String
    @SerializedName("favourites_count")
    var favouritesCount: Int = 0
    @SerializedName("utc_offset")
    lateinit var utcOffset: String
    @SerializedName("time_zone")
    lateinit var timeZone: String
    @SerializedName("geo_enabled")
    var geoEnabled: Boolean = false
    @SerializedName("verified")
    var verified: Boolean = false
    @SerializedName("statuses_count")
    var statusesCount: Int = 0
    @SerializedName("lang")
    lateinit var language: String
    @SerializedName("contributors_enabled")
    var contributorsEnabled: Boolean = false
    @SerializedName("is_translator")
    var isTranslator: Boolean = false
    @SerializedName("is_translation_enabled")
    var isTranslationEnabled: Boolean = false
    @SerializedName("profile_background_color")
    lateinit var profileBackgroundColor: String
    @SerializedName("profile_background_image_url")
    lateinit var profileBackgroundImageUrl: String
    @SerializedName("profile_background_image_url_https")
    lateinit var getProfileBackgroundImageUrlHttps: String
    @SerializedName("profile_background_tile")
    var profileBackgroundTile: Boolean = false
    @SerializedName("profile_image_url")
    lateinit var profileImageUrl: String
    @SerializedName("profile_image_url_https")
    lateinit var profileImageUrlHttps: String
    @SerializedName("profile_banner_url")
    lateinit var profileBannerUrl: String
    @SerializedName("profile_link_color")
    lateinit var profileLinkColor: String
    @SerializedName("profile_sidebar_border_color")
    lateinit var profileSidebarBorderColor: String
    @SerializedName("profile_sidebar_fill_color")
    lateinit var profileSidebarFillColor: String
    @SerializedName("profile_text_color")
    lateinit var profileTextColor: String
    @SerializedName("profile_use_background_image")
    var profileUseBackgroundImage: Boolean = false
    @SerializedName("has_extended_profile")
    var hasExtenderProfile: Boolean = false
    @SerializedName("default_profile")
    var defaultProfile: Boolean = false
    @SerializedName("default_profile_image")
    var defaultProfileImage: Boolean = false
    @SerializedName("following")
    var following: Boolean = false
    @SerializedName("follow_request_sent")
    var followRequestSent: Boolean = false
    @SerializedName("notifications")
    var notifications: Boolean = false
    @SerializedName("muting")
    var muting: Boolean = false
    @SerializedName("blocking")
    var blocking: Boolean = false
    @SerializedName("translator_type")
    lateinit var translatorType: String

}