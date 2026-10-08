Problema-Solucion-Consecuencias

Problema 

En el torneo de futbol se necesita calcular el costo y la descripcion de una 
descripcion de Equipo. La inscripcion base tiene un precio fijo, pero los equipos
pueden sumar adicionalmente opcionales: *Seguro Medico* o *Filmacion/Fotos*. Usar
herencia tradicionalmente para cada combinacion posible genera una explosion inmanejable
de clases(**InscripcionConSeguro**, **InscripcionConFotos**,**InscripcionConSegurosYFotos**).

Solucion

La solucion: *Decorator* permite aññadir responsabilidades a la inscripcion en 
tiempo de ejecucion de forma dinamica. Envolves el objeto en base a un decorador
que implementa misma interfaz(**InscripcionTorneo**), delegando la llamada base
y sumando su propio costo y descripcion.

Consecuencias

Ventajas: Cumple el principio Open/Close(Abierto a extension, cerrado a
modificaciones). Podes combinar las opciones como quieras, en cualquier orden y en 
tiempo de ejecucion.

Desventajas Genera un sistema con muchas clases pequeñas y puede ser complejo de 
depurar si la cadena de envoltorio es muy profunda.


