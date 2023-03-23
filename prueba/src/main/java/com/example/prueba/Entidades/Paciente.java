package com.example.prueba.Entidades;

import java.time.LocalDate;

public class Paciente {
    private int id;
    private String nombre;
    private String especie;
    private LocalDate fecha;
    private int edad;


    public Paciente(int id, String nombre, String especie, LocalDate fecha, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.fecha = fecha;
        this.edad = edad;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}