package com.luisenrique.petagramandroid.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisenrique.petagramandroid.R;
import com.luisenrique.petagramandroid.adapter.MascotaAdapter;
import com.luisenrique.petagramandroid.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by luisenrique on 03/06/2017.
 */

public class RecyclerViewFragment extends Fragment{

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inizializarAdapter();
        return v;
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Douglas","4","Perro chistoso",R.drawable.perro));
        mascotas.add(new Mascota("Missifus","3","Gato chistoso",R.drawable.gato));
        mascotas.add(new Mascota("Chicken","5","Pollito bonito",R.drawable.pollito));
        mascotas.add(new Mascota("Bunny","5","Conejito bonito",R.drawable.conejo));
        mascotas.add(new Mascota("Nala","2","",R.drawable.perro2));
        mascotas.add(new Mascota("Tracy","3","",R.drawable.perro3));
        mascotas.add(new Mascota("Barbie","1","",R.drawable.perro4));
    }

    public void inizializarAdapter(){
        MascotaAdapter adapter = new MascotaAdapter(mascotas);
        listaMascotas.setAdapter(adapter);
    }
}
