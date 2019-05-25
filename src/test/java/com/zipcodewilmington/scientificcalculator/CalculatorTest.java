package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Double a = 4.0;
        Double b = 6.0;
        Calculator c = new Calculator();

        Double result = c.add(a, b);

        assertEquals(new Double(10.0), result);
    }

    @Test
    public void add2() {
        Double a = 5.0;
        Double b = -4.0;
        Calculator c = new Calculator();

        Double result = c.add(a, b);

        assertEquals(new Double(1.0), result);
    }

    @Test
    public void add3() {
        Double a = -5.0;
        Double b = -4.0;
        Calculator c = new Calculator();

        Double result = c.add(a, b);

        assertEquals(new Double(-9.0), result);
    }

    @Test
    public void subtract() {
        Double a = 6.0;
        Double b = 2.0;
        Calculator c = new Calculator();

        Double result = c.subtract(a, b);

        assertEquals(new Double(4.0), result);
    }

    @Test
    public void subtract2() {
        Double a = 6.0;
        Double b = -5.0;
        Calculator c = new Calculator();

        Double result = c.subtract(a, b);

        assertEquals(new Double(11.0), result);
    }

    @Test
    public void subtract3() {
        Double a = -6.0;
        Double b = -5.0;
        Calculator c = new Calculator();

        Double result = c.subtract(a, b);

        assertEquals(new Double(-1.0), result);
    }

    @Test
    public void multiply() {
        Double a = 2.0;
        Double b = 3.0;
        Calculator c = new Calculator();

        Double result = c.multiply(a, b);

        assertEquals(new Double(6.0), result);
    }

    @Test
    public void multiply2() {
        Double a = -2.0;
        Double b = 3.0;
        Calculator c = new Calculator();

        Double result = c.multiply(a, b);

        assertEquals(new Double(-6.0), result);
    }

    @Test
    public void multiply3() {
        Double a = -2.0;
        Double b = -3.0;
        Calculator c = new Calculator();

        Double result = c.multiply(a, b);

        assertEquals(new Double(6.0), result);
    }

    @Test
    public void sqrt() {
        Double a = 4.0;
        Calculator c = new Calculator();

        Double result = c.sqrt(a);

        assertEquals(new Double(2.0), result);
    }

    @Test
    public void sqrt2() {
        Double a = -4.0;
        Calculator c = new Calculator();

        Double result = c.sqrt(a);

        assertEquals(new Double("NaN"), result);
    }

    @Test
    public void sqrt3() {
        Double a = 7.0;
        Calculator c = new Calculator();

        Double result = c.sqrt(a);

        assertEquals(new Double(2.6457513110645907), result);
    }

    @Test
    public void sq() {
        Double a = 2.0;
        Calculator c = new Calculator();

        Double result = c.sq(a);

        assertEquals(new Double(4.0), result);
    }

    @Test
    public void sq2() {
        Double a = -3.0;
        Calculator c = new Calculator();

        Double result = c.sq(a);

        assertEquals(new Double(9.0), result);
    }

    @Test
    public void exp() {
        Double a = 2.0;
        Double b = 3.0;
        Calculator c = new Calculator();

        Double result = c.exp(a, b);

        assertEquals(new Double(8.0), result);
    }

    @Test
    public void exp2() {
        Double a = -2.0;
        Double b = 3.0;
        Calculator c = new Calculator();

        Double result = c.exp(a, b);

        assertEquals(new Double(-8.0), result);
    }

    @Test
    public void exp3() {
        Double a = -2.0;
        Double b = -3.0;
        Calculator c = new Calculator();

        Double result = c.exp(a, b);

        assertEquals(new Double(-0.125), result);
    }

    @Test
    public void exp4() {
        Double a = 2.5;
        Double b = 3.0;
        Calculator c = new Calculator();

        Double result = c.exp(a, b);

        assertEquals(new Double(15.625), result);
    }

    @Test
    public void inv() {
        Double a = 2.0;
        Calculator c = new Calculator();

        Double result = c.inv(a);

        assertEquals(new Double(.5), result);
    }

    @Test
    public void inv2() {
        Double a = -2.0;
        Calculator c = new Calculator();

        Double result = c.inv(a);

        assertEquals(new Double(-0.5), result);
    }

    @Test
    public void inv3() {
        Double a = .7;
        Calculator c = new Calculator();

        Double result = c.inv(a);

        assertEquals(new Double(1.4285714285714286), result);
    }

    @Test
    public void negate() {
        Double a = 2.0;
        Calculator c = new Calculator();

        Double result = c.negate(a);

        assertEquals(new Double(-2.0), result);
    }

    @Test
    public void negate2() {
        Double a = -2.0;
        Calculator c = new Calculator();

        Double result = c.negate(a);

        assertEquals(new Double(2.0), result);
    }

}