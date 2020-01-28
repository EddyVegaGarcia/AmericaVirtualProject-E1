package modelo;

import modelo.interfaces.*;

public class Burns {

    EstadoBurns estadoBurns;

    public Burns(EstadoBurns unEstadoEconomico) {

        estadoBurns = unEstadoEconomico;

    }

    public void estaPobre() {

        this.estadoBurns.estaPobre();

    }
}
