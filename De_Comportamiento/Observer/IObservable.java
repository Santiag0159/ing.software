package De_Comportamiento.Observer;

public interface IObservable {
    void suscribir(IObservador observador);
    void desuscribir(IObservador observador);
    void notificarObservadores();
}