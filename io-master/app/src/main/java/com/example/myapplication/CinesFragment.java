package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CinesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CinesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CinesFragment() {

    }

    public static CinesFragment newInstance(String param1, String param2) {
        CinesFragment fragment = new CinesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cines, container, false);

        Button btnCineAntay = view.findViewById(R.id.btn_antay);
        Button btnCinePlanet = view.findViewById(R.id.btn_planet);

        btnCineAntay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirigirAFragmento(new cineAntayFragment());
            }
        });

        btnCinePlanet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {redirigirAFragmento(new cine_planetFragment());}
        });

        return view;
    }

    private void redirigirAFragmento(Fragment fragmento) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.contenedor, fragmento);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}