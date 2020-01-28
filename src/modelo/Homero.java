package modelo;

import modelo.exception.*;
import modelo.interfaces.*;

import static modelo.Constantes.*;

public class Homero implements EmpleadoDeControl {

    private EstadoHomero estadoHomero;

    public Integer donas;

    public Homero(Integer unaCantidadDonas) {

        this.estadoHomero = new Concentrado();
        this.donas = unaCantidadDonas;

    }

    public void cambioDeEstado(EstadoHomero unNuevoEstado){

        estadoHomero = unNuevoEstado;

    }

    public void comprarDona(Integer unaCantidadDeDonas) {

        this.donas += unaCantidadDeDonas;

    }

    public void comerDona(){

        this.donas -= CANTIDAD_DONAS_AL_COMER;

    }

    @Override
    public Boolean estaDistraido() {

        return estadoHomero.estaDistraido();

    }

    @Override
    public void almorzar() {

        this.estadoHomero.cambio(this);
        this.comprarDona(CANTIDAD_DONAS_AL_COMPRAR);
        this.comerDona();

    }

    @Override
    public void monitorear(PlantaNuclear unaPlantaNuclear) {

        try{

            this.estaDistraido();

        }catch (PosibleCasoEnPeligroException e){

            unaPlantaNuclear.posibleCasoEnPeligro();

        }

    }
}
