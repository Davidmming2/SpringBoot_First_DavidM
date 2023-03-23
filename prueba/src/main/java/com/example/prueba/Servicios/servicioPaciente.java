package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Paciente;

import java.time.LocalDate;
import java.util.ArrayList;

public class servicioPaciente {
    ArrayList<Paciente> lista = new ArrayList<>();

    public servicioPaciente() {
        lista.add(new Paciente(10, "Asrael", "Conejillo de indias", LocalDate.of(2023, 02, 28), 9));
        lista.add(new Paciente(11, "Kirara", "Tigrillo", LocalDate.of(2000, 05, 30), 4));
        lista.add(new Paciente(12, "Calipso", "Guacamaya", LocalDate.of(2009, 12, 01), 2));
    }

    public ArrayList<Paciente> listar() {
        return lista;
    }

    public String agregarPaciente(Paciente usu) {
        lista.add(usu);
        return "Registro Exitoso";
    }

    public Paciente buscarPaciente(int codigo) {
        Paciente usu = null;
        for (Paciente u : lista) {
            if (u.getId() == codigo) {
                usu = u;
            }
        }
        return usu;
    }
}
