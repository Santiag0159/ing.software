package FactoryMethod;

public class MainFactoryMethod {
    public static void main(String[] args) {
        FabricaEntradas fabricaparaPobres = new FabricaEntradaGeneral();
        FabricaEntradas fabricaPrimeraFila = new FabricaEntradaVIP();

        fabricaparaPobres.venderEntrada("Ana");
        fabricaPrimeraFila.venderEntrada("Carlos");
    }
}
