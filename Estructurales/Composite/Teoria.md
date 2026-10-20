# Patrón de Diseño: Composite (Objeto Compuesto)

## Problema
En la aplicación del Torneo de Fútbol, la organización de la competencia responde
 a una estructura jerárquica en forma de árbol: una **Liga** contiene múltiples
  **Categorías**, cada categoría contiene varias **Zonas**, y cada zona contiene múltiples **Equipos**.

Si necesitamos calcular el monto total recaudado por inscripciones en cualquier 
nivel del árbol (saber la recaudación de una Zona, de una Categoría o de la Liga entera),
un diseño ingenuo obligaría al cliente a conocer la estructura interna de cada contenedor,
realizando múltiples bucles `for` anidados e identificando manualmente si está tratando 
con un Equipo individual o con una lista de equipos. Esto rompe el encapsulamiento y vuelve al código sumamente rígido.

## Solución
Aplicar el patrón **Composite** para tratar a las hojas y a los contenedores 
compuestos de manera uniforme a través de una interfaz común:

1. **`ElementoTorneo` (Interfaz Componente):** Define las operaciones comunes, 
como `getCostoInscripcion()`.
2. **`Equipo` (Hoja / Leaf):** Objeto básico sin hijos. Devuelve su propio costo de inscripción.
3. **`EstructuraCompuesta` (Compuesto / Composite):** Mantiene una lista interna 
de objetos de tipo `ElementoTorneo` (pueden ser Equipos u otros contenedores). Cuando 
se invoca `getCostoInscripcion()`, itera sobre su lista y delega recursivamente la llamada a sus hijos.
4. **Tratamiento Polimórfico:** El cliente calcula la recaudación total simplemente 
invocando `liga.getCostoInscripcion()`, ignorando por completo la complejidad del árbol interno.

## Consecuencias

### Ventajas (Pros)
* **Tratamiento uniforme (Polimorfismo):** Simplifica el código del cliente, 
que puede operar con estructuras complejas o elementos simples sin usar condicionales 
de tipo (`instanceof`).
* **Cumple el Principio Abierto/Cerrado (OCP):** Es fácil agregar nuevos tipos de 
agrupaciones (ej. `CopaRegional` o `FaseEliminatorias`) sin modificar el código existente.
* **Facilita estructuras jerárquicas en árbol:** Permite crear construcciones 
anidadas de forma natural y recursiva.

### Desventajas (Contras)
* **Dificultad para restringir tipos de componentes:** El sistema de tipos no 
impide fácilmente limitar qué tipo de hojas van en cada contenedor 
(por ejemplo, evitar que por error se agregue una Liga dentro de un Equipo),
 ya que todos comparten la misma interfaz.
* **Diseño demasiado general:** Para hacer que los componentes sean uniformes, 
a veces hay que definir métodos en la interfaz que no aplican a las hojas 
(como `agregar()` o `eliminar()`).