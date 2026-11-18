package De_Comportamiento.Mediator;


public class Cronometro extends ComponentePartido {
    public Cronometro(MediadorPartido mediador) {
        super(mediador);
    }

    public void detener() {
        System.out.println("¡ TIEMPO !");
    }
}