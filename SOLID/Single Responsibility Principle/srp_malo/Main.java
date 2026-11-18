import java.util.List;

public class Main {
    public static void main(String[] args) {
        Torneo torneo = new Torneo(
            "Copa de Verano",
            List.of("Los Pibes", "Deportivo Sur", "La Ribera", "Villa Mercedes FC")
        );

        torneo.sortearYMostrarCruces();
    }
}
