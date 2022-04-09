package space.sosnovskikh.fiesta30;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MyService extends MainActivity {
    //Если музыка работает,то можно убрать.
    Switch switch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = findViewById(R.id.switch1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.music);
        mp.setLooping(true);


        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener () {
            public void onCheckedChanged (CompoundButton buttonView, boolean IsChecked) {
                if(IsChecked) {
                    mp.start();



                    // Переключатель включен
                } else {
                    // Переключатель отключен
                    mp.stop();
                }
            }
        });
    }
}
