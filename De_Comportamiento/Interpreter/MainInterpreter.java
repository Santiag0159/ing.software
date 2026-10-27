package De_Comportamiento.Interpreter;

public class MainInterpreter {
    public static void main(String[] args) {
        ExpresionElegibilidad esSub20 = new ReglaEspecifica("Sub20");
        ExpresionElegibilidad esFederado = new ReglaEspecifica("Federado");
        ExpresionElegibilidad reglaTorneo = new ExpresionAnd(esSub20, esFederado);

        String jugador = "Sub20, Federado";
        System.out.println("Jugador elegible: " + reglaTorneo.interpretar(jugador));
    }
}