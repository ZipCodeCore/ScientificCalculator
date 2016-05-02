package io.michaelcarroll;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;
    Display display;

    @Before
    public void setup() {
        calculator = new Calculator();
        display = new Display();
    }

    @Test
    public void sumTest() {
        double expectedSum = 12.1;
        double actualSum = calculator.addValues(10, 2.1);
        assertEquals("The expected value should be 12.1", expectedSum, actualSum, Math.ulp(1E-9));

    }

    @Test
    public void subtractTest() {
        double expectedSum = 6;
        double actualSum = calculator.subtractValues(10, 4);
        assertEquals("The expected value should be 6", expectedSum, actualSum, Math.ulp(1E-9));
    }

    @Test
    public void multiplyTest() {
        double expectedSum = 25;
        double actualSum = calculator.multiplyValues(5, 5);
        assertEquals("The expected value should be 25", expectedSum, actualSum, Math.ulp(1E-9));
    }

    @Test
    public void divideTest() {
        double expectedSum = 4;
        double actualSum = calculator.divideValues(24, 6);
        assertEquals("The expected value should be 4", expectedSum, actualSum, Math.ulp(1E-9));
    }

    @Test
    public void squareRootCalculationTest() {
        Calculator calculator = new Calculator();
        double expectedValue = 5;
        double actualValue = calculator.calculateSquareRootOfNumberOnDisplay(25);
        assertEquals("The expected value should be 5", expectedValue, actualValue, Math.ulp(1E-9));
    }

    @Test
    public void squareOfNumberOnDisplayTest() {
        double expectedValue = 25;
        double actualValue = calculator.calculateTheSquareOfNumberOnDisplay(5);
        assertEquals("The expected value should be 25", expectedValue, actualValue, Math.ulp(1E-9));
    }

    @Test
    public void calculateInverseOfNumberOnDisplayTest() {
        double expectedValue = 0.1;
        double actualValue = calculator.calculateInverseOfNumberOnDisplay(10);
        assertEquals("The expected value should be 0.1", expectedValue, actualValue, Math.ulp(1E-9));

    }

    @Test
    public void calculateVariableExponentiationTest() {
        double expectedValue = 32;
        double actualValue = calculator.calculateVariableExponentiation(2, 5);
        assertEquals("The expected value should 32", expectedValue, actualValue, Math.ulp(1E-9));
    }

    @Test
    public void clearCurrentNumberOnDisplayTest() {
        display.setCurrentNumberOnDisplay(25);
        double expectedValue = 0;
        display.setCurrentNumberOnDisplay(calculator.clearNumberOnDisplay());
        double actualValue = display.getCurrentNumberOnDisplay();
        assertEquals("The expected value should be 0", expectedValue, actualValue, Math.ulp(1E-9));

    }

    @Test
    public void invertSignOfCurrentNumberOnDisplayTest() {
        double expectedValue = -25;
        double actualValue = calculator.invertSignOfCurrentNumberOnDisplay(25);
        assertEquals("The expected value should be -25", expectedValue, actualValue, Math.ulp(1E-9));
    }

    @Test
    public void testToSeeIfMemoryIsAbleToStoreANumericValueToRecallLater() {
        calculator.storeAValueInMemory(34);
        double expectedValue = 34;
        double actualValue = calculator.getValueStoredInMemory();
        assertEquals("The expected value should be 34", expectedValue, actualValue, Math.ulp(1E-9));
    }

    @Test
    public void testToSeeIfMemoryInCalculatorProperlyResets() {
        calculator.storeAValueInMemory(5);
        calculator.resetValueStoredInMemory();
        double expectedValue = 0;
        double actualValue = calculator.getValueStoredInMemory();
        assertEquals("The expected value should be 0", expectedValue, actualValue, Math.ulp(1E-9));
    }

    @Test
    public void calculateTheSineOfValueOnDisplayTest() {
        double expectedValue = 0.9968297942787993;
        double actualValue = calculator.calculateTheSineOfValueOnDisplay(20.5);
        assertEquals("The expected value should be 0.9968297942787993", expectedValue, actualValue, Math.ulp(1E-9));
    }

    @Test
    public void calculateTheCosineOfValueOnDisplayTest() {
        double expectedValue = 0.5268326309626091;
        double actualValue = calculator.calculateTheCosineOfValueOnDisplay(30.4);
        assertEquals("The expected value should be 0.5268326309626091", expectedValue, actualValue, Math.ulp(1E-9));
    }

    @Test
    public void calculateTheTangentOfTheDisplayedValue() {
        double expectedValue = 1;
        double actualValue = calculator.calculateTheTangentOfTheDisplayedValue(45);
        assertEquals("The expected value should be 1", expectedValue, actualValue, Math.ulp(1E-9));
    }

    @Test
    public void calculateTheFactorialOfValueOnDisplay() {
        double expectedValue = 24;
        double actualValue = calculator.calculateTheFactorialOfValueOnDisplay(4);
        assertEquals("The expected value should be 24", expectedValue, actualValue, Math.ulp(1E-9));
    }

    @Test
    public void calculateInverseSineOfValueOnDisplayTest() {
        double expectedValue = 90;
        double actualValue = calculator.calculateInverseSineOfValueOnDisplay(1);
        assertEquals("The expected value should be 90", expectedValue, actualValue, Math.ulp(1E-9));
    }

    @Test
    public void calculateTheInverseCosineOfValueOnDisplayTest() {
        double expectedValue = 60;
        double actualValue = calculator.calculateTheInverseCosineOfValueOnDisplay(0.5);
        assertEquals("The expected value should be 0", expectedValue, actualValue, Math.ulp(1));
    }

    @Test
    public void calculateTheInverseTangentOfTheValueOnDisplayTest() {
        double expectedValue = 45;
        double actualValue = calculator.calculateTheInverseTangentOfTheValueOnDisplay(1);
        assertEquals("The expected value should be 45", expectedValue, actualValue, Math.ulp(0));
    }

    @Test
    public void calculateTheLogOfValueOnDisplayTest() {
        double expectedValue = 1;
        double actualValue = calculator.calculateTheLogOfValueOnDisplay(10);
        assertEquals("The expected value should be 1", expectedValue, actualValue, Math.ulp(0));
    }

    @Test
    public void calculateTheInverseLogOfValueOnDisplayTest() {
        double expectedValue = 100000;
        double actualValue = calculator.calculateTheInverseLogOfValueOnDisplay(5);
        assertEquals("The expected value should be 100000", expectedValue, actualValue, Math.ulp(0));
    }

    @Test
    public void calculateTheNaturalLogarithmOfValueOnDisplayTest() {
        double expectedValue = 0;
        double actualValue = calculator.calculateTheNaturalLogarithmOfValueOnDisplay(1);
        assertEquals("The expected value should be 0", expectedValue, actualValue, Math.ulp(1E-9));
    }

    @Test
    public void calculateInverseNaturalLogarithmOfValueOnDisplayTest() {
        double expectedValue = 148.41315910257657;
        double actualValue = calculator.calculateInverseNaturalLogarithmOfValueOnDisplay(5);
        assertEquals("The expected value should be 148.41315910257657", expectedValue, actualValue, Math.ulp(1E-9));
    }


}
