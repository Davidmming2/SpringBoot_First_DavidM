package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Medicamentos;

import java.util.ArrayList;

public class ServiciosMedicamentos {
    private ArrayList<Medicamentos> lista = new ArrayList<>();


    public ServiciosMedicamentos(){
        lista.add(new Medicamentos(1,"Resta derm",14.000,5,0));
        lista.add(new Medicamentos(2,"Sulfato de zinc",5.000,10,0));
        lista.add(new Medicamentos(3,"Suero fisiologico",20.000,20,0));
        lista.add(new Medicamentos(4,"Jabon de baño",110.000,3,0));
        lista.add(new Medicamentos(5,"Frijol",50.000,35,0));
    }


    public ArrayList<Medicamentos> mostrar(){
        return lista;
    }

    public int cantidad(){
        return lista.size();
    }

    public ArrayList<Medicamentos> actualizar(){
        for(Medicamentos medicamentos:lista){
            medicamentos.setTotal(medicamentos.getCantidad()*medicamentos.getPrecio());
        }
        return lista;
    }

    public ArrayList<Medicamentos> total(){
        for(Medicamentos medicamentos:lista){
            medicamentos.setTotal(+medicamentos.getTotal());
        }
        return lista;
    }


}
