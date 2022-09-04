package space.sosnovskikh.fiesta30;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;


public class Rules extends AppCompatActivity implements View.OnClickListener{
    Button button4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rule);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }


    @Override
    public void onBackPressed() {

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button4:
                Phone.tema.clear();
                Phone.end.clear();
                Osnova.element = new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                Osnova.element1 = new String[]{"0", "0", "0", "0", "0", "0"};
                Osnova.otvet=0;
                MainActivity.mPlayer.stop();

                MainActivity.mPlayer = null;
                Intent intent = new Intent(Rules.this, MainActivity.class);
                startActivity(intent);
                break;
    }}
}
