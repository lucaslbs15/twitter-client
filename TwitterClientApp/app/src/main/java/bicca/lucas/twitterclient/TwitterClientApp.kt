package bicca.lucas.twitterclient

import android.app.Application
import android.util.Log
import com.facebook.soloader.SoLoader
import com.facebook.sonar.android.AndroidSonarClient
import com.facebook.sonar.android.utils.SonarUtils
import com.facebook.sonar.core.SonarClient

class TwitterClientApp : Application {

    constructor() : super()

    override fun onCreate() {
        super.onCreate()
        Log.i(TwitterClientApp::class.java.simpleName, "${TwitterClientApp::class.java.simpleName} onCreate()")
        SoLoader.init(this, false)

        if (BuildConfig.DEBUG && SonarUtils.shouldEnableSonar(this)) {
            val client: SonarClient = AndroidSonarClient.getInstance(this)
            client.start()
        }
    }
}