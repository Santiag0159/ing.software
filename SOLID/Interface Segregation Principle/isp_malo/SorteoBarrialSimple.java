package isp_malo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SorteoBarrialSimple implements OperacionesSorteo {

    @Override
    public List<String> sortearCruces(List<String> equipos) {
        List<String> copia = new ArrayList<>(equipos);
        Collections.shuffle(copia);
        List<String> cruces = new ArrayList<>();
        for (int i = 0; i < copia.size(); i += 2) {
            cruces.add(copia.get(i) + " vs " + copia.get(i + 1));
        }
        return cruces;
    }

    @Override
    public void asignarCabezasDeSerie(List<String> favoritos) {
        throw new UnsupportedOperationException("El torneo barrial no utiliza cabezas de serie.");
    }

    @Override
    public void iniciarTransmisionEnVivo(String urlStream) {
        // Implementacion vacia innecesaria
    }
}