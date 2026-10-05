package Estructurales.Facade;

public class sistemaEquipos {
    public boolean validarRequisitos(Long equipoId) {
        System.out.println("Verificando que el equipo tenga el mínimo de jugadores");
        return true; // Retorna true si los requisitos son válidos, false en caso contrario
    }
    public void registarenTorneo(Long equipoId, Long torneoId) {
        System.out.println("Registrando equipo " + equipoId + " en el torneo " + torneoId);
    }

}