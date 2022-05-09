package space.sosnovskikh.fiesta30;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Final extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    MediaPlayer mPlayer;
    ImageButton button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_1);
        findViewById(R.id.textView6);
        findViewById(R.id.button);
        button.setOnClickListener((View.OnClickListener) this);
        textView.setOnClickListener((View.OnClickListener) this);
        textView.setText(String.valueOf(Osnova.otvet)+"/5");
        mPlayer= MediaPlayer.create(this, R.raw.music);
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlay();
                play();
            }
        });
        if (MainActivity.ump== 0) {
            play();
        }
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
    public void pause(){

        mPlayer.pause();

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





public void onClick( View v) {
    switch (v.getId()) {
        case R.id.playbutton:

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

    }
}
}