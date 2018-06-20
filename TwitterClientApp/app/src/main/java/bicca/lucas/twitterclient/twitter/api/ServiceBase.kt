package bicca.lucas.twitterclient.twitter.api

import android.content.Context
import retrofit2.Response

open class ServiceBase(
        val context: Context,
        val token: String,
        val twitterAPI: TwitterAPI) {

    protected fun getError(response: Response<Void>): String? {
        if (response.errorBody() == null) {
            return response.message()
        } else {
            try {
                return response.errorBody()?.string()
            } catch (ex: Exception) {
                return response.message()
            }
        }
    }
}