
import modelo.*;
import org.junit.jupiter.api.Test;

import static modelo.Constantes.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestAmericaVirtual {

    @Test
    public void revisionDePeligroConBurnsRicoConHomeroConcentradoYCantidadDeUranioEstable(){

        Burns burns = new Burns(new Rico());

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        assertEquals("Todo bien. Yujuu!!", plantaNuclear.revisionDePeligro);

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConHomeroConcentradoYCantidadDeUranioEstable(){

        Burns burns = new Burns(new Pobre());

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        plantaNuclear.revisionDePeligro;

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsRicoConHomeroConcentradoYCantidadDeUranioInestable(){

        Burns burns = new Burns(new Rico());

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.revisionDePeligro;

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConHomeroConcentradoYCantidadDeUranioInestable(){

        Burns burns = new Burns(new Pobre());

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.revisionDePeligro;

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsRicoConHomeroDistraidoYCantidadDeUranioEstable(){

        Burns burns = new Burns(new Rico());

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        plantaNuclear.horaDeAlmuerzo();

        plantaNuclear.revisionDePeligro;

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConHomeroDistraidoYCantidadDeUranioEstable(){

        Burns burns = new Burns(new Pobre());

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        plantaNuclear.horaDeAlmuerzo();

        plantaNuclear.revisionDePeligro;

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsRicoConHomeroDistraidoYCantidadDeUranioInestable(){

        Burns burns = new Burns(new Rico());

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.horaDeAlmuerzo();

        plantaNuclear.revisionDePeligro;

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConHomeroDistraidoYCantidadDeUranioInestable(){

        Burns burns = new Burns(new Pobre());

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.horaDeAlmuerzo();

        plantaNuclear.revisionDePeligro;

    }

    @Test
    public void revisionDePeligroConBurnsRicoConPatoBalancinYCantidadDeUranioEstable(){

        Burns burns = new Burns(new Rico());

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        plantaNuclear.despido();

        plantaNuclear.revisionDePeligro;

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConPatoBalancinYCantidadDeUranioEstable(){

        Burns burns = new Burns(new Pobre());

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_ESTABLE);

        plantaNuclear.despido();

        assertEquals("Todo mal. D'Ohhh!!!"plantaNuclear.revisionDePeligro);

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsRicoConPatoBalancinYCantidadDeUranioInestable(){

        Burns burns = new Burns(new Rico());

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.despido();

        plantaNuclear.revisionDePeligro;

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConPatoBalancinYCantidadDeUranioInestable(){

        Burns burns = new Burns(new Pobre());

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        plantaNuclear.agregarUranio(CANTIDAD_URANIO_INESTABLE);

        plantaNuclear.despido();

        plantaNuclear.revisionDePeligro;

    }

}
