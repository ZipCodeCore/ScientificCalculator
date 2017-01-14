package squier.john.calculatorProject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Double.NaN;

/**
 * Created by johnsquier on 1/14/17.
 */
public class CalculatorModelTest {

    CalculatorModel calculatorModel;
    double delta;

    @Before
    public void setup() {
        calculatorModel = new CalculatorModel();
        delta = 0.00001;
    }

    @Test
    public void getCurrentValueTest() {
        double expected = 0.0;
        double actual = calculatorModel.getCurrentValue();
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void setCurrentValueTest() {
        double expected = 100.0;
        calculatorModel.setCurrentValue(100.0);
        double actual = calculatorModel.getCurrentValue();
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void getInputValueTest() {
        double expected = 0.0;
        double actual = calculatorModel.getInputValue();
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void setInputValueTest() {
        double expected = 100.0;
        calculatorModel.setInputValue(100.0);
        double actual = calculatorModel.getInputValue();
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void getDisplayModeTest() {
        DisplayModes expected = DisplayModes.DECIMAL;
        DisplayModes actual = calculatorModel.getDisplayMode();
        Assert.assertEquals("I expected actual to be DECIMAL", expected, actual);
    }

    @Test
    public void setDisplayModeTest() {
        DisplayModes expected = DisplayModes.BINARY;
        calculatorModel.setDisplayMode(DisplayModes.BINARY);
        DisplayModes actual = calculatorModel.getDisplayMode();
        Assert.assertEquals("I expect actual to be BINARY", expected, actual);
    }

    @Test
    public void getOperationsTest() {
        Operations expected = new Operations();
        Operations actual = calculatorModel.getOperations();
        Assert.assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    public void hasOneArgumentTestTrue() {
        boolean actual = calculatorModel.hasOneArgument(new String[1]);
        Assert.assertTrue(actual);
    }

    @Test
    public void hasOneArgumentTestFalse() {
        boolean actual = calculatorModel.hasOneArgument(new String[2]);
        Assert.assertFalse(actual);
    }

    @Test
    public void hasTwoArgumentsTestTrue() {
        boolean actual = calculatorModel.hasTwoArguments(new String[2]);
        Assert.assertTrue(actual);
    }

    @Test
    public void hasTwoArgumentsTestFalse() {
        boolean actual = calculatorModel.hasTwoArguments(new String[1]);
        Assert.assertFalse(actual);
    }

    @Test
    public void isArgDoubleTestTrue() {
        boolean actual = calculatorModel.isArgDouble("2");
        Assert.assertTrue(actual);
    }

    @Test
    public void isArgDoubleTestFalse() {
        boolean actual = calculatorModel.isArgDouble("+");
        Assert.assertFalse(actual);
    }

    @Test
    public void resetInputValueTest() {
        double expected = 0.0;
        calculatorModel.resetInputValue();
        double actual = calculatorModel.getInputValue();
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void setErrorStateTest() {
        double expected = NaN;
        calculatorModel.setErrorState();
        double actual = calculatorModel.getCurrentValue();
        Assert.assertEquals(expected, actual, delta);
    }
}
