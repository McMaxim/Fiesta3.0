package space.sosnovskikh.fiesta30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    TextView textView3;
    ImageButton playbutton;
    ImageButton leftbutton;
    ImageButton rightbutton;
    Switch switch1;
    Integer a = 0;
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
        ArrayAdapter<String> themesAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, themes);
        themesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spthemes = (Spinner) findViewById(R.id.themes);
        spthemes.setAdapter(themesAdapter);


        myArray[0] = 2;
        myArray[1] = 3;
        myArray[2] = 4;
        myArray[3] = 5;
        myArray[4] = 6;
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.leftbutton:
                a -= 1;
                textView3.setText(myArray[a%5]);
            case R.id.rightbutton:
                a += 1;
                textView3.setText(myArray[a%5]);
            case R.id.playbutton:
                Intent intent = new Intent(this,Banana1.class);
                startActivity(intent);



        }




    }
<<<<<<< HEAD

=======
>>>>>>> 03539c172ef2ea36d3cd3dc0d66d5c2150112ffa
}