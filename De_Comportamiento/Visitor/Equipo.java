package De_Comportamiento.Visitor;

public class Equipo implements ElementoTorneo {
    private final String nombre;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void aceptar(VisitanteTorneo visitante) {
        visitante.visitar(this);
    }
}
