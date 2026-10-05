package De_Comportamiento.Memento;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Inicializamos el torneo y el guardián de historial
        Originator torneo = new Originator("Champions League", "Fase de Grupos", List.of());
        Caretaker caretaker = new Caretaker();

        // 2. Ocurren eventos correctos y guardamos el estado
        torneo.setMemento(new TorneoMemento("Cuartos de Final",
                List.of("Madrid", "Barca", "Bayern", "PSG")));
        caretaker.guardarmEstado(torneo.createMemento()); // Guardamos este punto seguro

        // 3. El administrador avanza a Semifinales correctamente
        torneo.setMemento(new TorneoMemento("Semifinales", List.of("Madrid", "Bayern")));
        caretaker.guardarmEstado(torneo.createMemento()); // Guardamos este punto seguro

        System.out.println("Estado Actual: " + torneo.createMemento().getFaseActual()
                + " " + torneo.createMemento().getEquiposParticipantes());

        // 4. ¡ERROR! El administrador registra mal un resultado y clasifica a los equipos equivocados
        System.out.println("\n[ERROR ADMINISTRATIVO]: Se cargaron datos falsos en la Final");
        torneo.setMemento(new TorneoMemento("Final Equivocada",
                List.of("EquipoFantasma1", "EquipoFantasma2")));
        System.out.println("Estado Incorrecto: " + torneo.createMemento().getFaseActual()
                + " " + torneo.createMemento().getEquiposParticipantes());

        // 5. SOLUCIÓN: Hacemos un "Deshacer" (Undo) para volver a las Semifinales
        System.out.println("\n[Acción: Presionar botón Deshacer]");
        torneo.setMemento(caretaker.deshacer());

        System.out.println("Estado Corregido: " + torneo.createMemento().getFaseActual()
                + " " + torneo.createMemento().getEquiposParticipantes());
    }
}
