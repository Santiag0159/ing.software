package Estructurales.Bridge;

public class FixtureLiga implements SistemaFixture {
    @Override
    public void generarCalendario(String nombreTorneo) {
        System.out.println("Generando fixture de Liga para: " + nombreTorneo);
    }
}
