package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Before
    public void setUp() throws Exception {
        Calculator calculator = new Calculator();

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
    }

    @Test
    public void clearCalculator() {
        Calculator calculator = new Calculator();
        calculator.setDisplay(23.3);
        calculator.setLastInput(-2);
        calculator.clearCalculator();
        assertEquals(calculator.getDisplay(),0.0);
        assertEquals(calculator.getLastInput(),0.0);
    }

    @Test
    public void inputLoop() {
    }

    @Test
    public void handleOperatorTrig() {

    }
}