package com.gustaav.mascotas;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();
        agregarFAB();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_view_top5, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.avTop5:
                Intent intent = new Intent(this, Top5Mascotas.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void agregarFAB() {
        FloatingActionButton fabCamara = (FloatingActionButton) findViewById(R.id.fabCamara);
        fabCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Seleccionaste la cámara", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas() {
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

    }
}
