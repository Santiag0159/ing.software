# Factory Method

## Problema

Un sistema de venta de entradas para un torneo debe crear entradas de distintos tipos, como general y VIP. Si la clase que vende las entradas decide qué clase concreta instanciar, queda acoplada a todos los tipos y debe cambiar cada vez que se agrega uno nuevo.

## Solución

`FabricaEntradas` declara el método de fábrica `crearEntrada()` y utiliza el producto creado para venderlo. Cada fábrica concreta implementa ese método y decide qué tipo de entrada crear. Así, el código que realiza la venta trabaja con la interfaz `Entrada` en vez de depender de clases concretas.

## Consecuencias

### Ventajas

- Separa el proceso de venta de la creación de cada tipo de entrada.
- Permite agregar nuevos tipos de entrada mediante nuevas fábricas y productos.
- Reduce el acoplamiento entre el código cliente y las clases concretas.

### Desventajas

- Agregar un tipo nuevo requiere crear clases adicionales.
- La estructura puede ser innecesaria si solo existe un tipo de producto.
