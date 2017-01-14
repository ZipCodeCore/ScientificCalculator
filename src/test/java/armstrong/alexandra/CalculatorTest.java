package armstrong.alexandra;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alexandraarmstrong on 1/13/17.
 */
public class CalculatorTest {

    Calculator calc;

    @Before
    public void setUp(){
        calc = new Calculator();
    }

    @Test
    public void getDisplayTest(){
        double expected = 0;
        double actual = calc.getDisplay();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void setDisplayTest(){
        calc.setDisplay(1d);
        double expected = 1;
        double actual = calc.getDisplay();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void clearDisplayTest(){
        calc.clearDisplay();
        double expected = 0;
        double actual = calc.getDisplay();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void addTest(){
        calc.add(1);
        double expected = 1;
        double actual = calc.getDisplay();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void subtractTest(){
        calc.subtract(1);
        double expected = -1;
        double actual = calc.getDisplay();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void multiplyTest(){
        calc.setDisplay(2);
        calc.multiply(2);
        double expected = 4;
        double actual = calc.getDisplay();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void divideTest(){
        calc.setDisplay(6);
        calc.divide(2);
        double expected = 3;
        double actual = calc.getDisplay();
        assertEquals(expected, actual, 0);
    }

    @Test
    @Ignore
    public void percentTest(){}

    @Test
    public void squareTest(){
        calc.setDisplay(3);
        calc.square();
        double expected = 9;
        double actual = calc.getDisplay();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void squareRoot(){
        calc.setDisplay(9);
        calc.squareRoot();
        double expected = 3;
        double actual = calc.getDisplay();
        assertEquals(expected, actual, 0);
    }

    @Test
    @Ignore
    public void exponent(){}

    @Test
    public void inverse(){
        calc.setDisplay(2);
        calc.inverse();
        double expected = 0.5d;
        double actual = calc.getDisplay();
        assertEquals(expected, actual, 0);
    }

    @Test
    @Ignore
    public void invertSignOfDisplay(){}

    @Test
    public void getErrorTest(){
        double expected = 0;
        double actual = calc.getError();
        assertEquals(expected, actual);
    }

    @Test
    public void errorDisplay(){
        double expected = 0;
        double actual = calc.getError();
        assertEquals(expected, actual);
    }

    @Test
    public void clearError(){
        double expected = 0;
        double actual = calc.getError();
        assertEquals(expected, actual);

    }

}
