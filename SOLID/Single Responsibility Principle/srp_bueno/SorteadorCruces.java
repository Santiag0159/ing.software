import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SorteadorCruces {
    public List<String> sortear(Torneo torneo) {
        List<String> equipos = new ArrayList<>(torneo.getEquipos());
        if (equipos.size() % 2 != 0) {
            throw new IllegalArgumentException("El sorteo necesita una cantidad par de equipos.");
        }

        Collections.shuffle(equipos);
        List<String> cruces = new ArrayList<>();
        for (int i = 0; i < equipos.size(); i += 2) {
            cruces.add(equipos.get(i) + " vs " + equipos.get(i + 1));
        }
        return cruces;
    }
}
