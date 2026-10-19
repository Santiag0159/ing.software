package Creacionales.FactoryMethod;

public class MainFactoryMethod {
    public static void main(String[] args) {
        FabricaEntradas fabricaGeneral = new FabricaEntradaGeneral();
        FabricaEntradas fabricaVIP = new FabricaEntradaVIP();

        fabricaGeneral.venderEntrada("Ana");
        fabricaVIP.venderEntrada("Carlos");
    }
}
