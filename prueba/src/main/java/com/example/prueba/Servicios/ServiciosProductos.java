package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Productos;

import java.util.ArrayList;

public class ServiciosProductos {

    private ArrayList<Productos> lista = new ArrayList<>();


    public ServiciosProductos(){
        lista.add(new Productos(1,"Manzana",5800.0,50,0,"Frutas"));
        lista.add(new Productos(2,"Papa",2500.0,120,0,"Vegetales"));
        lista.add(new Productos(3,"Fresa",4500.0,250,0,"Frutas"));
        lista.add(new Productos(4,"Jabon de baño",9800.0,330,0,"Aseo"));
        lista.add(new Productos(5,"Frijol",15800.0,50,0,"Grano"));
    }


    public ArrayList<Productos> mostrar(){
        return lista;
    }

    public int cantidad(){
        return lista.size();
    }

    public ArrayList<Productos> actualizar(){
        for(Productos productos:lista){
            productos.setTotal(productos.getCantidad()*productos.getPrecio());
        }
        return lista;
    }

    public ArrayList<Productos> total(){
        for(Productos productos:lista){
            productos.setTotal(+productos.getTotal());
        }
        return lista;
    }

}