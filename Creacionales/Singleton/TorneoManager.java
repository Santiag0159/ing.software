package Singleton;

import java.util.ArrayList;
import java.util.List;

public class TorneoManager {
    // 1. Variable estática privada que almacena la única instancia
    private static TorneoManager instancia;
    
    private List<Equipo> equiposInscriptos;

    // 2. Constructor privado para evitar instanciación externa usando 'new'
    private TorneoManager() {
        equiposInscriptos = new ArrayList<>();
    }

    // 3. Método estático público que controla el acceso a la instancia
    public static TorneoManager getInstancia() {
        if (instancia == null) {
            instancia = new TorneoManager();
        }
        return instancia;
    }

    public void registrarEquipo(Equipo equipo) {
        equiposInscriptos.add(equipo);
        System.out.println("Equipo " + equipo.getNombre() + " registrado exitosamente.");
    }

    public void mostrarEquipos() {
        System.out.println("Equipos inscriptos en el torneo:");
        for (Equipo e : equiposInscriptos) {
            System.out.println("- " + e.getNombre());
        }
    }
}