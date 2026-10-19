package De_Comportamiento.Command;

public class MainCommand {
    public static void main(String[] args) {
        Torneo torneo = new Torneo("Copa de Verano");
        ControladorTorneo controlador = new ControladorTorneo();

        controlador.invocar(new InscribirEquipoCommand(torneo, "Los Leones FC"));
        controlador.invocar(new InscribirEquipoCommand(torneo, "Deportivo Ciclón"));
        controlador.invocar(new IniciarTorneoCommand(torneo));
    }
}
