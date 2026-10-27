package De_Comportamiento.Mediator;

public class MainMediator {
    public static void main(String[] args) {
        System.out.println("=== PROBANDO PATRÓN MEDIATOR EN PARTIDO ===\n");

        // 1. Crear el Mediador Central
        ControladorPartidoMediator mediador = new ControladorPartidoMediator();

        // 2. Crear los componentes asociándolos al Mediador
        Arbitro arbitro = new Arbitro(mediador);
        Marcador marcador = new Marcador(mediador);
        Cronometro cronometro = new Cronometro(mediador);

        // 3. Registrar los componentes en el Mediador
        mediador.setArbitro(arbitro);
        mediador.setMarcador(marcador);
        mediador.setCronometro(cronometro);

        //Acciones
        marcador.registrarGol("A");
        System.out.println();
        
        //Final
        arbitro.pitazoFinal();
    }
}