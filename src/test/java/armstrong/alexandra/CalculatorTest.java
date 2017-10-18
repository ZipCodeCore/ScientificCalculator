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
        calc.setDisplay(6d);
        double expected = 6d;
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
        calc.multiply(2.0d);
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
    public void percentTest(){
        calc.setDisplay(50);
        calc.percent();
        double expected = 0.5d;
        double actual = calc.getDisplay();
        assertEquals(expected, actual, 0);
    }

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
    public void exponent(){
        calc.setDisplay(2);
        calc.exponent(2);
        double expected = 4;
        double actual = calc.getDisplay();
        assertEquals(expected, actual);
    }

    @Test
    public void inverse(){
        calc.setDisplay(2);
        calc.inverse();
        double expected = 0.5d;
        double actual = calc.getDisplay();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void invertSignOfDisplay(){
        calc.setDisplay(2);
        calc.invertSignOfDisplay();
        double expected = -2d;
        double actual = calc.getDisplay();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void getErrorDisplayTest(){
        String expected = null;
        String actual = calc.getErrorDisplay();
        assertEquals(expected, actual);
    }

    @Test
    public void setErrorDisplayTest(){
        calc.setErrorDisplay();
        String expected = "Err";
        String actual = calc.getErrorDisplay();
        assertEquals(expected, actual);
    }

    @Test
    public void clearErrorDisplayTest(){
        calc.clearErrorDisplay();
        String expected = null;
        String actual = calc.getErrorDisplay();
        assertEquals(expected, actual);

    }

}
