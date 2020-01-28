package modelo.interfaces;

import modelo.PlantaNuclear;

public interface EmpleadoDeControl {

    Boolean estaDistraido();

    void almorzar();

    void monitorear(PlantaNuclear unaPlantaNuclear);

}
