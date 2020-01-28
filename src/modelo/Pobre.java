package modelo;

import modelo.exception.PlantaNuclearEnPeligroException;
import modelo.interfaces.*;

public class Pobre implements EstadoBurns {

    @Override
    public Boolean estaPobre() {

        throw new PlantaNuclearEnPeligroException();

    }
}
