package com.example.domain;
import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by 47912513V on 17/10/2016.
 * Empezaremos con la entidad jugador.
 * La entidad jugador tendrá los siguientes atributos:
 * un identificador, un nombre, una fecha de nacimiento,
 * un número de canastas totales, un número de asistencias totales,
 * un número de rebotes totales y una posición en el campo por defecto 4
 * (alero, base, etc.).
 */
@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    private Long identificador;
    private String nombre;
    private LocalDate birthday;
    private int canastasTotales;
    private int asistenciasTotales;
    private int rebotesTotales;
    private String posicion;

    public Jugador(){
    }

    public Jugador(String nombre, LocalDate birthday, int canastasTotales, int asistenciasTotales, int rebotesTotales, String posicion) {
        this.nombre = nombre;
        this.birthday = birthday;
        this.canastasTotales = canastasTotales;
        this.asistenciasTotales = asistenciasTotales;
        this.rebotesTotales = rebotesTotales;
        this.posicion = posicion;
    }

    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getCanastasTotales() {
        return canastasTotales;
    }

    public void setCanastasTotales(int canastasTotales) {
        this.canastasTotales = canastasTotales;
    }

    public int getAsistenciasTotales() {
        return asistenciasTotales;
    }

    public void setAsistenciasTotales(int asistenciasTotales) {
        this.asistenciasTotales = asistenciasTotales;
    }

    public int getRebotesTotales() {
        return rebotesTotales;
    }

    public void setRebotesTotales(int rebotesTotales) {
        this.rebotesTotales = rebotesTotales;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jugador jugador = (Jugador) o;

        if (canastasTotales != jugador.canastasTotales) return false;
        if (asistenciasTotales != jugador.asistenciasTotales) return false;
        if (rebotesTotales != jugador.rebotesTotales) return false;
        if (!identificador.equals(jugador.identificador)) return false;
        if (nombre != null ? !nombre.equals(jugador.nombre) : jugador.nombre != null) return false;
        if (birthday != null ? !birthday.equals(jugador.birthday) : jugador.birthday != null) return false;
        return posicion != null ? posicion.equals(jugador.posicion) : jugador.posicion == null;

    }

    @Override
    public int hashCode() {
        int result = identificador.hashCode();
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + canastasTotales;
        result = 31 * result + asistenciasTotales;
        result = 31 * result + rebotesTotales;
        result = 31 * result + (posicion != null ? posicion.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", birthday=" + birthday +
                ", canastasTotales=" + canastasTotales +
                ", asistenciasTotales=" + asistenciasTotales +
                ", rebotesTotales=" + rebotesTotales +
                ", posicion='" + posicion + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
