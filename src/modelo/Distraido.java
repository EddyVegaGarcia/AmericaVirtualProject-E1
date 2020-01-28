package modelo;

import modelo.exception.*;
import modelo.interfaces.*;

public class Distraido implements EstadoHomero {

    @Override
    public Boolean estaDistraido() {

        throw new PosibleCasoEnPeligroException();

    }

    @Override
    public void cambio(Homero unHomero) {

        unHomero.cambioDeEstado(new Concentrado());

    }
}
