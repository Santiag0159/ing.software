package De_Comportamiento.State;

public class EstadoFinalizado implements EstadoPartido {
    @Override
    public void iniciar(Partido partido){
        System.out.println("[ERROR] El partido ha finalizado.");
    }

    @Override 
    public void pausar(Partido partido){
        System.out.println("[ERROR] El partido ha finalizado.");
    }
    
    @Override
    public void anotarGol(Partido partido, String equipo){
        System.out.println("[ERROR] El partido ha finalizado.");
    }

    @Override 
    public void finalizar(Partido partido){
        System.out.println("[ERROR] El partido ha finalizado.");
    }
   
}
