package modelo;

import static modelo.Constantes.*;

public class PlantaNuclear {

    public Burns dueño;
    public Integer cantidadDeUranio = CANTIDAD_URANIO_INICIAL;

    public PlantaNuclear(Burns unDueño) {

        this.dueño = unDueño;

    }

    public void agregarUranio(Integer unaCantidadDeUranio) {

        this.cantidadDeUranio += unaCantidadDeUranio;

    }

    public String revisionDePeligro() {

        return NO_HAY_PELIGRO;

    }
}
