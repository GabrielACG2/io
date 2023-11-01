package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void sali(View v){
        Intent i = new Intent(this, pantalla1.class);
        startActivity(i);
    }
    public void emergenci(View v){
        Intent i = new Intent(this, MainActivity6.class);
        startActivity(i);
    }
}