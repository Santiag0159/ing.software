public class ValidadorNombre extends ManejadorValidacion {
    @Override
    public boolean validar(Equipo equipo) {
        if (equipo.getNombre() == null || equipo.getNombre().isEmpty()) {
            System.out.println("Error: El equipo debe tener un nombre.");
            return false;
        }
        return pasarAlSiguiente(equipo);
    }
}