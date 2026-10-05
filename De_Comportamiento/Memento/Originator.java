package De_Comportamiento.Memento;
import java.util.ArrayList;
import java.util.List;

public class Originator {
    private String nombre;
    private String faseActual;
    private List<String> equiposParticipantes;

    public Originator(String nombre, String faseActual, List<String> equiposParticipantes) {
        this.nombre = nombre;
        this.faseActual = faseActual;
        this.equiposParticipantes = equiposParticipantes;
    }

    public TorneoMemento createMemento() {
        return new TorneoMemento(faseActual, equiposParticipantes);
    }

    public void setMemento(TorneoMemento memento) {
        this.faseActual = memento.getFaseActual();
        this.equiposParticipantes = memento.getEquiposParticipantes();
    }
}
