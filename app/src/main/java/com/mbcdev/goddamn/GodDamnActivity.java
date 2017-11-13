package com.mbcdev.goddamn;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GodDamnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_god_damn);

        final MediaPlayer mediaPlayer = MediaPlayer.create(GodDamnActivity.this, R.raw.goddamn);

        findViewById(R.id.goddamn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.seekTo(0);
                }

                mediaPlayer.start();
            }
        });
    }
}
