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
    public void getState() {
    }

    @Test
    public void getLastInput() {
    }

    @Test
    public void setState() {
    }

    @Test
    public void setLastInput() {
        Double[] options = {-2.3, 0.0, 4.7, 89359.009384};
        for (Double n : options) {
            calculator.setLastInput(n);
            Console.println(Double.toString(n),Double.toString(calculator.getLastInput()));
            assertTrue(calculator.getLastInput() == n);
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
    }

    @Test
    public void inputLoop() {
    }

    @Test
    public void handleOperatorTrig() {

    }
}