package modelo;

import modelo.exception.PlantaNuclearEnPeligroException;
import modelo.interfaces.*;

import static modelo.Constantes.*;

public class PlantaNuclear {

    EmpleadoDeControl empleadoDeControl;
    public Burns duenio;
    public Integer cantidadDeUranio;

    private void monitorearEconomiaDuenio() {

        this.duenio.estaPobre();

    }

    private void monitorearRecursos() {

        this.empleadoDeControl.monitorear(this);

    }

    public PlantaNuclear(Burns unDuenio) {

        cantidadDeUranio = CANTIDAD_URANIO_INICIAL;
        this.empleadoDeControl = new Homero(CANTIDAD_DONAS_INICIALES);
        this.duenio = unDuenio;

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

    public void posibleCasoEnPeligro() {

        if(cantidadDeUranio >= CANTIDAD_URANIO_INESTABLE) throw new PlantaNuclearEnPeligroException();

    }

    public String revisionDePeligro() {

        this.monitorearEconomiaDuenio();
        this.monitorearRecursos();
        return NO_HAY_PELIGRO;

    }
}
