##Problema-Solucion-Consecuencias

##Problema 

    Un partido de futbol atraviesa distintos estados(*Programado*, *En juego* 
*En Pausa* y *Finalizado*). Las acciones como **anotarGol()**, **iniciar()**,
**pausar()** o **finalizar()** dependen directamente del estado actual. Usar un
bloque **switch** o **id/else** gigante dentro de *Partido* viola el principio de
Responsabilidad unica y vuelve el codigo dificil de mantener o extender

##Solucion

    State extrae los comportamientos espesificos de cada estado a clases separadas 
que implementan la interfaz *EstadoPartido*. El *Partido* delega sus acciones en el
estado en que se escuentra actualmente.

##Consecuencias

#Ventajas Elimina condiocionales complejos, organiza el codigo por cada estado
especifico y facilita agregar nuevos estados sin modificar la clase *Partido*.

#Desventajas: Aumenta la cantidad de clases pequeñas en el proyecto.