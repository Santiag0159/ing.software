package De_Comportamiento.Visitor;

public class Partido implements ElementoTorneo {
    private final Equipo equipoLocal;
    private final Equipo equipoVisitante;
    private final int golesLocal;
    private final int golesVisitante;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, int golesLocal, int golesVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    @Override
    public void aceptar(VisitanteTorneo visitante) {
        visitante.visitar(this);
    }
}
