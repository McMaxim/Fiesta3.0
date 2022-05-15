package space.sosnovskikh.fiesta30;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Final extends AppCompatActivity implements View.OnClickListener {
    TextView textView;

    ImageButton buttonh;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_1);

        textView = findViewById(R.id.textView7);
        buttonh =findViewById(R.id.button2);
        buttonh.setOnClickListener( this);
        textView.setOnClickListener( this);

        textView.setText(String.valueOf(Osnova.otvet)+"/5");

        if (MainActivity.ump== 0) {
            play();
        }
    }


    public void play(){

        MainActivity.mPlayer.start();

    }






public void onClick( View v) {
    switch (v.getId()) {
        case R.id.button2:
            Phone.tema.clear();
            Phone.end.clear();
            Osnova.element = new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            Osnova.element1 = new String[]{"0", "0", "0", "0", "0", "0"};
            Osnova.otvet=0;
            MainActivity.mPlayer.stop();

            MainActivity.mPlayer = null;


            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

    }
}
}