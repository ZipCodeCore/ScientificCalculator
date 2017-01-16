package reynoldstitko.gillian;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gillianreynolds-titko on 1/16/17.
 */
public class SimpleCalculationsModelTest {
    SimpleCalculationsModel simpleCalculationsModel;

    @Before
    public void setUp(){
        simpleCalculationsModel = new SimpleCalculationsModel();
    }

    @Test
    public void additionTest(){
        Double expected = 4.0;
        Double actual = simpleCalculationsModel.addition(1.0, 3.0);
        assertEquals("I expected the addition to be 4.0", expected, actual);
    }

    @Test
    public void subtractionTest(){
        Double expected = -2.0;
        Double actual = simpleCalculationsModel.subtraction(5.0, 3.0);
        assertEquals("I expected the subtraction to be 2.0", expected, actual);
    }

    @Test
    public void multiplicationTest(){
        Double expected = 15.0;
        Double actual = simpleCalculationsModel.multiplication(5.0, 3.0);
        assertEquals("I expected the multiplication to be 15.0", expected, actual);
    }

    @Test
    public void divisionTest(){
        Double expected = 5.0;
        Double actual = simpleCalculationsModel.division(3.0, 15.0);
        assertEquals("I expected the division to be 15.0", expected, actual);
    }

    //Need to check for Err
    @Test
    public void divisionByZeroTest(){
        Double expected = 0.0;
        Double actual = simpleCalculationsModel.division(0.0, 3.0);
        assertEquals("I expected the division by 0 to be 0.0", expected, actual);
    }

}
