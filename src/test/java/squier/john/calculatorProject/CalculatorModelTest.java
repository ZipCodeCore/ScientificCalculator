package squier.john.calculatorProject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
    public void getOperationsTest() {
        Operations expected = new Operations();
        Operations actual = calculatorModel.getOperations();
        Assert.assertEquals(expected.getClass(), actual.getClass());
    }
}
