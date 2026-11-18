package De_Comportamiento.Strategy;

import java.util.List;
import java.util.ArrayList;

public class FormatoLiga implements FormatoTorneo {
    @Override
    public void simularFormato(List<String> equipos) {
        System.out.println("== LIGA  ==");
        int n = equipos.size();
        List<String> rotacion = new ArrayList<>(equipos);

        for (int fecha = 1; fecha < n; fecha++) {
            rotacion.add(rotacion.remove(1));

            System.out.println("Fecha " + fecha);
            for (int i = 0; i < n / 2; i++) {
                System.out.println(rotacion.get(i) + " vs " + rotacion.get(n - 1 - i));
            }
            System.out.println();
        }
    }
}