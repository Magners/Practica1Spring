package com.example.repository;
import com.example.domain.Equipo;
import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by 47912513V on 20/10/2016.
 */
public interface EquipoRepository extends JpaRepository<Equipo, Long> {
}
