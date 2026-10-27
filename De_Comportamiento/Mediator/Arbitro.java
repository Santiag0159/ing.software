package De_Comportamiento.Mediator;

public class Arbitro extends ComponentePartido {
    public Arbitro(MediadorPartido mediador) {
        super(mediador);
    }

    public void pitazoFinal() {
        System.out.println("[Arbitro] ¡Marca el final del encuentro!");
        mediador.notificar(this, "Termino el partido");
    }
}