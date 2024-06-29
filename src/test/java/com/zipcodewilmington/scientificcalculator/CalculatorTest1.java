package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest1 extends TestCase {

    private Calculator calculator;

        @Before
        public void setUp() {
        calculator = new Calculator();
        }

        @Test
        public void testAdd() {
            assertEquals(12.3, calculator.add(5.2, 7.1), 0.0001); // Test addition
        }

        @Test
        public void testSubtract() {
            assertEquals(33.9, calculator.subtract(45.1, 11.2), 0.0001); // Test subtraction
        }

        @Test
        public void testMultiply() {
            assertEquals(484.0, calculator.multiply(22, 22), 0.0001); // Test multiplication
        }

        @Test
        public void testDivide() {
            assertEquals(2.0, calculator.divide(8, 4), 0.0001); // Test division
        }

        @Test
        public void testModulo() {
            assertEquals(2.0, calculator.modulo(8, 3), 0.0001); // Test modulo
        }

        @Test
        public void testSquare() {
            assertEquals(484.0, calculator.square(22), 0.0001); // Test square
        }

        @Test
        public void testSquareRoot() {
            assertEquals(2.8284, calculator.squareRoot(8), 0.0001); // Test square root
            assertEquals(Double.NaN, calculator.squareRoot(-8), 0.0001); // Test square root of negative number
        }

        @Test
        public void testVarExpnt() {
            assertEquals(343.0, calculator.varExpnt(7, 3), 0.0001); // Test variable exponentiation
        }

        @Test
        public void testInverse() {
            assertEquals(0.2, calculator.inverse(5), 0.0001); // Test inverse
            assertEquals(Double.NaN, calculator.inverse(0), 0.0001); // Test inverse of 0
        }

        @Test
        public void testInvertSign() {
            assertEquals(333.0, calculator.invertSign(-333), 0.0001); // Test invert sign of negative number
            assertEquals(333.0, calculator.invertSign(333), 0.0001); // Test invert sign of positive number
        }
    }
