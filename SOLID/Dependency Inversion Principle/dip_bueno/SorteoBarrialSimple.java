package dip_bueno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SorteoBarrialSimple implements Sorteable {

    @Override
    public List<String> sortearCruces(List<String> equipos) {
        List<String> copia = new ArrayList<>(equipos);
        Collections.shuffle(copia);
        List<String> cruces = new ArrayList<>();
        for (int i = 0; i + 1 < copia.size(); i += 2) {
            cruces.add(copia.get(i) + " vs " + copia.get(i + 1));
        }
        return cruces;
    }
}
