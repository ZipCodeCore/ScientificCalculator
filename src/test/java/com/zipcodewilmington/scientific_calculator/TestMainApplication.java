package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Calculator;

import static org.junit.Assert.*;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testAddition() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.addition(2,2), 0.00001);
        assertEquals(Double.valueOf(100.0), myCalc.addition(79,21), 0.00001);
        assertEquals(Double.valueOf(4.0), myCalc.addition(6,-2), 0.00001);
    }

    @org.junit.Test
    public void testSubtraction() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.subtraction(6,2), 0.00001);
        assertEquals(Double.valueOf(-20.0), myCalc.subtraction(70,90), 0.00001);
        assertEquals(Double.valueOf(4.0), myCalc.subtraction(2,-2), 0.00001);
    }

    @org.junit.Test
    public void testMultiply() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(18.0), myCalc.multiply(6,3), 0.00001);
        assertEquals(Double.valueOf(-4.0), myCalc.multiply(-2,2), 0.00001);
        assertEquals(Double.valueOf(144.0), myCalc.multiply(12,12), 0.00001);
    }

    @org.junit.Test
    public void testDivide() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(1.0), myCalc.divide(2,2), 0.00001);
        assertEquals(Double.valueOf(2.0), myCalc.divide(8,4), 0.00001);
        assertEquals(Double.valueOf(0.25), myCalc.divide(1,4), 0.00001);
    }

    @org.junit.Test
    public void testExponential() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(9.0), myCalc.exponential(3,2), 0.00001);
        assertEquals(Double.valueOf(8.0), myCalc.exponential(2,3), 0.00001);
        assertEquals(Double.valueOf(1.0), myCalc.exponential(2,0), 0.00001);
    }

    @org.junit.Test
    public void testSquare() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.square(2), 0.00001);
        assertEquals(Double.valueOf(1.0), myCalc.square(1), 0.00001);
        assertEquals(Double.valueOf(1600.0), myCalc.square(40), 0.00001);
    }

    @org.junit.Test
    public void testSquareRoot() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(1.41421), myCalc.squareRoot(2), 0.00001);
        assertEquals(Double.valueOf(2.0), myCalc.squareRoot(4), 0.00001);
        assertEquals(Double.valueOf(4.0), myCalc.squareRoot(16), 0.00001);
    }

    @org.junit.Test
    public void testInverse() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(0.5), myCalc.inverse(2), 0.00001);
        assertEquals(Double.valueOf(2.0), myCalc.inverse(0.5), 0.00001);
        assertEquals(Double.valueOf(0.1), myCalc.inverse(10), 0.00001);
    }

    @org.junit.Test
    public void testInvert() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(-2.0), myCalc.invert(2), 0.00001);
        assertEquals(Double.valueOf(3.0), myCalc.invert(-3), 0.00001);
        assertEquals(Double.valueOf(0.0), myCalc.invert(0), 0.00001);
    }

    @org.junit.Test
    public void testSine() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(0), myCalc.sine(0), 0.00001);
        assertEquals(Double.valueOf(0.84147), myCalc.sine(1), 0.00001);
        assertEquals(Double.valueOf(0.9093), myCalc.sine(2), 0.00001);
    }

    @org.junit.Test
    public void testCosine() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(1.0), myCalc.cosine(0), 0.00001);
        assertEquals(Double.valueOf(0.5403), myCalc.cosine(1), 0.00001);
        assertEquals(Double.valueOf(-0.41615), myCalc.cosine(2), 0.00001);
    }

    @org.junit.Test
    public void testTangent() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(0.0), myCalc.tangent(0), 0.00001);
        assertEquals(Double.valueOf(1.55741), myCalc.tangent(1), 0.00001);
        assertEquals(Double.valueOf(-2.18504), myCalc.tangent(2), 0.00001);
    }

    @org.junit.Test
    public void testInverseSine() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.inverseSine(2), 0.00001);
    }

    @org.junit.Test
    public void testInverseCosine() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.inverseCosine(2), 0.00001);
    }

    @org.junit.Test
    public void testFactorial() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.factorial(2), 0.00001);
    }

    @org.junit.Test
    public void testLog() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.log(2), 0.00001);
    }

    @org.junit.Test
    public void testInverseLog() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.inverseLog(2), 0.00001);
    }

    @org.junit.Test
    public void testNaturalLog() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.naturalLog(2), 0.00001);
    }

    @org.junit.Test
    public void testInverseNaturalLog() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.inverseNaturalLog(2), 0.00001);
    }

    @org.junit.Test
    public void initial6() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.addition(2,2), 0.00001);
    }

    @org.junit.Test
    public void initial7() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.addition(2,2), 0.00001);
    }

    @org.junit.Test
    public void testConvertBinary() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(10), myCalc.convertBinary(2));
    }
}
