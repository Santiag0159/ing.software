package De_Comportamiento.Visitor;

public class VisitanteEstadisticasTorneo implements VisitanteTorneo {
    private int cantidadEquipos;
    private int cantidadPartidos;
    private int totalGoles;

    @Override
    public void visitar(Equipo equipo) {
        cantidadEquipos++;
        System.out.println("Equipo participante: " + equipo.getNombre());
    }

    @Override
    public void visitar(Partido partido) {
        cantidadPartidos++;
        totalGoles += partido.getGolesLocal() + partido.getGolesVisitante();
        System.out.println(partido.getEquipoLocal().getNombre() + " "
                + partido.getGolesLocal() + " - " + partido.getGolesVisitante() + " "
                + partido.getEquipoVisitante().getNombre());
    }

    public void mostrarResumen() {
        System.out.println("\nResumen del torneo:");
        System.out.println("Equipos: " + cantidadEquipos);
        System.out.println("Partidos: " + cantidadPartidos);
        System.out.println("Goles: " + totalGoles);
    }
}
