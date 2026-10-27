package Estructurales.Proxy;

public class TorneoProxy implements ITorneo {
    private TorneoReal torneoReal;
    private Usuario usuarioActual;

    public TorneoProxy(Usuario usuarioActual, TorneoReal torneoReal) {
        this.usuarioActual = usuarioActual;
        this.torneoReal = torneoReal;
    }

    @Override
    public void registrarEquipo(String equipo) {
        if ("ADMIN".equalsIgnoreCase(usuarioActual.getRol())) {
            System.out.println("Proxy: Permiso concedido a " + usuarioActual.getNombre());
            torneoReal.registrarEquipo(equipo);
        } else {
            System.out.println("Proxy ERROR: Acceso denegado. " + usuarioActual.getNombre() + " no tiene permisos para registrar equipos.");
        }
    }

    @Override
    public void mostrarEquipos() {
        torneoReal.mostrarEquipos();
    }
}