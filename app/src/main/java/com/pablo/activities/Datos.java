package com.pablo.activities;

/**
 * Created by Pablo on 08/07/2016.
 */
public class Datos {

    private String nombre;
    private String telefono;
    private String mail;
    private String descripcion;

    public Datos(String nombre, String telefono, String mail, String datos) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

