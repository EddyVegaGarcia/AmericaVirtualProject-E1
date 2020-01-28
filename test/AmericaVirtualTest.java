
import modelo.*;
import modelo.exception.*;
import org.junit.Test;

import static modelo.Constantes.*;
import static org.junit.Assert.assertEquals;

public class AmericaVirtualTest {

    @Test
    public void revisionDePeligroConBurnsRicoConHomeroConcentradoYCantidadDeUranioEstable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Rico()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        assertEquals("Todo bien. Yujuu!!", (plantaNuclear.revisionDePeligro()));

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConHomeroConcentradoYCantidadDeUranioEstable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Pobre()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        plantaNuclear.revisionDePeligro();

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsRicoConHomeroConcentradoYCantidadDeUranioInestable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Rico()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.revisionDePeligro();

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConHomeroConcentradoYCantidadDeUranioInestable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Pobre()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.revisionDePeligro();

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsRicoConHomeroDistraidoYCantidadDeUranioEstable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Rico()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        plantaNuclear.horaDeAlmuerzo();

        plantaNuclear.revisionDePeligro();

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConHomeroDistraidoYCantidadDeUranioEstable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Pobre()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        plantaNuclear.horaDeAlmuerzo();

        plantaNuclear.revisionDePeligro();

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsRicoConHomeroDistraidoYCantidadDeUranioInestable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Rico()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.horaDeAlmuerzo();

        plantaNuclear.revisionDePeligro();

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConHomeroDistraidoYCantidadDeUranioInestable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Pobre()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.horaDeAlmuerzo();

        plantaNuclear.revisionDePeligro();

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsRicoConPatoBalancinYCantidadDeUranioEstable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Rico()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        plantaNuclear.despido();

        plantaNuclear.revisionDePeligro();

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConPatoBalancinYCantidadDeUranioEstable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Pobre()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        plantaNuclear.despido();

        plantaNuclear.revisionDePeligro();

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsRicoConPatoBalancinYCantidadDeUranioInestable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Rico()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.despido();

        plantaNuclear.revisionDePeligro();

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConPatoBalancinYCantidadDeUranioInestable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Pobre()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.despido();

        plantaNuclear.revisionDePeligro();

    }

}
