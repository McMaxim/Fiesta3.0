package space.sosnovskikh.fiesta30;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Osnova extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4, btn5, btn21, btn11, btn31, btn41, btn51;

    static Integer[] element = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static String[] element1 = {"0", "0", "0", "0", "0", "0"};
    static int otvet = 0;
    //какая кнопка к какой относится
    int m = 0;
    int n = 0;

    static final int[] colors = {R.color.c0, R.color.c1, R.color.c2, R.color.c3,
            R.color.c4, R.color.c5};

    static int a = 1;
    static int i = 1;
    static int o = 0;
    ArrayList<String> copyOftema = new ArrayList<String>();
    ArrayList<String> copyOftema1 = new ArrayList<String>();


    ArrayList<String> start = new ArrayList<String>();
    ArrayList<String> copyOfend = new ArrayList<String>();


    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banan);
        Log.d("mim", "onCreate: "+element.length+" "+element1.length+" "+otvet+" "+n+" "+m+" "+a+" "+i+" "+o+" "+copyOftema1.size()+" "+copyOfend.size()+" "+copyOftema.size()+" "+start.size());
         /*element = new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
         element1 = new String[]{"0", "0", "0", "0", "0", "0"};
         otvet = 0;
        //какая кнопка к какой относится
         m = 0;
         n = 0;



         a = 1;
         i = 1;
         o = 0;
        ArrayList<String> copyOftema = new ArrayList<String>();
        ArrayList<String> copyOftema1 = new ArrayList<String>();


        ArrayList<String> start = new ArrayList<String>();
        ArrayList<String> copyOfend = new ArrayList<String>();

          */
        for (int j = 0; j < 5; j++) {
            copyOftema1.add(Phone.tema.get(j));
            Log.d("mmmm", "onCreate: "+copyOftema1.size());

        }
        copyOfend.addAll(Phone.end);
        copyOftema.addAll(Phone.tema);


        for (int i = 0; i < 5; i++) {
            int bibka = (int) (Math.random() * copyOftema.size());
            start.add(copyOftema.get(bibka));
            copyOftema.remove(copyOftema.get(bibka));
        }


        // сделать проверку правильно или нет и сохранить результат!!! сам после
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn11 = findViewById(R.id.btn11);
        btn21 = findViewById(R.id.btn21);
        btn31 = findViewById(R.id.btn31);
        btn41 = findViewById(R.id.btn41);
        btn51 = findViewById(R.id.btn51);
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



        if (MainActivity.ump == 0) {
            play();
        }
    }




    public void play() {

        MainActivity.mPlayer.start();
    }



    public void proverka() {
        if (element[6] != 0 && element[7] != 0 && element[8] != 0 && element[9] != 0 && element[10] != 0) {
            Log.d("by", "proverka: ");

            for (int i = 6; i < 11; i++) {
                Log.d("by", "proverka идет");
                Log.d("by", "proverka: "+start.size());
                Log.d("by", "proverka: "+copyOftema1.size());
                Log.d("by", "proverka: "+start.get(element[i] - 1));
                Log.d("by", "proverka: "+copyOftema1.get(i - 6));
                if (start.get(element[i] - 1).equals(copyOftema1.get(i - 6))) {
                    Log.d("by", "идет");
                    otvet += 1;
                }

            }


            Intent intent = new Intent(this, Final.class);
            startActivity(intent);



        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                if (m == 0) {
                    btn1.setBackgroundColor(getResources().getColor(colors[1]));
                    m = 1;
                    Log.d("my", "m =1");

                } else {
                    n = m;
                    m = 1;
                    Log.d("my", "m =1");
                }
                zhest1();

                break;
            case R.id.btn2:
                btn2.setBackgroundColor(getResources().getColor(colors[2]));
                if (m == 0) {
                    m = 2;
                    Log.d("my", "m =2");
                } else {
                    n = m;
                    m = 2;
                    Log.d("my", "m =2");
                }
                zhest1();
                break;
            case R.id.btn3:
                btn3.setBackgroundColor(getResources().getColor(colors[3]));
                if (m == 0) {
                    m = 3;
                    Log.d("my", "m =3");
                } else {
                    n = m;
                    m = 3;
                    Log.d("my", "m =3");
                }
                zhest1();
                break;
            case R.id.btn4:
                btn4.setBackgroundColor(getResources().getColor(colors[4]));
                if (m == 0) {
                    m = 4;
                    Log.d("my", "m =4");
                } else {
                    n = m;
                    m = 4;
                    Log.d("my", "m =4");
                }
                zhest1();
                break;
            case R.id.btn5:
                btn5.setBackgroundColor(getResources().getColor(colors[5]));
                if (m == 0) {
                    m = 5;
                    Log.d("my", "m =5");
                } else {
                    n = m;
                    m = 5;
                    Log.d("my", "m =5");
                }
                zhest1();
                break;
            case R.id.btn11:
                if (m == 0) {
                    m = 6;
                    Log.d("my", "m =11");
                } else {
                    n = m;
                    m = 6;
                    Log.d("my", "m =11");
                }
                zhest();

                break;
            case R.id.btn21:
                if (m == 0) {
                    m = 7;
                    Log.d("my", "m =21");
                } else {
                    n = m;
                    m = 7;
                    Log.d("my", "m =21");
                }
                zhest();

                break;
            case R.id.btn31:
                if (m == 0) {
                    m = 8;
                    Log.d("my", "m =31");
                } else {
                    n = m;
                    m = 8;
                    Log.d("my", "m =31");
                }
                zhest();

                break;
            case R.id.btn41:
                if (m == 0) {
                    m = 9;
                    Log.d("my", "m =41");
                } else {
                    n = m;
                    m = 9;
                    Log.d("my", "m =41");
                }
                zhest();

                break;

            case R.id.btn51:
                if (m == 0) {
                    m = 10;
                    Log.d("my", "m =51");
                } else {
                    n = m;
                    m = 10;
                    Log.d("my", "m =51");
                }
                zhest();
                break;
        }

    }

    public void zhest() {
        if (n != 0 && m != 0) {
            Log.d("my", "zhest: ");
            if (n == 1) {
                int a = 0;
                for (int j = 6; j < 11; j++) {
                    if (element[j] == n){
                        a+=1;
                    }
                }
                if(a==0){



                Log.d("my", "zhest: 1");

                if (m == 6) {
                    btn11.setBackgroundColor(getResources().getColor(colors[1]));
                }
                if (m == 7) {
                    btn21.setBackgroundColor(getResources().getColor(colors[1]));
                }
                if (m == 8) {
                    btn31.setBackgroundColor(getResources().getColor(colors[1]));
                }
                if (m == 9) {
                    btn41.setBackgroundColor(getResources().getColor(colors[1]));
                }
                if (m == 10) {
                    btn51.setBackgroundColor(getResources().getColor(colors[1]));
                }
                if (m == 5) {
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 4) {
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 3) {
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 2) {
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 1) {

                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                }
                    ball();

            }}
            if (n == 2) {int a = 0;
                for (int j = 6; j < 11; j++) {
                    if (element[j] == n){
                        a+=1;
                    }
                }
                if(a==0){



                Log.d("my", "zhest: 2");

                if (m == 6) {
                    btn11.setBackgroundColor(getResources().getColor(colors[2]));
                }
                if (m == 7) {
                    btn21.setBackgroundColor(getResources().getColor(colors[2]));
                }
                if (m == 8) {
                    btn31.setBackgroundColor(getResources().getColor(colors[2]));
                }
                if (m == 9) {
                    btn41.setBackgroundColor(getResources().getColor(colors[2]));
                }
                if (m == 10) {
                    btn51.setBackgroundColor(getResources().getColor(colors[2]));
                }
                if (m == 5) {
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 4) {
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 3) {
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 2) {

                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 1) {
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                }
                    ball();
            }}
            if (n == 3) {
                int a = 0;
                for (int j = 6; j < 11; j++) {
                    if (element[j] == n){
                        a+=1;
                    }
                }
                if(a==0){
                Log.d("my", "zhest:3 ");

                if (m == 6) {
                    btn11.setBackgroundColor(getResources().getColor(colors[3]));
                }
                if (m == 7) {
                    btn21.setBackgroundColor(getResources().getColor(colors[3]));
                }
                if (m == 8) {
                    btn31.setBackgroundColor(getResources().getColor(colors[3]));
                }
                if (m == 9) {
                    btn41.setBackgroundColor(getResources().getColor(colors[3]));
                }
                if (m == 10) {
                    btn51.setBackgroundColor(getResources().getColor(colors[3]));
                }

                if (m == 5) {
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 4) {
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 3) {

                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 2) {
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 1) {
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                }
                    ball();
            }}
            if (n == 4) {
                int a = 0;
                for (int j = 6; j < 11; j++) {
                    if (element[j] == n){
                        a+=1;
                    }
                }
                if(a==0){
                Log.d("my", "zhest: 4");

                if (m == 6) {
                    btn11.setBackgroundColor(getResources().getColor(colors[4]));
                }
                if (m == 27) {
                    btn21.setBackgroundColor(getResources().getColor(colors[4]));
                }
                if (m == 8) {
                    btn31.setBackgroundColor(getResources().getColor(colors[4]));
                }
                if (m == 9) {
                    btn41.setBackgroundColor(getResources().getColor(colors[4]));
                }
                if (m == 10) {
                    btn51.setBackgroundColor(getResources().getColor(colors[4]));
                }
                if (m == 5) {
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 4) {

                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 3) {
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 2) {
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 1) {
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                }
                    ball();
            }}
            if (n == 5) {
                int a = 0;
                for (int j = 6; j < 11; j++) {
                    if (element[j] == n){
                        a+=1;
                    }
                }
                if(a==0){
                Log.d("my", "zhest: 5");

                if (m == 6) {
                    btn11.setBackgroundColor(getResources().getColor(colors[5]));
                }
                if (m == 7) {
                    btn21.setBackgroundColor(getResources().getColor(colors[5]));
                }
                if (m == 8) {
                    btn31.setBackgroundColor(getResources().getColor(colors[5]));
                }
                if (m == 9) {
                    btn41.setBackgroundColor(getResources().getColor(colors[5]));
                }
                if (m == 10) {
                    btn51.setBackgroundColor(getResources().getColor(colors[5]));
                }
                if (m == 5) {
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 4) {
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 3) {
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 2) {
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 1) {
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                }
                    ball();
            }}

            n = 0;
            m = 0;
            proverka();

        }
    }

    public void zhest1() {
        if (n != 0 && m != 0) {
            Log.d("by", "zhest: ");
            if (n == 1) {
                Log.d("my", "zhest: 1");

                if (m == 6) {
                    btn11.setBackgroundColor(getResources().getColor(colors[1]));
                }
                if (m == 7) {
                    btn21.setBackgroundColor(getResources().getColor(colors[1]));
                }
                if (m == 8) {
                    btn31.setBackgroundColor(getResources().getColor(colors[1]));
                }
                if (m == 9) {
                    btn41.setBackgroundColor(getResources().getColor(colors[1]));
                }
                if (m == 10) {
                    btn51.setBackgroundColor(getResources().getColor(colors[1]));
                }
                if (m == 5) {
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 4) {
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 3) {
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 2) {
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 1) {

                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                }

            }
            if (n == 2) {
                Log.d("my", "zhest: 2");

                if (m == 6) {
                    btn11.setBackgroundColor(getResources().getColor(colors[2]));
                }
                if (m == 7) {
                    btn21.setBackgroundColor(getResources().getColor(colors[2]));
                }
                if (m == 8) {
                    btn31.setBackgroundColor(getResources().getColor(colors[2]));
                }
                if (m == 9) {
                    btn41.setBackgroundColor(getResources().getColor(colors[2]));
                }
                if (m == 10) {
                    btn51.setBackgroundColor(getResources().getColor(colors[2]));
                }
                if (m == 5) {
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 4) {
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 3) {
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 2) {

                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 1) {
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                }

            }
            if (n == 3) {
                Log.d("my", "zhest:3 ");

                if (m == 6) {
                    btn11.setBackgroundColor(getResources().getColor(colors[3]));
                }
                if (m == 7) {
                    btn21.setBackgroundColor(getResources().getColor(colors[3]));
                }
                if (m == 8) {
                    btn31.setBackgroundColor(getResources().getColor(colors[3]));
                }
                if (m == 9) {
                    btn41.setBackgroundColor(getResources().getColor(colors[3]));
                }
                if (m == 10) {
                    btn51.setBackgroundColor(getResources().getColor(colors[3]));
                }

                if (m == 5) {
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 4) {
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 3) {

                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 2) {
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 1) {
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                }
            }
            if (n == 4) {
                Log.d("my", "zhest: 4");

                if (m == 6) {
                    btn11.setBackgroundColor(getResources().getColor(colors[4]));
                }
                if (m == 27) {
                    btn21.setBackgroundColor(getResources().getColor(colors[4]));
                }
                if (m == 8) {
                    btn31.setBackgroundColor(getResources().getColor(colors[4]));
                }
                if (m == 9) {
                    btn41.setBackgroundColor(getResources().getColor(colors[4]));
                }
                if (m == 10) {
                    btn51.setBackgroundColor(getResources().getColor(colors[4]));
                }
                if (m == 5) {
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 4) {

                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 3) {
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 2) {
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 1) {
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                }
            }
            if (n == 5) {
                Log.d("my", "zhest: 5");

                if (m == 6) {
                    btn11.setBackgroundColor(getResources().getColor(colors[5]));
                }
                if (m == 7) {
                    btn21.setBackgroundColor(getResources().getColor(colors[5]));
                }
                if (m == 8) {
                    btn31.setBackgroundColor(getResources().getColor(colors[5]));
                }
                if (m == 9) {
                    btn41.setBackgroundColor(getResources().getColor(colors[5]));
                }
                if (m == 10) {
                    btn51.setBackgroundColor(getResources().getColor(colors[5]));
                }
                if (m == 5) {
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 4) {
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                    btn4.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 3) {
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                    btn3.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 2) {
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                    btn2.setBackgroundColor(getResources().getColor(colors[0]));
                }
                if (m == 1) {
                    btn5.setBackgroundColor(getResources().getColor(colors[0]));
                    btn1.setBackgroundColor(getResources().getColor(colors[0]));
                }}
                Log.d("by", "ура");
                    if(m!= 6 &&m!= 7 && m!= 8 && m!= 9 && m!= 10  ){
                        for (int j = 6; j < 11; j++) {
                            if (element[j] == n){
                                element[j]= 0;
                                if (j == 6) {
                                    btn11.setBackgroundColor(getResources().getColor(colors[0]));
                                }
                                if (j == 7) {
                                    btn21.setBackgroundColor(getResources().getColor(colors[0]));
                                }
                                if (j == 8) {
                                    btn31.setBackgroundColor(getResources().getColor(colors[0]));
                                }
                                if (j == 9) {
                                    btn41.setBackgroundColor(getResources().getColor(colors[0]));
                                }
                                if (j == 10) {
                                    btn51.setBackgroundColor(getResources().getColor(colors[0]));
                                }
                            }
                            if (element[j] == m){
                                element[j]= 0;
                                if (j == 6) {
                                    btn11.setBackgroundColor(getResources().getColor(colors[0]));
                                }
                                if (j == 7) {
                                    btn21.setBackgroundColor(getResources().getColor(colors[0]));
                                }
                                if (j == 8) {
                                    btn31.setBackgroundColor(getResources().getColor(colors[0]));
                                }
                                if (j == 9) {
                                    btn41.setBackgroundColor(getResources().getColor(colors[0]));
                                }
                                if (j == 10) {
                                    btn51.setBackgroundColor(getResources().getColor(colors[0]));
                                }
                            }


                        }

                }

            Log.d("by", "zhest1:jhjhghgghghhghghg ");


            n = 0;
            m = 0;

        }
    }

    public void ball() {
        Log.d("by", "" + m + "  " + n);
        if (element[m] != 0) {
            Log.d("by", "" + m + "  " + n);

            if (element[m] == 1) {
                btn1.setBackgroundColor(getResources().getColor(colors[0]));
            }
            if (element[m] == 2) {
                btn2.setBackgroundColor(getResources().getColor(colors[0]));
            }
            if (element[m] == 3) {
                btn3.setBackgroundColor(getResources().getColor(colors[0]));
            }
            if (element[m] == 4) {
                btn4.setBackgroundColor(getResources().getColor(colors[0]));
            }
            if (element[m] == 5) {
                btn5.setBackgroundColor(getResources().getColor(colors[0]));
            }
        }
        element[m] = n;


    }
    @Override
    public void onBackPressed() {

    }

}






