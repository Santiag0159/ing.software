package dip_malo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServicioTorneo servicio = new ServicioTorneo();
        servicio.realizarSorteo(List.of("Los Pibes", "Deportivo Sur", "La Ribera", "Villa Mercedes FC"));
    }
}
