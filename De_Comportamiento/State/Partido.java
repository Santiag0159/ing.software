package De_Comportamiento.State;

public class Partido {
    private EstadoPartido estadoActual;
    private int golesLocal;
    private int golesVisitante;

    public Partido(){
        this.estadoActual = new EstadoProgramado();
        this.golesLocal = 0;
        this.golesVisitante = 0;
    }

    public void setEstado(EstadoPartido nuevoEstado){
        this.estadoActual = nuevoEstado;
    }

    public void sumarGolLocal(){
        this.golesLocal++;
    }
    public void sumarGolVisitante(){
        this.golesVisitante++;
    }
    public String getResultado(){
        return "Resultado Local: " + golesLocal + " - Visitante: " + golesVisitante;
    }

    public void iniciar(){
        estadoActual.iniciar(this);
    }
    public void pausar(){
        estadoActual.pausar(this);
    }
    public void anotarGol(String equipo){
        estadoActual.anotarGol(this, equipo);
    }
    public void finalizar(){
        estadoActual.finalizar(this);
    }
}
