package com.adrian.repasocomponentes.Utiles;

import java.io.Serializable;

public class Persona implements Serializable {
    String nombre, apellido;
    int foto;

    public Persona(String nombre, String apellido, int foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
