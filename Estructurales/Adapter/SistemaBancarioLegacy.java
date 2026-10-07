package Estructurales.Adapter;

public class SistemaBancarioLegacy {
    public void ejecutarTransferencia(float cantidad, String concepto, int idTransaccion) {
        System.out.println("banco externo | tx #" + idTransaccion + " aprobada. monto: $" + cantidad + " concepto: " + concepto);
    }
}