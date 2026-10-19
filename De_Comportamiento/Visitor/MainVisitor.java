package De_Comportamiento.Visitor;

import java.util.List;

public class MainVisitor {
    public static void main(String[] args) {
        Equipo leones = new Equipo("Los Leones FC");
        Equipo ciclon = new Equipo("Deportivo Ciclón");
        Equipo atletico = new Equipo("Atlético Norte");

        List<ElementoTorneo> elementos = List.of(
                leones,
                ciclon,
                atletico,
                new Partido(leones, ciclon, 2, 1),
                new Partido(ciclon, atletico, 0, 0),
                new Partido(atletico, leones, 1, 3));

        VisitanteEstadisticasTorneo estadisticas = new VisitanteEstadisticasTorneo();
        for (ElementoTorneo elemento : elementos) {
            elemento.aceptar(estadisticas);
        }
        estadisticas.mostrarResumen();
    }
}
