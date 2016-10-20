package com.example.service;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * Created by 47912513V on 17/10/2016.
 */
@Service
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;

    /*public JugadorService() {
        super();
    }*/
    @Autowired
    private EquipoRepository equipoRepository;

    public void testJugadores(){

        //Equipos

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

        //Jugadores

        Jugador jugador1 = new Jugador();
        jugador1.setNombre("juan");
        jugador1.setBirthday(LocalDate.of(1994, 7, 6));
        jugador1.setCanastasTotales(100);
        jugador1.setAsistenciasTotales(100);
        jugador1.setRebotesTotales(100);
        jugador1.setPosicion("base");
        jugador1.setTeam(equipo1);
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador();
        jugador2.setNombre("paco");
        jugador2.setBirthday(LocalDate.of(1994, 7, 6));
        jugador2.setCanastasTotales(200);
        jugador2.setAsistenciasTotales(200);
        jugador2.setRebotesTotales(200);
        jugador2.setPosicion("base");
        jugadorRepository.save(jugador2);
        jugador1.setTeam(equipo1);


        Jugador jugador3 = new Jugador();
        jugador3.setNombre("jandol");
        jugador3.setBirthday(LocalDate.of(1994, 7, 6));
        jugador3.setCanastasTotales(300);
        jugador3.setAsistenciasTotales(300);
        jugador3.setRebotesTotales(300);
        jugador3.setPosicion("base");
        jugador1.setTeam(equipo1);
        jugadorRepository.save(jugador3);


        Jugador jugador4 = new Jugador();
        jugador4.setNombre("dadak");
        jugador4.setBirthday(LocalDate.of(1994, 7, 6));
        jugador4.setCanastasTotales(400);
        jugador4.setAsistenciasTotales(400);
        jugador4.setRebotesTotales(400);
        jugador4.setPosicion("ala");
        jugador1.setTeam(equipo2);
        jugadorRepository.save(jugador4);


        Jugador jugador5 = new Jugador();
        jugador5.setNombre("magner");
        jugador5.setBirthday(LocalDate.of(1994, 7, 6));
        jugador5.setCanastasTotales(500);
        jugador5.setAsistenciasTotales(500);
        jugador5.setRebotesTotales(500);
        jugador5.setPosicion("ala");
        jugador1.setTeam(equipo2);
        jugadorRepository.save(jugador5);


        Jugador jugador6 = new Jugador();
        jugador6.setNombre("c4");
        jugador6.setBirthday(LocalDate.of(1994, 7, 6));
        jugador6.setCanastasTotales(500);
        jugador6.setAsistenciasTotales(500);
        jugador6.setRebotesTotales(500);
        jugador6.setPosicion("ala");
        jugador1.setTeam(equipo2);
        jugadorRepository.save(jugador6);

        Jugador jugador7 = new Jugador();
        jugador7.setNombre("nigga");
        jugador7.setBirthday(LocalDate.of(1994, 7, 6));
        jugador7.setCanastasTotales(600);
        jugador7.setAsistenciasTotales(600);
        jugador7.setRebotesTotales(600);
        jugador7.setPosicion("pivot");
        jugador1.setTeam(equipo3);
        jugadorRepository.save(jugador7);

        Jugador jugador8 = new Jugador();
        jugador8.setNombre("white");
        jugador8.setBirthday(LocalDate.of(1994, 7, 6));
        jugador8.setCanastasTotales(700);
        jugador8.setAsistenciasTotales(700);
        jugador8.setRebotesTotales(700);
        jugador8.setPosicion("pivot");
        jugador1.setTeam(equipo3);
        jugadorRepository.save(jugador8);

        Jugador jugador9 = new Jugador();
        jugador9.setNombre("pollum");
        jugador9.setBirthday(LocalDate.of(1994, 7, 6));
        jugador9.setCanastasTotales(800);
        jugador9.setAsistenciasTotales(800);
        jugador9.setRebotesTotales(800);
        jugador9.setPosicion("pivot");
        jugador1.setTeam(equipo3);
        jugadorRepository.save(jugador9);

        Jugador jugador10 = new Jugador();
        jugador10.setNombre("beka");
        jugador10.setBirthday(LocalDate.of(1994, 7, 6));
        jugador10.setCanastasTotales(900);
        jugador10.setAsistenciasTotales(900);
        jugador10.setRebotesTotales(900);
        jugador10.setPosicion("pivot");
        jugador1.setTeam(equipo1);
        jugadorRepository.save(jugador10);

        //Consultas

        System.out.println("Buscar jugadores por nombre, de manera que no sea necesario introducir el nombre completo.");
        System.out.println(jugadorRepository.findByNombreContaining("a"));
        System.out.println("Buscar jugadores que hayan conseguido un número mayor o igual a un número de canastas especificado como parámetro.");
        System.out.println(jugadorRepository.findByCanastasTotatlesGreaterThan(500));
        System.out.println("Buscar jugadores que hayan efectuado un número de asistencias dentro de un rango especificado como parámetro.");
        System.out.println(jugadorRepository.findByAsisteniasTotalesBetween(200,800));
        System.out.println("Buscar jugadores que pertenezcan a una posición específica, por ejemplo: base");
        System.out.println(jugadorRepository.findByPosicion("base"));
        System.out.println("Buscar jugadores que hayan nacido en una fecha anterior a una fecha especificada como parámetro.");
        System.out.println(jugadorRepository.findByBirthdayBefore(LocalDate.of(1995,1,1)));

        //Consultas complejas

        System.out.println("Agrupar los jugadores por la posición del campo y devolver para cada grupo la siguiente información: la media de canastas, asistencias y rebotes.");
        System.out.println(jugadorRepository.findBy);
        System.out.println("Lo mismo que el punto anterior pero devolviendo la media, el máximo y el mínimo de canastas, asistencias y rebotes.");
        System.out.println(jugadorRepository.findBy);
    }

}
