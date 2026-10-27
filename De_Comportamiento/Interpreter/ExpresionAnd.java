package De_Comportamiento.Interpreter;

public class ExpresionAnd implements ExpresionElegibilidad {
    private ExpresionElegibilidad expr1;
    private ExpresionElegibilidad expr2;

    public ExpresionAnd(ExpresionElegibilidad expr1, ExpresionElegibilidad expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpretar(String perfilJugador) {
        return expr1.interpretar(perfilJugador) && expr2.interpretar(perfilJugador);
    }
}