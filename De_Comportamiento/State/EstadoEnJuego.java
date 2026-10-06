package De_Comportamiento.State;

public class EstadoEnJuego implements EstadoPartido{
    @Override
    public void iniciar(Partido partido){
        System.out.println("[AVISO] El partido esta en curso.");

    }

    @Override 
    public void pausar(Partido partido){
        System.out.println("[DESCANSO]. El partido ha sido pausado.");
        partido.setEstado(new EstadoPausado());
    }
    
    @Override
    public void anotarGol(Partido partido, String equipo){
        if("local".equalsIgnoreCase(equipo)){
            partido.sumarGolLocal();
        } else{
            partido.sumarGolVisitante();
        }
        System.out.println("--->GOOOOOLLLL de "+equipo+".  Resultado: "+partido.getResultado());
    }

    @Override 
    public void finalizar(Partido partido){
        System.out.print("Final del encuentro.");
        partido.setEstado(new EstadoFinalizado());
    }
}
