package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Libreria;

import java.util.ArrayList;

public class ServiciosLibreria {

    private ArrayList<Libreria> lista = new ArrayList<>();


    public ServiciosLibreria(){
        lista.add(new Libreria("Colombia","Bogota","Cra 22 #2-45 Norte","Teatro Julio Mario"));
        lista.add(new Libreria("Argentina","Tucuman","Ruta Panamericana Km 36","Teatro Tucuman"));
        lista.add(new Libreria("Colombia","Cali","Calle 10 #4-69 Norte","Biblioteca Central"));
        lista.add(new Libreria("Mexico","CDMX","Balderas 27, Colonia Centro","Tikos Takos"));
    }


    public ArrayList<Libreria> mostrar(){
        return lista;
    }

    public int cantidad(){
        return lista.size();
    }
}
