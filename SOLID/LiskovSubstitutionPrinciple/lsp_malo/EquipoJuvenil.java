package SOLID.LiskovSubstitutionPrinciple.lsp_malo;
public class EquipoJuvenil extends Equipo {
    
    public EquipoJuvenil(String nombre) {
        super(nombre);
    }

    @Override
    public void agregarJugadorProfesional(String jugador) {
        throw new UnsupportedOperationException("los equipos juveniles no pueden fichar profesionales");
    }
}