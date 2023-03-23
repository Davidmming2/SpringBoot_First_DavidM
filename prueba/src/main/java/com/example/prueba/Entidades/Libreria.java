package com.example.prueba.Entidades;

public class Libreria {

    private String pais;

    private String ciudad;

    private String direccion;

    private String sede;


    public Libreria(String pais, String ciudad, String direccion, String sede) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.sede = sede;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
