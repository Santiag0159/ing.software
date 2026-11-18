package FactoryMethod;

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
    public void procesarPago() {
        System.out.println("Procesando pago de entrada VIP para " + comprador + " por un total de $" + getPrecio());
    }
}
