import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Torneo {
    private String nombre;
    private List<String> equipos;

    public Torneo(String nombre, List<String> equipos) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>(equipos);
    }

    public void sortearYMostrarCruces() {
        // Esta clase sortea los equipos y tambien se encarga de mostrar el resultado.
        Collections.shuffle(equipos);

        System.out.println("Cruces del torneo " + nombre + ":");
        for (int i = 0; i < equipos.size(); i += 2) {
            System.out.println(equipos.get(i) + " vs " + equipos.get(i + 1));
        }
    }
}
