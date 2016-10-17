package com.example.repository;
import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 47912513V on 17/10/2016.
 */
public interface JugadorRepository extends JpaRepository<Jugador, Long>{
    
}
