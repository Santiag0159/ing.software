package Estructurales.Bridge;

public class FixtureEliminatoria implements SistemaFixture {
    @Override
    public void generarCalendario(String nombreTorneo) {
        System.out.println("Generando fixture de Eliminatoria para: " + nombreTorneo);
    }
}
