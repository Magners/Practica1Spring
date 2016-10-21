package com.example.service;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

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
        equipo1.setFechaCreacion(LocalDate.of(1992, 7, 6));
        equipoRepository.save(equipo1);

        Equipo equipo2 = new Equipo();
        equipo2.setNombre("Equipo2");
        equipo2.setLocalidad("City2");
        equipo2.setFechaCreacion(LocalDate.of(1995, 7, 6));
        equipoRepository.save(equipo2);

        Equipo equipo3 = new Equipo();
        equipo3.setNombre("Equipo3");
        equipo3.setLocalidad("City1");
        equipo3.setFechaCreacion(LocalDate.of(1996, 7, 6));
        equipoRepository.save(equipo3);
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
        jugador2.setTeam(equipo1);
        jugadorRepository.save(jugador2);



        Jugador jugador3 = new Jugador();
        jugador3.setNombre("jandol");
        jugador3.setBirthday(LocalDate.of(1994, 7, 6));
        jugador3.setCanastasTotales(300);
        jugador3.setAsistenciasTotales(300);
        jugador3.setRebotesTotales(300);
        jugador3.setPosicion("base");
        jugador3.setTeam(equipo1);
        jugadorRepository.save(jugador3);


        Jugador jugador4 = new Jugador();
        jugador4.setNombre("dadak");
        jugador4.setBirthday(LocalDate.of(1994, 7, 6));
        jugador4.setCanastasTotales(400);
        jugador4.setAsistenciasTotales(400);
        jugador4.setRebotesTotales(400);
        jugador4.setPosicion("ala");
        jugador4.setTeam(equipo2);
        jugadorRepository.save(jugador4);


        Jugador jugador5 = new Jugador();
        jugador5.setNombre("magner");
        jugador5.setBirthday(LocalDate.of(1994, 7, 6));
        jugador5.setCanastasTotales(500);
        jugador5.setAsistenciasTotales(500);
        jugador5.setRebotesTotales(500);
        jugador5.setPosicion("ala");
        jugador5.setTeam(equipo2);
        jugadorRepository.save(jugador5);


        Jugador jugador6 = new Jugador();
        jugador6.setNombre("c4");
        jugador6.setBirthday(LocalDate.of(1994, 7, 6));
        jugador6.setCanastasTotales(500);
        jugador6.setAsistenciasTotales(500);
        jugador6.setRebotesTotales(500);
        jugador6.setPosicion("ala");
        jugador6.setTeam(equipo2);
        jugadorRepository.save(jugador6);

        Jugador jugador7 = new Jugador();
        jugador7.setNombre("nigga");
        jugador7.setBirthday(LocalDate.of(1994, 7, 6));
        jugador7.setCanastasTotales(600);
        jugador7.setAsistenciasTotales(600);
        jugador7.setRebotesTotales(600);
        jugador7.setPosicion("pivot");
        jugador7.setTeam(equipo3);
        jugadorRepository.save(jugador7);

        Jugador jugador8 = new Jugador();
        jugador8.setNombre("white");
        jugador8.setBirthday(LocalDate.of(1994, 7, 6));
        jugador8.setCanastasTotales(700);
        jugador8.setAsistenciasTotales(700);
        jugador8.setRebotesTotales(700);
        jugador8.setPosicion("pivot");
        jugador8.setTeam(equipo3);
        jugadorRepository.save(jugador8);

        Jugador jugador9 = new Jugador();
        jugador9.setNombre("pollum");
        jugador9.setBirthday(LocalDate.of(1994, 7, 6));
        jugador9.setCanastasTotales(800);
        jugador9.setAsistenciasTotales(800);
        jugador9.setRebotesTotales(800);
        jugador9.setPosicion("pivot");
        jugador9.setTeam(equipo3);
        jugadorRepository.save(jugador9);

        Jugador jugador10 = new Jugador();
        jugador10.setNombre("beka");
        jugador10.setBirthday(LocalDate.of(1994, 7, 6));
        jugador10.setCanastasTotales(900);
        jugador10.setAsistenciasTotales(900);
        jugador10.setRebotesTotales(900);
        jugador10.setPosicion("pivot");
        jugador10.setTeam(equipo1);
        jugadorRepository.save(jugador10);

        //Consultas

        System.out.println("Buscar jugadores por nombre, de manera que no sea necesario introducir el nombre completo.");
        System.out.println(jugadorRepository.findByNombreContaining("a"));
        System.out.println("Buscar jugadores que hayan conseguido un número mayor o igual a un número de canastas especificado como parámetro.");
        System.out.println(jugadorRepository.findByCanastasTotalesGreaterThan(500));
        System.out.println("Buscar jugadores que hayan efectuado un número de asistencias dentro de un rango especificado como parámetro.");
        System.out.println(jugadorRepository.findByasistenciasTotalesBetween(200,800));
        System.out.println("Buscar jugadores que pertenezcan a una posición específica, por ejemplo: base");
        System.out.println(jugadorRepository.findByPosicion("base"));
        System.out.println("Buscar jugadores que hayan nacido en una fecha anterior a una fecha especificada como parámetro.");
        System.out.println(jugadorRepository.findByBirthdayBefore(LocalDate.of(1995,1,1)));

        //Consultas complejas

        System.out.println("AVG per position");
        List<Object[]> jugadorList = jugadorRepository.findAVGStatisticsFromPosition();
        for (Object[] posicion : jugadorList) //Object - Jugador?
        {
            System.out.println("Posicion: "+posicion[0]);
            System.out.println("AVG Canastas: "+posicion[1]);
            System.out.println("AVG Asistencias: "+posicion[2]);
            System.out.println("AVG Rebotes: "+posicion[3]);
        }

        System.out.println("AVG,MIN,MAX per position");
        List<Object[]> jugadorListComp = jugadorRepository.findAVGMINMAXStatisticsFromPosition();
        for (Object[] posicion : jugadorListComp) //Object - Jugador?
        {
            System.out.println("Posicion: "+posicion[0]);
            System.out.println("AVG Canastas: "+posicion[1]);
            System.out.println("AVG Asistencias: "+posicion[2]);
            System.out.println("AVG Rebotes: "+posicion[3]);
            System.out.println("MAX Canastas: "+posicion[4]);
            System.out.println("MAX Asistencias: "+posicion[5]);
            System.out.println("MAX Rebotes: "+posicion[6]);
            System.out.println("MIN Canastas: "+posicion[7]);
            System.out.println("MIN Asistencias: "+posicion[8]);
            System.out.println("MIN Rebotes: "+posicion[9]);

        }

        /*System.out.println("last");
        List<Object[]> jugadorult = jugadorRepository.findJugadorMaxCanastasFromTeam();
        for (Object[] posicion : jugadorult){
            System.out.println("nombre: "+posicion[0]);
            .System.out.println("canastas: "+posicion[1]);
        }*/


        //Consultas equipo

        System.out.println("Consulta los equipos existentes en una localidad determinada");
        System.out.println(equipoRepository.findByLocalidad("City1"));
        System.out.println("Jugadores de un Equipo");
        System.out.println(jugadorRepository.findByTeamNombre("equipo1"));
        System.out.println("Jugadores de un equipo y posicion");
        System.out.println(jugadorRepository.findByTeamNombreAndPosicion("equipo1", "base"));
        //System.out.println("Jugador mas canastas dentro de equipo " +jugadorRepository.findJugadorMaxCanastasFromTeam("equipo1"));
        //Devuelve el jugador que más canastas ha realizado de un equipo determinado como parámetro.

        /*System.out.println("Agrupar los jugadores por la posición del campo y devolver para cada grupo la siguiente información: la media de canastas, asistencias y rebotes.");
        System.out.println(jugadorRepository.findBy);
        System.out.println("Lo mismo que el punto anterior pero devolviendo la media, el máximo y el mínimo de canastas, asistencias y rebotes.");
        System.out.println(jugadorRepository.findBy);*/
    }

}
