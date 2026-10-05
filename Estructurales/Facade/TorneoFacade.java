package Estructurales.Facade;

public class TorneoFacade {
    private sistemaEquipos sistemaEquipos;
    private pasarelaPago pasarelaPago;
    private servicioNotificaciones servicioNotificaciones;

    public TorneoFacade() {
        this.sistemaEquipos = new sistemaEquipos();
        this.pasarelaPago = new pasarelaPago();
        this.servicioNotificaciones = new servicioNotificaciones();
    }

    public void registrarEquipoEnTorneo(Long equipoId, Long torneoId, Double monto) {
        if (sistemaEquipos.validarRequisitos(equipoId)) {
            if (pasarelaPago.procesarPago(equipoId, monto)) {
                sistemaEquipos.registarenTorneo(equipoId, torneoId);
                servicioNotificaciones.enviarNotificacion(equipoId, "Registro exitoso en el torneo " + torneoId);
            } else {
                servicioNotificaciones.enviarNotificacion(equipoId, "Error en el pago para el torneo " + torneoId);
            }
        } else {
            servicioNotificaciones.enviarNotificacion(equipoId, "El equipo no cumple con los requisitos para el torneo " + torneoId);
        }
    
    sistemaEquipos.registarenTorneo(equipoId, torneoId);
    servicioNotificaciones.enviarNotificacion(equipoId, "Registro exitoso en el torneo " + torneoId);
    System.out.println("________________________inscrpcion finalizada con exito__________________________");
    }
}
