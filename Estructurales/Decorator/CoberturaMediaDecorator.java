package Estructurales.Decorator;

public class CoberturaMediaDecorator extends DecoratorInscripcion {
    public CoberturaMediaDecorator(InscripcionTorneo inscripcion){
        super(inscripcion);
    }

    @Override
    public String getDescripcion(){
        return super.getDescripcion() + " + Cobertura Fotografica";
    }
    
    @Override 
    public double getCosto(){
        return super.getCosto() + 500.0;
    }

}
