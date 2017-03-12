package com.gustaav.mascotas;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gustaav.mascotas.adapter.MascotaAdaptador;
import com.gustaav.mascotas.db.BaseDatos;
import com.gustaav.mascotas.db.ConstructorMascotas;
import com.gustaav.mascotas.pojo.Mascota;

import java.util.ArrayList;

public class Top5Mascotas extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top5_mascotas);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

    }

    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas() {
        ConstructorMascotas constructorMascotas = new ConstructorMascotas(this);
        mascotas = constructorMascotas.obtenerTop5Mascotas();
    }
}
