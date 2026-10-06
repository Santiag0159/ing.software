package De_Comportamiento.Strategy;

import java.util.List;

public class FormatoEliminacionDirecta implements FormatoTorneo {
    @Override
    public void simularFormato(List<String> equipos) {
        System.out.println("== ELIMINACION DIRECTA ==");
        for (int i = 0; i < equipos.size() - 1; i += 2) {
            System.out.println(equipos.get(i) + " vs " + equipos.get(i + 1) + " -> el perdedor queda eliminado");
        }
    }
}