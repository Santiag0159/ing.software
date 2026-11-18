package De_Comportamiento.Strategy;

public class MainStrategy {
    public static void main(String[] args) {
        
        Torneo miTorneo = new Torneo("Verano 2026\n");
        miTorneo.agregarEquipo("Pringles JD");
        miTorneo.agregarEquipo("Deportivo Ciclon");
        miTorneo.agregarEquipo("ATTE Club");
        miTorneo.agregarEquipo("Belgrano");

        //Prueba Eliminación Directa
        miTorneo.setFormatoTorneo(new FormatoEliminacionDirecta());
        miTorneo.iniciarTorneo();

        // Formato Liga
        System.out.println("\n=================================================="); 
        miTorneo.setFormatoTorneo(new FormatoLiga()); 
        miTorneo.iniciarTorneo();   
        
        System.out.println("=================================================="); 

    }
}