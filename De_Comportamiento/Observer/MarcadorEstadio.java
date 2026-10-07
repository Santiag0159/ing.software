package De_Comportamiento.Observer;

public class MarcadorEstadio implements IObservador {
    @Override
    public void actualizar(int golesLocal, int golesVisitante) {
        System.out.println("marcador estadio | local: " + golesLocal + " - visitante: " + golesVisitante);
    }
}