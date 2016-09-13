package kamsheh.adam.project1calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by adam on 9/11/16.
 */
public class CalculatorTest {


    Calculator calc;
    @Before
    public void initialize() {
        calc = new Calculator(10);
    }

    @Test
    public void CalculatorTest() {
        double exptectedValue = 10.0;
        double actualValue = calc.getState();

        Assert.assertEquals("Check constructor.", exptectedValue, actualValue, 0);
    }

    @Test
    public void getStateTest() {
        calc.changeState(10);
        double expectedValue = 10;
        double actualValue = calc.getState();

        Assert.assertEquals("Check getState is correct.", expectedValue, actualValue, .00001);
    }

    @Test
    public void changeStateTest() {
        //already completed with "getStateTest"
    }

    @Test
    public void clearDisplayTest() {
        calc.clearDisplay();
        double expectedValue = 0.0;
        double actualValue = calc.getState();

        Assert.assertEquals("clearDisplay shoudl set state to 0.0", expectedValue, actualValue, .00001);
    }

    @Test
    public void addToMemoryTest() {
        calc.addToMemory();
        double expectedValue = 10.0;
        double actualValue = calc.getMemory();

        Assert.assertEquals("Check that state copies to memory.", expectedValue, actualValue, 0);
    }

    @Test
    public void clearMemoryTest() {
        calc.addToMemory();
        calc.clearMemory();
        double expectedValue = 0.0;
        double actualValue = calc.getMemory();

        Assert.assertEquals("Check that memory clears to 0.0.", expectedValue, actualValue, 0);
    }

    @Test
    public void getMemoryTest() {
        calc.changeState(10);
        calc.addToMemory();
        double expectedValue = 10;
        double actualValue = calc.getMemory();

        Assert.assertEquals("Check getMemory function", expectedValue, actualValue, 0);
    }

    @Test
    public void setStateToMemory() {
        calc.changeState(55);
        calc.addToMemory();
        calc.changeState(1000);
        calc.setStateToMemory();
        double expectedValue = 55;
        double actualValue = calc.getMemory();

        Assert.assertEquals("Check that state is set to memory.", expectedValue, actualValue, 0);
    }
}