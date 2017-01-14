package armstrong.alexandra;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static armstrong.alexandra.DisplayMode.*;
import static armstrong.alexandra.Notation.*;
import static armstrong.alexandra.TrigUnit.*;

import java.awt.*;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alexandraarmstrong on 1/13/17.
 */
public class ScientificCalculatorTest {
    ScientificCalculator sciCalc;

    @Before
    public void setUp(){
        sciCalc = new ScientificCalculator();
    }

    @Test
    public void addDisplayToMemoryTest(){
        sciCalc.setDisplay(4);
        sciCalc.addDisplayToMemory();
        double expected = 4;
        double actual = sciCalc.getMemory();
        assertEquals(expected, actual);
    }

    @Test
    public void resetMemoryTest(){
        sciCalc.setMemory(4);
        sciCalc.resetMemory();
        double expected = 0;
        double actual = sciCalc.getMemory();
        assertEquals(expected, actual);
    }

    @Test
    public void recallStoredValueFromMemoryTest(){
        sciCalc.setMemory(4);
        sciCalc.recallStoredValueFromMemory();
        double expected = 4;
        double actual = sciCalc.getDisplay();
        assertEquals(expected, actual);
    }

    @Test
    public void getModeTest(){
        DisplayMode expected = DECIMAL;
        DisplayMode actual = sciCalc.getMode();
        assertEquals(expected, actual);
    }

    @Test
    public void switchDisplayModeTest(){
        sciCalc.switchDisplayMode();
        sciCalc.switchDisplayMode();
        DisplayMode expected = BINARY;
        DisplayMode actual = sciCalc.getMode();
        assertEquals(expected, actual);
    }

    @Test
    public void switchDisplayModeInputTest(){
        sciCalc.switchDisplayMode(OCTAL);
        DisplayMode expected = OCTAL;
        DisplayMode actual   = sciCalc.getMode();
        assertEquals(expected, actual);
    }

    @Test
    public void getNotationTest(){
        Notation expected = STANDARD;
        Notation actual = sciCalc.getNotation();
        assertEquals(actual, expected);
    }

    @Test
    public void toggleScientificNotationTest(){
        sciCalc.toggleScientificNotation();
        Notation expected = SCIENTIFIC;
        Notation actual = sciCalc.getNotation();
        assertEquals(actual, expected);
    }

    @Test
    public void toggleScientificNotationWithInputTest(){
        sciCalc.toggleScientificNotation(SCIENTIFIC);
        Notation expected = SCIENTIFIC;
        Notation actual = sciCalc.getNotation();
        assertEquals(actual, expected);
    }


    @Test
    public void sineTest(){
        sciCalc.setDisplay(2d);
        sciCalc.sine();
        double expected = Math.sin(2d);
        double actual = sciCalc.getDisplay();
        assertEquals(expected, actual, 0d);
    }

    @Test
    public void cosineTest(){
        sciCalc.setDisplay(2d);
        sciCalc.cosine();
        double expected = Math.cos(2d);
        double actual = sciCalc.getDisplay();
        assertEquals(expected, actual, 0d);}

    @Test
    public void tangentTest(){
        sciCalc.setDisplay(2d);
        sciCalc.tangent();
        double expected = Math.tan(2d);
        double actual = sciCalc.getDisplay();
        assertEquals(expected, actual, 0d);
    }

    @Test
    public void inverseSineTest(){
        sciCalc.setDisplay(2d);
        sciCalc.inverseSine();
        double expected = 1d / Math.sin(2d);
        double actual = sciCalc.getDisplay();
        assertEquals(expected, actual, 0d);
    }

    @Test
    public void inverseCosineTest(){
        sciCalc.setDisplay(2d);
        sciCalc.inverseCosine();
        double expected = 1d / Math.cos(2d);
        double actual = sciCalc.getDisplay();
        assertEquals(expected, actual, 0d);
    }

    @Test
    public void inverseTangentTest(){
        sciCalc.setDisplay(2d);
        sciCalc.inverseTangent();
        double expected = 1 / Math.tan(2d);
        double actual = sciCalc.getDisplay();
        assertEquals(expected, actual, 0d);
    }

    @Test
    public void getTrigUnits(){
        TrigUnit expected = DEGREES;
        TrigUnit actual = sciCalc.getTrigUnit();
        assertEquals(expected, actual);
    }

    @Test
    public void switchTrigUnitsModeTest(){
        sciCalc.switchTrigUnitsMode();
        TrigUnit expected = RADIANS;
        TrigUnit actual = sciCalc.getTrigUnit();
        assertEquals(expected, actual);
    }

    @Test
    public void switchTrigUnitsModeInputTest(){
        sciCalc.switchTrigUnitsMode(RADIANS);
        TrigUnit expected = RADIANS;
        TrigUnit actual = sciCalc.getTrigUnit();
        assertEquals(expected, actual);
    }
}
