package com.mbcdev.goddamn

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_god_damn.*

class GodDamnActivity : AppCompatActivity() {

    val mediaPlayer by lazy {
        MediaPlayer.create(this@GodDamnActivity, R.raw.goddamn)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_god_damn)

        goddamn.setOnClickListener {
            godDamn()
        }
    }

    override fun onResume() {
        super.onResume()

        godDamn()
    }

    private fun godDamn() {
        if (mediaPlayer.isPlaying) {
            mediaPlayer.seekTo(0)
        }

        mediaPlayer.start()
    }
}
