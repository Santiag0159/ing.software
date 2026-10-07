package De_Comportamiento.Observer;

public class AppMovilNotificacion implements IObservador {
    @Override
    public void actualizar(int golesLocal, int golesVisitante) {
        System.out.println("app push | resultado actualizado. local: " + golesLocal + " - visitante: " + golesVisitante);
    }
}