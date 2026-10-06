package De_Comportamiento.State;

import De_Comportamiento.Observer.IObservable;
import De_Comportamiento.Observer.IObservador;
import java.util.ArrayList;
import java.util.List;

public class Partido implements IObservable {
    private EstadoPartido estadoActual;
    private int golesLocal;
    private int golesVisitante;
    private List<IObservador> observadores;

    public Partido(){
        this.estadoActual = new EstadoProgramado();
        this.golesLocal = 0;
        this.golesVisitante = 0;
        this.observadores = new ArrayList<>();
    }

    public void setEstado(EstadoPartido nuevoEstado){
        this.estadoActual = nuevoEstado;
    }

    public void sumarGolLocal(){
        this.golesLocal++;
        notificarObservadores();
    }
    
    public void sumarGolVisitante(){
        this.golesVisitante++;
        notificarObservadores();
    }
    
    public String getResultado(){
        return "resultado local: " + golesLocal + " - visitante: " + golesVisitante;
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

    @Override
    public void suscribir(IObservador observador) {
        observadores.add(observador);
    }

    @Override
    public void desuscribir(IObservador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (IObservador obs : observadores) {
            obs.actualizar(golesLocal, golesVisitante);
        }
    }
}