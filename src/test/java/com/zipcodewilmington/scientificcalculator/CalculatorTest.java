package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Double a = 4.0;
        Double b = 6.0;
        Calculator c = new Calculator();

        c.add(a, b);
        Double result = c.getCurrentNumber();

        Double expected = 10.0;
        assertEquals(expected,  result, 0.01);
    }

    @Test
    public void add2() {
        Double a = 5.0;
        Double b = -4.0;
        Calculator c = new Calculator();

        c.add(a, b);

        Double result = c.getCurrentNumber();

        Double expected = 1.0;
        assertEquals(expected,  result, 0.01);
    }

    @Test
    public void add3() {
        Double a = -5.0;
        Double b = -4.0;
        Calculator c = new Calculator();

        c.add(a, b);
        Double result = c.getCurrentNumber();

        Double expected = -9.0;
        assertEquals(expected,  result, 0.01);
    }

    @Test
    public void subtract() {
        Double a = 6.0;
        Double b = 2.0;
        Calculator c = new Calculator();

        c.subtract(a, b);
        Double result = c.getCurrentNumber();

        Double expected = 4.0;
        assertEquals(expected,  result, 0.01);
    }

    @Test
    public void subtract2() {
        Double a = 6.0;
        Double b = -5.0;
        Calculator c = new Calculator();

        c.subtract(a, b);
        Double result = c.getCurrentNumber();

        Double expected = 11.0;
        assertEquals(expected,  result, 0.01);
    }

    @Test
    public void subtract3() {
        Double a = -6.0;
        Double b = -5.0;
        Calculator c = new Calculator();

        c.subtract(a, b);
        Double result = c.getCurrentNumber();

        Double expected = -1.0;
        assertEquals(expected,  result, 0.01);
    }

    @Test
    public void multiply() {
        Double a = 2.0;
        Double b = 3.0;
        Calculator c = new Calculator();

        c.multiply(a, b);
        Double result = c.getCurrentNumber();

        Double expected = 6.0;
        assertEquals(expected,  result, 0.01);
    }

    @Test
    public void multiply2() {
        Double a = -2.0;
        Double b = 3.0;
        Calculator c = new Calculator();

        c.multiply(a, b);
        Double result = c.getCurrentNumber();

        Double expected = -6.0;
        assertEquals(expected,  result, 0.01);
    }

    @Test
    public void multiply3() {
        Double a = -2.0;
        Double b = -3.0;
        Calculator c = new Calculator();

        c.multiply(a, b);
        Double result = c.getCurrentNumber();

        Double expected = 6.0;
        assertEquals(expected,  result, 0.01);
    }

    @Test
    public void divide() {
        Double a = 4.0;
        Double b = 2.0;
        Calculator c = new Calculator();

        c.divide(a, b);
        Double result = c.getCurrentNumber();

        Double expected = 2.0;
        assertEquals(expected,  result, 0.01);
    }

    @Test
    public void divide2() {
        Double a = 2.0;
        Double b = 4.0;
        Calculator c = new Calculator();

        c.divide(a, b);
        Double result = c.getCurrentNumber();

        Double expected = 0.5;
        assertEquals(expected,  result, 0.01);
    }

    @Test
    public void divide3() {
        Double a = -2.0;
        Double b = 4.0;
        Calculator c = new Calculator();

        c.divide(a, b);
        Double result = c.getCurrentNumber();

        Double expected = -0.5;
        assertEquals(expected,  result, 0.01);
    }

    @Test
    public void divide4() {
        Double a = 2.0;
        Double b = 0.0;
        Calculator c = new Calculator();

        c.divide(a, b);
        Double result = c.getCurrentNumber();

        assertEquals(new Double("Infinity"), result);
    }


    @Test
    public void sqrt() {
        Double a = 4.0;
        Calculator c = new Calculator();

        c.sqrt(a);
        Double result = c.getCurrentNumber();

        Double expected = 2.0;
        assertEquals(expected,  result, 0.01);
    }

    @Test
    public void sqrt2() {
        Double a = -4.0;
        Calculator c = new Calculator();

        c.sqrt(a);
        Double result = c.getCurrentNumber();

        assertEquals(new Double("NaN"), result);
    }

    @Test
    public void sqrt3() {
        Double a = 7.0;
        Calculator c = new Calculator();

        c.sqrt(a);
        Double result = c.getCurrentNumber();

        Double expected = 2.64;
        assertEquals(expected,  result, 0.01);
    }

    @Test
    public void sq() {
        Double a = 2.0;
        Calculator c = new Calculator();

        c.sq(a);
        Double result = c.getCurrentNumber();

        Double expected = 4.0;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void sq2() {
        Double a = -3.0;
        Calculator c = new Calculator();

        c.sq(a);
        Double result = c.getCurrentNumber();

        Double expected = 9.0;
        assertEquals(expected, result, 0.01);

    }

    @Test
    public void exp() {
        Double a = 2.0;
        Double b = 3.0;
        Calculator c = new Calculator();

        c.exp(a, b);
        Double result = c.getCurrentNumber();

        Double expected = 8.0;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void exp2() {
        Double a = -2.0;
        Double b = 3.0;
        Calculator c = new Calculator();

        c.exp(a, b);
        Double result = c.getCurrentNumber();

        Double expected = -8.0;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void exp3() {
        Double a = -2.0;
        Double b = -3.0;
        Calculator c = new Calculator();

        c.exp(a, b);
        Double result = c.getCurrentNumber();

        Double expected = -0.125;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void exp4() {
        Double a = 2.5;
        Double b = 3.0;
        Calculator c = new Calculator();

        c.exp(a, b);
        Double result = c.getCurrentNumber();

        Double expected = 15.625;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void inv() {
        Double a = 2.0;
        Calculator c = new Calculator();

        c.inv(a);
        Double result = c.getCurrentNumber();

        Double expected = .5;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void inv2() {
        Double a = -2.0;
        Calculator c = new Calculator();

        c.inv(a);
        Double result = c.getCurrentNumber();

        Double expected = -0.5;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void inv3() {
        Double a = .7;
        Calculator c = new Calculator();

        c.inv(a);
        Double result = c.getCurrentNumber();

        Double expected = 1.4285714285714286;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void negate() {
        Double a = 2.0;
        Calculator c = new Calculator();

        c.negate(a);
        Double result = c.getCurrentNumber();

        Double expected = -2.0;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void negate2() {
        Double a = -2.0;
        Calculator c = new Calculator();

        c.negate(a);
        Double result = c.getCurrentNumber();

        Double expected = 2.0;
        assertEquals(expected, result, 0.01);
    }

}

