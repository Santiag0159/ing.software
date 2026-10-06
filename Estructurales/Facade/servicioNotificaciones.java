package Estructurales.Facade;

public class servicioNotificaciones {
    public void enviarNotificacion(Long equipoId, String mensaje) {
        System.out.println("Enviando notificación al equipo " + equipoId + ": " + mensaje);
    }
}
