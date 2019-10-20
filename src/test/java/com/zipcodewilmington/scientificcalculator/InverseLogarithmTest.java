package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InverseLogarithmTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void inverseLogarithmTest1() {
        // given
        InverseLogarithm result = new InverseLogarithm();
        Integer inputValue = 1;
        double expected = Math.pow(10,inputValue);

        // when
        double actual = result.inverseLogarithm(inputValue);

        // then
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseLogarithmTest2() {
        // given
        InverseLogarithm result = new InverseLogarithm();
        Integer inputValue = 45;
        double expected = Math.pow(10,inputValue);

        // when
        double actual = result.inverseLogarithm(inputValue);

        // then
        assertEquals(expected, actual, .00);
    }
}