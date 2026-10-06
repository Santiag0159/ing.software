package De_Comportamiento.State;

public class EstadoPausado implements EstadoPartido {
    @Override 
    public void iniciar(Partido partido){
        System.out.println("[AVISO] Se reanuda el partido, Comienza la segunda mitad.");
        partido.setEstado(new EstadoEnJuego());
    }

    @Override
    public void pausar(Partido partido){
        System.out.println("[DESCANSO] El partido ya está pausado.");
    }

    @Override
    public void anotarGol(Partido partido, String equipo){
        System.out.println("[ERROR] No se puede anotar un gol mientras el partido está pausado.");
    }

    @Override
    public void finalizar(Partido partido){
        System.out.println("[FINALIZACION] El partido ha sido finalizado en el descanso.");
        partido.setEstado(new EstadoFinalizado());
    }
}
