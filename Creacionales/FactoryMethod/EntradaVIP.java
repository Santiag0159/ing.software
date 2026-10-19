package Creacionales.FactoryMethod;

public class EntradaVIP implements Entrada {
    private final String comprador;

    public EntradaVIP(String comprador) {
        this.comprador = comprador;
    }

    @Override
    public String getTipo() {
        return "VIP";
    }

    @Override
    public String getComprador() {
        return comprador;
    }

    @Override
    public double getPrecio() {
        return 60000;
    }
}
