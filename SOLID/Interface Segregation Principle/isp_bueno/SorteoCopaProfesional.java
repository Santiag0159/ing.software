package isp_bueno;

import java.util.ArrayList;
import java.util.List;

public class SorteoCopaProfesional implements Sorteable, ConCabezasDeSerie, TransmitibleEnVivo {
    private List<String> cabezasDeSerie = new ArrayList<>();

    @Override
    public void asignarCabezasDeSerie(List<String> favoritos) {
        this.cabezasDeSerie = favoritos;
        System.out.println("[COPA PRO] Cabezas de serie fijadas: " + cabezasDeSerie);
    }

    @Override
    public void iniciarTransmisionEnVivo(String urlStream) {
        System.out.println("[STREAMING] Transmitiendo sorteo oficial en: " + urlStream);
    }

    @Override
    public List<String> sortearCruces(List<String> equipos) {
        System.out.println("[COPA PRO] Sorteando cruces evitando enfrentamientos entre cabezas de serie.");
        return List.of("Boca Juniors vs Racing Club", "River Plate vs San Lorenzo");
    }
}