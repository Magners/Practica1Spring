package com.example.service;

import com.example.domain.Jugador;
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

    public JugadorService() {
        super();
    }

    public void testJugadores(){

        Jugador jugador1 = new Jugador();
        jugador1.setNombre("");
        jugador1.setBirthday(LocalDate.of());
        jugador1.setCanastasTotales();
        jugador1.setAsistenciasTotales();
        jugador1.setRebotesTotales();
        jugador1.setPosicion("");
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador();
        jugador2.setNombre("");
        jugador2.setBirthday(LocalDate.of());
        jugador2.setCanastasTotales();
        jugador2.setAsistenciasTotales();
        jugador2.setRebotesTotales();
        jugador2.setPosicion("");
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador();
        jugador3.setNombre("");
        jugador3.setBirthday(LocalDate.of());
        jugador3.setCanastasTotales();
        jugador3.setAsistenciasTotales();
        jugador3.setRebotesTotales();
        jugador3.setPosicion("");
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador();
        jugador4.setNombre("");
        jugador4.setBirthday(LocalDate.of());
        jugador4.setCanastasTotales();
        jugador4.setAsistenciasTotales();
        jugador4.setRebotesTotales();
        jugador4.setPosicion("");
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador();
        jugador5.setNombre("");
        jugador5.setBirthday(LocalDate.of());
        jugador5.setCanastasTotales();
        jugador5.setAsistenciasTotales();
        jugador5.setRebotesTotales();
        jugador5.setPosicion("");
        jugadorRepository.save(jugador5);

        Jugador jugador6 = new Jugador();
        jugador6.setNombre("");
        jugador6.setBirthday(LocalDate.of());
        jugador6.setCanastasTotales();
        jugador6.setAsistenciasTotales();
        jugador6.setRebotesTotales();
        jugador6.setPosicion("");
        jugadorRepository.save(jugador6);

        Jugador jugador7 = new Jugador();
        jugador7.setNombre("");
        jugador7.setBirthday(LocalDate.of());
        jugador7.setCanastasTotales();
        jugador7.setAsistenciasTotales();
        jugador7.setRebotesTotales();
        jugador7.setPosicion("");
        jugadorRepository.save(jugador7);

        Jugador jugador8 = new Jugador();
        jugador8.setNombre("");
        jugador8.setBirthday(LocalDate.of());
        jugador8.setCanastasTotales();
        jugador8.setAsistenciasTotales();
        jugador8.setRebotesTotales();
        jugador8.setPosicion("");
        jugadorRepository.save(jugador8);

        Jugador jugador9 = new Jugador();
        jugador9.setNombre("");
        jugador9.setBirthday(LocalDate.of());
        jugador9.setCanastasTotales();
        jugador9.setAsistenciasTotales();
        jugador9.setRebotesTotales();
        jugador9.setPosicion("");
        jugadorRepository.save(jugador9);

        Jugador jugador10 = new Jugador();
        jugador10.setNombre("");
        jugador10.setBirthday(LocalDate.of());
        jugador10.setCanastasTotales();
        jugador10.setAsistenciasTotales();
        jugador10.setRebotesTotales();
        jugador10.setPosicion("");
        jugadorRepository.save(jugador10);


    }

}
