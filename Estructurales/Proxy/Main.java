package Estructurales.Proxy;

public class Main {
    public static void main(String[] args) {
        TorneoReal sistemaCentral = new TorneoReal();

        Usuario admin = new Usuario("Nery", "ADMIN");
        Usuario invitado = new Usuario("Pupin", "INVITADO");

        System.out.println("--- Intento de Administrador ---");
        ITorneo proxyAdmin = new TorneoProxy(admin, sistemaCentral);
        proxyAdmin.registrarEquipo("Boca Juniors");

        System.out.println("\n--- Intento de Invitado ---");
        ITorneo proxyInvitado = new TorneoProxy(invitado, sistemaCentral);
        proxyInvitado.registrarEquipo("River Plate");

        System.out.println("\n--- Estado Final del Torneo ---");
        proxyInvitado.mostrarEquipos();
    }
}