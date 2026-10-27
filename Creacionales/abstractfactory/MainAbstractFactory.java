package Creacionales.abstractfactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        TorneoFactory factory = new FutbolFactory();
        Cancha cancha = factory.crearCancha();
        Arbitro arbitro = factory.crearArbitro();
        
        cancha.prepararCancha();
        arbitro.pitarInicio();
    }
}