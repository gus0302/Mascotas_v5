package com.gustaav.mascotas.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.gustaav.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by gustavo.alvarado on 11/03/2017.
 */
public class BaseDatos extends SQLiteOpenHelper {

    private Context context;

    public BaseDatos(Context context) {
        super(context, ConstantesBaseDatos.BASE_DATOS_NOMBRE, null, ConstantesBaseDatos.BASE_DATOS_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String queryCrearTablaMascota = "CREATE TABLE " + ConstantesBaseDatos.TABLA_MASCOTA + " (" +
                                        ConstantesBaseDatos.TABLA_MASCOTA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                        ConstantesBaseDatos.TABLA_MASCOTA_NOMBRE + " TEXT, " +
                                        ConstantesBaseDatos.TABLA_MASCOTA_FOTO + " INTEGER, " +
                                        ConstantesBaseDatos.TABLA_MASCOTA_RATING + " INTEGER " +
                                        ")";

        db.execSQL(queryCrearTablaMascota);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXIST " + ConstantesBaseDatos.TABLA_MASCOTA);
        onCreate(db);
    }

    public ArrayList<Mascota> obtenerTodasMascotas() {
        ArrayList<Mascota> mascotas = new ArrayList<>();
        String query = "SELECT * FROM " + ConstantesBaseDatos.TABLA_MASCOTA;
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor registros = db.rawQuery(query, null);

        while (registros.moveToNext()) {
            Mascota mascotaActual = new Mascota();
            mascotaActual.setId(registros.getInt(0));
            mascotaActual.setNombre(registros.getString(1));
            mascotaActual.setFoto(registros.getInt(2));

            String queryRating = "SELECT " + ConstantesBaseDatos.TABLA_MASCOTA_RATING + "  " +
                    "FROM " + ConstantesBaseDatos.TABLA_MASCOTA + " " +
                    "WHERE " + ConstantesBaseDatos.TABLA_MASCOTA_ID + " = " + mascotaActual.getId();

            Cursor registrosRating = db.rawQuery(queryRating, null);
            if (registrosRating.moveToNext()) {
                mascotaActual.setRating(registrosRating.getInt(0));
            }
            else {
                mascotaActual.setRating(0);
            }

            mascotas.add(mascotaActual);
        }

        db.close();
        return mascotas;
    }

    public ArrayList<Mascota> obtenerTop5Mascotas() {
        ArrayList<Mascota> mascotas = new ArrayList<>();
        String query = "SELECT * FROM " + ConstantesBaseDatos.TABLA_MASCOTA + " ORDER BY " + ConstantesBaseDatos.TABLA_MASCOTA_RATING + " DESC LIMIT 5";
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor registros = db.rawQuery(query, null);

        while (registros.moveToNext()) {
            Mascota mascotaActual = new Mascota();
            mascotaActual.setId(registros.getInt(0));
            mascotaActual.setNombre(registros.getString(1));
            mascotaActual.setFoto(registros.getInt(2));
            mascotaActual.setRating(registros.getInt(3));

            mascotas.add(mascotaActual);
        }

        db.close();
        return mascotas;
    }

    public void insertarMascota(ContentValues contentValues) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(ConstantesBaseDatos.TABLA_MASCOTA, null, contentValues);
        db.close();
    }

    public void ratearMascota(Mascota mascota) {
        SQLiteDatabase db = this.getWritableDatabase();
        String queryActualizarTabla =   "UPDATE " + ConstantesBaseDatos.TABLA_MASCOTA + " " +
                                        "SET " + ConstantesBaseDatos.TABLA_MASCOTA_RATING + " = " + ConstantesBaseDatos.TABLA_MASCOTA_RATING + " +  1 " +
                                        "WHERE " + ConstantesBaseDatos.TABLA_MASCOTA_ID + " = " + mascota.getId();

        db.execSQL(queryActualizarTabla);
        db.close();
    }

    public int obtenerRatingMascota(Mascota mascota)
    {
        int rating = 0;
        String query = "SELECT  " + ConstantesBaseDatos.TABLA_MASCOTA_RATING + " " +
                "FROM " + ConstantesBaseDatos.TABLA_MASCOTA + " " +
                "WHERE " + ConstantesBaseDatos.TABLA_MASCOTA_ID + " = " + mascota.getId();

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);

        while (registros.moveToNext()) {
            rating = registros.getInt(0);
        }

        db.close();

        return rating;
    }
}
