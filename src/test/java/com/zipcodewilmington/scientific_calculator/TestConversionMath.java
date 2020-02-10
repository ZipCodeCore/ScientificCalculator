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
        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void TestFeetToMetersDecimal() {
        ConversionMath feetToMetersTest = new ConversionMath();
        Double actual;
        Double expected = 0.762;
        actual = feetToMetersTest.feetToMeters(2.5);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void TestCtoF() {
        ConversionMath celsiusToFahrenheitTest = new ConversionMath();
        Double actual;
        Double expected = 140.0;
        actual = celsiusToFahrenheitTest.celsiusToFahrenheit(60.0);
        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void TestCtoFDecimal() {
        ConversionMath celsiusToFahrenheitTest = new ConversionMath();
        Double actual;
        Double expected = 107.6;
        actual = celsiusToFahrenheitTest.celsiusToFahrenheit(42.0);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void TestFtoC() {
        ConversionMath fahrenheitToCelsiusTest = new ConversionMath();
        Double actual;
        Double expected = 60.0;
        actual = fahrenheitToCelsiusTest.fahrenheitToCelsius(140.0);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void TestFtoCDecimal() {
        ConversionMath fahrenheitToCelsiusTest = new ConversionMath();
        Double actual;
        Double expected = 37.778;
        actual = fahrenheitToCelsiusTest.fahrenheitToCelsius(100.0);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void TestPoundstoKilos() {
        ConversionMath poundsToKilosTest = new ConversionMath();
        Double actual;
        Double expected = 5.44311;
        actual = poundsToKilosTest.poundsToKilos(12.0);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void TestPoundstoKilosDecimal() {
        ConversionMath poundsToKilosTest = new ConversionMath();
        Double actual;
        Double expected = 7.9365;
        actual = poundsToKilosTest.poundsToKilos(17.5);
        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void TestKilosToPounds() {
        ConversionMath kilosToPoundsTest= new ConversionMath();
        Double actual;
        Double expected = 81.585;
        actual = kilosToPoundsTest.kilosToPounds(37.0);
        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void TestKilosToPoundsDecimal() {
        ConversionMath kilosToPoundsTest= new ConversionMath();
        Double actual;
        Double expected = 26.901;
        actual = kilosToPoundsTest.kilosToPounds(12.2);
        assertEquals(expected, actual, 0.001);
    }
}
