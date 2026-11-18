package isp_malo;

import java.util.List;

public interface OperacionesSorteo {
    List<String> sortearCruces(List<String> equipos);
    void asignarCabezasDeSerie(List<String> favoritos);
    void iniciarTransmisionEnVivo(String urlStream);
}