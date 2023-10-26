package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import org.jetbrains.annotations.Nullable;


public class MainActivity extends AppCompatActivity {
    static final int REQUEST_IMAGE_CAPTURE = 1;
    static final int GALLERY_INTENT = 2;
    private StorageReference mStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStorage = FirebaseStorage.getInstance().getReference();

    }

    public void login(View v) {
        EditText corre = this.findViewById(R.id.correo);
        String correo = corre.getText().toString();
        EditText contra = this.findViewById(R.id.contrasenia);
        String contrasenia = contra.getText().toString();

        if (correo.equals("gabrielalejandrogonzalez2003@gmail.com") && contrasenia.equals("123456")) {
            Intent i = new Intent(this, pantalla1.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "error en las credenciales", Toast.LENGTH_SHORT).show();
        }
    }

    public void crearCuenta(View v) {
        Intent i = new Intent(this, RegistraCuenta.class);
        startActivity(i);
    }
}