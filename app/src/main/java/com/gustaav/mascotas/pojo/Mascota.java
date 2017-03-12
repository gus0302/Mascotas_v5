package com.gustaav.mascotas.pojo;

/**
 * Created by gustavo.alvarado on 09/10/2016.
 */
public class Mascota {
    private int id;
    private String nombre;
    private int foto;
    private int rating;

    public Mascota(String nombre, int rating, int foto) {
        this.id = id;
        this.nombre = nombre;
        this.rating = rating;
        this.foto = foto;
    }

    public Mascota() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
