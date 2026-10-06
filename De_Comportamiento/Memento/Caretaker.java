package De_Comportamiento.Memento;
import java.util.Stack;

public class Caretaker {
    private final Stack<TorneoMemento> historial = new Stack<>();

    public Caretaker() {
    }

    public void guardarmEstado(TorneoMemento memento) {
        historial.push(memento);
    }

    public TorneoMemento getMemento() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
    public TorneoMemento deshacer(){
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
}