package dip_malo;

import java.util.List;


public class ServicioTorneo {
    private final SorteoBarrialSimple sorteo = new SorteoBarrialSimple();
    private final NotificadorEmail notificador = new NotificadorEmail();

    public void realizarSorteo(List<String> equipos) {
        List<String> cruces = sorteo.sortearCruces(equipos); 
        notificador.enviar("Cruces definidos: " + cruces); 
    }
}
