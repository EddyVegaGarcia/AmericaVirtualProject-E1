package modelo;

import modelo.interfaces.*;

public class Concentrado implements EstadoHomero {

    @Override
    public Boolean estaDistraido() {

        return false;

    }

    @Override
    public void cambio(Homero unHomero) {

        unHomero.cambioDeEstado(new Distraido());

    }
}
