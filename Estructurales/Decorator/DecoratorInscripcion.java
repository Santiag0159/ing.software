package Estructurales.Decorator;

public abstract class DecoratorInscripcion implements InscripcionTorneo{
    protected final InscripcionTorneo inscripcion;

    public DecoratorInscripcion(InscripcionTorneo inscripcion){
        this.inscripcion = inscripcion;
    }

    @Override 
    public String getDescripcion(){
        return inscripcion.getDescripcion();
    }

    @Override 
    public double getCosto(){
        return inscripcion.getCosto();
    }
    

}
