package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Libro;

import java.time.LocalDate;
import java.util.ArrayList;

public class servicioLibro {
    ArrayList<Libro> lista = new ArrayList<>();

    public servicioLibro(){
        lista.add(new Libro(01, "Cien años de soledad",69900, "Gabriel Garcia Marquez","Vickys","Historia"));
        lista.add(new Libro(10, "La isla misteriosa",45000,"Julio Verne","Henrys","Aventura"));
        lista.add(new Libro(24, "Charley y la fabrica de cocholates",96500,"Tim Burton","Dayus","Drama"));
    }

    public ArrayList<Libro> listar(){
        return lista;
    }

    public String agregarLibro(Libro libro){
        lista.add(libro);
        return "Registro exitoso";
    }

    public Libro buscarLibro(int codigo){
        Libro libro=null;
        for(Libro u: lista){
            if (u.getCodigo() == codigo){
                libro=u;
            }
        }
        return libro;
    }
}

