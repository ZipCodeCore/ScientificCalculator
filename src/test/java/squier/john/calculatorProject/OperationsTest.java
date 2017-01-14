package squier.john.calculatorProject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/13/17.
 */
public class OperationsTest {

    Operations operations;
    double delta;

    @Before
    public void setup() {
        operations = new Operations();
        delta = 0.00001;
    }

    @Test
    public void testPerformCalculationAddition() {
        double expected = 2.0;
        double actual = operations.performCalculation("+", 0.0, 2.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationSubtraction() {
        double expected = 2.0;
        double actual = operations.performCalculation("-", 4.0, 2.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationMultiplication() {
        double expected = 10.0;
        double actual = operations.performCalculation("*", 2.0, 5.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationDivision() {
        double expected = 5.0;
        double actual = operations.performCalculation("/", 10.0, 2.0);
    }

}
