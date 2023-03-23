package com.example.prueba.Controlador;

import com.example.prueba.Entidades.Paciente;
import com.example.prueba.Servicios.servicioPaciente;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class controladorPaciente {
    servicioPaciente servicio = new servicioPaciente();

    @GetMapping("/ListarPaciente")
    public ArrayList<Paciente> listarPaciente(){return servicio.listar();}

    @PostMapping("/agregarPaciente")
    public String agregar(@RequestBody Paciente paciente){
        return servicio.agregarPaciente(paciente);
    }

    @GetMapping("/buscarPaciente/{cod}")
    public Paciente buscarPaciente(@PathVariable("cod") int codigo) {return servicio.buscarPaciente(codigo);}
}
