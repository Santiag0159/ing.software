public class Equipo {
    private String nombre;
    private int cantidadJugadores;
    private boolean tieneDeudas;

    public Equipo(String nombre, int cantidadJugadores, boolean tieneDeudas) {
        this.nombre = nombre;
        this.cantidadJugadores = cantidadJugadores;
        this.tieneDeudas = tieneDeudas;
    }

    public String getNombre() { return nombre; }
    public int getCantidadJugadores() { return cantidadJugadores; }
    public boolean tieneDeudas() { return tieneDeudas; }
}