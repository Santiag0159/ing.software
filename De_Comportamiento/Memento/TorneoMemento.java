package De_Comportamiento.Memento;
import java.util.ArrayList;
import java.util.List;
public class TorneoMemento {
    private final String faseActual;
    private final List<String> equiposParticipantes;

    public TorneoMemento(String faseActual, List<String> equiposParticipantes) {
        this.faseActual = faseActual;
        this.equiposParticipantes = new ArrayList<>(equiposParticipantes);
    }

    public String getFaseActual() {
        return faseActual;
    }

    public List<String> getEquiposParticipantes() {
        return new ArrayList<>(equiposParticipantes);
    }
}
