package Estructurales.Decorator;

public class MainDecorator {
    public static void main(String[] args){

        //Inscripcion basica
        InscripcionTorneo inscripcion = new InscripcionBasica("Unvime FC");
       
        System.out.println("Descripcion: "+inscripcion.getDescripcion());
        System.out.println(" - Costo: "+inscripcion.getCosto());
        System.out.println("Costo esperado 1000.0");
        //Envolvemos con Seguro medico
        inscripcion = new SeguroMedicoDecorator(inscripcion);
    
        //Envolvemos con Seguro medico otra vez, se puede envolver varias veces
        inscripcion = new SeguroMedicoDecorator(inscripcion); 

        System.out.println("Descripcion: "+inscripcion.getDescripcion());
        System.out.println(" - Costo: "+inscripcion.getCosto());

        //Envolvemos con Cobertura fotografica 
        inscripcion = new CoberturaMediaDecorator(inscripcion);

        System.out.println("Descripcion: "+inscripcion.getDescripcion());
        System.out.println(" - Costo: "+inscripcion.getCosto());
    }
}
