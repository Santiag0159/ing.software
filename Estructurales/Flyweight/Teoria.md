# Patrón de Diseño: Flyweight

## Problema
En el sistema de gestión del Torneo de Fútbol, cada evento de sanción (tarjeta) requiere almacenar 
información detallada como el color de la tarjeta, el reglamento asociado y la imagen/icono en alta definición. 

Si en un torneo con cientos de partidos se crea una nueva instancia de `Tarjeta` por cada falta cometida, 
el sistema terminará creando miles de objetos redundantes en memoria RAM que contienen exactamente los mismos 
datos inmutables (como la regla y el gráfico de la tarjeta amarilla). Esto degrada el rendimiento y satura los 
recursos del servidor.

## Solución
Aplicar el patrón **Flyweight** separando el **Estado Intrínseco** (compartido) del **Estado Extrínseco** (contextual):

1. **`TipoTarjeta` (Flyweight Inmutable):** Guarda únicamente el color, el reglamento y el icono. Se garantiza que 
sea inmutable (`private final`).
2. **Recepción por Parámetro:** Los datos variables (`jugador`, `minuto`, `partido`) no se almacenan como atributos 
dentro de `TipoTarjeta`, sino que se reciben como parámetros en el método `aplicarSancion(...)`.
3. **`TarjetaFactory` (Caché / Pool):** Administra un `Map<String, TipoTarjeta>` de objetos compartidos. Si se 
solicita una tarjeta `"AMARILLA"` que ya existe en el pool, la fábrica devuelve la referencia existente sin hacer un `new`.
4. **`GestorSanciones` (Contexto Extrínseco):** Lleva el seguimiento de las tarjetas acumuladas por jugador 
(por ejemplo, controlar la doble amarilla para expulsar).

## Consecuencias

### Ventajas (Pros)
* **Ahorro masivo de memoria RAM:** Se reduce la cantidad de objetos creados en el Heap a un número finito 
(en este caso, solo 2 instancias de `TipoTarjeta` para miles de sanciones).
* **Centralización de datos intrínsecos:** Si el reglamento o el icono de la tarjeta cambia, se actualiza 
en una única instancia compartida.
* **Separación de responsabilidades:** La lógica del objeto compartido queda desacoplada del contexto de uso.

### Desventajas (Contras)
* **Mayor complejidad en el código:** Requiere dividir el estado de los objetos y administrar una fábrica/pool centralizado.
* **Costo en CPU:** Para consultar o aplicar un Flyweight se requiere buscar en la fábrica (`Map`), 
lo que intercambia consumo de RAM por un pequeño procesamiento adicional de CPU.
* **Cuidado con el estado extrínseco:** Si el cliente modifica por error el estado intrínseco, 
afectará a todos los componentes que compartan la misma instancia.