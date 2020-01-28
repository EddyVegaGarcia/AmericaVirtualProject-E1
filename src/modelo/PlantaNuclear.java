package modelo;

import modelo.interfaces.*;

import static modelo.Constantes.*;

public class PlantaNuclear {

    EmpleadoDeControl empleadoDeControl;
    public modelo.Burns dueño;
    public Integer cantidadDeUranio;

    public PlantaNuclear(Burns unDueño) {

        cantidadDeUranio = CANTIDAD_URANIO_INICIAL;
        this.empleadoDeControl = new Homero(CANTIDAD_DONAS_INICIALES);
        this.dueño = unDueño;

    }

    public void agregarUranio(Integer unaCantidadDeUranio) {

        this.cantidadDeUranio += unaCantidadDeUranio;

    }

    public void horaDeAlmuerzo() {

        this.empleadoDeControl.almorzar();

    }

    public void despido() {

        this.empleadoDeControl = new PatoBalancin();

    }

    public String revisionDePeligro() {

        this.dueño.estaPobre();

        return NO_HAY_PELIGRO;

    }

}
