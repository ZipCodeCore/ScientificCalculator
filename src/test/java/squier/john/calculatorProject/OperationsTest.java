package squier.john.calculatorProject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Double.NEGATIVE_INFINITY;
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
        delta = 0.00000001;
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
        double expected = 0.25;
        double actual = operations.performCalculation("exp", -2.0, -2.0);
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testPerformCalculationExponentiationOneArgNegOneArgPos() {
        double expected = 4.0;
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
    public void testPerformCalculationNegatePositive() {
        double expected = -1.0;
        double actual = operations.performCalculation("neg", 1.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationNegateNegative() {
        double expected = 1.0;
        double actual = operations.performCalculation("neg", -1.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationNegateZero() {
        double expected = 0.0;
        double actual = operations.performCalculation("neg", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationSineZero() {
        double expected = 0.0;
        double actual = operations.performCalculation("sin", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationSineNinety() {
        double expected = 1.0;
        double actual = operations.performCalculation("sin", 90.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationSineTwoSeventy() {
        double expected = -1.0;
        double actual = operations.performCalculation("sin", 270.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationArcsineNegativeOne() {
        double expected = -90.0;
        double actual = operations.performCalculation("asin", -1.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationArcsineOne() {
        double expected = 90.0;
        double actual = operations.performCalculation("asin", 1.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationArcsineError() {
        double expected = NaN;
        double actual = operations.performCalculation("asin", -100.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationCosineZero() {
        double expected = 1.0;
        double actual = operations.performCalculation("cos", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationCosineNinety() {
        double expected = 0.0;
        double actual = operations.performCalculation("cos", 90.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationCosineOneEighty() {
        double expected = -1.0;
        double actual = operations.performCalculation("cos", 180.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationArcosineNegativeOne() {
        double expected = 180.0;
        double actual = operations.performCalculation("acos", -1.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationArcosineOne() {
        double expected = 0.0;
        double actual = operations.performCalculation("acos", 1.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationArcosineError() {
        double expected = NaN;
        double actual = operations.performCalculation("acos", -100.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationTanZero() {
        double expected = 0.0;
        double actual = operations.performCalculation("tan", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationTanOneEighty() {
        double expected = 0.0;
        double actual = operations.performCalculation("tan", 180.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationArctanZero() {
        double expected = 0.0;
        double actual = operations.performCalculation("atan", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationArctanOne() {
        double expected = 45.0;
        double actual = operations.performCalculation("atan", 1.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformLogZero() {
        double expected = NaN;
        double actual = operations.performCalculation("log", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformLogOne() {
        double expected = 0.0;
        double actual = operations.performCalculation("log", 1.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformLogOneHundred() {
        double expected = 2.0;
        double actual = operations.performCalculation("log", 100.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformInverseLogNegativeOne() {
        double expected = 0.1;
        double actual = operations.performCalculation("10^x", -1.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformInverseLogZero() {
        double expected = 1.0;
        double actual = operations.performCalculation("10^x", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformInverseLogOne() {
        double expected = 10.0;
        double actual = operations.performCalculation("10^x", 1.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformNaturalLogZero() {
        double expected = NaN;
        double actual = operations.performCalculation("ln", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformNaturalLogOne() {
        double expected = 0.0;
        double actual = operations.performCalculation("ln", 1.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformInverseNaturalLogNegativeOne() {
        double expected = 1/Math.E;
        double actual = operations.performCalculation("e^x", -1.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformInverseNaturalLogZero() {
        double expected = 1.0;
        double actual = operations.performCalculation("e^x", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformInverseNaturalLogOne() {
        double expected = Math.E;
        double actual = operations.performCalculation("e^x", 1.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationFactorialZero() {
        double expected = 0.0;
        double actual = operations.performCalculation("!", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationFactorialThree() {
        double expected = 6.0;
        double actual = operations.performCalculation("!", 3.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPI() {
        double expected = Math.PI;
        double actual = operations.performCalculation("pi", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testE() {
        double expected = Math.E;
        double actual = operations.performCalculation("e", 0.0, 0.0);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testPerformCalculationClear() {
        double expected = 0.0;
        double actual = operations.performCalculation("clear", 10.0, 10.0);
        Assert.assertEquals(expected, actual, delta);
    }
}
