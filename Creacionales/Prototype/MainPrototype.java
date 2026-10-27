package Creacionales.Prototype;

public class MainPrototype {
    public static void main(String[] args) {
        
        //Prototipo Base
        Equipo equipoBase = new Equipo("Equipo Base", "Primera", 11);
        System.out.println("\nPrototipo: " + equipoBase +"\n");

        //Clonar
        Equipo equipo1 = equipoBase.clone();
        equipo1.setNombre("Atlas");
        equipo1.agregarJugador("Volante: Zenon");
        System.out.println(equipo1 + "\n");

        Equipo equipo2 = equipoBase.clone();
        equipo2.setNombre("Boca Juniors");
        equipo2.agregarJugador("Delantero: Benedetto");
        System.out.println(equipo2 + "\n");
        
    }
}