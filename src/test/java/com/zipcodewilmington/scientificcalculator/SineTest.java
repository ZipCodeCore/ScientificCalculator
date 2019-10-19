package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SineTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void factorialTest1() {
        // given
        Sine result = new Sine();
        double inputValue = 5;
        double expected = Math.sin(inputValue);

        // when
        double actual = result.sine(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }
    @Test
    public void factorialTest2() {
        // given
        Sine result = new Sine();
        double inputValue = 45;
        double expected = Math.sin(inputValue);

        // when
        double actual = result.sine(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }
}