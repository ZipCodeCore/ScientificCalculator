package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;
import org.junit.Test;

public class UnitTestArithmetic extends TestCase {

    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        int result = calc.theAnswer(3, "*", 4);
        assertEquals(12, result);
        // Expected result for 3 * 4 is 12
        }

    @Test
    public void testDivision() {
        Calculator calc = new Calculator();
        int result = calc.theAnswer(10, "/", 2);
        assetEquals(5, result);
        // Expected result for 10/2 is 5
    }

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.theAnswer(7, "+", 3);
        assetEquals(10, result);
        // Expected result for 7 + 3 is 10
    }

    @Test
    public void testSubtraction() {
        Calculator calc =  new Calculator();
        int result = calc.theAnswer(8, "-", 5);
        assetEquals(3, result);
        // Expected result for 8-5 is 3
    }

    @Test
    public void testInvalidOperator() {
        Calculator calc = new Calculator();
        int result = calc.theAnswer(5, "#", 3); //# Number sign is an invalid op
        assertEquals(0, result); // Expected result for invalid op
    }
}


