package modelo;

import static modelo.Constantes.*;

public class PlantaNuclear {

    modelo.EmpleadoDeControl empleadoDeControl;
    public modelo.Burns dueño;
    public Integer cantidadDeUranio = CANTIDAD_URANIO_INICIAL;

    public PlantaNuclear(modelo.Burns unDueño) {

        this.dueño = unDueño;

    }

    public void agregarUranio(Integer unaCantidadDeUranio) {

        this.empleadoDeControl = new Homero();
        this.cantidadDeUranio += unaCantidadDeUranio;

    }

    public String revisionDePeligro() {

        return NO_HAY_PELIGRO;

    }

    public void horaDeAlmuerzo() {

    }

    public void despido() {

        this.empleadoDeControl = new PatoBalancin();

    }
}
