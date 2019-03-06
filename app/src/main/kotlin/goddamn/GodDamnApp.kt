package goddamn

import android.app.Application
import android.content.Context
import android.media.MediaPlayer
import com.mbcdev.goddamn.R

class GodDamnApp: Application() {

    companion object {
        fun get(context: Context): GodDamnApp {
            return context.applicationContext as GodDamnApp
        }
    }

    private val godDamnPlayer by lazy {
        MediaPlayer.create(this, R.raw.goddamn)
    }

    fun godDamn() {
        if (godDamnPlayer.isPlaying) {
            godDamnPlayer.seekTo(0)
        }

        godDamnPlayer.start()
    }
}