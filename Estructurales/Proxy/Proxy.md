# Proxy (Estructural)

## Problema
En el torneo, la clase `TorneoReal` se encarga de guardar los equipos en la base de datos. Sin embargo, no queremos que cualquier usuario pueda registrar equipos, solo los administradores deberían tener ese permiso. Si agregamos la lógica de seguridad y validación de roles directamente dentro de `TorneoReal`, estaríamos mezclando reglas de negocio puro con infraestructura de seguridad, haciendo el código difícil de mantener y violando el principio de responsabilidad única.

## Solución
Se crea una clase intermediaria (`TorneoProxy`) que implementa exactamente la misma interfaz (`ITorneo`) que el objeto real (`TorneoReal`). El cliente (el `Main`) interactúa con el Proxy creyendo que es el sistema central. Cuando se llama a `registrarEquipo()`, el Proxy intercepta la petición, verifica si el usuario tiene el rol de "ADMIN" y, solo si la validación es exitosa, delega la llamada al `TorneoReal`.

## Consecuencias

### Ventajas
*   **Separación de responsabilidades:** La clase principal (`TorneoReal`) se concentra únicamente en su lógica de negocio (gestionar datos) sin preocuparse por quién la llama o la seguridad.
*   **Principio Abierto/Cerrado (OCP):** Puedes introducir nuevos proxies (para logs, caché, o diferentes reglas de seguridad) sin modificar el código del cliente ni el del objeto real.
*   **Seguridad:** Protege al objeto real de accesos no autorizados (Protection Proxy).

### Desventajas
*   **Complejidad adicional:** Introduce nuevas clases e interfaces en el sistema, lo que puede hacer que la arquitectura inicial sea más pesada de leer.
*   **Ligero retraso:** Interceptar las peticiones antes de pasarlas al objeto real añade una capa extra de procesamiento, lo que podría generar una mínima latencia (aunque en la mayoría de los casos es imperceptible).
*   **Falsa sensación de seguridad:** Si un desarrollador logra instanciar y acceder directamente a `TorneoReal` esquivando el Proxy, el sistema queda vulnerable.
