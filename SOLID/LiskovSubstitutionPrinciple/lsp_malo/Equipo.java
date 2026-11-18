package SOLID.LiskovSubstitutionPrinciple.lsp_malo;

public class Equipo {
    protected String nombre;
    
    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void agregarJugadorProfesional(String jugador) {
        System.out.println("jugador profesional " + jugador + " agregado a " + nombre);
    }
}