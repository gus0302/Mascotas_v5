package com.gustaav.mascotas.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gustaav.mascotas.R;
import com.gustaav.mascotas.adapter.FotoMascotaAdaptador;
import com.gustaav.mascotas.adapter.MascotaAdaptador;
import com.gustaav.mascotas.pojo.FotoMascota;
import com.gustaav.mascotas.pojo.Mascota;

import java.util.ArrayList;


public class MiMascota extends Fragment {

    ArrayList<FotoMascota> fotosMascota;
    private RecyclerView listaFotosMascota;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_mi_mascota, container, false);


        listaFotosMascota = (RecyclerView) v.findViewById(R.id.rvFotosMascota);

        GridLayoutManager glm = new GridLayoutManager(getActivity(), 3, LinearLayoutManager.VERTICAL, false);
        listaFotosMascota.setLayoutManager(glm);

        inicializarListaMascotas();
        inicializarAdaptador();
        return v;
    }

    public void inicializarAdaptador() {
        FotoMascotaAdaptador adaptador = new FotoMascotaAdaptador(fotosMascota, getActivity());
        listaFotosMascota.setAdapter(adaptador);
    }

    public void inicializarListaMascotas() {
        fotosMascota = new ArrayList<FotoMascota>();

        fotosMascota.add(new FotoMascota(5, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(5, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(4, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(5, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(4, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(4, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(4, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(3, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(3, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(5, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(5, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(4, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(5, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(4, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(4, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(4, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(3, R.drawable.snarf));
        fotosMascota.add(new FotoMascota(3, R.drawable.snarf));

    }
}
