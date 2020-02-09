package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicMath;
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
    public void TestSubtractionThirtyFifteen()
    {
     BasicMath subtractionTest = new BasicMath();
     Double actual;
     Double expected = 15.0;
     actual = subtractionTest.subtraction(30.0,15.0);
     assertEquals(expected, actual);
    }
    // Multiplication test cases
    @Test
    public void TestMultiplicationThreeFive()
    {
        BasicMath multiplicationTest = new BasicMath();
        Double actual;
        Double expected = 15.0;
        actual = multiplicationTest.multiplication(3.0,5.0);
        assertEquals(expected, actual);
    }
    // Division Test Cases
    @Test
    public void TestDivisionSixTwo()
    {
        BasicMath divisionTest = new BasicMath();
        Double actual;
        Double expected = 3.0;
        actual = divisionTest.division(6.0,2.0);
        assertEquals(expected, actual);
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
}

