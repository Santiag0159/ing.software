package De_Comportamiento.Observer;

public class MainObserver {
    public static void main(String[] args) {
        PartidoEnVivo partido = new PartidoEnVivo();
        MarcadorEstadio marcador = new MarcadorEstadio();
        AppMovilNotificacion app = new AppMovilNotificacion();

        partido.suscribir(marcador);
        partido.suscribir(app);

        partido.marcarGolLocal();
        partido.marcarGolVisitante();
    }
}