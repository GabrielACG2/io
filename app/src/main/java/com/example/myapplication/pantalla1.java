package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class pantalla1 extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.inicio){
            Toast.makeText(this,"Te dirijes al inicio",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, pantalla1.class);
            startActivity(i);
        }
        else if(id==R.id.inicio2){
            Toast.makeText(this,"Te dirijes a entradas", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, MainActivity5.class);
            startActivity(i);
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);
        //referencia toolbar
        Toolbar tb= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tb);



        TabLayout tl = (TabLayout) findViewById(R.id.Tablayout);
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                switch (position) {
                    case 0:
                        //llamar al fragmento planet
                        cplanet p= new cplanet();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,p).commit();

                        break;
                    case 1:
                        //llamar al fragmento antay
                        cantay a= new cantay();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,a).commit();
                        break;


                }

            }



            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
        //Incorporar menu lateral
        NavigationView nav = (NavigationView) findViewById(R.id.nav);
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //  Recuperar opcion menu

                return false;
            }
        });
        DrawerLayout dl = (DrawerLayout) findViewById(R.id.pantalla1);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                dl,
                R.string.abrir_drawer,
                R.string.cerrar_drawer
        );
        dl.addDrawerListener(toggle);
        toggle.syncState();

        tb.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dl.isDrawerOpen(GravityCompat.START)){
                    dl.closeDrawer(GravityCompat.START);
                }
                else{
                    dl.openDrawer((int)Gravity.START);
                }

            }
        });
    }

    //@Override
    //public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       // return super.onOptionsItemSelected(item);
    //}

    public void grant(View v){
        Intent i = new Intent(this, grananta.class);
        startActivity(i);
    }
    public void hola(View v){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
    public void hola1(View v){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
    public void hola2(View v){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
    public void hola3(View v){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
    public void hola4(View v){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
    public void hola5(View v){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }



}