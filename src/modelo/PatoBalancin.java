package modelo;

import modelo.interfaces.*;

public class PatoBalancin implements EmpleadoDeControl {

    @Override
    public Boolean estaDistraido() {

        return true;

    }

    @Override
    public void almorzar() {

    }

    @Override
    public void monitorear(PlantaNuclear unaPlantaNuclear) {

        unaPlantaNuclear.posibleCasoEnPeligro();

    }
}
