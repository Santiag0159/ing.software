package dip_bueno;

import java.util.List;


public class ServicioTorneo {
    private final Sorteable sorteo;
    private final Notificador notificador;

    public ServicioTorneo(Sorteable sorteo, Notificador notificador) {
        this.sorteo = sorteo;
        this.notificador = notificador;
    }

    public void realizarSorteo(List<String> equipos) {
        List<String> cruces = sorteo.sortearCruces(equipos);
        notificador.enviar("Cruces definidos: " + cruces);
    }
}
