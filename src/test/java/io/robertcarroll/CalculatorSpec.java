package io.robertcarroll;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorSpec {

    Calculator calculator;
    Display display;
    @Before public void setUp() {
        calculator = new Calculator();
        display = new Display();
    }

    final double DELTA = 1e-9;
    @Test
    public void sumTest() {
        int expectedSum = 4;
        double actualSum = calculator.sum(2,2);
        assertEquals("The expected value is 4", expectedSum, actualSum, DELTA);
    }

    @Test
    public void differenceTest() {
        double expectedDifference = 3;
        double actualDifference = calculator.difference(6,3);
        assertEquals("The expected difference is 3", expectedDifference, actualDifference, DELTA);
    }

    @Test
    public void productTest() {
        double expectedProduct = 9;
        double actualProduct = calculator.product(3,3);
        assertEquals("The expected product is 9", expectedProduct, actualProduct, DELTA);
    }

    @Test
    public void quotientTest() {
        double expectedQuotient = 5;
        double actualQuotient = calculator.quotient(10,2);
        assertEquals("The expected quotient is 5", expectedQuotient, actualQuotient, DELTA);
    }


    @Test
    public void exponentiationTest() {
        double expectedValue = 27;
        double actualValue = calculator.exponentiation(3,3);
        assertEquals("The expected value is 9", expectedValue, actualValue, DELTA);
    }

    @Test
    public void squareRootTest() {
        double expectedValue = 3;
        double actualValue = calculator.sqaureRoot(9);
        assertEquals("The expected value is 4", expectedValue, actualValue, DELTA);
    }

    @Test
    public void squareTest() {
        double expectedValue = 16;
        double actualValue = calculator.square(4);
        assertEquals("The expected value is 4", expectedValue, actualValue, DELTA);
    }

    @Test
    public void inverseNumberTest() {;
        double expectedValue = .25;
        double actualValue = calculator.inverseNumber(4);
        assertEquals("The expected value is 4", expectedValue, actualValue, DELTA);
    }

    @Test
    public void sineTestDegrees() {
        double expectedValue = .5;
        double actualValue = calculator.sine(30);
        assertEquals("The expected value is 0.5", expectedValue, actualValue, DELTA);
    }

    @Test
    public void cosineTestDegrees() {
        double expectedValue = -1;
        double actualValue = calculator.cosine(180);
        assertEquals("The expected value is -1", expectedValue, actualValue, DELTA);
    }

    @Test
    public void tangentTestDegrees() {
        double expectedValue = 1;
        double actualValue = calculator.tangent(45);
        assertEquals("The expected value is 1", expectedValue, actualValue, DELTA);
    }

    @Test
    public void inverseSineTestDegrees() {
        double expectedValue = 30;
        double actualValue = calculator.inverseSine(.5);
        assertEquals("The expected value is 30", expectedValue, actualValue, DELTA);
    }

    @Test
    public void inverseCosineTestDegrees() {
        double expectedValue = 60;
        double actualValue = calculator.inverseCosine(.5);
        assertEquals("The expected value is 60", expectedValue, actualValue, DELTA);
    }

    @Test
    public void inverseTangentTestDegrees() {
        double expectedValue = 45;
        double actualValue = calculator.inverseTangent(1);
        assertEquals("The expected value is 45", expectedValue, actualValue, DELTA);
    }

    @Test
    public void sineTestRadians() {
        calculator.setUnits(Units.RADIANS);
        double expectedValue = 0;
        double actualValue = calculator.sine(Math.PI);
        assertEquals("The expected value is 0", expectedValue, actualValue, DELTA);
    }

    @Test
    public void cosineTestRadians() {
        calculator.setUnits(Units.RADIANS);
        double expectedValue = -1;
        double actualValue = calculator.cosine(Math.PI);
        assertEquals("The expected value is -1", expectedValue, actualValue, DELTA);
    }

    @Test
    public void tangentTestRadians() {
        calculator.setUnits(Units.RADIANS);
        double expectedValue = 0;
        double actualValue = calculator.tangent(Math.PI);
        assertEquals("The expected value is 0", expectedValue, actualValue, DELTA);
    }

    @Test
    public void inverseSineTestRadians() {
        calculator.setUnits(Units.RADIANS);
        double expectedValue = 1.570796326;
        double actualValue = calculator.inverseSine(1);
        assertEquals("The expected value is 1.57", expectedValue, actualValue, DELTA);
    }

    @Test
    public void inverseCosineTestRadians() {
        calculator.setUnits(Units.RADIANS);
        double expectedValue = 1.570796326;
        double actualValue = calculator.inverseCosine(0);
        assertEquals("The expected value is 1.57", expectedValue, actualValue, DELTA);
    }

    @Test
    public void inverseTangentTestRadians() {
        calculator.setUnits(Units.RADIANS);
        double expectedValue = .78539816339;
        double actualValue = calculator.inverseTangent(1);
        assertEquals("The expected value is .785", expectedValue, actualValue, DELTA);
    }

    @Test
    public void logTest() {
        double expectedValue = 1;
        double actualValue = calculator.log(10);
        assertEquals("The expected value is 1", expectedValue, actualValue, DELTA);
    }

    @Test
    public void naturalLogTest() {
        double expectedValue = .69314718;
        double actualValue = calculator.naturalLog(2);
        assertEquals("The expected value is .69", expectedValue, actualValue, DELTA);
    }

    @Test
    public void inverseNaturalLogTest() {
        double expectedValue = 2.71828182846;
        double actualValue = calculator.inverseNaturalLog(1);
        assertEquals("The expected value is 2.7", expectedValue, actualValue, DELTA);
    }

    @Test
    public void inverseLogTest() {
        double expectedValue = 100;
        double actualValue = calculator.inverseLog(2);
        assertEquals("The expected value is 2.7", expectedValue, actualValue, DELTA);
    }

    @Test
    public void factorialTest() {
        double expectedValue = 120;
        double actualValue = calculator.factorial(5);
        assertEquals("The expected value is 120", expectedValue, actualValue, DELTA);
    }

    @Test
    public void switchSignToNegativeTest() {
        double expectedValue = -5;
        double actualValue = calculator.switchSign(5);
        assertEquals("The expected value is -5", expectedValue, actualValue, DELTA);
    }

    @Test
    public void switchSignToPositiveTest() {
        double expectedValue = 5;
        double actualValue = calculator.switchSign(-5);
        assertEquals("The expected value is 5", expectedValue, actualValue, DELTA);
    }
}
