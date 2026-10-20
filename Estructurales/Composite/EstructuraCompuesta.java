package Estructurales.Composite;

import java.util.ArrayList;
import java.util.List;

public class EstructuraCompuesta implements ElementoTorneo {
    private final String nombre;
    private final List<ElementoTorneo> elementos = new ArrayList<>();

    public EstructuraCompuesta(String nombre){
        this.nombre = nombre;
    }

    public void agregar(ElementoTorneo elemento){
        elementos.add(elemento);
    }

    public void eliminar(ElementoTorneo elemento){
        elementos.remove(elemento);
    }

    @Override 
    public String getNombre(){
        return nombre;
    }

    @Override 
    public double getCostoInscripcion(){
        double total = 0;

        for(ElementoTorneo e: elementos) {
            total += e.getCostoInscripcion();
        }
        return total;
    }

    @Override 
    public void mostrarEstructura(String sangria){
        System.out.println(sangria + "+ Contenedor: " + nombre+ 
            " Total acumulado: $" + getCostoInscripcion()+ " ."
        );
        for(ElementoTorneo e : elementos){
            e.mostrarEstructura(sangria + " ");
        }
    }
}
