package Estructurales.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class GestorSanciones {
    private final Map<String, Integer> contadorAmarillas = new HashMap<>();

    public void registrarFalta(String jugador, String tipoTarjeta, int minuto, String partido){
        if(tipoTarjeta.equalsIgnoreCase("Amarilla")){
            int amarrilasPrevias = contadorAmarillas.getOrDefault(jugador, 0) + 1;
            contadorAmarillas.put(jugador, amarrilasPrevias);

            //Se obtiene la amarilla del Flyweight
            TipoTarjeta amarilla = TarjetaFactory.getTipoTarjeta("Amarilla");
            amarilla.aplicarSancion(jugador, minuto, partido);

            //se cuenta si es la segunda amarilla
            if(amarrilasPrevias == 2){
                System.out.println("Segunda amarilla para "+jugador+ " ");
                TipoTarjeta roja = TarjetaFactory.getTipoTarjeta("Roja");
                roja.aplicarSancion(jugador, minuto, partido);
            }
        } else if(tipoTarjeta.equals("Roja")){
            //Roja directa
            System.out.println("Roja directa para " + jugador+ " ");
            TipoTarjeta roja = TarjetaFactory.getTipoTarjeta("Roja");
            roja.aplicarSancion(jugador, minuto, partido);
        }
    }
}
