package De_Comportamiento.State;

public class EstadoProgramado implements EstadoPartido {
    @Override
    public void iniciar(Partido partido){
        System.out.println("El partido ha comenzado.");
        partido.setEstado(new EstadoEnJuego());
    }

    @Override
    public void pausar(Partido partido){
        System.out.println("[ERROR] El partido no ha comenzado.");
    }

    @Override
    public void anotarGol(Partido partido, String equipo){
        System.out.println("[ERROR] El partido no ha comenzado.");
    }

    @Override
    public void finalizar(Partido partido){
        System.out.println("[ERROR] El partido no ha comenzado.");
    }

}
