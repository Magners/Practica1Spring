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
public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    //Spring Data Queries
    List<Jugador> findByNombreContaining(String nombre);

    List<Jugador> findByCanastasTotalesGreaterThan(Integer canastasTotales);

    List<Jugador> findByasistenciasTotalesBetween(Integer min, Integer max);

    List<Jugador> findByPosicion(String posicion);

    List<Jugador> findByBirthdayBefore(LocalDate birthday);

    List<Jugador> findByTeamNombre(String nombreEquipo);

    List<Jugador> findByTeamNombreAndPosicion(String nombreEquipo, String posicion);


    //JPQL Queries

    @Query("SELECT jugador.posicion , AVG(jugador.canastasTotales),  AVG(jugador.asistenciasTotales), AVG(jugador.rebotesTotales) from Jugador jugador GROUP BY jugador.posicion")
    List<Object[]> findAVGStatisticsFromPosition();

    @Query("SELECT jugador.posicion , AVG(jugador.canastasTotales),  AVG(jugador.asistenciasTotales), AVG(jugador.rebotesTotales), " +
            "MIN(jugador.canastasTotales),  MIN(jugador.asistenciasTotales), MIN(jugador.rebotesTotales), " +
            "MAX(jugador.canastasTotales),  MAX(jugador.asistenciasTotales), MAX(jugador.rebotesTotales) from Jugador jugador GROUP BY jugador.posicion")
    List<Object[]> findAVGMINMAXStatisticsFromPosition();

    @Query("SELECT jugador from Jugador jugador WHERE jugador.team = :team AND jugador.canastasTotales IN (SELECT MAX(jugador.canastasTotales) FROM Jugador jugador WHERE jugador.team = :team)")
    List<Object[]> findMaxPointsPlayerByTeam(@Param("team") Equipo equipo);

}

