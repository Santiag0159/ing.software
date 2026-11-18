package dip_bueno;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> equipos = List.of("Los Pibes", "Deportivo Sur", "La Ribera", "Villa Mercedes FC");

        ServicioTorneo barrial = new ServicioTorneo(new SorteoBarrialSimple(), new NotificadorEmail());
        barrial.realizarSorteo(equipos);

        ServicioTorneo alfabetico = new ServicioTorneo(new SorteoPorOrdenAlfabetico(), new NotificadorWhatsApp());
        alfabetico.realizarSorteo(equipos);
    }
}
