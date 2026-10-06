
public class MainBuilder {
    public static void main(String[] args) {
        // La final de madrid
        Partido laFinal = new Partido.PartidoBuilder("Boca Juniors", "River Plate")
                .conEstadio("Bernabeu")
                .conArbitro("Rodolfo Donofrio")
                .conVar(true)
                .construir();


        Partido amistoso = new Partido.PartidoBuilder("River", "Boca")
                .construir();

        System.out.println(laFinal.toString());
        System.out.println(amistoso.toString());
    }
}