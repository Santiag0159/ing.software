package Creacionales.FactoryMethod;

public class EntradaGeneral implements Entrada {
    private final String comprador;

    public EntradaGeneral(String comprador) {
        this.comprador = comprador;
    }

    @Override
    public String getTipo() {
        return "General";
    }

    @Override
    public String getComprador() {
        return comprador;
    }

    @Override
    public double getPrecio() {
        return 25000;
    }
}
