package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicMath;
import jdk.nashorn.internal.objects.Global;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBasicMath {
// Addition test cases
    @Test
    public void TestAdditionWhole()
    {
        BasicMath additionTest = new BasicMath();
        Double actual;
        Double expected = 45.0;
        actual = additionTest.addition(30.0,15.0);
        assertEquals(expected, actual);
    }
    @Test
    public void TestAdditionNegative()
    {
        BasicMath additionTest = new BasicMath();
        Double actual;
        Double expected = 3.0;
        actual = additionTest.addition(8.0,-5.0);
        assertEquals(expected, actual);
    }
    @Test
    public void TestAdditionDecimal()
    {
        BasicMath additionTest = new BasicMath();
        Double actual;
        Double expected = 57.4;
        actual = additionTest.addition(55.0,2.4);
        assertEquals(expected, actual);
    }
// Subtraction test cases
    @Test
    public void TestSubtractionWholes()
    {
     BasicMath subtractionTest = new BasicMath();
     Double actual;
     Double expected = 15.0;
     actual = subtractionTest.subtraction(30.0,15.0);
     assertEquals(expected, actual);
    }
    @Test
    public void TestSubtractionNegatives()
    {
        BasicMath subtractionTest = new BasicMath();
        Double actual;
        Double expected = 25.0;
        actual = subtractionTest.subtraction(17.0,-8.0);
        assertEquals(expected, actual);
    }

    @Test
    public void TestSubtractionDecimal()
    {
        BasicMath subtractionTest = new BasicMath();
        Double actual;
        Double expected = 5.9;
        actual = subtractionTest.subtraction(12.4,6.5);
        assertEquals(expected, actual);
    }

    @Test
    public void TestSubtractionGreater()
    {
        BasicMath subtractionTest = new BasicMath();
        Double actual;
        Double expected = -11.8;
        actual = subtractionTest.subtraction(4.7,16.5);
        assertEquals(expected, actual);
    }
    // Multiplication test cases
    @Test
    public void TestMultiplicationWholes1()
    {
        BasicMath multiplicationTest = new BasicMath();
        Double actual;
        Double expected = 15.0;
        actual = multiplicationTest.multiplication(3.0,5.0);
        assertEquals(expected, actual);
    }
    @Test
    public void TestMultiplicationDecimals()
    {
        BasicMath multiplicationTest = new BasicMath();
        Double actual;
        Double expected = 18.48;
        // fix this rounding error
        actual = multiplicationTest.multiplication(8.4,2.2);
        assertEquals(expected, actual, .0001);
    }
    // Division Test Cases
    @Test
    public void TestDivisionWholes()
    {
        BasicMath divisionTest = new BasicMath();
        Double actual;
        Double expected = 3.0;
        actual = divisionTest.division(6.0,2.0);
        assertEquals(expected, actual);
    }
    @Test
    public void TestDivisionDecimals()
    {
        BasicMath divisionTest = new BasicMath();
        Double actual;
        Double expected = 6.2;
        actual = divisionTest.division(12.4,2.0);
        assertEquals(expected, actual, .0001);

    }
    @Test
    public void TestDivisionZero() {
        BasicMath divisionTest = new BasicMath();
        Double actual;
        Double expected = Global.Infinity;
        actual = divisionTest.division(12.4, 0.0);
        assertEquals(expected, actual, .0001);
    }
        @Test
    public void TestExponentSixTwo()
    {
        BasicMath exponentTest = new BasicMath();
        Double actual;
        Double expected = 36.0;
        actual = exponentTest.exponent(6.0,2.0);
        assertEquals(expected, actual);
    }
    //Square Test Cases
    @Test
    public void TestsquareFour()
    {
        BasicMath squareTest = new BasicMath();
        Double actual;
        Double expected = 16.0;
        actual = squareTest.square(4.0);
        assertEquals(expected, actual);
    }
    @Test
    public void TestSquareRootTwentyFive()
    {
        BasicMath squarerootTest = new BasicMath();
        Double actual;
        Double expected = 5.0;
        actual = squarerootTest.squareroot(25.0);
        assertEquals(expected, actual);
    }
    @Test
    public void TestSquareRootFour()
    {
        BasicMath squarerootTest = new BasicMath();
        Double actual;
        Double expected = 2.0;
        actual = squarerootTest.squareroot(4.0);
        assertEquals(expected, actual);
    }
    @Test
    public void TestSquareRootNegative()
    {
        BasicMath squarerootTest = new BasicMath();
        Double actual;
        Double expected = Double.NaN;
        actual = squarerootTest.squareroot(-4.0);
        assertEquals(expected, actual);
    }
}

