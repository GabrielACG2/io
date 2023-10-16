package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View v){
        EditText corre = this.findViewById(R.id.correo);
        String correo = corre.getText().toString();
        EditText contra = this.findViewById(R.id.contrasenia);
        String contrasenia = contra.getText().toString();

        if(correo.equals("c")&&contrasenia.equals("1")){
            Intent i = new Intent(this,pantalla1.class);
            startActivity(i);
        }else{
            Toast.makeText(this,"error en las credenciales",Toast.LENGTH_SHORT).show();
        }
    }
    public void crearCuenta(View v){
        Intent i = new Intent(this,RegistraCuenta.class);
        startActivity(i);
    }
}