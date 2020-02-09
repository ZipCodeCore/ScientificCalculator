package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Operations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationsTest {

    Operations operations = new Operations();

    // Addition Tests
    @Test
    public void addPosNums() {
        double expected = 50;
        double actual = operations.add(23, 27);
        assertEquals(expected, actual, 0.01);
    }
    @Test
    public void addPosNums1() {
        double expected = 80;
        double actual = operations.add(75, 5);
        assertEquals(expected,actual, 0.01);
    }

    @Test
    public  void addNegNums(){
        double expected = -70;
        double actual = operations.add(-50, -20);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void addNegNums1() {
        double expected = -3;
        double actual = operations.add(-10, 7);
        assertEquals(expected, actual, 0.01);

    }

    // Subtraction Tests
    @Test
    public void subtractPosNums() {
        double expected = 23;
        double actual = operations.subtract(50, 27);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void subtractNegNums() {
        double expected = -30;
        double actual = operations.subtract(-50, -20);
        assertEquals(expected, actual, 0.01);
    }

    // Multiplication Tests
    @Test
    public void multiplyPosNums() {
        double expected = 27;
        double actual = operations.multiply(9, 3);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void multiplyNegNums() {
        double expected = 27;
        double actual = operations.multiply(-9, -3);
        assertEquals(expected, actual, 0.01);
    }

    // Division Tests
    @Test
    public void dividePosNums() {
        double expected = 3;
        double actual = operations.divide(9, 3);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void divideNegNums() {
        double expected = -3;
        double actual = operations.divide(9, -3);
        assertEquals(expected, actual, 0.01);
    }

    // Number Squared Test
    @Test
    public void squarePosNums() {
        double expected = 9;
        double actual = operations.square(3);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void squarePosNums1() {
        double expected = 64;
        double actual = operations.square(8);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void squareNegNums() {
        double expected = 9;
        double actual = operations.square(-3);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void squareNegNums1() {
        double expected = 16;
        double actual = operations.square(-4);
        assertEquals(expected, actual, 0.01);
    }

    // Square Root of Numbers
    @Test
    public void squareRootPosNums() {
        double expected = 9;
        double actual = operations.squareRoot(81);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void squareRootPosNums1() {
        double expected = 10;
        double actual = operations.squareRoot(100);
        assertEquals(expected, actual, 0.01);
    }

    // Square Root Negative Numbers Test Case ???

    // Exponent Tests
    @Test
    public void exponentNums() {
        double expected = 8;
        double actual = operations.exponent(2, 3);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void exponentNums1() {
        double expected = 9;
        double actual = operations.exponent(3, 2);
        assertEquals(expected, actual, 0.01);
    }

    // Need To Parse All User Inputs as Doubles
    @Test
    public void exponentNegNums() {
        double expected = 1/8.0;
        double actual = operations.exponent(2, -3);
        assertEquals(expected, actual, 0.01);
    }

    // Inverse
    @Test
    public void inverseNums() {
        double expected = 1/8.0;
        double actual = operations.inverse(8);
        assertEquals(expected, actual, 0.01);
    }

    // Switch Signs
    @Test
    public void switchSigns() {
        double expected = -8;
        double actual = operations.switchSign(8);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void switchSignsPosToNeg() {
        double expected = -8;
        double actual = operations.switchSign(8);
        assertEquals(expected, actual, 0.01);
    }


}
