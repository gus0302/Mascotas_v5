package com.gustaav.mascotas.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.gustaav.mascotas.R;
import com.gustaav.mascotas.pojo.FotoMascota;
import com.gustaav.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by gustavo.alvarado on 16/10/2016.
 */
public class FotoMascotaAdaptador extends RecyclerView.Adapter<FotoMascotaAdaptador.FotoMascotaViewHolder> {


    ArrayList<FotoMascota> fotosMascota;
    Activity activity;

    public FotoMascotaAdaptador(ArrayList<FotoMascota> fotosMascota, Activity activity) {
        this.fotosMascota = fotosMascota;
        this.activity = activity;
    }

    @Override
    public FotoMascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_foto_mascota, parent, false);
        return new FotoMascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(FotoMascotaViewHolder fotoMascotaViewHolder, int position) {
        final FotoMascota fotoMascota = fotosMascota.get(position);

        fotoMascotaViewHolder.imgFoto.setImageResource(fotoMascota.getFoto());
        fotoMascotaViewHolder.tvRating.setText(Integer.toString(fotoMascota.getRating()));
    }

    @Override
    public int getItemCount() {
        return fotosMascota.size();
    }

    public static class FotoMascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private TextView tvRating;

        public FotoMascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvRating = (TextView) itemView.findViewById(R.id.tvRating);
        }
    }

}
