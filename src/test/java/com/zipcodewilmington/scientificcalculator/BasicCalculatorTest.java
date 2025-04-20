package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;

public class BasicCalculatorTest {

    @Test
    public void addTest() {
        BasicCalculator adding = new BasicCalculator();
        double actual = adding.add(10, 5);
        double expected = 15;
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void subTest() {
        BasicCalculator subtracting = new BasicCalculator();
        double actual = subtracting.subst(10, 5);
        double expected = 5;
        Assert.assertEquals(expected, actual, 0);
    }
}