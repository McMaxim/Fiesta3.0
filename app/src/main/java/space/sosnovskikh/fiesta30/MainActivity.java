package space.sosnovskikh.fiesta30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Switch;
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

    MediaPlayer mPlayer;

    public static Integer a = 0;
    int[] myArray = new int[5];
    String[] themes = {"фильмы","работа","хобби","домашние животные","путешествие","спорт"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playbutton = findViewById(R.id.playbutton);
        playbutton.setOnClickListener(this);
        startService(new Intent(this, MyService.class)); //вот єто вам нужно написать!!!!!!

        textView3 = findViewById(R.id.textView3);
        textView3.setOnClickListener(this);
        leftbutton = findViewById(R.id.leftbutton);
        leftbutton.setOnClickListener(this);
        rightbutton = findViewById(R.id.rightbutton);
        rightbutton.setOnClickListener(this);
        //ArrayAdapter<String> themesAdapter = new ArrayAdapter<>(this,R.layout.simple_spinner_item, themes);
        //themesAdapter.setDropDownViewResource(R.layout.aerg);
        //Spinner spthemes = (Spinner)findViewById(R.id.themes);
        //spthemes.setAdapter(themesAdapter);
        String[] list = getResources().getStringArray(R.array.list);
        spinner = findViewById(R.id.themes);
        ArrayAdapter<String> themesAdapter = new ArrayAdapter<>(this,R.layout.spinner_row, list);
        spinner.setAdapter(themesAdapter);




        //spthemes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //@Override
            //public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //((TextView) parent.getChildAt(0)).setTextColor(getColor(R.color.white));
                //((TextView) parent.getChildAt(0)).setTextSize(20);
                //Typeface type = Typeface.createFromAsset(getAssets(),"fonts/ri00.ttf");
                //((TextView) parent.getChildAt(0)).setTypeface(type);
                //как сделать шрифт в спиннере




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
            }
        });
        play = findViewById(R.id.play);

        stop = findViewById(R.id.stop);
        stop.setEnabled(false);
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
    public void play(View view){

        mPlayer.start();
        play.setEnabled(false);
        stop.setEnabled(true);
    }
    public void pause(View view){

        mPlayer.pause();
        play.setEnabled(true);
        stop.setEnabled(true);
    }
    public void stop(View view){
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
                if (a==-1){
                    a = 4;
                }
                textView3.setText(String.valueOf(myArray[a%5]));
                break;
            case R.id.rightbutton:
                a += 1;
                textView3.setText(String.valueOf(myArray[a%5]));
                break;
            case R.id.playbutton:

                Intent intent = new Intent(this,Banana1.class);
                startActivity(intent);
                finish();
                break;



        }




    }

}