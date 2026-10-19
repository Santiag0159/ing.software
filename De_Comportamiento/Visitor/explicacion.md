# Patrón Visitor: torneo

El ejemplo permite recorrer equipos y partidos para calcular estadisticas sin
agregar esa logica a las clases que representan los elementos:

- **`ElementoTorneo`** declara `aceptar`, que recibe un visitante.
- **`Equipo`** y **`Partido`** son elementos visitables y derivan al metodo
  correspondiente del visitante.
- **`VisitanteTorneo`** define las operaciones para cada tipo de elemento.
- **`VisitanteEstadisticasTorneo`** cuenta equipos y partidos y suma los goles.
- **`MainVisitor`** recorre los elementos del torneo y muestra el resumen.

El doble despacho de `aceptar` permite aplicar una operacion especifica segun
el tipo concreto del elemento. Se pueden agregar nuevas operaciones, como
generar reportes, creando otros visitantes sin cambiar `Equipo` ni `Partido`.
