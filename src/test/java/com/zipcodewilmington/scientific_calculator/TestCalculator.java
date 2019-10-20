package com.zipcodewilmington.scientific_calculator;

import org.junit.Test;
import org.junit.Assert;

import static com.zipcodewilmington.scientificcalculator.Calculator.*;

public class TestCalculator {
    @Test
    public void testAdd() {
        String expected = "45.0";
        String actual = add(34, 11);
        Assert.assertEquals(expected, actual);
    }
}
