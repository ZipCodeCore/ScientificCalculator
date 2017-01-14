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
    public void testPerformCalculationAdditionPositive() {
        double expected = 2.0;
        double actual = operations.performCalculation("+", 0.0, 2.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationAdditionNegative() {
        double expected = -5.0;
        double actual = operations.performCalculation("+", 0.0, -5.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationAddditionZero() {
        double expected = 0.0;
        double actual = operations.performCalculation("+", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationSubtractionPositive() {
        double expected = 2.0;
        double actual = operations.performCalculation("-", 4.0, 2.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationSubtractionNegative() {
        double expected = -2.0;
        double actual = operations.performCalculation("-", -7.0, -5.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationSubtractionZero() {
        double expected = 0.0;
        double actual = operations.performCalculation("-", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationMultiplicationPositive() {
        double expected = 10.0;
        double actual = operations.performCalculation("*", 2.0, 5.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationMultiplicationNegativeResult() {
        double expected =  -10.0;
        double actual = operations.performCalculation("*", -2.0, 5.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationMultiplicationNegativeArgs() {
        double expected = 10.0;
        double actual = operations.performCalculation("*", -2.0, -5.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationMultiplicationZero() {
        double expected = 0.0;
        double actual = operations.performCalculation("*", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationDivisionPositive() {
        double expected = 5.0;
        double actual = operations.performCalculation("/", 10.0, 2.0);
        Assert.assertEquals(expected,actual, delta);
    }

    @Test
    public void testPerformCalculationDivisionNegativeResult() {
        double expected = -5.0;
        double actual = operations.performCalculation("/", -10.0, 2.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationDivisionNegativeArgs() {
        double expected = 5.0;
        double actual = operations.performCalculation("/", -10.0, -2.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationSquarePositive() {
        double expected = 4.0;
        double actual = operations.performCalculation("square", 2.0, 2.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationSquareNegative() {
        double expected = 4.0;
        double actual = operations.performCalculation("square", -2.0, -2.0);
        Assert.assertEquals(expected, actual, delta);
    }
}
