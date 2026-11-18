package dip_bueno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SorteoPorOrdenAlfabetico implements Sorteable {

    @Override
    public List<String> sortearCruces(List<String> equipos) {
        List<String> ordenados = new ArrayList<>(equipos);
        Collections.sort(ordenados);
        List<String> cruces = new ArrayList<>();
        for (int i = 0; i + 1 < ordenados.size(); i += 2) {
            cruces.add(ordenados.get(i) + " vs " + ordenados.get(i + 1));
        }
        return cruces;
    }
}
