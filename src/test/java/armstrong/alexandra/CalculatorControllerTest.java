package armstrong.alexandra;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static java.lang.Math.PI;
import static junit.framework.TestCase.assertEquals;
import static armstrong.alexandra.DisplayMode.*;
import static armstrong.alexandra.Notation.*;
import static armstrong.alexandra.TrigUnit.*;


/**
 * Created by alexandraarmstrong on 1/14/17.
 */
public class CalculatorControllerTest {
    Calculator calc;
    ScientificCalculator sciCalc;
    CalculatorController calcCont;

    @Before
    public void setUp(){
        calc = new Calculator();
        sciCalc = new ScientificCalculator();
        calcCont = new CalculatorController();
    }

    /*@Test
    @Ignore
    public void checkDisplayModeTest(){}

    @Test
    @Ignore
    public void checkNotationTest(){}

    @Test
    @Ignore
    public void checkTrigUnitsTest(){}*/

    @Test
    public void convertToDecimalTest(){
        double expected = 42d;
        double actual = calcCont.convertToDecimal("2A");
        assertEquals(expected, actual);
    }

    @Test
    public void convertToHexadecimalTest(){
        String expected = "2a";
        String actual = calcCont.convertToHexadecimal(42);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToStandardNotationTest(){
        double expected = 42321d;
        double actual = calcCont.convertToStandardNotation(4.2321e4);
        assertEquals(expected, actual, 1000);
    }

    @Test
    public void convertToScientificNotationTest(){
        double expected = 4.2321E4;
        double actual = calcCont.convertToScientificNotation(42321);
        assertEquals(expected, actual, 10);
    }

    @Test
    public void convertToRadiansTest(){
        double expected = PI;
        double actual = calcCont.convertToRadians(180d);
        assertEquals(expected, actual, 1);
    }

    @Test
    public void convertToDegreesTest(){
        double expected = 180;
        double actual = calcCont.convertToDegrees(PI);
        assertEquals(expected, actual, 1);
    }

    @Test
    public void parseInputTest(){}

    @Test
    public void translateInputTest(){}
}
