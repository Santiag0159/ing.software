package dip_bueno;

public class NotificadorEmail implements Notificador {

    @Override
    public void enviar(String mensaje) {
        System.out.println("[EMAIL] " + mensaje);
    }
}
