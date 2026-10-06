package Creacionales.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Equipo implements Cloneable {
    private String nombre;
    private String categoria;
    private int cantidadJugadores;
    private List<String> jugadores;

    public Equipo(String nombre, String categoria, int cantidadJugadores) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidadJugadores = cantidadJugadores;
        this.jugadores = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public int getCantidadJugadores() { return cantidadJugadores; }
    public void setCantidadJugadores(int cantidadJugadores) { this.cantidadJugadores = cantidadJugadores; }

    public List<String> getJugadores() { return jugadores; }

    public void agregarJugador(String jugador) { jugadores.add(jugador); }

    // Clonación PROFUNDA
    @Override
    public Equipo clone() {
        try {
            Equipo copia = (Equipo) super.clone();  //Copia de los campos
            copia.jugadores = new ArrayList<>(this.jugadores); //Generamos una nueva lista indepediente 
            return copia;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e); // no ocurre: implementamos Cloneable
        }
    }

    @Override
    public String toString() {
        return "Equipo [Nombre: " + nombre + ", Categoria: " + categoria + ", Jugadores: " + cantidadJugadores + ", Plantel: " + jugadores + "]";
    }
}