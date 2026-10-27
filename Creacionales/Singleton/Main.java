package Singleton;

public class Main {
    public static void main(String[] args) {
        // Obtenemos la instancia para registrar los primeros equipos
        TorneoManager gestorFaseGrupos = TorneoManager.getInstancia();
        gestorFaseGrupos.registrarEquipo(new Equipo("Boca Juniors"));
        gestorFaseGrupos.registrarEquipo(new Equipo("River Plate"));


        // Simulamos que otra parte del sistema necesita registrar un equipo
        TorneoManager gestorFaseFinal = TorneoManager.getInstancia();
        
        gestorFaseFinal.registrarEquipo(new Equipo("Unvime Club"));

        // Verificamos si ambas variables apuntan exactamente al mismo objeto en memoria
        System.out.println("\n¿Son la misma instancia? " + (gestorFaseGrupos == gestorFaseFinal));

        // Al imprimir, veremos a los 3 equipos, confirmando que la lista es compartida
        System.out.println();
        gestorFaseFinal.mostrarEquipos();
    }
}