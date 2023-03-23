package com.example.prueba.Controlador;

import com.example.prueba.Entidades.Medicamentos;
import com.example.prueba.Servicios.ServiciosMedicamentos;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

public class controladorMedicamentos {
    ServiciosMedicamentos servicio = new ServiciosMedicamentos();

    @GetMapping("/listarMedicamentos")
    public ArrayList<Medicamentos> listar(){
        return servicio.mostrar();
    }

    @GetMapping("/tamaño")
    public int mostrarCant(){
        return servicio.cantidad();
    }

    @GetMapping("/actualizartotal")
    public ArrayList<Medicamentos> actualizardatos(){
        return servicio.actualizar();
    }

    @GetMapping("/total")
    public ArrayList<Medicamentos> total(){
        return servicio.total();
    }
}
