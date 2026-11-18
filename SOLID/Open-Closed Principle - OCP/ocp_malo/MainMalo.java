package ocp_malo;

public class MainMalo {
    public static void main(String[] args) {
        Torneo torneo = new Torneo("Copa de Verano", "Amateur");
        System.out.println("Costo: " + torneo.obtenerCostoInscripcion());
    }
}