package isp_malo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OperacionesSorteo sorteo = new SorteoBarrialSimple();
        List<String> cruces = sorteo.sortearCruces(List.of("Equipo A", "Equipo B", "Equipo C", "Equipo D"));
        System.out.println("Cruces barriales: " + cruces);
    }
}