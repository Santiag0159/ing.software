package Estructurales.Adapter;

import Estructurales.Decorator.InscripcionTorneo;

public class BancoAdapter implements IProcesadorCobro {
    private SistemaBancarioLegacy sistemaBancario;
    private int generadorId = 1000; 

    public BancoAdapter(SistemaBancarioLegacy sistemaBancario) {
        this.sistemaBancario = sistemaBancario;
    }

    @Override
    public void cobrarInscripcion(InscripcionTorneo inscripcion) {
        float cantidadAdaptada = (float) inscripcion.getCosto();
        String conceptoAdaptado = inscripcion.getDescripcion().toLowerCase();
        generadorId++;
        
        sistemaBancario.ejecutarTransferencia(cantidadAdaptada, conceptoAdaptado, generadorId);
    }
}