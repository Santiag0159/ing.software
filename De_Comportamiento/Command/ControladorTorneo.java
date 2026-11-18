package De_Comportamiento.Command;

public class ControladorTorneo {
    public void invocar(ComandoTorneo comando) {
        comando.ejecutar();
    }
}
//Sobreescribe la funcion invocar para ejecutar el comando pasado como parametro.