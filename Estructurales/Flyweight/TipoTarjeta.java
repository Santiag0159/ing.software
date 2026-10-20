package Estructurales.Flyweight;

public class TipoTarjeta{
    private final String color;
    private final String textoReglamento;
    private final String iconoHD;

    public TipoTarjeta(String color, String textoReglamento, String iconoHD){
        this.color = color;
        this.textoReglamento = textoReglamento;
        this.iconoHD = iconoHD;
        System.out.println("Creando unica instancia de Tipo Tarjeta: " + color);

    }

    public void aplicarSancion(String jugador, int minuto, String partido){
        if (this.color.equalsIgnoreCase("Roja")) {
            System.out.println(" Tarjeta ROJA a '" + jugador + "' en min " + minuto + "' (" + partido + ") -> EXPULSADO!");
        } else {
            System.out.println(" Tarjeta AMARILLA a '" + jugador + "' en min " + minuto + "' (" + partido + ")");
        }
    }

    public String getColor(){
        return color;
    }
}