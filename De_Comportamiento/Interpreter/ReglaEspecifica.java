package De_Comportamiento.Interpreter;

public class ReglaEspecifica implements ExpresionElegibilidad {
    private String requisito;

    public ReglaEspecifica(String requisito) {
        this.requisito = requisito;
    }

    @Override
    public boolean interpretar(String perfilJugador) {
        return perfilJugador.contains(requisito);
    }
}