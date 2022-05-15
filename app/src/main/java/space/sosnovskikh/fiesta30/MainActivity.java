package space.sosnovskikh.fiesta30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    TextView textView3;
    ImageButton playbutton;
    ImageButton leftbutton;
    ImageButton rightbutton;

    ImageButton play;
    ImageButton stop;
    Spinner spinner;
   static int num;
    public static Integer ump = 0;

    static MediaPlayer mPlayer;

    public static Integer a = 2;
    int[] myArray = new int[5];
    static final String[] themes = {"фильмы","работа","хобби","домашние животные","путешествие","спорт"};

    static int getThemes() {
        return  num;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playbutton = findViewById(R.id.playbutton);
        Log.d("mim", "onCreate: "+num+" "+ump+" "+a+" "+myArray.length);
        playbutton.setOnClickListener(this);





        a = 2;










        textView3 = findViewById(R.id.textView3);
        textView3.setOnClickListener(this);
        leftbutton = findViewById(R.id.leftbutton);
        leftbutton.setOnClickListener(this);
        rightbutton = findViewById(R.id.rightbutton);
        rightbutton.setOnClickListener(this);

        String[] list = getResources().getStringArray(R.array.list);
        spinner = findViewById(R.id.themes);
        ArrayAdapter<String> themesAdapter = new ArrayAdapter<>(this,R.layout.spinner_row, list);
        spinner.setAdapter(themesAdapter);

        myArray[0] = 2;
        myArray[1] = 3;
        myArray[2] = 4;
        myArray[3] = 5;
        myArray[4] = 6;
        mPlayer= MediaPlayer.create(this, R.raw.music);
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlay();
                play();
            }
        });
        play = findViewById(R.id.play);
        stop = findViewById(R.id.stop);
        stop.setEnabled(false);
        play.setOnClickListener(this);
        stop.setOnClickListener(this);
        if (MainActivity.ump== 0) {
            play();
        }

        ArrayAdapter<String> a = new ArrayAdapter<>(this,R.layout.spinner_row, themes);
        a.setDropDownViewResource(R.layout.aerg);
        Spinner spthemes = (Spinner)findViewById(R.id.themes);
        spthemes.setAdapter(a);

        spthemes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) parent.getChildAt(0)).setTextColor(getColor(R.color.white));
                ((TextView) parent.getChildAt(0)).setTextSize(40);
                ((TextView) parent.getChildAt(0)).setGravity(Gravity.CENTER);
                Typeface type = Typeface.createFromAsset(getAssets(), "fonts/ri00.ttf");
                ((TextView) parent.getChildAt(0)).setTypeface(type);
                num = (int)id;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


        private void stopPlay(){
        mPlayer.stop();

        stop.setEnabled(false);
        try {
            mPlayer.prepare();
            mPlayer.seekTo(0);
            play.setEnabled(true);
        }
        catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void play(){

        mPlayer.start();
        play.setEnabled(false);
        stop.setEnabled(true);
    }
    public void pause(){

        mPlayer.pause();
        play.setEnabled(true);
        stop.setEnabled(true);
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
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.leftbutton:
                a -= 1;
                if (a==1){
                    a = 6;
                }
                textView3.setText(String.valueOf(a));
                break;
            case R.id.rightbutton:
                a += 1;
                if (a==7){
                    a=2;

                }
                textView3.setText(String.valueOf(a));
                break;
            case R.id.playbutton:

                Intent intent = new Intent(this, Phone.class);
                startActivity(intent);

                break;
            case R.id.play:
                play();

                ump = 0;
                break;


            case R.id.stop:
                Log.d("mim", "onClick: ");
                stop();
                stopPlay();



                ump = 1;
                break;


        }
    }

    @Override
    public void onBackPressed() {

    }
}