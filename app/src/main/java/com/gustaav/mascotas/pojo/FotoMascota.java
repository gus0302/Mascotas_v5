package com.gustaav.mascotas.pojo;

/**
 * Created by gustavo.alvarado on 16/10/2016.
 */
public class FotoMascota {

    private int rating;
    private int foto;


    public FotoMascota(int rating, int foto) {
        this.foto = foto;
        this.rating = rating;
    }

    public int getFoto() {
        return foto;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public void setFoto(int foto) {
        this.foto = foto;
    }
}
