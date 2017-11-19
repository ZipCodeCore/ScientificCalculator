package reynoldstitko.gillian;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gillianreynolds-titko on 1/14/17.
 */
public class SquareRootCalculationModelTest {

    SquareRootCalculationModel squareRootCalculationModel;

    @Before
    public void setUp(){
        squareRootCalculationModel = new SquareRootCalculationModel();
    }

    @Test
    public void squareRootTest(){
        Double expected = 3.0;
        Double actual = squareRootCalculationModel.squareRoot(9.0);
        assertEquals("I expected the sqrt to be 3.0", expected, actual);
    }
}
