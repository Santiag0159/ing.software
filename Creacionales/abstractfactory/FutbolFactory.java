package Creacionales.abstractfactory;

public class FutbolFactory implements TorneoFactory {
    @Override
    public Cancha crearCancha() {
        return new CanchaFutbol();
    }
    
    @Override
    public Arbitro crearArbitro() {
        return new ArbitroFutbol();
    }
}