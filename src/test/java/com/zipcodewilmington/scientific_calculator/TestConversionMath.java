package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicMath;
import com.zipcodewilmington.scientificcalculator.ConversionMath;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConversionMath {
    @Test
    public void TestFeetToMetersWhole()
    {
        ConversionMath feetToMetersTest = new ConversionMath();
        Double actual;
        Double expected = 0.30478512648582745;
        actual = feetToMetersTest.feetToMeters(1.0);
        assertEquals(expected, actual);
    }
}
