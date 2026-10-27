package De_Comportamiento.Mediator;

public abstract class ComponentePartido {
    protected MediadorPartido mediador;

    public ComponentePartido(MediadorPartido mediador) {
        this.mediador = mediador;
    }
}