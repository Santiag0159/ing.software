import java.util.List;

public class ImpresorTorneo {
    public void mostrarCruces(Torneo torneo, List<String> cruces) {
        System.out.println("Cruces del torneo " + torneo.getNombre() + ":");
        for (String cruce : cruces) {
            System.out.println(cruce);
        }
    }
}
