package com.example;

import com.example.service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(
        basePackageClasses = { Practica1SpringApplication.class, Jsr310JpaConverters.class }
)
@SpringBootApplication
public class Practica1SpringApplication {

    public static void main(String[] args) {
        //SpringApplication.run(Practica1SpringApplication.class, args);
            ConfigurableApplicationContext context = SpringApplication.run(Practica1SpringApplication.class, args);
        context.getBean(JugadorService.class).testJugadores();
        /*ConfigurableApplicationContext context= SpringApplication.run(CarApplication.class, args);

        CarService carService=context.getBean(CarService.class);

        PersonService personaService =context.getBean(PersonService.class);

        personaService.testPeople();
        carService.testCars();*/
    }
}
