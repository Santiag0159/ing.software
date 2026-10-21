package De_Comportamiento.Iterator;

public class IteradorArrayGoleadores{
    private final Jugador[] goleadores;
    private int posicion = 0;

    
    public IteradorArrayGoleadores(Jugador[] goleadores) {
        this.goleadores = goleadores;
    }

    
    public boolean tieneSiguiente() {
        return posicion < goleadores.length && goleadores[posicion] != null;
    }

    
    public Jugador siguiente() {
        return goleadores[posicion++];
    }
}