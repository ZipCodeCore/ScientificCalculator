package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;

import org.junit.Assert;
import org.junit.Test;

public class scientificCalcTest {

    @Test
    public void sine() {
        // given 30
        double sine = Math.toRadians(30);
        scientificCalc sineCalc = new scientificCalc();
        double actual = sineCalc.sineOf(sine);
        double expected = 0.5;
        Assert.assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void inverseSine() {
        double inversesine = 0.2;
        scientificCalc inversesineCalc = new scientificCalc();
        double actual = inversesineCalc.inversesineOf(inversesine);
        double expected = 0.201358;
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @org.junit.Test
    public void cosign() {
    }

    @org.junit.Test
    public void inverseCoSine() {
    }

    @org.junit.Test
    public void tangent() {
    }

    @org.junit.Test
    public void inverseTangent() {
    }

    @org.junit.Test
    public void logarithm() {
    }

    @org.junit.Test
    public void logarithm10() {
    }

    @org.junit.Test
    public void logp() {
    }

    @org.junit.Test
    public void factorial() {
    }
}