package Estructurales.Composite;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- ESTRUCTURA JERARQUICA DEL TORNEO DE FÚTBOL ---\n");

        // 1. Equipos individuales (Hojas)
        Equipo e1 = new Equipo("Boca Juniors", 50000);
        Equipo e2 = new Equipo("River Plate", 50000);
        Equipo e3 = new Equipo("Independiente", 9);
        Equipo e4 = new Equipo("Racing", 45000);

        // 2. Zona A (Compuesto)
        EstructuraCompuesta zonaA = new EstructuraCompuesta("Zona A");
        zonaA.agregar(e1);
        zonaA.agregar(e4);

        // 3. Zona B (Compuesto)
        EstructuraCompuesta zonaB = new EstructuraCompuesta("Zona B");
        zonaB.agregar(e2);
        zonaB.agregar(e3);

        // 4. Categoría Primera A (Compuesto que contiene otros compuestos)
        EstructuraCompuesta primeraA = new EstructuraCompuesta("Categoría Primera A");
        primeraA.agregar(zonaA);
        primeraA.agregar(zonaB);

        // 5. Liga Completa (Raíz de la estructura en árbol)
        EstructuraCompuesta ligaGeneral = new EstructuraCompuesta("Liga de Futbol Argentino");
        ligaGeneral.agregar(primeraA);

        // Mostrar árbol y cálculo transparente
        ligaGeneral.mostrarEstructura("");

        System.out.println("\n------------------------------------------------");
        System.out.println("RECAUDACIÓN TOTAL DE LA LIGA: $" + ligaGeneral.getCostoInscripcion());
        System.out.println("------------------------------------------------");
    }
}