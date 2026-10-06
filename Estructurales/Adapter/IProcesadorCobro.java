package Estructurales.Adapter;

import Estructurales.Decorator.InscripcionTorneo;

public interface IProcesadorCobro {
    void cobrarInscripcion(InscripcionTorneo inscripcion);
}