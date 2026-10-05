
public class Torneo {
    private FormatoTorneo formatoTorneo;
    private String nombre; 

    public Torneo(String nombre){ 
        this.nombre = nombre; 
    }

    public void setFormatoTorneo(FormatoTorneo formatoTorneo){
        this.formatoTorneo = formatoTorneo;
    }

    public void iniciarTorneo(){
        System.out.println("Torneo: " + nombre);
        if (formatoTorneo != null){
            formatoTorneo.simularFormato();
        }
        else{
            System.out.println("ERROR! El torneo no tiene formato asignado"); 
        }
        
    }

}
