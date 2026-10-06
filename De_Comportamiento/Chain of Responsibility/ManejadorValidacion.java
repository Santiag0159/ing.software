public abstract class ManejadorValidacion {
    protected ManejadorValidacion siguienteManejador;

    public void setSiguiente(ManejadorValidacion siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }

    public abstract boolean validar(Equipo equipo);
    
    protected boolean pasarAlSiguiente(Equipo equipo) {
        if (siguienteManejador != null) {
            return siguienteManejador.validar(equipo);
        }
        return true;
    }
}