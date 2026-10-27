package Creacionales.abstractfactory;

public class CanchaFutbol implements Cancha {
    @Override
    public void prepararCancha() {
        System.out.println("Marcando lineas de cal y colocando redes en los arcos.");
    }
}