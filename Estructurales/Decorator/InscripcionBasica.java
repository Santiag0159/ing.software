package Estructurales.Decorator;

public class InscripcionBasica implements InscripcionTorneo {
    private final String nombreEquipo;

    public InscripcionBasica(String nombreEquipo){
        this.nombreEquipo = nombreEquipo;
    }

    @Override
    public String getDescripcion(){
        return "Inscripcion basica - Equipo: "+ nombreEquipo;
    }

    @Override
    public double getCosto(){
        return 1000.00;
    }
    
}
