package Estructurales.Facade;

public class pasarelaPago {
    public boolean procesarPago(Long equipoId, Double monto) {
        System.out.println("Procesando pago de " + monto + " para el equipo " + equipoId);
        return true; // Retorna true si el pago fue exitoso, false en caso contrario
    }
}
