package Estructurales.Bridge;

public abstract class Torneo {
    protected SistemaFixture sistemaFixture;
    protected String nombre;

    protected Torneo(SistemaFixture sistemaFixture, String nombre) {
        this.sistemaFixture = sistemaFixture;
        this.nombre = nombre;
    }

    public abstract void organizar();
}