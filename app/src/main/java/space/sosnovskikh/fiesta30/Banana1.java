package space.sosnovskikh.fiesta30;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Banana1 extends AppCompatActivity {
    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banan1);
        //MainActivity.a обращение к переменной другого класса
    //я могу обращаться к ней
        //ArrayList<S> people = new ArrayList<>();
        //people.add(String[] themes = {"фильмы","работа","хобби","домашние животные","путешествие","спорт"};);
        mPlayer= MediaPlayer.create(this, R.raw.music);
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlay();
                play();
            }
        });
        play();
    }

    private void stopPlay(){
        mPlayer.stop();

        try {
            mPlayer.prepare();
            mPlayer.seekTo(0);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void play(){

        mPlayer.start();
    }

    public void stop(){
        stopPlay();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPlayer.isPlaying()) {
            stopPlay();
            //как зациклить если можно?
        }
    }
}


