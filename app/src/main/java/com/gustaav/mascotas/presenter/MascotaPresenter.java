package com.gustaav.mascotas.presenter;

import android.content.Context;

import com.gustaav.mascotas.db.ConstructorMascotas;
import com.gustaav.mascotas.fragment.IListaMascotas;
import com.gustaav.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by gustavo.alvarado on 11/03/2017.
 */
public class MascotaPresenter implements IMascotaPresenter {

    private IListaMascotas iListaMascotas;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas ;

    public MascotaPresenter(IListaMascotas iListaMascotas, Context context) {
        this.iListaMascotas = iListaMascotas;
        this.context = context;
        obtenerMascotasBaseDatos();
    }

    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerTodasMascotas();
        mostrarMascotasRV();
    }

    @Override
    public void mostrarMascotasRV() {
        iListaMascotas.inicializarAdaptadorRV(iListaMascotas.crearAdaptador(mascotas));
        iListaMascotas.generarLinearLayoutVertical();
    }
}
