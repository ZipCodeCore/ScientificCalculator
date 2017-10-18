package reynoldstitko.gillian;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by gillianreynolds-titko on 1/16/17.
 */
public class InverseCalculationModelTest {
    InverseCalculationModel inverseCalculationModel;

    @Before
    public void setUp(){
        inverseCalculationModel = new InverseCalculationModel();
    }

    @Test
    public void inverseTest(){
        Double expected = 4.0;
        Double actual = inverseCalculationModel.inverse(0.25);
        assertEquals("I expected the inverse to be 4.0", expected, actual);
    }

    @Test
    public void inverseByZeroTest(){
        Double expected = 0.0;
        Double actual = inverseCalculationModel.inverse(0.0);
        assertEquals("I expected the inverse of 0 to be NAN", expected, actual);
    }
}
