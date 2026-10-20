package De_Comportamiento.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- GENERACIÓN DE REPORTES DEL TORNEO ---\n");

        // 1. Carga de datos en el módulo de Primera A
        GoleadoresPrimeraA primeraA = new GoleadoresPrimeraA(5);
        primeraA.agregarJugador("Messi", 12);
        primeraA.agregarJugador("Ronaldo", 10);
        primeraA.agregarJugador("Mbappé", 9);

        // 2. Instanciamos el servicio de reportes
        ReporteGoleadores reporte = new ReporteGoleadores();

        // 3. Imprimimos el reporte de forma totalmente desacoplada
        reporte.imprimirTabla("Primera A", primeraA);
    }
}