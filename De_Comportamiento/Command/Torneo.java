package De_Comportamiento.Command;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private final String nombre;
    private final List<String> equipos = new ArrayList<>();
    private boolean iniciado;

    public Torneo(String nombre) {
        this.nombre = nombre;
    }

    public void inscribirEquipo(String nombreEquipo) {
        if (iniciado) {
            System.out.println("No se puede inscribir equipos: el torneo ya comenzo.");
            return;
        }
        if (nombreEquipo == null || nombreEquipo.isBlank()) {
            System.out.println("No se puede inscribir un equipo sin nombre.");
            return;
        }
        if (equipos.contains(nombreEquipo)) {
            System.out.println("El equipo " + nombreEquipo + " ya esta inscrito.");
            return;
        }

        equipos.add(nombreEquipo);
        System.out.println("Equipo inscrito: " + nombreEquipo);
    }

    public void iniciar() {
        if (iniciado) {
            System.out.println("El torneo " + nombre + " ya habia comenzado.");
            return;
        }
        if (equipos.isEmpty()) {
            System.out.println("No se puede iniciar un torneo sin equipos.");
            return;
        }

        iniciado = true;
        System.out.println("Comienza el torneo " + nombre + " con " + equipos.size() + " equipos.");
    }
}
