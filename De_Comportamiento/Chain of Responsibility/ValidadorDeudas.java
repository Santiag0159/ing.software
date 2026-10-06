public class ValidadorDeudas extends ManejadorValidacion {
    @Override
    public boolean validar(Equipo equipo) {
        if (equipo.tieneDeudas()) {
            System.out.println("Error: El equipo '" + equipo.getNombre() + "' tiene deudas pendientes con la liga.");
            return false;
        }
        System.out.println("Exito: El equipo '" + equipo.getNombre() + "' ha sido validado e inscripto.");
        return pasarAlSiguiente(equipo);
    }
}