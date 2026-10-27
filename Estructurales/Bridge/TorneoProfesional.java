package Estructurales.Bridge;

public class TorneoProfesional extends Torneo {
    public TorneoProfesional(SistemaFixture sistemaFixture, String nombre) {
        super(sistemaFixture, nombre);
    }

    @Override
    public void organizar() {
        System.out.println("Organizando torneo profesional...");
        sistemaFixture.generarCalendario(nombre);
    }
}