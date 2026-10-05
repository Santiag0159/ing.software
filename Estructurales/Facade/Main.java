package Estructurales.Facade;

public class Main {
    public static void main(String[] args) {
        TorneoFacade torneoFacade = new TorneoFacade();
        Long equipoId = 1L;
        Long torneoId = 101L;
        Double monto = 50.0;

        torneoFacade.registrarEquipoEnTorneo(equipoId, torneoId, monto);
        System.out.println("El equipo " + equipoId + " se ha registrado exitosamente en el torneo " + torneoId);
    }
}
