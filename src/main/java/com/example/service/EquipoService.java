package com.example.service;

import com.example.domain.Equipo;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * Created by 47912513V on 20/10/2016.
 */
@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private JugadorRepository jugadorRepository;

    public void testequipos(){
        Equipo equipo1 = new Equipo();
        equipo1.setNombre("Equipo1");
        equipo1.setLocalidad("City1");
        equipo1.setFechaCreacion(LocalDate.of(1994, 7, 6));

        Equipo equipo2 = new Equipo();
        equipo1.setNombre("Equipo1");
        equipo1.setLocalidad("City2");
        equipo1.setFechaCreacion(LocalDate.of(1994, 7, 6));

        Equipo equipo3 = new Equipo();
        equipo1.setNombre("Equipo1");
        equipo1.setLocalidad("City3");
        equipo1.setFechaCreacion(LocalDate.of(1994, 7, 6));
    }
}
