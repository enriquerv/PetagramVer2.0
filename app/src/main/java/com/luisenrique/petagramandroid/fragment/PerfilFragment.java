package com.luisenrique.petagramandroid.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.luisenrique.petagramandroid.R;
import com.luisenrique.petagramandroid.adapter.ImageAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        GridView gridView = (GridView) v.findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(v.getContext()));


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(container.getContext(),"Hola"+position,Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }


}
