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
    public void manTest() {
        for (String op : Calculator.BINARYOPERATORS) {
            String expected = Calculator.MANUAL.get(op);
            String actual = calculator.man(op);
            assertTrue(actual.equals(expected));
        }
        for (String op : Calculator.UNARYOPERATORS) {
            String expected = Calculator.MANUAL.get(op);
            String actual = calculator.man(op);
            assertTrue(actual.equals(expected));
        }
        for (String op : Calculator.COMMANDS) {
            String expected = Calculator.MANUAL.get(op);
            String actual = calculator.man(op);
            assertTrue(actual.equals(expected));
        }
        String[] bogusInputs = {"","blargh","4.5"};
        for (String op : bogusInputs) {
            String expected = "Command not found";
            String actual = calculator.man(op);
            assertTrue(actual.equals(expected));
        }
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
        Double[] options = {Double.NEGATIVE_INFINITY,-2.3, 0.0, 4.7, 89359.009384, Double.POSITIVE_INFINITY };

        for (Double n : options) {
            calculator.setDisplay(n);
            calculator.setDisplay(n * 212.5 * Math.PI);
            calculator.clearCalculator();
            assertTrue(calculator.getDisplay() == 0.0);
            assertTrue(calculator.getLastInput() == 0.0);
        }
    }

    @Test
    public void lastTest() {
        Double[] options = {Double.NEGATIVE_INFINITY,-2.3, 0.0, 4.7, 89359.009384, Double.POSITIVE_INFINITY };

        for (Double n : options) {
            calculator.setDisplay(n * 2.21);
            calculator.setLastInput(n);
            calculator.handleCommands("last");
            assertTrue(calculator.getDisplay() == n);
            assertTrue(calculator.getLastInput() == 0.0);
        }
    }

    @Test
    public void setDisplayModesTest() {
        calculator.setDisplayMode(Calculator.dMode.BINARY);
        assertEquals(calculator.getDisplayMode(), Calculator.dMode.BINARY);
        calculator.setDisplayMode();
        assertEquals(calculator.getDisplayMode(), Calculator.dMode.OCTAL);
        calculator.setDisplayMode(Calculator.dMode.HEXADECIMAL);
        assertEquals(calculator.getDisplayMode(), Calculator.dMode.HEXADECIMAL);
        calculator.setDisplayMode();
        assertEquals(calculator.getDisplayMode(), Calculator.dMode.BINARY);
        calculator.setDisplayMode(Calculator.dMode.DECIMAL);
        assertEquals(calculator.getDisplayMode(), Calculator.dMode.DECIMAL);
        calculator.setDisplayMode();
        assertEquals(calculator.getDisplayMode(), Calculator.dMode.HEXADECIMAL);
        calculator.setDisplayMode(Calculator.dMode.OCTAL);
        assertEquals(calculator.getDisplayMode(), Calculator.dMode.OCTAL);
        calculator.setDisplayMode();
        assertEquals(calculator.getDisplayMode(), Calculator.dMode.DECIMAL);
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
            calculator.handleOperator("tan");
            expected = calculator.getTrig().tan(n);
            actual = calculator.getDisplay();

            assertTrue(0 == Double.compare(actual,expected));

            calculator.setDisplay(n);
            calculator.handleOperator("asin");
            expected = calculator.getTrig().arcSin(n);
            actual = calculator.getDisplay();

            assertTrue(0 == Double.compare(actual,expected));

            calculator.setDisplay(n);
            calculator.handleOperator("acos");
            expected = calculator.getTrig().arcCos(n);
            actual = calculator.getDisplay();

            assertTrue(0 == Double.compare(actual,expected));

            calculator.setDisplay(n);
            calculator.handleOperator("atan");
            expected = calculator.getTrig().arcTan(n);
            actual = calculator.getDisplay();

            assertTrue(0 == Double.compare(actual,expected));

        }

    }
    @Test
    public void testHandleOperator_inv() {


        calculator.setDisplay(5.0);

        calculator.handleOperator("inv");

        assertTrue(1.0/5.0 ==  calculator.getDisplay().doubleValue());

    }
    @Test
    public void testHandleOperator_sign() {


        calculator.setDisplay(1.0);

        calculator.handleOperator("sign");

        assertTrue(-1.0 ==  calculator.getDisplay().doubleValue());

    }
    @Test
    public void testHandleOperator_sign2() {


        calculator.setDisplay(-1.0);

        calculator.handleOperator("sign");

        assertTrue(1.0 ==  calculator.getDisplay().doubleValue());

    }
    @Test
    public void testHandleOperator_Factorial_1() {


        calculator.setDisplay(4.0);

        calculator.handleOperator("!");

        assertTrue(24.0 ==  calculator.getDisplay().doubleValue());

    }
    @Test
    public void testHandleOperator_Factorial_2() {


        calculator.setDisplay(4.3);

        calculator.handleOperator("!");

        assertTrue(24.0 ==  calculator.getDisplay().doubleValue());

    }

}