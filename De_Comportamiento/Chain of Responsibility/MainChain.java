public class MainChain {
    public static void main(String[] args) {
        ManejadorValidacion validacion = new ValidadorNombre();
        ManejadorValidacion validadorJugadores = new ValidadorJugadores();
        ManejadorValidacion validadorDeudas = new ValidadorDeudas();

        validacion.setSiguiente(validadorJugadores);
        validadorJugadores.setSiguiente(validadorDeudas);


        Equipo equipo1 = new Equipo("River Plate", 11, false);
        Equipo equipo2 = new Equipo("Chacarita", 5, false);
        Equipo equipo3 = new Equipo("Unvime Fc", 11, true);

        System.out.println("--- Validando Equipo 1 ---");
        validacion.validar(equipo1);
        
        System.out.println("\n--- Validando Equipo 2 ---");
        validacion.validar(equipo2);

        System.out.println("\n--- Validando Equipo 3 ---");
        validacion.validar(equipo3);
    }
}