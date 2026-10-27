package Estructurales.Proxy;

import java.util.ArrayList;
import java.util.List;

public class TorneoReal implements ITorneo {
    private List<String> equipos = new ArrayList<>();

    @Override
    public void registrarEquipo(String equipo) {
        equipos.add(equipo);
        System.out.println("ÉXITO: El equipo '" + equipo + "' ha sido registrado en la base de datos.");
    }

    @Override
    public void mostrarEquipos() {
        System.out.println("Equipos en el torneo: " + equipos);
    }
}