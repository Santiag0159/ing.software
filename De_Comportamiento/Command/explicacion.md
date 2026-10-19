# Patrón Command: torneo

El ejemplo encapsula las operaciones del torneo como objetos comando:

- **`ComandoTorneo`** define la operacion `ejecutar`.
- **`InscribirEquipoCommand`** e **`IniciarTorneoCommand`** representan
  solicitudes concretas y delegan su ejecucion al torneo.
- **`Torneo`** es el receptor que contiene la logica de inscripcion e inicio.
- **`ControladorTorneo`** es el invocador: ejecuta comandos sin conocer los
  detalles de cada operacion.
- **`MainCommand`** crea y envia comandos para inscribir equipos e iniciar el
  torneo.

De esta forma, quien solicita una accion no necesita llamar directamente a la
logica del torneo. Los comandos tambien pueden ampliarse para registrar,
encolar o deshacer solicitudes.
