package dip_bueno;

public class NotificadorWhatsApp implements Notificador {

    @Override
    public void enviar(String mensaje) {
        System.out.println("[WHATSAPP] " + mensaje);
    }
}
