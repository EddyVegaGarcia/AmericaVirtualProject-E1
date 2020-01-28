package modelo;

import modelo.interfaces.*;

public class PatoBalancin implements EmpleadoDeControl {

    @Override
    public Boolean estaDistraido() {
        return true;
    }
}
