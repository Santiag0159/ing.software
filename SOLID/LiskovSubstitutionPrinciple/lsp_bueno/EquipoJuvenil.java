package SOLID.LiskovSubstitutionPrinciple.lsp_bueno;
public class EquipoJuvenil implements ParticipanteTorneo {
    private String nombre;

    public EquipoJuvenil(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void registrarEnTorneo() {
        System.out.println("equipo juvenil " + nombre + " registrado con validacion de edad");
    }
}