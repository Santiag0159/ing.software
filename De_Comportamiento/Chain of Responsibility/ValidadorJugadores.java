public class ValidadorJugadores extends ManejadorValidacion {
    @Override
    public boolean validar(Equipo equipo) {
        if (equipo.getCantidadJugadores() < 7) {
            System.out.println("Error: El equipo '" + equipo.getNombre() + "' no tiene el minimo de 7 jugadores.");
            return false;
        }
        return pasarAlSiguiente(equipo);
    }
}