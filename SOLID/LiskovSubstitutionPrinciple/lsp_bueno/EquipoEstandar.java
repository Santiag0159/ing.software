package SOLID.LiskovSubstitutionPrinciple.lsp_bueno;
public class EquipoEstandar implements ParticipanteTorneo {
    private String nombre;

    public EquipoEstandar(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void registrarEnTorneo() {
        System.out.println("equipo estandar " + nombre + " registrado correctamente");
    }
}