package com.example.prueba.Controlador;
import com.example.prueba.Entidades.Usuario;
import com.example.prueba.Servicios.servicioUsuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class controladorUsuario {
    servicioUsuario servicio = new servicioUsuario();

    @GetMapping("/ListarUsuario")
    public ArrayList<Usuario> listarUsuario(){
        return servicio.listar();
    }

    @PostMapping("/agregarUsuario")
    public String agregar(@RequestBody Usuario usuario){
        return servicio.agregarUsuario(usuario);
    }
}
