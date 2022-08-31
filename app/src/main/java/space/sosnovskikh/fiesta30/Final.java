package space.sosnovskikh.fiesta30;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Final extends AppCompatActivity implements View.OnClickListener {
    TextView textView,text, text1;
    MyDB database;
    ImageButton buttonh;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_1);
        text = findViewById(R.id.textView6);
        text1 = findViewById(R.id.textView8);
        textView = findViewById(R.id.textView7);
        buttonh =findViewById(R.id.button2);
        buttonh.setOnClickListener( this);
        textView.setOnClickListener( this);

        textView.setText(String.valueOf(Osnova.otvet)+"/5");
        database = new MyDB(this);
        if (database.selectAll().size() == 0) {
            database.insert(0, 0 ,0);
        }

        Table table = database.select(1);
        int point = table.getPoint();
        float stat = table.getStat();
        int number = table.getNumber();
        Table table1 = new Table();
        table1.setId(1);
        table1.setNumber(database.select(1).getNumber()+1);
        Log.d("My", "onCreate: "+point);
        Log.d("My", "onCreate: "+number);
        float a = (float) (database.select(1).getStat()*database.select(1).getNumber()+Osnova.otvet)/(database.select(1).getNumber()+1);
        Log.d("My", String.valueOf(a));


        table1.setStat(a);

        table1.setPoint(Osnova.otvet);
        long s = database.update(table1);

        Table table2 = database.select(1);

        point = table2.getPoint();
        stat = table2.getStat();
        number = table2.getNumber();
        text.setText("В среднем за игру вы набираете " + Math.floor(10 * stat) / 10 + "/5");
        text1.setText("всего игр вы сыграли: " + String.valueOf(number));
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
    @Override
    public void onBackPressed() {

    }
}