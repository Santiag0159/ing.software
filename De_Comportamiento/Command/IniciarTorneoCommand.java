package De_Comportamiento.Command;

public class IniciarTorneoCommand implements ComandoTorneo {
    private final Torneo torneo;

    public IniciarTorneoCommand(Torneo torneo) {
        this.torneo = torneo;
    }

    @Override
    public void ejecutar() {
        torneo.iniciar();
    }
}
