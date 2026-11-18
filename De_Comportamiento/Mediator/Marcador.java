package De_Comportamiento.Mediator;


public class Marcador extends ComponentePartido {
    private int golesEquipoA = 0;
    private int golesEquipoB = 0;

    public Marcador(MediadorPartido mediador) {
        super(mediador);
    }

    public void registrarGol(String equipo) {
        if (equipo.equalsIgnoreCase("A")) golesEquipoA++;
        else golesEquipoB++;
        
        System.out.println("Partido Actual");
        System.out.println("Equipo A: " + golesEquipoA + " - Equipo B: " + golesEquipoB);
        mediador.notificar(this, "GOL_ANOTADO");
    }

    public void congelarTablero() {
        System.out.println("Resultado final guardado.");
    }
}