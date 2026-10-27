package De_Comportamiento.TemplateMethod;

import java.util.Arrays;
import java.util.List;

public class MainTemplateMethod {
    public static void main(String[] args) {
        List<String> equipos = Arrays.asList("Boca", "Vasco Da Gama", "Estudiantes", "Racing");

        System.out.println("=== PROBANDO TEMPLATE METHOD PARA FIXTURES ===\n");

        //Generar Eliminación Directa
        GeneradorFixture fixtureEliminacion = new FixtureEliminacionDirecta();
        fixtureEliminacion.armarFixture(equipos);

        //Generar por Fase de Grupos
        GeneradorFixture fixtureGrupos = new FixtureFaseGrupos();
        fixtureGrupos.armarFixture(equipos);
    }
}