# Explicación breve de la carpeta Facade

Esta carpeta implementa el patrón de diseño Facade para simplificar la operación de registrar un equipo en un torneo.

## ¿Qué hace?

La clase `TorneoFacade` actúa como una interfaz única para coordinar varios subsistemas que, por separado, tienen responsabilidades distintas:

- `sistemaEquipos`: valida si el equipo cumple con los requisitos mínimos y luego lo registra en el torneo.
- `pasarelaPago`: procesa el pago de la inscripción.
- `servicioNotificaciones`: envía mensajes de éxito o error al equipo.
- `Main`: es el punto de entrada que prueba la funcionalidad.

## Flujo principal

Cuando se llama a `registrarEquipoEnTorneo(...)`, la fachada hace lo siguiente:

1. Verifica que el equipo cumpla los requisitos.
2. Si cumple, intenta procesar el pago.
3. Si el pago es exitoso, registra al equipo en el torneo.
4. Envía una notificación con el resultado.
5. Si alguna validación falla, notifica el problema en lugar de dejar que el usuario maneje cada sistema por separado.

## ¿Por qué es útil?

El patrón Facade oculta la complejidad de varios componentes y ofrece una sola operación más fácil de usar desde el exterior. En este ejemplo, el cliente no necesita conocer los detalles de validación, pago y notificaciones: solo llama a una única clase (`TorneoFacade`).
