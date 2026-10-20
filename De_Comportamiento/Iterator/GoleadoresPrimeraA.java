package De_Comportamiento.Iterator;

public class GoleadoresPrimeraA implements ColeccionGoleadores {
    private final Jugador[] goleadores;
    private int indice = 0;

    public GoleadoresPrimeraA(int capacidad) {
        this.goleadores = new Jugador[capacidad];
    }

    public void agregarJugador(String nombre, int goles) {
        if (indice < goleadores.length) {
            goleadores[indice++] = new Jugador(nombre, goles);
        }
    }

    @Override
    public IteradorGoleadores crearIterador() {
        return new IteradorArrayGoleadores(goleadores);
    }
}