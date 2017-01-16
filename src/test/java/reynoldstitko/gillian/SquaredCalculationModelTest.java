package reynoldstitko.gillian;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gillianreynolds-titko on 1/16/17.
 */
public class SquaredCalculationModelTest {
    SquaredCalculationModel squaredCalculationModel;

    @Before
    public void setUp(){
        squaredCalculationModel = new SquaredCalculationModel();
    }

    @Test
    public void squaredTest(){
        Double expected = 9.0;
        Double actual = squaredCalculationModel.squared(3.0);
        assertEquals("I expected the addition to be 9.0", expected, actual);
    }
}
