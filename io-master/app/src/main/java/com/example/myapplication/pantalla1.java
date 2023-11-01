package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.tabs.TabLayout;

public class pantalla1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);

        Toolbar tb= (Toolbar) findViewById(R.id.toolbar);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        HomeFragment home = new HomeFragment();
        transaction.replace(R.id.contenedor, home);

        transaction.commit();
        setSupportActionBar(tb);



        TabLayout tl = (TabLayout) findViewById(R.id.bottombarCine);
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                switch (position) {
                    case 0:
                        //llamar al fragmento planet
                        HomeFragment h = new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, h).commit();

                        break;
                    case 1:
                        //llamar al fragmento antay
                        CinesFragment c = new CinesFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, c).commit();
                        break;

                    case 2:
                        EntradasFragment e = new EntradasFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, e).commit();
                        break;
                }
            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                switch (position) {
                    case 0:
                        //llamar al fragmento planet
                        HomeFragment h = new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, h).commit();

                        break;
                    case 1:
                        //llamar al fragmento antay
                        CinesFragment c = new CinesFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, c).commit();
                        break;

                    case 2:
                        EntradasFragment e = new EntradasFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, e).commit();
                        break;
                }
            }


            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                switch (position) {
                    case 0:
                        //llamar al fragmento planet
                        HomeFragment h = new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, h).commit();

                        break;
                    case 1:
                        //llamar al fragmento antay
                        CinesFragment c = new CinesFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, c).commit();
                        break;

                    case 2:
                        EntradasFragment e = new EntradasFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, e).commit();
                        break;
                }
            }

        });
    }

}