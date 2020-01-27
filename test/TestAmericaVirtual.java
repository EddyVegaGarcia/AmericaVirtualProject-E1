import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAmericaVirtual {

    @Test
    public void revisionDePeligroConCantidadDeUranioEstableConHomeroConcentradoYBurnsRico(){

        Burns burns = new Burns("Rico");

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 9000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);

        assertEquals("Todo bien. Yujuu!!", plantaNuclear.revisionDePeligro);

    }

    @Test
    public void revisionDePeligroConCantidadDeUranioEstableConHomeroConcentradoYBurnsPobre(){

        Burns burns = new Burns("Pobre");

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 9000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);

        assertEquals("Todo mal. D'Ohhh!!!"plantaNuclear.revisionDePeligro);

    }

    @Test
    public void revisionDePeligroConCantidadDeUranioEstableConHomeroDistraidoYBurnsRico(){

        Burns burns = new Burns("Rico");

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 9000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);

        plantaNuclear.horaDeAlmuerzo();

        assertEquals("Todo mal. D'Ohhh!!!"plantaNuclear.revisionDePeligro);

    }

    @Test
    public void revisionDePeligroConCantidadDeUranioInestableConHomeroConcentradoYBurnsRico(){

        Burns burns = new Burns("Rico");

        PlantaNuclear plantaNuclear = new PlantaNuclear(burns);

        Integer cantidadDeUranioEstable = 10000;
        plantaNuclear.agregarUranio(cantidadDeUranioEstable);


        assertEquals("Todo mal. D'Ohhh!!!"plantaNuclear.revisionDePeligro);

    }

}
