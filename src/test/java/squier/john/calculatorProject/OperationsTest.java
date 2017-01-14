package squier.john.calculatorProject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Double.NaN;

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
    public void testPerformCalculationAdditionZero() {
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
    public void testPerformCalculationDivisionZero() {
        double expected = 0.0;
        double actual = operations.performCalculation("/", 0.0, 10.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationDivisionByZero() {
        double expected = NaN;
        double actual = operations.performCalculation("\\", 10.0, 0.0);
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

    @Test
    public void testPerformCalculationSquareZero() {
        double expected = 0.0;
        double actual = operations.performCalculation("square", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationSqrtPositive() {
        double expected = 4.0;
        double actual = operations.performCalculation("squareroot", 16.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationSqrtNegative() {
        double expected = NaN;
        double actual = operations.performCalculation("sqrt", -10.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationSqrtZero() {
        double expected = 0.0;
        double actual = operations.performCalculation("sqrt", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationInversePositive() {
        double expected = 0.5;
        double actual = operations.performCalculation("inv", 2.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationInverseNegative() {
        double expected = -0.5;
        double actual = operations.performCalculation("inverse", -2.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationInverseZero() {
        double expected = NaN;
        double actual = operations.performCalculation("inverse", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationExponentiationPositive() {
        double expected = 4.0;
        double actual = operations.performCalculation("exp", 2.0, 2.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationExponentiationBothArgsNegative() {
        double expected = -0.25;
        double actual = operations.performCalculation("exp", -2.0, -2.0);
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testPerformCalculationExponentiationOneArgNegOneArgPos() {
        double expected = -4.0;
        double actual  = operations.performCalculation("exp", -2.0, 2.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationExponentiationOneArgPosOneArgNeg() {
        double expected = 0.25;
        double actual = operations.performCalculation("exp", 2.0, -2.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationExponentiationBaseZero() {
        double expected = 0.0;
        double actual = operations.performCalculation("exp", 0.0, 2.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerforCalculationExponentiationMantissaZero() {
        double expected = 1.0;
        double actual = operations.performCalculation("exp", 2.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationClear() {
        double expected = 0.0;
        double actual = operations.performCalculation("clear", 10.0, 10.0);
        Assert.assertEquals(expected, actual, delta);
    }
}
