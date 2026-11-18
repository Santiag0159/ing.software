package ocp_malo;

public class Torneo {
    private String nombre;
    private String tipoCategoria; 

    public Torneo(String nombre, String tipoCategoria) {
        this.nombre = nombre;
        this.tipoCategoria = tipoCategoria;
    }

    public double obtenerCostoInscripcion() {
        // VIOLACION DE OCP: Todo esta atado con if/else.
        // Agregar una categoria nueva obliga a modificar esta clase.
        if (tipoCategoria.equals("Amateur")) {
            return 5000.0;
        } else if (tipoCategoria.equals("Profesional")) {
            return 25000.0;
        } else {
            return 0.0; 
        }
    }

    public String getNombre() {
        return nombre;
    }
}