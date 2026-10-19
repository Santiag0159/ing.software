package De_Comportamiento.Command;

public class InscribirEquipoCommand implements ComandoTorneo {
    private final Torneo torneo;
    private final String nombreEquipo;

    public InscribirEquipoCommand(Torneo torneo, String nombreEquipo) {
        this.torneo = torneo;
        this.nombreEquipo = nombreEquipo;
    }

    @Override
    public void ejecutar() {
        torneo.inscribirEquipo(nombreEquipo);
    }
}
