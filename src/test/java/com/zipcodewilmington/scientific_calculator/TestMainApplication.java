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
        assertEquals(Double.valueOf(4.0), myCalc.addition(2,2), 0.00001);

    }

    @org.junit.Test
    public void initial4() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.addition(2,2), 0.00001);

    }

    @org.junit.Test
    public void initial5() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.addition(2,2), 0.00001);

    }

    @org.junit.Test
    public void initial6() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.addition(2,2), 0.00001);

    }

}
