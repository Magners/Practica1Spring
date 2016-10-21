package com.example.repository;
import com.example.domain.Equipo;
import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.StringQueryParameterBinder;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by 47912513V on 17/10/2016.
 */
public interface JugadorRepository extends JpaRepository<Jugador, Long>{

    //Spring Data Queries
    List<Jugador> findByNombreContaining(String nombre);
    List<Jugador> findByCanastasTotalesGreaterThan(Integer canastasTotales);
    List<Jugador> findByasistenciasTotalesBetween(Integer min, Integer max);
    List<Jugador> findByPosicion(String posicion);
    List<Jugador> findByBirthdayBefore(LocalDate birthday);
    List<Jugador> findByTeamNombre(String nombreEquipo);
    List<Jugador> findByTeamNombreAndPosicion(String nombreEquipo, String posicion);

    //Devuelve el jugador que más canastas ha realizado de un equipo determinado como parámetro.
    //c.	Devuelve todos los jugadores de un equipo, que además jueguen en la misma posición (parámetro adicional de la consulta), por ejemplo, alero.
    //d.	Devuelve el jugador que más canastas ha realizado de un equipo determinado como parámetro.


    //JPQL Queries

    @Query("SELECT jugador.posicion , AVG(jugador.canastasTotales),  AVG(jugador.asistenciasTotales), AVG(jugador.rebotesTotales) from Jugador jugador GROUP BY jugador.posicion")
    List <Object[]> findAVGStatisticsFromPosition();

    @Query("SELECT jugador.posicion , AVG(jugador.canastasTotales),  AVG(jugador.asistenciasTotales), AVG(jugador.rebotesTotales), " +
            "MIN(jugador.canastasTotales),  MIN(jugador.asistenciasTotales), MIN(jugador.rebotesTotales), " +
            "MAX(jugador.canastasTotales),  MAX(jugador.asistenciasTotales), MAX(jugador.rebotesTotales) from Jugador jugador GROUP BY jugador.posicion")
    List <Object[]> findAVGMINMAXStatisticsFromPosition();

    //@Query("SELECT jugador FROM Jugador jugador WHERE jugador.team=:teame and jugador.canastasTotales=MAX(jugador.canastasTotales)")
    //List <Object[]>findJugadorMaxCanastasFromTeam(
    //@Param("teame") String teame);
    //@Query("SELECT jugador.nombre, jugador.canastasTotales, from Jugador jugador WHERE jugador.canastasTotales = MAX(jugador.canasats) GROUP BY jugador.team")
    //List <Object[]> findJugadorMaxCanastasFromTeam();
}

   /*Agrupar los jugadores por la posición del campo y devolver para cada
    grupo la siguiente información: la media de canastas, asistencias y rebotes
    Lo mismo que el punto anterior pero devolviendo la media, el máximo
    y el mínimo de canastas, asistencias y rebotes.*/

