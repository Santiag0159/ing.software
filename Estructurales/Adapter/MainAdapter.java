package Estructurales.Adapter;

import Estructurales.Decorator.InscripcionBasica;
import Estructurales.Decorator.InscripcionTorneo;

public class MainAdapter {
    public static void main(String[] args) {
        SistemaBancarioLegacy bancoViejo = new SistemaBancarioLegacy();
        IProcesadorCobro procesadorPago = new BancoAdapter(bancoViejo);
        
        InscripcionTorneo inscripcion = new InscripcionBasica("los pibes fc");
        
        procesadorPago.cobrarInscripcion(inscripcion);
    }
}