package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicMath;
import com.zipcodewilmington.scientificcalculator.ConversionMath;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConversionMath {
    @Test
    public void TestFeetToMetersWhole() {
        ConversionMath feetToMetersTest = new ConversionMath();
        Double actual;
        Double expected = 0.30478512648582745;
        actual = feetToMetersTest.feetToMeters(1.0);
        assertEquals(expected, actual);
    }
    @Test
    public void TestFeetToMetersDecimal() {
        ConversionMath feetToMetersTest = new ConversionMath();
        Double actual;
        Double expected = 0.762;
        actual = feetToMetersTest.feetToMeters(2.5);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCtoF() {
        ConversionMath celsiusToFahrenheitTest = new ConversionMath();
        Double actual;
        Double expected = 140.0;
        actual = celsiusToFahrenheitTest.celsiusToFahrenheit(60.0);
        assertEquals(expected, actual);
    }

    @Test
    public void TestFtoC() {
        ConversionMath fahrenheitToCelsiusTest = new ConversionMath();
        Double actual;
        Double expected = 60.0;
        actual = fahrenheitToCelsiusTest.fahrenheitToCelsius(140.0);
        assertEquals(expected, actual);
    }

    @Test
    public void TestFtoCDecimal() {
        ConversionMath fahrenheitToCelsiusTest = new ConversionMath();
        Double actual;
        Double expected = 37.77777777777778;
        actual = fahrenheitToCelsiusTest.fahrenheitToCelsius(100.0);
        assertEquals(expected, actual);
    }
}
