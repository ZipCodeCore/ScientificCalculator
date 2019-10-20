package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InverseNaturalLogarithmTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void inverseNaturalLogarithmTest1() {
        // given
        InverseNaturalLogarithm result = new InverseNaturalLogarithm();
        Integer inputValue = 1;
        double expected = Math.exp(inputValue);

        // when
        double actual = result.inverseNaturalLogarithm(inputValue);

        // then
        assertEquals(expected, actual, .00);
    }
    @Test
    public void inverseNaturalLogarithmTest2() {
        // given
        InverseNaturalLogarithm result = new InverseNaturalLogarithm();
        Integer inputValue = 45;
        double expected = Math.exp(inputValue);

        // when
        double actual = result.inverseNaturalLogarithm(inputValue);

        // then
        assertEquals(expected, actual, .00);
    }
}