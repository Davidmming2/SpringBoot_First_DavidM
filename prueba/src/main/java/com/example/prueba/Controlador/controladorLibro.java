package com.example.prueba.Controlador;
import com.example.prueba.Entidades.Libro;
import com.example.prueba.Servicios.servicioLibro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class controladorLibro {
    servicioLibro servicio = new servicioLibro();

    @GetMapping("/ListarLibro")
    public ArrayList<Libro> listarLibro(){
        return servicio.listar();
    }

    @PostMapping("/agregarLibro")
    public String agregar(@RequestBody Libro libro){
        return servicio.agregarLibro(libro);
    }


    @GetMapping("/buscarLibro/{cod}")
    public Libro buscarLibro(@PathVariable("cod") int codigo){
        return servicio.buscarLibro(codigo);
    }
}
