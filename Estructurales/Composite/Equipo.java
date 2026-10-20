package Estructurales.Composite;

public class Equipo implements ElementoTorneo {
    private final String nombre;
    private final double costoInscripcion;

    public Equipo(String nombre, double costoInscripcion){
        this.nombre = nombre;
        this.costoInscripcion = costoInscripcion;
    }

    @Override 
    public String getNombre(){
        return nombre;
    }

    @Override 
    public double getCostoInscripcion(){
        return costoInscripcion;
    }

    @Override 
    public void mostrarEstructura(String sangria){
        System.out.println(sangria + "- Equipo: " + nombre +
            " Monto: $" + costoInscripcion
        );
    }
}
