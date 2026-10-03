package Estructurales.Decorator;

public class SeguroMedicoDecorator extends DecoratorInscripcion{
    public SeguroMedicoDecorator(InscripcionTorneo inscripcion){
        super(inscripcion);
    }

    @Override 
    public String getDescripcion(){
        return super.getDescripcion() + " + Seguro medico";
    }

    @Override 
    public double getCosto(){
        return super.getCosto()+ 500.0;
    }
}
