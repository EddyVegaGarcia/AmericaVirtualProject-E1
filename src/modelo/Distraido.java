package modelo;

import modelo.interfaces.EstadoHomero;

public class Distraido implements EstadoHomero {

    @Override
    public Boolean estaDistraido() {
        return true;
    }

    @Override
    public void cambio(Homero unHomero) {

        unHomero.cambioDeEstado(new Concentrado());

    }
}
