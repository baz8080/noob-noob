package com.mbcdev.goddamn;

import android.media.MediaPlayer;
import android.os.Build;
import android.service.quicksettings.TileService;
import android.support.annotation.RequiresApi;

/**
 * Just stop judging me. It's your fault Egan and Brenda.
 *
 * Created by bcarroll on 13/11/2017.
 */
@RequiresApi(api = Build.VERSION_CODES.N)
public class GodDamnService extends TileService {

    @Override
    public void onClick() {
        final MediaPlayer mediaPlayer = MediaPlayer.create(GodDamnService.this, R.raw.goddamn);
        mediaPlayer.start();
    }
}
