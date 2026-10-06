package Creacionales.Prototype;

public class MainPrototype {
    public static void main(String[] args) {
        
        //Prototipo Base
        Equipo equipoBase = new Equipo("Equipo Base", "Libre", 11);
        equipoBase.agregarJugador("Arquero");
        equipoBase.agregarJugador("Defensor");
        System.out.println("Prototipo Original: " + equipoBase);

        // 2. Clonar y personalizar
        Equipo equipo1 = equipoBase.clone();
        equipo1.setNombre("Los Leones FC");
        equipo1.agregarJugador("Delantero León");
        System.out.println("Equipo Registrado 1: " + equipo1);

        Equipo equipo2 = equipoBase.clone();
        equipo2.setNombre("Deportivo Ciclón");
        equipo2.agregarJugador("Delantero Ciclón");
        System.out.println("Equipo Registrado 2: " + equipo2);
        
    }
}