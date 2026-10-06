##Problema-Solucion-Consecuencias

##Problema 
Validar la inscripcion de un equipo requiere multiples comprobaciones (*Nombre*, *Cantidad de jugadores* y *Deudas*). Las acciones como **validar()** usando un bloque **if/else** gigante dentro del controlador o en la clase *Equipo* viola el principio de Responsabilidad Unica y vuelve el codigo dificil de mantener o extender si cambian las reglas del torneo.

##Solucion
Chain of Responsibility extrae las comprobaciones especificas de cada regla a clases separadas que heredan de la clase abstracta *ManejadorValidacion*. El sistema delega la validacion al primer manejador, y este la pasa al siguiente en la cadena hasta finalizar.


##Consecuencias

#Ventajas Elimina condicionales complejos, organiza el codigo por cada regla de validacion especifica y facilita agregar nuevas reglas sin modificar las clases existentes.

#Desventajas: Aumenta la cantidad de clases pequeñas en el proyecto y no garantiza que la validacion se procese completa si la cadena se enlaza mal.