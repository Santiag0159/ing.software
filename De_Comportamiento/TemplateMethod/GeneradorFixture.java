package De_Comportamiento.TemplateMethod;

import java.util.List;

public abstract class GeneradorFixture {

    // Final para que nadie rompa el esqueleto 
    public final void armarFixture(List<String> equipos) {
        System.out.println("--- FIXTURE ---");
        validarEquipos(equipos);
        generarEmparejamientos(equipos);
        notificarEquipos();
    }

    //Validacion
    private void validarEquipos(List<String> equipos) {
        if (equipos == null || equipos.isEmpty()) {
            throw new IllegalArgumentException("No hay equipos cargados");
        }
        System.out.println("Total de equipos: " + equipos.size());
    }

    protected abstract void generarEmparejamientos(List<String> equipos);

    //Notificacion
    private void notificarEquipos() {
        System.out.println("Aviso a los delegados");
    }
}