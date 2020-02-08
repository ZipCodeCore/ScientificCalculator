package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicMath;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBasicMath {

    @Test
    public void TestAdditionThirtyPlusFifteen()
    {
    BasicMath additionTest = new BasicMath();
    Double actual;
    Double expected = 45.0;
    actual = additionTest.addition(30.0,15.0);
    assertEquals(expected, actual);
    }

    @Test
    public void TestSubtractionThirtyFifteen()
    {
        BasicMath subtractionTest = new BasicMath();
        Double actual;
        Double expected = 15.0;
        actual = subtractionTest.subtraction(30.0,15.0);
        assertEquals(expected, actual);
    }
}
