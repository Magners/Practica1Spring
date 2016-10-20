package com.example.repository;
import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by 47912513V on 17/10/2016.
 */
public interface JugadorRepository extends JpaRepository<Jugador, Long>{
    List<Jugador> findByNombreContaining(String nombre);
    List<Jugador> findByCanastasTotatlesGreaterThan(Integer canastasTotales);
    List<Jugador> findByAsisteniasTotalesBetween(Integer min, Integer max);
    List<Jugador> findByPosicion(String posicion);
    List<Jugador> findByBirthdayBefore(LocalDate birthday);
}
