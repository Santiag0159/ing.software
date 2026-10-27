package Estructurales.Bridge;

public class TorneoAmateur extends Torneo {
    public TorneoAmateur(SistemaFixture sistemaFixture, String nombre) {
        super(sistemaFixture, nombre);
    }

    @Override
    public void organizar() {
        System.out.println("Organizando torneo amateur...");
        sistemaFixture.generarCalendario(nombre);
    }
}