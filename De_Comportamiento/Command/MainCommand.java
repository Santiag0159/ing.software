package De_Comportamiento.Command;

public class MainCommand {
    public static void main(String[] args) {
        Torneo Torneojueguito = new Torneo("Copa Minecraft 2024");
        ControladorTorneo controladordeTorneojueguito = new ControladorTorneo();

        controladordeTorneojueguito.invocar(new InscribirEquipoCommand(Torneojueguito, "Los Leones FC"));
        controladordeTorneojueguito.invocar(new InscribirEquipoCommand(Torneojueguito, "Deportivo Ciclón"));
        controladordeTorneojueguito.invocar(new IniciarTorneoCommand(Torneojueguito));
    }
}
