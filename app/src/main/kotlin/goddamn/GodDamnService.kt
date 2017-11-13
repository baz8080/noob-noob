package com.mbcdev.goddamn

import android.media.MediaPlayer
import android.os.Build
import android.service.quicksettings.TileService
import android.support.annotation.RequiresApi

/**
 * Just stop judging me. It's your fault Egan and Brenda.
 *
 * It wasn't my fault before, but some of it is now.
 *
 * Created by bcarroll on 13/11/2017.
 */
@RequiresApi(api = Build.VERSION_CODES.N)
class GodDamnService : TileService() {

    val mediaPlayer by lazy {
        MediaPlayer.create(this@GodDamnService, R.raw.goddamn)
    }

    override fun onClick() {
        if (mediaPlayer.isPlaying) {
            mediaPlayer.seekTo(0)
        }

        mediaPlayer.start()
    }
}
