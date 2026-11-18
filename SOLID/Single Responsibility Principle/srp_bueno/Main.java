import java.util.List;

public class Main {
    public static void main(String[] args) {
        Torneo torneo = new Torneo(
            "Copa de Verano",
            List.of("Los Pibes", "Deportivo Sur", "La Ribera", "Villa Mercedes FC")
        );

        SorteadorCruces sorteador = new SorteadorCruces();
        List<String> cruces = sorteador.sortear(torneo);

        ImpresorTorneo impresor = new ImpresorTorneo();
        impresor.mostrarCruces(torneo, cruces);
    }
}
