
import modelo.Burns;
import modelo.PlantaNuclear;
import modelo.Pobre;
import modelo.Rico;
import modelo.exception.PlantaNuclearEnPeligroException;
import org.junit.Test;

import static modelo.Constantes.*;
import static org.junit.Assert.assertEquals;

public class AmericaVirtualTest {

    @Test
    public void tesRevisionDePeligroConBurnsRicoConHomeroConcentradoYCantidadDeUranioEstable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Rico()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        assertEquals("Todo bien. Yujuu!!", plantaNuclear.revisionDePeligro());

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void testRevisionDePeligroConBurnsPobreConHomeroConcentradoYCantidadDeUranioEstable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Pobre()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        plantaNuclear.revisionDePeligro();

    }

    @Test
    public void testRevisionDePeligroConBurnsRicoConHomeroConcentradoYCantidadDeUranioInestable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Rico()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        assertEquals("Todo bien. Yujuu!!", plantaNuclear.revisionDePeligro());

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void testRevisionDePeligroConBurnsPobreConHomeroConcentradoYCantidadDeUranioInestable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Pobre()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.revisionDePeligro();

    }

    @Test
    public void testRevisionDePeligroConBurnsRicoConHomeroDistraidoYCantidadDeUranioEstable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Rico()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        plantaNuclear.horaDeAlmuerzo();

        assertEquals("Todo bien. Yujuu!!", plantaNuclear.revisionDePeligro());

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void testRevisionDePeligroConBurnsPobreConHomeroDistraidoYCantidadDeUranioEstable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Pobre()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        plantaNuclear.horaDeAlmuerzo();

        plantaNuclear.revisionDePeligro();

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void testRevisionDePeligroConBurnsRicoConHomeroDistraidoYCantidadDeUranioInestable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Rico()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.horaDeAlmuerzo();

        plantaNuclear.revisionDePeligro();

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void testRevisionDePeligroConBurnsPobreConHomeroDistraidoYCantidadDeUranioInestable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Pobre()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.horaDeAlmuerzo();

        plantaNuclear.revisionDePeligro();

    }

    @Test
    public void testRevisionDePeligroConBurnsRicoConPatoBalancinYCantidadDeUranioEstable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Rico()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        plantaNuclear.despido();

        assertEquals("Todo bien. Yujuu!!", plantaNuclear.revisionDePeligro());

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void testRevisionDePeligroConBurnsPobreConPatoBalancinYCantidadDeUranioEstable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Pobre()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        plantaNuclear.despido();

        plantaNuclear.revisionDePeligro();

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void testRevisionDePeligroConBurnsRicoConPatoBalancinYCantidadDeUranioInestable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Rico()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.despido();

        plantaNuclear.revisionDePeligro();

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void testRevisionDePeligroConBurnsPobreConPatoBalancinYCantidadDeUranioInestable(){

        PlantaNuclear plantaNuclear = new PlantaNuclear(new Burns(new Pobre()));

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.despido();

        plantaNuclear.revisionDePeligro();

    }

}
