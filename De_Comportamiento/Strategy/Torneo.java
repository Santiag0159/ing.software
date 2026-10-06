package De_Comportamiento.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private FormatoTorneo formatoTorneo;
    private String nombre;
    private List<String> equipos;

    public Torneo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    public void agregarEquipo(String equipo) {
        equipos.add(equipo);
    }

    public void setFormatoTorneo(FormatoTorneo formatoTorneo) {
        this.formatoTorneo = formatoTorneo;
    }

    public void iniciarTorneo() {
        System.out.println("Torneo: " + nombre);
        if (formatoTorneo != null) {
            formatoTorneo.simularFormato(equipos);
        } else {
            System.out.println("ERROR! El torneo no tiene formato asignado");
        }
    }
}