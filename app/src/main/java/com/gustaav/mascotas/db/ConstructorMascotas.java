package com.gustaav.mascotas.db;

import android.content.ContentValues;
import android.content.Context;

import com.gustaav.mascotas.R;
import com.gustaav.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by gustavo.alvarado on 11/03/2017.
 */
public class ConstructorMascotas {
    private Context context;

    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerTodasMascotas() {
        /*ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Tom", 5, R.drawable.tom));
        mascotas.add(new Mascota("Dino", 5, R.drawable.dino));
        mascotas.add(new Mascota("Astro", 4, R.drawable.astro));
        mascotas.add(new Mascota("Pluto", 5, R.drawable.pluto));
        mascotas.add(new Mascota("Snarf", 4, R.drawable.snarf));
        mascotas.add(new Mascota("Garfield", 4, R.drawable.garfield));
        mascotas.add(new Mascota("Silvestre", 4, R.drawable.silvestre));
        mascotas.add(new Mascota("Scooby Doo", 3, R.drawable.scooby_doo));
        mascotas.add(new Mascota("Heathcliff", 3, R.drawable.heathcliff));*/

        BaseDatos db = new BaseDatos(context);
        insertarMascotas(db);

        return db.obtenerTodasMascotas();

        //return mascotas;
    }

    public ArrayList<Mascota> obtenerTop5Mascotas() {
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        BaseDatos db = new BaseDatos(context);
        return db.obtenerTop5Mascotas();
    }

    public void insertarMascotas(BaseDatos db) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_NOMBRE, "Tom");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_FOTO, R.drawable.tom);
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_RATING, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_NOMBRE, "Dino");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_FOTO, R.drawable.dino);
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_RATING, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_NOMBRE, "Astro");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_FOTO, R.drawable.astro);
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_RATING, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_NOMBRE, "Pluto");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_FOTO, R.drawable.pluto);
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_RATING, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_NOMBRE, "Snarf");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_FOTO, R.drawable.snarf);
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_RATING, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_NOMBRE, "Garfield");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_FOTO, R.drawable.garfield);
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_RATING, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_NOMBRE, "Silvestre");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_FOTO, R.drawable.silvestre);
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_RATING, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_NOMBRE, "Scooby Doo");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_FOTO, R.drawable.scooby_doo);
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_RATING, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_NOMBRE, "Heathcliff");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_FOTO, R.drawable.heathcliff);
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_RATING, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_NOMBRE, "Snoopy");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_FOTO, R.drawable.snoopy);
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_RATING, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_NOMBRE, "Burro");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_FOTO, R.drawable.burro);
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_RATING, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_NOMBRE, "Cringer");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_FOTO, R.drawable.cringer);
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_RATING, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_NOMBRE, "Slinky");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_FOTO, R.drawable.slinky);
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_RATING, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_NOMBRE, "Golfo");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_FOTO, R.drawable.golfo);
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTA_RATING, 0);
        db.insertarMascota(contentValues);
    }

    public void ratearMascota(Mascota mascota) {
        BaseDatos db = new BaseDatos(context);
        db.ratearMascota(mascota);
        db.close();
    }

    public int obtenerRatingMascota(Mascota mascota) {
        BaseDatos db = new BaseDatos(context);
        return db.obtenerRatingMascota(mascota);
    }
}
