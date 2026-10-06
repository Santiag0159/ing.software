##Problema-Solucion-Consecuencias

##Problema 
Un partido de futbol requiere atributos obligatorios (*Equipos*) y muchos opcionales (*Estadio*, *Arbitro*, *VAR*). Las acciones de instanciacion requieren sobrecargar el **constructor()** repetidas veces o enviar valores nulos, lo que vuelve la creacion de *Partido* confusa, propensa a errores y difucil de leer.

##Solucion
Builder extrae la logica de construccion paso a paso a una clase separada llamada *PartidoBuilder*. La instanciacion delega la configuracion en metodos encadenados como **conEstadio()** o **conArbitro()** y finalmente genera el objeto *Partido* listo para usar.

##Consecuencias

#Ventajas Elimina constructores complejos con muchos parametros, organiza el codigo de inicializacion de forma muy legible y permite crear distintas configuraciones de un Partido manteniendo sus datos inmutables.

#Desventajas: Aumenta la cantidad de clases en el proyecto al requerir una clase constructora extra y duplica los atributos en memoria durante la creacion.