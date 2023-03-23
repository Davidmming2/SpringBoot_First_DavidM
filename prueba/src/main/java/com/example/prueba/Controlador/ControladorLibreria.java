package com.example.prueba.Controlador;

import com.example.prueba.Entidades.Libreria;
import com.example.prueba.Entidades.Libro;
import com.example.prueba.Servicios.ServiciosLibreria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControladorLibreria {

    ServiciosLibreria servicio = new ServiciosLibreria();

    @GetMapping("/listarLibros")
    public ArrayList<Libreria> listar(){
        return servicio.mostrar();
    }

    @GetMapping("/tamano")
    public int mostrarCant(){
        return servicio.cantidad();
    }

}