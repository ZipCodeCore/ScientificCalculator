package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;
    @Before
    public void setUp() throws Exception {
        this.calculator = new Calculator();

    }

    @Test
    public void getAndSetLastInput() {
        Double[] options = {Double.NEGATIVE_INFINITY,-2.3, 0.0, 4.7, 89359.009384, Double.POSITIVE_INFINITY };
        for (Double n : options) {
            calculator.setLastInput(n);
            Console.println(Double.toString(n),Double.toString(calculator.getLastInput()));
            assertTrue(calculator.getLastInput() == n);
        }
    }

    @Test
    public void getAndSetDisplay() {
        Double[] options = {Double.NEGATIVE_INFINITY,-2.3, 0.0, 4.7, 89359.009384, Double.POSITIVE_INFINITY };
        for (Double n : options) {
            calculator.setDisplay(n);
            assertTrue(calculator.getDisplay() == n);
        }
    }

    @Test
    public void clearCalculator() {

        calculator.setDisplay(23.3);
        calculator.setLastInput(-2.0);
        calculator.clearCalculator();
        assertTrue(calculator.getDisplay() == 0.0);
        assertTrue(calculator.getLastInput() == 0.0);

        calculator.clearCalculator();
        assertTrue(calculator.getDisplay() == 0.0);
        assertTrue(calculator.getLastInput() == 0.0);

        calculator.setDisplay(-23.3);
        calculator.setLastInput(0.0);
        calculator.clearCalculator();
        assertTrue(calculator.getDisplay() == 0.0);
        assertTrue(calculator.getLastInput() == 0.0);

        calculator.setDisplay(-23.3);
        calculator.setLastInput(0.0);
        calculator.clearCalculator();
        assertTrue(calculator.getDisplay() == 0.0);
        assertTrue(calculator.getLastInput() == 0.0);
    }

    @Test
    public void inputLoop() {
    }

    @Test
    public void trigOperators() {
        Double[] options = {Double.NEGATIVE_INFINITY, -2.3, 0.0, 4.7, 89359.009384, Double.POSITIVE_INFINITY };
        Double expected;
        Double actual;
        for (Double n : options) {
            calculator.setDisplay(n);
            calculator.handleOperator("sin");
            expected = calculator.getTrig().sin(n);
            actual = calculator.getDisplay();

            assertTrue(0 == Double.compare(actual,expected));

            calculator.setDisplay(n);
            calculator.handleOperator("cos");
            expected = calculator.getTrig().cos(n);
            actual = calculator.getDisplay();

            assertTrue(0 == Double.compare(actual,expected));

            calculator.setDisplay(n);
            calculator.handleOperator("atan");
            expected = calculator.getTrig().arcTan(n);
            actual = calculator.getDisplay();

            assertTrue(0 == Double.compare(actual,expected));

        }

    }
}