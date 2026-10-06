package De_Comportamiento.State;

public class MainState {
    public static void main(String[] args) {
        //Crear un partido
        Partido partido = new Partido();
        System.out.println(partido.getResultado());

        //Intentar anotar un gol antes de iniciar el partido
        partido.anotarGol("Local");

        //Iniciar el partido
        partido.iniciar();

        //GOOOLLL
        partido.anotarGol("Local");
        System.out.println(partido.getResultado());
        
        //Entretiempo
        partido.pausar();

        //Intentar anotar un gol mientras el partido está parado
        partido.anotarGol("Visitante");
        System.out.println(partido.getResultado());

        //Reanudar el partido
        partido.iniciar();
        partido.finalizar();
        //Terminar el partido
        System.out.println(partido.getResultado());

        //Intentar anotar un gol después de finalizar el partido
        partido.anotarGol("Visitante");
    }
    
}
