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
    public void handleBinaryOperatorTest() {
        // addition tests
        calculator.setDisplay(5.0);
        calculator.handleBinaryOperator("+", 5.0);
        assertEquals(10.0, calculator.getDisplay(), 0);

        calculator.setDisplay(2.0);
        calculator.handleBinaryOperator("+", 2.0);
        assertNotEquals(5.0, calculator.getDisplay(), 0);

        calculator.setDisplay(514.5);
        calculator.handleBinaryOperator("+", 27.0);
        assertEquals(541.5, calculator.getDisplay(), 0);


        //subtraction tests
        calculator.setDisplay(5.0);
        calculator.handleBinaryOperator("-", 5.0);
        assertEquals(0.0, calculator.getDisplay(), 0);

        calculator.setDisplay(10.0);
        calculator.handleBinaryOperator("-", 2.0);
        assertEquals(8.0, calculator.getDisplay(), 0);

        calculator.setDisplay(64.5);
        calculator.handleBinaryOperator("-", 4.0);
        assertEquals(60.5, calculator.getDisplay(), 0);


        //Division tests
        calculator.setDisplay(5.0);
        calculator.handleBinaryOperator("/", 2.0);
        assertEquals(2.5, calculator.getDisplay(), 0);

        calculator.setDisplay(10.0);
        calculator.handleBinaryOperator("/", 5.0);
        assertEquals(2.0, calculator.getDisplay(), 0);

        calculator.setDisplay(100.0);
        calculator.handleBinaryOperator("/", 10.0);
        assertEquals(10.0, calculator.getDisplay(), 0);


        //Multiplication tests
        calculator.setDisplay(5.0);
        calculator.handleBinaryOperator("*", 2.0);
        assertEquals(10, calculator.getDisplay(), 0);

        calculator.setDisplay(10.0);
        calculator.handleBinaryOperator("*", 5.0);
        assertEquals(50.0, calculator.getDisplay(), 0);

        calculator.setDisplay(2.5);
        calculator.handleBinaryOperator("*", 10.0);
        assertEquals(25.0, calculator.getDisplay(), 0);

        Double val1 = Math.random() * 100.0;
        Double val2 = Math.random() * 100.0;
        Double expected = Math.log(val1) / Math.log(val2);

        calculator.setDisplay(val1);
        calculator.handleBinaryOperator("logb", val2);

        assertEquals(expected, calculator.getDisplay(), 0.0);
    }


    @Test
    public void HandleUnaryTest() {
        //test for square root
        calculator.setDisplay(4.0);
        calculator.handleOperator("sqrt");
        assertTrue(2.0 ==  calculator.getDisplay().doubleValue());

        calculator.setDisplay(16.0);
        calculator.handleOperator("sqrt");
        assertTrue(4.0 ==  calculator.getDisplay().doubleValue());

        calculator.setDisplay(64.0);
        calculator.handleOperator("sqrt");
        assertTrue(8.0 ==  calculator.getDisplay().doubleValue());


        // square a number test
        calculator.setDisplay(5.0);
        calculator.handleOperator("sq");
        assertTrue(25.0 ==  calculator.getDisplay().doubleValue());

        calculator.setDisplay(-5.0);
        calculator.handleOperator("sq");
        assertTrue(25.0 ==  calculator.getDisplay().doubleValue());

        calculator.setDisplay(-5.5);
        calculator.handleOperator("sq");
        assertTrue(30.25 ==  calculator.getDisplay().doubleValue());


        //inverse log test
        calculator.setDisplay(6.0);
        calculator.handleOperator("10^");
        assertTrue(1000000.0 ==  calculator.getDisplay().doubleValue());

        calculator.setDisplay(8.0);
        calculator.handleOperator("10^");
        assertTrue(100000000.0 ==  calculator.getDisplay().doubleValue());

        calculator.setDisplay(2.0);
        calculator.handleOperator("10^");
        assertTrue(100.0 ==  calculator.getDisplay().doubleValue());


        //log test
        calculator.setDisplay(4.0);
        calculator.handleOperator("log");
        assertTrue(1.3862943611198906 ==  calculator.getDisplay().doubleValue());

        calculator.setDisplay(5.0);
        calculator.handleOperator("log");
        assertTrue(1.6094379124341003 ==  calculator.getDisplay().doubleValue());

        calculator.setDisplay(500.0);
        calculator.handleOperator("log");
        assertTrue(6.214608098422191 ==  calculator.getDisplay().doubleValue());


        //natural log test
        calculator.setDisplay(3.0);
        calculator.handleOperator("ln");
        assertTrue(1.3862943611198906 ==  calculator.getDisplay().doubleValue());

        calculator.setDisplay(5000.0);
        calculator.handleOperator("ln");
        assertTrue(8.517393171418904 ==  calculator.getDisplay().doubleValue());

        calculator.setDisplay(0.5);
        calculator.handleOperator("ln");
        assertTrue(0.4054651081081644 ==  calculator.getDisplay().doubleValue());


        //Inverse operator tests
        calculator.setDisplay(5.0);
        calculator.handleOperator("inv");
        assertTrue(1.0/5.0 ==  calculator.getDisplay().doubleValue());

        calculator.setDisplay(5.2);
        calculator.handleOperator("inv");
        assertTrue(1.0/5.2 ==  calculator.getDisplay().doubleValue());

        calculator.setDisplay(9.1111233);
        calculator.handleOperator("inv");
        assertTrue(1/9.1111233 ==  calculator.getDisplay().doubleValue());

        //Change sign tests
        calculator.setDisplay(1.0);
        calculator.handleOperator("sign");
        assertTrue(-1.0 ==  calculator.getDisplay().doubleValue());

        calculator.setDisplay(-7.4);
        calculator.handleOperator("sign");
        assertTrue(7.4 ==  calculator.getDisplay().doubleValue());

        calculator.setDisplay(-9.9);
        calculator.handleOperator("sign");
        assertTrue(9.9 ==  calculator.getDisplay().doubleValue());

        //Factorial tests and test error message if non-integer
        calculator.setDisplay(4.0);
        calculator.handleOperator("!");
        assertTrue(24.0 ==  calculator.getDisplay().doubleValue());

        calculator.handleOperator("!");
        calculator.setDisplay(4.3);
        assertEquals("ERR", calculator.handleOperator("!"));

        /*calculator.handleOperator("!");
        calculator.setDisplay(-4.0);
        assertEquals(-24.0, calculator.handleOperator("!"));
*/
    }

}