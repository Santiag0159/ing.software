# Singleton (Creacional)

## Problema
En un sistema de gestión deportiva, tener múltiples instancias del gestor de torneos puede generar inconsistencias críticas. Si distintas partes de la aplicación (o distintos usuarios) instancian su propio `TorneoManager` usando `new`, cada uno tendrá su propia lista vacía de equipos. Esto provocaría que los registros queden divididos y se pierda el control sobre la lista oficial y unificada de inscriptos al torneo.

## Solución
Se garantiza que la clase tenga una única instancia y se proporciona un punto de acceso global a ella. En el código, el constructor de `TorneoManager` se hace privado (`private TorneoManager()`) para bloquear el uso de `new`. Se crea una variable estática privada `instancia` y un método público estático `getInstancia()` que actúa como puerta: la primera vez crea el objeto, y en las siguientes llamadas devuelve exactamente la misma memoria. De este modo, todas las partes del sistema operan sobre la misma lista de equipos.

## Consecuencias

### Ventajas
*   **Única fuente de verdad:** Garantiza el control centralizado de un recurso compartido (la lista de equipos).
*   **Inicialización perezosa (Lazy Initialization):** El objeto solo se crea la primera vez que se solicita mediante `getInstancia()`, ahorrando recursos si nunca se usa.
*   **Acceso global:** Proporciona un punto de acceso fácil y estandarizado desde cualquier lugar de la aplicación.

### Desventajas
*   **Estado global:** Introduce un estado global en la aplicación, lo que puede hacer que el código sea más difícil de rastrear y probar (Testing), ya que los tests pueden interferir entre sí al compartir la misma instancia.
*   **Problemas en multihilo (Thread-Safety):** En un entorno concurrente, si dos hilos llaman a `getInstancia()` al mismo tiempo la primera vez, podrían crearse dos instancias por error (requiere sincronización extra).
*   **Violación de principios:** Rompe el Principio de Responsabilidad Única (SRP), ya que la clase no solo gestiona el torneo, sino que también controla su propio ciclo de vida y creación.
