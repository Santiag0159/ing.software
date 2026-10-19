package Creacionales.FactoryMethod;

public class FabricaEntradaGeneral extends FabricaEntradas {
    @Override
    public Entrada crearEntrada(String comprador) {
        return new EntradaGeneral(comprador);
    }
}
