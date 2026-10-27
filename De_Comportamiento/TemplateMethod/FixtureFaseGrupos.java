package De_Comportamiento.TemplateMethod;

import java.util.List;

public class FixtureFaseGrupos extends GeneradorFixture {

    @Override
    protected void generarEmparejamientos(List<String> equipos) {
        System.out.println("== FASE DE GRUPOS ==");
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                System.out.println("   [Partido Grupo] " + equipos.get(i) + " vs " + equipos.get(j));
            }
        }
    }
}