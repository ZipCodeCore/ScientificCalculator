package com.zipcode.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vidyachandasekhar on 4/29/17.
 */
public class CalculatorTest {
    @Test
    public void testGetCurrentDisplay() {
        //when
        Calculator calculator = new Calculator();

        //then
        assertEquals(new Double(0), calculator.getCurrentDisplay());

    }

    @Test
    public void testCurrentDisplay() {
        //when
        Calculator calculator = new Calculator();
        calculator.changeDisplay(5.00);

        //then
        assertEquals(new Double(5.00), calculator.getCurrentDisplay());

        //then
        assertEquals(new Double(5.00), calculator.getCurrentDisplay());
    }

    @Test
    public void testChangeDisplay() {
        //when
        Calculator calculator = new Calculator();

        //then
        assertEquals(new Double(4.00), calculator.add(4.00));

        //then
        assertEquals(new Double(8.00), calculator.add(4.00));

        //then
        assertEquals(new Double(-13.00), calculator.add(-21.00));

        //then
        assertEquals(new Double(-13.00), calculator.getCurrentDisplay());

    }

    @Test
    public void testAdd() {
        //when
        Calculator calculator = new Calculator();

        //then
        assertEquals(new Double(4.00), calculator.add(4.00));

    }

    @Test
    public void testSubtract() {
        //when
        Calculator calculator = new Calculator();


        //then
        assertEquals(new Double(-4.00), calculator.subtract(4.00));

        //then
        assertEquals(new Double(-8.00), calculator.subtract(4.00));

    }

    @Test
    public void testMultiply() {
        //when
        Calculator calculator = new Calculator();

        //then (ensure that when current display is 0, the product is 0;
        assertEquals(new Double(0.00), calculator.multiply(4.00));

        calculator.changeDisplay(1.00);

        //then
        assertEquals(new Double(4.00), calculator.multiply(4.00));

        //then
        assertEquals(new Double(16.00), calculator.multiply(4.00));



    }


}