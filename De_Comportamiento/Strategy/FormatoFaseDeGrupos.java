package De_Comportamiento.Strategy;

import java.util.List;

public class FormatoFaseDeGrupos implements FormatoTorneo {
    @Override
    public void simularFormato(List<String> equipos) {
        System.out.println("== FASE DE GRUPOS ==");
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                System.out.println(equipos.get(i) + " vs " + equipos.get(j));
            }
        }
    }
}