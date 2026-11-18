package De_Comportamiento.TemplateMethod;

import java.util.List;

public class FixtureEliminacionDirecta extends GeneradorFixture {

    @Override
    protected void generarEmparejamientos(List<String> equipos) {
        System.out.println("== ELIMINACIÓN DIRECTA ==");
        for (int i = 0; i < equipos.size() - 1; i += 2) {
            System.out.println("   [Partido] " + equipos.get(i) + " vs " + equipos.get(i + 1));
        }
    }
}