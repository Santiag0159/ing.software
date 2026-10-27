package Creacionales.abstractfactory;

public class CanchaBasquet implements Cancha {
    @Override
    public void prepararCancha() {
        System.out.println("Limpiando el parque y ajustando los aros.");
    }
}