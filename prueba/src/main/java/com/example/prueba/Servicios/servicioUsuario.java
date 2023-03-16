package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;

public class servicioUsuario {
    ArrayList<Usuario> lista = new ArrayList<>();

    public servicioUsuario(){
        lista.add(new Usuario(10, "Luisa","Alemania", LocalDate.of(2023,02,28),"luisa@gmail.com"));
        lista.add(new Usuario(11, "Fernando","Colombia", LocalDate.of(2000,05,30),"fernando@gmail.com"));
        lista.add(new Usuario(12, "Maria","Chile", LocalDate.of(2009,12,01),"maria@gmail.com"));
    }

    public ArrayList<Usuario> listar(){
        return lista;
    }

    public String agregarUsuario(Usuario usu){
        lista.add(usu);
        return "Registro exitoso";

    }

}
