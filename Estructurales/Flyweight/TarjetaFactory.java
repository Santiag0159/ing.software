package Estructurales.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TarjetaFactory {
    private static final Map<String, TipoTarjeta> pool = new HashMap<>();

    public static TipoTarjeta getTipoTarjeta(String color) {
        String clave = color.toUpperCase();

        if (!pool.containsKey(clave)) {
            if (clave.equals("AMARILLA")) {
                pool.put(clave, new TipoTarjeta("AMARILLA", 
                "Regla 12: Conducta antideportiva...", "[Icono_Amarillo.png]"));
            } else if (clave.equals("ROJA")) {
                pool.put(clave, new TipoTarjeta("ROJA", 
                "Regla 12: Expulsión por doble amarilla o juego brusco...", "[Icono_Rojo.png]"));
            } else {
                throw new IllegalArgumentException("Tipo de tarjeta no soportado: " + color);
            }
        }
        return pool.get(clave);
    }

    public static int getCantidadInstanciasEnMemoria() {
        return pool.size();
    }
}