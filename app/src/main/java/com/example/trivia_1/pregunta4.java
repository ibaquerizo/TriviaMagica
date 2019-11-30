package com.example.trivia_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class pregunta4 extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta4);
    }

    public void incorrecto_r(View view) {
        Intent intent=new Intent(this,perdio.class);
        startActivity(intent);
    }

    public void correcto_r(View view) {
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
            Intent intent = new Intent(this, preunta5.class);
            startActivity(intent);
        }}
    }
}
