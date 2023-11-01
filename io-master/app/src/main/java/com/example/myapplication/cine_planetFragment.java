package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link cine_planetFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class cine_planetFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public cine_planetFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment cine_planetFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static cine_planetFragment newInstance(String param1, String param2) {
        cine_planetFragment fragment = new cine_planetFragment();
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
        View view = inflater.inflate(R.layout.fragment_cine_planet, container, false);

        ImageButton btnImageButtonGT1 = view.findViewById(R.id.imageButtonGT);
        ImageButton btnImageButtonM21 = view.findViewById(R.id.imageButtonM2);
        ImageButton btnImageButtonO1 = view.findViewById(R.id.imageButtonO);


        // Agregar OnClickListener a los otros ImageButtons
        btnImageButtonGT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirigirAButacasFragment();
            }
        });

        btnImageButtonM21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirigirAButacasFragment();
            }
        });

        btnImageButtonO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirigirAButacasFragment();
            }
        });

        return view;
    }

    private void redirigirAButacasFragment() {
        // Iniciar una transacción de fragmentos.
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        // Reemplazar el contenido actual del contenedor por el fragmento ButacasFragment.
        transaction.replace(R.id.contenedor, new butacasFragment());

        // Agregar la transacción a la pila hacia atrás.
        transaction.addToBackStack(null);

        // Confirmar la transacción.
        transaction.commit();
    }
}