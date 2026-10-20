package De_Comportamiento.Iterator;

public class ReporteGoleadores {

    public void imprimirTabla(String torneo, ColeccionGoleadores coleccion) {
        System.out.println("=== TABLA DE GOLEADORES: " + torneo + " ===");
        
        // Uso polimórfico del Iterador: desconoce cómo está guardada la colección internamente
        final IteradorArrayGoleadores iterador = coleccion.crearIterador();

        int posicion = 1;
        while (iterador.tieneSiguiente()) {
            Jugador j = iterador.siguiente();
            System.out.println("  " + posicion + "°. " + j);
            posicion++;
        }
        System.out.println();
    }
}
