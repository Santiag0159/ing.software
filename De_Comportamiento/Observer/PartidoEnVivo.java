package De_Comportamiento.Observer;

import java.util.ArrayList;
import java.util.List;

public class PartidoEnVivo implements IObservable {
    private List<IObservador> observadores = new ArrayList<>();
    private int golesLocal = 0;
    private int golesVisitante = 0;

    public void marcarGolLocal() {
        this.golesLocal++;
        notificarObservadores();
    }

    public void marcarGolVisitante() {
        this.golesVisitante++;
        notificarObservadores();
    }

    @Override
    public void suscribir(IObservador observador) {
        observadores.add(observador);
    }

    @Override
    public void desuscribir(IObservador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (IObservador obs : observadores) {
            obs.actualizar(golesLocal, golesVisitante);
        }
    }
}