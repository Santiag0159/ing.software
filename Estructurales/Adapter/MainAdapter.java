package Estructurales.Adapter;

public class MainAdapter {
    public static void main(String[] args) {
        SistemaBancarioLegacy bancoViejo = new SistemaBancarioLegacy();
        IProcesadorPago procesadorPago = new BancoAdapter(bancoViejo);
        
        procesadorPago.pagarInscripcion("los pibes fc", 15000.00);
    }
}