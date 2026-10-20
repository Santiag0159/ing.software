package De_Comportamiento.Iterator;

public class Jugador {
    private final String nombre;
    private final int goles;

    public Jugador(String nombre, int goles) {
        this.nombre = nombre;
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGoles() {
        return goles;
    }

    @Override
    public String toString() {
        return nombre + " (" + goles + " goles)";
    }
}