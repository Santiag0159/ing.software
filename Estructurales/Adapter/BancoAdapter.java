package Estructurales.Adapter;

public class BancoAdapter implements IProcesadorPago {
    private SistemaBancarioLegacy sistemaBancario;
    private int generadorId = 1000; 

    public BancoAdapter(SistemaBancarioLegacy sistemaBancario) {
        this.sistemaBancario = sistemaBancario;
    }

    @Override
    public void pagarInscripcion(String equipo, double monto) {
        float cantidadAdaptada = (float) monto;
        String conceptoAdaptado = "pago inscripcion - equipo: " + equipo.toLowerCase();
        generadorId++;
        
        sistemaBancario.ejecutarTransferencia(cantidadAdaptada, conceptoAdaptado, generadorId);
    }
}