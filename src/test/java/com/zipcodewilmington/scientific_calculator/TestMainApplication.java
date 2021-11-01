package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CoreFeatures;
import com.zipcodewilmington.scientificcalculator.scientificFunctions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    @Test
    private void testAddition() {
        CoreFeatures testCore = new CoreFeatures();
        double base = 10.0;
        assertEquals(base, testCore.addition(3.0, 7.0));
    }

    @Test
    private void testSubtraction() {
        CoreFeatures testCore = new CoreFeatures();
        double base = -5.0;
        assertEquals(base, testCore.subtraction(0, 5));
    }

    @Test
    private void testMultiplication() {
        CoreFeatures testCore = new CoreFeatures();
        double base = 27.0;
        assertEquals(base, testCore.multiplication(3.0, 9.0));
    }

    @Test
    private void testDivision() {
        CoreFeatures testCore = new CoreFeatures();
        double base = 4;
        assertEquals(base, testCore.division(24.0, 6.0));
    }

    @Test
    private void testSquare() {
        CoreFeatures testCore = new CoreFeatures();
        double base = 9.0;
        assertEquals(base, testCore.square(3.0));
    }

    @Test
    private void testSquareRoot() {
        CoreFeatures testCore = new CoreFeatures();
        double base = 3.0;
        assertEquals(base, testCore.squareroot(9.0));
    }

    @Test
    private void testSine() {
        scientificFunctions testSci = new scientificFunctions();
        double base = 0.1736478;
        assertEquals(base, testSci.sine(10.0));
    }

    @Test
    private void testCosine() {
        scientificFunctions testSci = new scientificFunctions();
        double base = 0.9848077;
        assertEquals(base, testSci.cosine(10.0));
    }

    @Test
    private void testTangent() {
        scientificFunctions testSci = new scientificFunctions();
        double base = 0.1763269;
        assertEquals(base, testSci.tangent(10.0));
    }

    @Test
    private void testInverseSine() {
        scientificFunctions testSci = new scientificFunctions();
        double base = 11013.232874;
        assertEquals(base, testSci.inverseSine(10.0));
    }

    @Test
    private void testInverseCosine() {
        scientificFunctions testSci = new scientificFunctions();
        double base = 11013.232292;
        assertEquals(base, testSci.inverseCosine(10.0));
    }

    @Test
    private void testInverseTangent() {
        scientificFunctions testSci = new scientificFunctions();
        double base = 0.999999;
        assertEquals(base, testSci.inverseTangent(10.0));
    }

    @Test
    private void testLog() {
        scientificFunctions testSci = new scientificFunctions();
        double base = 1.0;
        assertEquals(base, testSci.log(10.0));
    }

    @Test
    private void testNaturalLog() {
        scientificFunctions testSci = new scientificFunctions();
        double base = 2.302585;
        assertEquals(base, testSci.naturalLog(10.0));
    }

    @Test
    private void testInverseLog() {
        scientificFunctions testSci = new scientificFunctions();
        double base = 2.302585;
        assertEquals(base, testSci.InverseLog(10.0));
    }

    @Test
    private void testInverseNaturalLog() {
        scientificFunctions testSci = new scientificFunctions();
        double base = 2.302585;
        assertEquals(base, testSci.InverseNaturalLog(10.0));
    }

}
