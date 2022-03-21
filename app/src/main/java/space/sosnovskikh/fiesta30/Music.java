package space.sosnovskikh.fiesta30;

import android.media.MediaPlayer;
import android.os.AsyncTask;

public class Music extends AsyncTask<Void, Void, Void> {

    @Override
    protected Void doInBackground(Void... params) {
        MediaPlayer player = MediaPlayer.create(Music.this, R.raw.test_cbr);
        player.setLooping(true); // Set looping
        player.setVolume(100,100);
        player.start();

        return null;
    }

}


