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
            assertEquals(1, calc.MathDegrees("sin", 90.00),0);
            assertEquals(.9974949866040544, calc.MathOperation("sin", 1.5),0);
            assertEquals(0.8660254037844387, calc.MathDegrees("cos", 30.00),0);
            assertEquals(-0.9999987317275395, calc.MathOperation("cos", 3.14),0);
            assertEquals(0.7131230097859091, calc.MathOperation("tan", 120.00),0);
            assertEquals(0.5773502691896257, calc.MathDegrees("tan", 30.00),0);
            assertEquals(0.45151844661923823, calc.MathDegrees("inverse sine", 25.00),0);
            assertEquals(1.5562572219050328, calc.MathDegrees("inverse cosine", .833),0);
            assertEquals(0.6657737500283538, calc.MathDegrees("inverse tan", 45.00),0);
            assertEquals(2.302585092994046, calc.MathOperation("log", 10.00),0);
            assertEquals(0.6020599913279624, calc.MathOperation("log10", 4.00),0);
            assertEquals(1, calc.MathOperation("log10", 10.00),0);
            assertEquals(2.718281828459045, calc.MathOperation("inverse natural log", 1.00),0);
            assertEquals(22026.465794806703, calc.MathOperation("inverse natural log", 10.00),0);
            assertEquals(1000, calc.MathOperation("inverse log", 3.00),0);
            assertEquals(10000, calc.MathOperation("inverse log", 4.00),0);
            assertEquals(6, calc.MathOperation("factorial", 3.00),0);
            assertEquals(3628800, calc.MathOperation("factorial", 10.00),0);
            assertEquals(0.0, calc.MathOperation("mc", 0.0),0);


        }

        @Test
        public void factorial() {

            ScientificCalc calc = new ScientificCalc();

            BigInteger expected = new BigInteger("39916800");

            BigInteger actual = calc.factorial(11);
            assertEquals("Values should be equal", expected, actual);


        }
    }

