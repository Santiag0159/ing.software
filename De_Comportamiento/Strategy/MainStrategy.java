package De_Comportamiento.Strategy;

public class MainStrategy {
    public static void main(String[] args) {
        
        Torneo miTorneo = new Torneo("Copa Verano 2026");
        miTorneo.agregarEquipo("Los Leones FC");
        miTorneo.agregarEquipo("Deportivo Ciclón");
        miTorneo.agregarEquipo("Atlético Norte");
        miTorneo.agregarEquipo("Club Sur");

        //Prueba Eliminación Directa
        System.out.println("\n--- Configurando Formato ---");
        miTorneo.setFormatoTorneo(new FormatoEliminacionDirecta());
        miTorneo.iniciarTorneo();

        // Fase de Grupos
        System.out.println("\n--- Cambiando de Formato ---");
        miTorneo.setFormatoTorneo(new FormatoFaseDeGrupos());
        miTorneo.iniciarTorneo();
        
        System.out.println("\n==================================================");
    }
}