package space.sosnovskikh.fiesta30;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Osnova extends AppCompatActivity implements View.OnClickListener{
    Button btn1,btn2,btn3,btn4,btn5,btn21,btn11,btn31,btn41,btn51;
    MediaPlayer mPlayer;
    static Integer[] element = {0,0,0,0,0};
    static String[] element1 = {"0","0","0","0","0","0"};
    int otvet = 0;
    //какая кнопка к какой относится

    static int[] colors = { R.color.c0,R.color.c1, R.color.c2, R.color.c3,
            R.color.c4,R.color.c5};

    static int a = 1;
    static int i = 1;
    static int o = 0;
    ArrayList<String> copyOftema = new ArrayList<String>();
    ArrayList<String> start = new ArrayList<String>();
    ArrayList<String> copyOfend = new ArrayList<String>();


    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banan);

        copyOfend.addAll(Banana1.end);
        copyOftema.addAll(Banana1.tema);
        for(int i = 0; i < 5; i++) {
            int bibka = (int) (Math.random() * copyOftema.size());
            start.add(copyOftema.get(bibka));
            copyOftema.remove(copyOftema.get(bibka));
        }


        // сделать проверку правильно или нет и сохранить результат!!! сам после
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn11=findViewById(R.id.btn11);
        btn21=findViewById(R.id.btn21);
        btn31=findViewById(R.id.btn31);
        btn41=findViewById(R.id.btn41);
        btn51=findViewById(R.id.btn51);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn31.setOnClickListener(this);
        btn41.setOnClickListener(this);
        btn51.setOnClickListener(this);
        btn1.setText(start.get(0));
        btn2.setText(start.get(1));
        btn3.setText(start.get(2));
        btn4.setText(start.get(3));
        btn5.setText(start.get(4));
        btn11.setText(copyOfend.get(0));
        btn21.setText(copyOfend.get(1));
        btn31.setText(copyOfend.get(2));
        btn41.setText(copyOfend.get(3));
        btn51.setText(copyOfend.get(4));







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

        }
    }
    public void proverka() {
            if (element[0]!= 0&& element[1]!= 0&& element[2]!= 0&& element[3]!= 0&& element[4]!= 0){

                for(int i = 0; i < 5; i++){
                    int x = element[i];

                    element1[x]= start.get(i);
                }
                for(int i = 0; i < 5; i++){
                    if (copyOftema.get(i) == element1[i+1]){
                        otvet+=1;
                    }
                }
                Intent intent = new Intent(Osnova.this,Final.class);
                //пройдет?
                startActivity(intent);
                finish();


            }
        }






    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                btn1.setBackgroundColor(colors[1]);
                switch (v.getId()){
                    case R.id.btn11:
                        btn11.setBackgroundColor(colors[1]);
                        element[0]=1;
                        break;
                    case R.id.btn21:
                        btn21.setBackgroundColor(colors[1]);
                        element[0]=2;
                        break;
                    case R.id.btn31:
                        btn31.setBackgroundColor(colors[1]);
                        element[0]=3;
                        break;
                    case R.id.btn41:
                        btn41.setBackgroundColor(colors[1]);
                        element[0]=4;
                        break;
                    case R.id.btn51:
                        btn51.setBackgroundColor(colors[1]);
                        element[0]=5;
                        break;
                    case R.id.btn1:
                        btn1.setBackgroundColor(colors[o]);
                        switch (element[0]){
                            case 1:
                                btn11.setBackgroundColor(colors[0]);
                                break;
                            case  2:
                                btn21.setBackgroundColor(colors[0]);
                                break;
                            case 3:
                                btn31.setBackgroundColor(colors[0]);
                                break;
                            case 4:
                                btn41.setBackgroundColor(colors[0]);
                                break;
                            case 5:
                                btn51.setBackgroundColor(colors[0]);
                                break;

                        }


                    case R.id.btn2:
                        btn1.setBackgroundColor(colors[o]);
                        break;

                    case R.id.btn3:
                        btn1.setBackgroundColor(colors[o]);
                        break;


                    case R.id.btn4:
                        btn1.setBackgroundColor(colors[o]);
                        break;

                    case R.id.btn5:
                        btn1.setBackgroundColor(colors[o]);
                        break;}
                proverka();



            case R.id.btn2:
                btn2.setBackgroundColor(colors[2]);
                switch (v.getId()){
                    case R.id.btn11:
                        btn11.setBackgroundColor(colors[2]);
                        element[1]=1;
                        break;
                    case R.id.btn21:
                        btn21.setBackgroundColor(colors[2]);
                        element[1]=2;
                        break;
                    case R.id.btn31:
                        btn31.setBackgroundColor(colors[2]);
                        element[1]=3;
                        break;
                    case R.id.btn41:
                        btn41.setBackgroundColor(colors[2]);
                        element[1]=4;
                        break;
                    case R.id.btn51:
                        btn51.setBackgroundColor(colors[2]);
                        element[1]=5;
                        break;
                    case R.id.btn2:
                        btn1.setBackgroundColor(colors[o]);
                        switch (element[0]){
                            case 1:
                                btn11.setBackgroundColor(colors[0]);
                                break;
                            case  2:
                                btn21.setBackgroundColor(colors[0]);
                                break;
                            case 3:
                                btn31.setBackgroundColor(colors[0]);
                                break;
                            case 4:
                                btn41.setBackgroundColor(colors[0]);
                                break;
                            case 5:
                                btn51.setBackgroundColor(colors[0]);
                                break;

                        }
                proverka();


                    case R.id.btn1:
                        btn2.setBackgroundColor(colors[o]);
                        break;

                    case R.id.btn3:
                        btn2.setBackgroundColor(colors[o]);
                        break;


                    case R.id.btn4:
                        btn2.setBackgroundColor(colors[o]);
                        break;

                    case R.id.btn5:
                        btn2.setBackgroundColor(colors[o]);
                        break;}
            case R.id.btn3:
                btn3.setBackgroundColor(colors[3]);
                switch (v.getId()){
                    case R.id.btn11:
                        btn11.setBackgroundColor(colors[3]);
                        element[2]=1;
                        break;
                    case R.id.btn21:
                        btn21.setBackgroundColor(colors[3]);
                        element[2]=2;
                        break;
                    case R.id.btn31:
                        btn31.setBackgroundColor(colors[3]);
                        element[2]=3;
                        break;
                    case R.id.btn41:
                        btn41.setBackgroundColor(colors[3]);
                        element[2]=4;
                        break;
                    case R.id.btn51:
                        btn51.setBackgroundColor(colors[3]);
                        element[2]=5;
                        break;
                    case R.id.btn3:
                        btn1.setBackgroundColor(colors[o]);
                        switch (element[0]){
                            case 1:
                                btn11.setBackgroundColor(colors[0]);
                                break;
                            case  2:
                                btn21.setBackgroundColor(colors[0]);
                                break;
                            case 3:
                                btn31.setBackgroundColor(colors[0]);
                                break;
                            case 4:
                                btn41.setBackgroundColor(colors[0]);
                                break;
                            case 5:
                                btn51.setBackgroundColor(colors[0]);
                                break;

                        }



                    case R.id.btn1:
                        btn2.setBackgroundColor(colors[o]);
                        break;

                    case R.id.btn2:
                        btn2.setBackgroundColor(colors[o]);
                        break;


                    case R.id.btn4:
                        btn2.setBackgroundColor(colors[o]);
                        break;

                    case R.id.btn5:
                        btn2.setBackgroundColor(colors[o]);
                        break;}
                proverka();
            case R.id.btn4:
                btn4.setBackgroundColor(colors[4]);
                switch (v.getId()){
                    case R.id.btn11:
                        btn11.setBackgroundColor(colors[4]);
                        element[3]=1;
                        break;
                    case R.id.btn21:
                        btn21.setBackgroundColor(colors[4]);
                        element[3]=2;
                        break;
                    case R.id.btn31:
                        btn31.setBackgroundColor(colors[4]);
                        element[3]=3;
                        break;
                    case R.id.btn41:
                        btn41.setBackgroundColor(colors[4]);
                        element[3]=4;
                        break;
                    case R.id.btn51:
                        btn51.setBackgroundColor(colors[4]);
                        element[3]=5;
                        break;
                    case R.id.btn4:
                        btn1.setBackgroundColor(colors[o]);
                        switch (element[0]){
                            case 1:
                                btn11.setBackgroundColor(colors[0]);
                                break;
                            case  2:
                                btn21.setBackgroundColor(colors[0]);
                                break;
                            case 3:
                                btn31.setBackgroundColor(colors[0]);
                                break;
                            case 4:
                                btn41.setBackgroundColor(colors[0]);
                                break;
                            case 5:
                                btn51.setBackgroundColor(colors[0]);
                                break;

                        }


                    case R.id.btn1:
                        btn2.setBackgroundColor(colors[o]);
                        break;

                    case R.id.btn3:
                        btn2.setBackgroundColor(colors[o]);
                        break;


                    case R.id.btn2:
                        btn2.setBackgroundColor(colors[o]);
                        break;

                    case R.id.btn5:
                        btn2.setBackgroundColor(colors[o]);
                        break;}
                proverka();
            case R.id.btn5:
                btn5.setBackgroundColor(colors[6]);
                switch (v.getId()){
                    case R.id.btn11:
                        btn11.setBackgroundColor(colors[5]);
                        element[4]=1;
                        break;
                    case R.id.btn21:
                        btn21.setBackgroundColor(colors[5]);
                        element[4]=2;
                        break;
                    case R.id.btn31:
                        btn31.setBackgroundColor(colors[5]);
                        element[4]=3;
                        break;
                    case R.id.btn41:
                        btn41.setBackgroundColor(colors[5]);
                        element[4]=4;
                        break;
                    case R.id.btn51:
                        btn51.setBackgroundColor(colors[5]);
                        element[4]=5;
                        break;
                    case R.id.btn5:
                        btn1.setBackgroundColor(colors[o]);
                        switch (element[0]){
                            case 1:
                                btn11.setBackgroundColor(colors[0]);
                                break;
                            case  2:
                                btn21.setBackgroundColor(colors[0]);
                                break;
                            case 3:
                                btn31.setBackgroundColor(colors[0]);
                                break;
                            case 4:
                                btn41.setBackgroundColor(colors[0]);
                                break;
                            case 5:
                                btn51.setBackgroundColor(colors[0]);
                                break;

                        }


                    case R.id.btn1:
                        btn2.setBackgroundColor(colors[o]);
                        break;

                    case R.id.btn3:
                        btn2.setBackgroundColor(colors[o]);
                        break;


                    case R.id.btn4:
                        btn2.setBackgroundColor(colors[o]);
                        break;

                    case R.id.btn2:
                        btn2.setBackgroundColor(colors[o]);
                        break;}
                }
                proverka();




        }


}
