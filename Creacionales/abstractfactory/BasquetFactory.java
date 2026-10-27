package Creacionales.abstractfactory;

public class BasquetFactory implements TorneoFactory {
    @Override
    public Cancha crearCancha() {
        return new CanchaBasquet();
    }
    
    @Override
    public Arbitro crearArbitro() {
        return new ArbitroBasquet();
    }
}