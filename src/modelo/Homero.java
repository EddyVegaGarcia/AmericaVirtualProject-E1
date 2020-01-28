package modelo;

import modelo.interfaces.*;

public class Homero implements EmpleadoDeControl {

    public Integer donas;

    public Homero(Integer unaCantidadDonas) {

        this.donas = unaCantidadDonas;

    }

    @Override
    public Boolean estaDistraido() {
        return false;
    }

}
