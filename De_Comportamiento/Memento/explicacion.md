# Patrón Memento: torneo

El programa muestra cómo guardar y restaurar estados de un torneo con el patrón
Memento:

- **`Main`** crea el torneo, guarda el estado de cuartos y el de semifinales,
  simula un resultado incorrecto en la final y luego deshace ese cambio para
  recuperar las semifinales.
- **`Originator`** representa el torneo y su estado actual: nombre, fase y
  equipos. Crea un Memento para guardar el estado y puede restaurarlo desde uno.
- **`TorneoMemento`** guarda una copia de la fase y de la lista de equipos. Sus
  métodos devuelven una copia de la lista para evitar que se modifique el estado
  guardado desde fuera.
- **`Caretaker`** conserva los Mementos en una pila. Al deshacer, extrae el
  último estado guardado para restaurarlo.

Así, `Main` puede volver al último estado correcto sin que `Caretaker` necesite
conocer ni modificar directamente los detalles internos del torneo.