# Patrón de Diseño: Iterator

## Problema
En el sistema del Torneo de Fútbol, distintos módulos guardan la información
 de sus jugadores y goleadores en estructuras de datos totalmente variadas: 
 el módulo de *Primera A* utiliza un arreglo estático (`Jugador[]`), mientras 
 que otros módulos utilizan listas dinámicas (`List<Jugador>`) o conjuntos ordenados.

Si el cliente (por ejemplo, el generador de reportes o la pantalla de la tabla 
de posiciones) quiere mostrar la lista de goleadores, tendría que conocer los 
detalles internos de implementación de cada colección (`length`, `get(i)`, `iterator()`). 
Esto viola el encapsulamiento, acopla el código del cliente a las estructuras de datos 
subyacentes y complica la incorporación de nuevas formas de almacenamiento.

## Solución
Aplicar el patrón **Iterator** para abstraer el recorrido de las colecciones:

1. **`IteradorGoleadores` (Interfaz Iterador):** Define una interfaz común con los 
métodos `tieneSiguiente()` y `siguiente()`.
2. **`IteradorArrayGoleadores` (Iterador Concreto):** Encapsula la lógica específica 
para recorrer un arreglo unidimensional de jugadores manteniendo el puntero de índice.
3. **`ColeccionGoleadores` (Interfaz Agregado):** Declara el método `crearIterador()`.
4. **`GoleadoresPrimeraA` (Colección Concreta):** Implementa el método de fábrica que 
retorna una instancia del iterador concreto asociado a su arreglo de datos.
5. **Acceso Uniforme:** El cliente recorre los datos a través de la interfaz del iterador 
sin exponer la representación interna del grupo de objetos.

## Consecuencias

### Ventajas (Pros)
* **Principio de Responsabilidad Única (SRP):** Limpia la colección separando los algoritmos 
de recorrido de las estructuras de almacenamiento de datos.
* **Principio Abierto/Cerrado (OCP):** Es posible agregar nuevas colecciones e iteradores 
sin alterar el cliente ni las colecciones existentes.
* **Encapsulamiento garantizado:** La estructura interna de datos de la colección permanece 
completamente oculta.
* **Recorridos en paralelo:** Permite tener múltiples iteradores activos recorriendo la misma 
colección de manera independiente.

### Desventajas (Contras)
* **Sobreingeniería en casos simples:** Si la aplicación solo maneja colecciones sencillas 
nativas de la biblioteca estándar de Java (como `List`), crear interfaces e iteradores a mano puede resultar innecesario.
* **Costo de eficiencia ligero:** En estructuras hiper simples, usar un iterador abstracto 
puede ser levemente menos eficiente que un bucle `for` directo sobre un arreglo.