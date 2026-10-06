public class Partido {
    private String equipoLocal;
    private String equipoVisitante;

    //Estos les parece o es mucho?
    private String estadio;
    private String arbitro;
    private boolean tieneVar;

    //constructor pero en privado
    private Partido(PartidoBuilder builder) {
        this.equipoLocal = builder.equipoLocal;
        this.equipoVisitante = builder.equipoVisitante;
        this.estadio = builder.estadio;
        this.arbitro = builder.arbitro;
        this.tieneVar = builder.tieneVar;
    }

    @Override
    public String toString() {
        return "Partido: " + equipoLocal + " vs " + equipoVisitante + 
            " | Estadio: " + (estadio != null ? estadio : "A definir") +
            " | Arbitro: " + (arbitro != null ? arbitro : "A definir") +
            " | VAR: " + (tieneVar ? "Si" : "No");
    }


    public static class PartidoBuilder {
        private String equipoLocal;
        private String equipoVisitante;
        private String estadio;
        private String arbitro;
        private boolean tieneVar = false; 


        public PartidoBuilder(String equipoLocal, String equipoVisitante) {
            this.equipoLocal = equipoLocal;
            this.equipoVisitante = equipoVisitante;
        }

        public PartidoBuilder conEstadio(String estadio) {
            this.estadio = estadio;
            return this; 
        }

        public PartidoBuilder conArbitro(String arbitro) {
            this.arbitro = arbitro;
            return this;
        }

        public PartidoBuilder conVar(boolean tieneVar) {
            this.tieneVar = tieneVar;
            return this;
        }

        public Partido construir() {
            return new Partido(this);
        }
    }
}