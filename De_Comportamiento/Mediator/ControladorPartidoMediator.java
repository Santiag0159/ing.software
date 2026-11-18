package De_Comportamiento.Mediator;

public class ControladorPartidoMediator implements MediadorPartido {
    private Arbitro arbitro;
    private Marcador marcador;
    private Cronometro cronometro;

    public void setArbitro(Arbitro arbitro) { this.arbitro = arbitro; }
    public void setMarcador(Marcador marcador) { this.marcador = marcador; }
    public void setCronometro(Cronometro cronometro) { this.cronometro = cronometro; }

    @Override
    public void notificar(ComponentePartido emisor, String evento) {
        //Decide que hacer, dependiedo el evento que se reciba
        if (evento.equals("GOL_ANOTADO")) {
            System.out.println("GOOL!");
        } else if (evento.equals("Termino el partido")) {
            if (cronometro != null) cronometro.detener();
            if (marcador != null) marcador.congelarTablero();
        }
    }
}