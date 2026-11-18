import java.util.List;

public class Torneo {
    private String nombre;
    private List<String> equipos;

    public Torneo(String nombre, List<String> equipos) {
        this.nombre = nombre;
        this.equipos = List.copyOf(equipos);
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getEquipos() {
        return equipos;
    }
}
