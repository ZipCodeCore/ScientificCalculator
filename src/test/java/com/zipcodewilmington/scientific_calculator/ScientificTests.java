package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScientificCalc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScientificTests {

    ScientificCalc scientific = new ScientificCalc();

    // Sine Tests in Radians and Degrees
    @Test
    public void sinRadians() {
        double expected = 0;
        double actual = scientific.sin(0);
        assertEquals(expected, actual, 0.01);
    }

    /*
    @Test
    public void sinRadians() {
        double expected = 0;
        double actual = scientific.sin(0);
        assertEquals(expected, actual, 0.01);
    }
    */

}
