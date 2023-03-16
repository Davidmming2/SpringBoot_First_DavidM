package com.example.prueba.Controlador;

import com.example.prueba.Entidades.Productos;
import com.example.prueba.Servicios.ServiciosProductos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControladorProductos {

    ServiciosProductos servicio = new ServiciosProductos();

    @GetMapping("/listarProductos")
    public ArrayList<Productos> listar(){
        return servicio.mostrar();
    }

    @GetMapping("/tamano")
    public int mostrarCant(){
        return servicio.cantidad();
    }

    @GetMapping("/actualizartotal")
    public ArrayList<Productos> actualizardatos(){
        return servicio.actualizar();
    }

    @GetMapping("/total")
    public ArrayList<Productos> total(){
        return servicio.total();
    }

}
