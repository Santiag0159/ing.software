package Estructurales.Flyweight;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- CONTROL DE PARTIDO Y SANCIONES ---\n");

        GestorSanciones arbitro = new GestorSanciones();
        // 1. Primera amarilla a Rossi 
        arbitro.registrarFalta("Rossi", "AMARILLA", 15, "Estudiantes vs Flamengo");

        // 2. Roja directa a Marcos Rojo
        arbitro.registrarFalta("Marcos Rojo", "Roja", 90, "Estudiantes vs Flamengo");

        // 3. Primera amarilla a Martinez Quarta
        arbitro.registrarFalta("Martinez Quarta", "AMARILLA", 30, "Boca vs River");

        // 4. Segunda amarilla a Martinez... Automáticamente ROJA "EXPULSADO"
        arbitro.registrarFalta("Martinez Quarta", "AMARILLA", 65, "Boca vs River");


        System.out.println("\n------------------------------------------------");
        System.out.println("Total de instancias 'TipoTarjeta' creadas en RAM: " + TarjetaFactory.getCantidadInstanciasEnMemoria());
        System.out.println("------------------------------------------------");
    }
}
