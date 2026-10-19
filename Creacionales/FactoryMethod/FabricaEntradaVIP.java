package Creacionales.FactoryMethod;

public class FabricaEntradaVIP extends FabricaEntradas {
    @Override
    public Entrada crearEntrada(String comprador) {
        return new EntradaVIP(comprador);
    }
}
