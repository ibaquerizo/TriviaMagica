package com.example.trivia_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class preunta5 extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preunta5);
    }

    public void correcto_t(View view) {
        c=c+1;
        if (c==5){
            Intent intent = new Intent(this,menu_gano.class);
            startActivity(intent);
        }
        else {
        Random rand= new Random();
        int n= rand.nextInt(3)+1;
        if (n==1){
            Intent intent = new Intent(this,pregunta1.class);
            startActivity(intent);
        }
        else if (n==2){
            Intent intent = new Intent(this,pregunta2.class);
            startActivity(intent);
        }
        else if (n==3){
            Intent intent = new Intent(this,pregunta3.class);
            startActivity(intent);
        }
        else if (n == 4) {
            Intent intent = new Intent(this, pregunta4.class);
            startActivity(intent);
        }
    }}

    public void incorrecto_t(View view) {
        Intent intent=new Intent(this,perdio.class);
        startActivity(intent);
    }
}
