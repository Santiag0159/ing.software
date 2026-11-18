package ocp_bueno;

public class Torneo {
    private String nombre;
    private CategoriaTorneo categoria;

    public Torneo(String nombre, CategoriaTorneo categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public double obtenerCostoInscripcion() {
        return categoria.calcularCostoBase();
    }

    public String getNombre() {
        return nombre;
    }
}