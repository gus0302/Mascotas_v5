package com.gustaav.mascotas.fragment;

import com.gustaav.mascotas.adapter.MascotaAdaptador;
import com.gustaav.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by gustavo.alvarado on 11/03/2017.
 */
public interface IListaMascotas {
    public void generarLinearLayoutVertical();
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> contactos);
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);

}
