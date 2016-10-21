package com.example.service;

import com.example.domain.Equipo;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

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
        /*Equipo equipo1 = new Equipo();
        equipo1.setNombre("Equipo1");
        equipo1.setLocalidad("City1");
        equipo1.setFechaCreacion(LocalDate.of(1994, 7, 6));

        Equipo equipo2 = new Equipo();
        equipo1.setNombre("Equipo1");
        equipo1.setLocalidad("City2");
        equipo1.setFechaCreacion(LocalDate.of(1994, 7, 6));

        Equipo equipo3 = new Equipo();
        equipo1.setNombre("Equipo1");
        equipo1.setLocalidad("City1");
        equipo1.setFechaCreacion(LocalDate.of(1994, 7, 6));*/

        System.out.println("Consulta los equipos existentes en una localidad determinada");
        System.out.println(equipoRepository.findByLocalidad("City1"));
        //System.out.println("Devuelve todos los jugadores de un equipo, a partir del nombre completo del equipo");
        //System.out.println(jugadorRepository.findByTeamNombre("team1"));


    }
}

/*a.	Consulta los equipos existentes en una localidad determinada.
b.	Devuelve todos los jugadores de un equipo, a partir del nombre completo del equipo.
c.	Devuelve todos los jugadores de un equipo, que además jueguen en la misma posición (parámetro adicional de la consulta), por ejemplo, alero.
d.	Devuelve el jugador que más canastas ha realizado de un equipo determinado como parámetro.
*/