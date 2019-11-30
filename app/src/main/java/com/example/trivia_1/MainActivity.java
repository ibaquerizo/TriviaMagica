package com.example.trivia_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Button btn_empezar;
    static int c = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_empezar= (Button) findViewById(R.id.empezar);

    }

    public void empezar(View view) {
        Random rand = new Random();
        int n = rand.nextInt(4) + 1;
        if (n == 1) {
            Intent intent = new Intent(this, pregunta1.class);
            startActivity(intent);
        } else if (n == 2) {
            Intent intent = new Intent(this, pregunta2.class);
            startActivity(intent);
        } else if (n == 3) {
            Intent intent = new Intent(this, pregunta3.class);
            startActivity(intent);
        } else if (n == 4) {
            Intent intent = new Intent(this, pregunta4.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, preunta5.class);
            startActivity(intent);
        }
    }

}
