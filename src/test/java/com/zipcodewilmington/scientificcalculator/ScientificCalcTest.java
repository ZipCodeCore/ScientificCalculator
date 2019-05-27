package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class ScientificCalcTest {


        @Before
        public void setUp() throws Exception {

        }

        @After
        public void tearDown() throws Exception {
        }

        @Test
        public void mathOperation() {
            ScientificCalc calc = new ScientificCalc();

            assertEquals(1010.0, calc.MathOperation("binary", 10.0),0);
            assertEquals(10100.0, calc.MathOperation("binary", 20.0),0);
            assertEquals(620, calc.MathOperation("octal", 400.00),0);
            assertEquals(15530, calc.MathOperation("octal", 7000.00),0);
            assertEquals(3e8, calc.MathOperation("hexadecimal", 1000.00),0);
            assertEquals(14.0, calc.MathOperation("hexadecimal", 20.00),0);
            assertEquals(1, calc.MathOperation("sin", 90.00),0);
            assertEquals(.99, calc.MathOperation("sin", 1.5),0);
            assertEquals(0.8660, calc.MathOperation("cos", 30.00),0);
            assertEquals(-0.99, calc.MathOperation("cos", 3.14),0);
            assertEquals(.713, calc.MathOperation("tan", 120.00),0);
            assertEquals(.577, calc.MathOperation("tan", 30.00),0);
            assertEquals(34.75, calc.MathOperation("inverse sine", .57),0);
            assertEquals(38.99, calc.MathOperation("inverse sine", .6293),0);
            assertEquals(33.6, calc.MathOperation("inverse cosine", .833),0);
            assertEquals(45, calc.MathOperation("inverse tan", 1.00),0);
            assertEquals(36.86, calc.MathOperation("inverse tan", .75),0);
            assertEquals(1, calc.MathOperation("log", 10.00),0);
            assertEquals(3, calc.MathOperation("log", 1000.00),0);
            assertEquals(.602, calc.MathOperation("log10", 4.00),0);
            assertEquals(1, calc.MathOperation("log10", 10.00),0);
            assertEquals(0, calc.MathOperation("inverse natural log", 1.00),0);
            assertEquals(2.30, calc.MathOperation("inverse natural log", 10.00),0);
            assertEquals(1000, calc.MathOperation("inverse log", 3.00),0);
            assertEquals(10000, calc.MathOperation("inverse log", 4.00),0);
            assertEquals(6, calc.MathOperation("factorial", 3.00),0);
            assertEquals(3628800, calc.MathOperation("factorial", 10.00),0);
            assertEquals(10, calc.MathOperation("mr", 10.00),0);
            assertEquals(10, calc.MathOperation("mc", 0.0),0);


        }

        @Test
        public void factorial() {

            ScientificCalc calc = new ScientificCalc();

            BigInteger expected = new BigInteger("39916800");

            BigInteger actual = calc.factorial(11);
            assertEquals("Values should be equal", expected, actual);


        }
    }

