import modelo.Burns;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAmericaVirtual {

    @Test
    public void revisionDePeligroConBurnsRicoConHomeroConcentradoYCantidadDeUranioEstable(){

        Burns burns = new Burns(new Rico);

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 9000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);

        assertEquals("Todo bien. Yujuu!!", plantaNuclear.revisionDePeligro);

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConHomeroConcentradoYCantidadDeUranioEstable(){

        Burns burns = new Burns(new Pobre);

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 9000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);

        assertEquals("Todo mal. D'Ohhh!!!"plantaNuclear.revisionDePeligro);

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsRicoConHomeroConcentradoYCantidadDeUranioInestable(){

        Burns burns = new Burns(new Rico);

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 10000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);

        plantaNuclear.revisionDePeligro;

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConHomeroConcentradoYCantidadDeUranioInestable(){

        Burns burns = new Burns(new Pobre);

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 10000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);


        plantaNuclear.revisionDePeligro;

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsRicoConHomeroDistraidoYCantidadDeUranioEstable(){

        Burns burns = new Burns(new Rico);

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 9000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);

        plantaNuclear.horaDeAlmuerzo();

        plantaNuclear.revisionDePeligro;

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConHomeroDistraidoYCantidadDeUranioEstable(){

        Burns burns = new Burns(new Pobre);

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 9000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);

        plantaNuclear.horaDeAlmuerzo();

        plantaNuclear.revisionDePeligro;

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsRicoConHomeroDistraidoYCantidadDeUranioInestable(){

        Burns burns = new Burns(new Rico);

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 10000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);

        plantaNuclear.horaDeAlmuerzo();

        plantaNuclear.revisionDePeligro;

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConHomeroDistraidoYCantidadDeUranioInestable(){

        Burns burns = new Burns(new Pobre);

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 10000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);

        plantaNuclear.horaDeAlmuerzo();

        plantaNuclear.revisionDePeligro;

    }

    @Test
    public void revisionDePeligroConBurnsRicoConPatoBalancinYCantidadDeUranioEstable(){

        Burns burns = new Burns(new Rico);

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 9000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);

        plantaNuclear.despido();

        plantaNuclear.revisionDePeligro;

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConPatoBalancinYCantidadDeUranioEstable(){

        Burns burns = new Burns(new Pobre);

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 9000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);

        plantaNuclear.despido();

        assertEquals("Todo mal. D'Ohhh!!!"plantaNuclear.revisionDePeligro);

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsRicoConPatoBalancinYCantidadDeUranioInestable(){

        Burns burns = new Burns(new Rico);

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 10000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);

        plantaNuclear.despido();

        plantaNuclear.revisionDePeligro;

    }

    @Test(expected = PlantaNuclearEnPeligroException.class)
    public void revisionDePeligroConBurnsPobreConPatoBalancinYCantidadDeUranioInestable(){

        Burns burns = new Burns(new Pobre);

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 10000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);

        plantaNuclear.despido();

        plantaNuclear.revisionDePeligro;

    }

}
