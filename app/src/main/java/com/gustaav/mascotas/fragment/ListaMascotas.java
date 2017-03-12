package com.gustaav.mascotas.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gustaav.mascotas.R;
import com.gustaav.mascotas.adapter.MascotaAdaptador;
import com.gustaav.mascotas.pojo.Mascota;
import com.gustaav.mascotas.presenter.IMascotaPresenter;
import com.gustaav.mascotas.presenter.MascotaPresenter;

import java.util.ArrayList;


public class ListaMascotas extends Fragment implements IListaMascotas {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private IMascotaPresenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_lista_mascotas, container, false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        presenter = new MascotaPresenter(this, getContext());

        /*LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);*/

        /*inicializarListaMascotas();
        inicializarAdaptador();*/
        return v;
    }

    /*public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }*/

    /*public void inicializarListaMascotas() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Tom", 5, R.drawable.tom));
        mascotas.add(new Mascota("Dino", 5, R.drawable.dino));
        mascotas.add(new Mascota("Astro", 4, R.drawable.astro));
        mascotas.add(new Mascota("Pluto", 5, R.drawable.pluto));
        mascotas.add(new Mascota("Snarf", 4, R.drawable.snarf));
        mascotas.add(new Mascota("Garfield", 4, R.drawable.garfield));
        mascotas.add(new Mascota("Silvestre", 4, R.drawable.silvestre));
        mascotas.add(new Mascota("Scooby Doo", 3, R.drawable.scooby_doo));
        mascotas.add(new Mascota("Heathcliff", 3, R.drawable.heathcliff));

    }*/

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador) {
        listaMascotas.setAdapter(adaptador);
    }
}
