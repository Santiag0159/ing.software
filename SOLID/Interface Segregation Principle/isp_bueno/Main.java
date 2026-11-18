package isp_bueno;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sorteable sorteoBarrial = new SorteoBarrialSimple();
        List<String> crucesBarrial = sorteoBarrial.sortearCruces(
            List.of("Los Pibes", "Deportivo Sur", "La Ribera", "Villa Mercedes FC")
        );
        System.out.println("Cruces Barrial: " + crucesBarrial);

        SorteoCopaProfesional copaPro = new SorteoCopaProfesional();
        copaPro.asignarCabezasDeSerie(List.of("Boca Juniors", "River Plate"));
        copaPro.iniciarTransmisionEnVivo("https://youtube.com/torneo-vivo");
        List<String> crucesCopa = copaPro.sortearCruces(
            List.of("Boca Juniors", "River Plate", "Racing Club", "San Lorenzo")
        );
        System.out.println("Cruces Copa Pro: " + crucesCopa);
    }
}