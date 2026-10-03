package De_Comportamiento.State;

public interface EstadoPartido{
    void iniciar(Partido partido);
    void pausar(Partido partido);
    void anotarGol(Partido partido, String equipo);
    void finalizar(Partido partido);
}