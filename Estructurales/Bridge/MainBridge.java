package Estructurales.Bridge; 

public class MainBridge {
    public static void main(String[] args) {
        SistemaFixture eliminatorias = new FixtureEliminatoria();
        Torneo torneoNacional = new TorneoProfesional(eliminatorias, "Copa Nacional");
        torneoNacional.organizar();
    }
}