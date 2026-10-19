package Creacionales.FactoryMethod;

public abstract class FabricaEntradas {
    public abstract Entrada crearEntrada(String comprador);

    public void venderEntrada(String comprador) {
        Entrada entrada = crearEntrada(comprador);
        System.out.println(
                "Entrada " + entrada.getTipo()
                        + " para " + entrada.getComprador()
                        + " | Precio: $" + entrada.getPrecio());
    }
}
