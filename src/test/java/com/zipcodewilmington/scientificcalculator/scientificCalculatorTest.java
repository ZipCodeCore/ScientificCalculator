package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class scientificCalculatorTest {

    @Test
    public void switchDisplayMode() {
    }

    @Test
    public void switchDisplayMode1() {
    }

    @Test
    public void saveNumber() {
    }

    @Test
    public void sine() {
        Double input = 5.0;

        scientificCalculator testCalc = new scientificCalculator();
        Double result = testCalc.sine(input);

        assertEquals(new Double(-0.959), result);
    }

    @Test
    public void cosine() {
        Double input = 5.0;

        scientificCalculator testCalc = new scientificCalculator();
        Double result = testCalc.cosine(input);

        assertEquals(new Double(0.284), result);
    }

    @Test
    public void tangent() {
        Double input = 5.0;

        scientificCalculator testCalc = new scientificCalculator();
        Double result = testCalc.tangent(new Double(input));

        assertEquals(new Double(-3.381), result);
    }

    @Test
    public void arcSine() {
        Double input = 5.0;

        scientificCalculator testCalc = new scientificCalculator();
        Double result = testCalc.arcSine(new Double(input));

        assertEquals(new Double(100), result);
    }

    @Test
    public void arcCos() {
        Double input = 5.0;

        scientificCalculator testCalc = new scientificCalculator();
        Double result = testCalc.arcCos(new Double(input));

        assertEquals(new Double(100), result);
    }

    @Test
    public void arcTan() {
        Double input = 5.0;


        scientificCalculator testCalc = new scientificCalculator();
        Double result = testCalc.arcTan(input);

        assertEquals(new Double(100), result);
    }

    @Test
    public void switchUnitsMode() {
    }

    @Test
    public void switchUnitesMode() {
    }

    @Test
    public void log() {
        Double input = 5.0;

        scientificCalculator testCalc = new scientificCalculator();
        Double result = testCalc.invLn(input);

        assertEquals(new Double(100), result);
    }

    @Test
    public void invLog() {
        Double input = 5.0;

        scientificCalculator testCalc = new scientificCalculator();
        Double result = testCalc.invLn(input);

        assertEquals(new Double(100), result);
    }

    @Test
    public void ln() {
        Double input = 5.0;

        scientificCalculator testCalc = new scientificCalculator();
        Double result = testCalc.ln(input);

        assertEquals(new Double(100), result);
    }

    @Test
    public void invLn() {
        Double input = 5.0;

        scientificCalculator testCalc = new scientificCalculator();
        Double result = testCalc.invLn(input);

        assertEquals(new Double(100), result);
    }

    @Test
    public void factorial() {
        Double input = 5.0;

        scientificCalculator testCalc = new scientificCalculator();
        Double result = testCalc.factorial(input);

        assertEquals(new Double(120), result);

    }
}