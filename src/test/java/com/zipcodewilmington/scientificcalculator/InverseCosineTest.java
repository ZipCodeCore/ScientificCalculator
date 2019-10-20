package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InverseCosineTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void inverseCosineTest1() {
        // given
        InverseCosine result = new InverseCosine();
        double inputValue = 1;
        double expected = Math.acos(inputValue);

        // when
        double actual = result.inverseCosine(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseCosineTest2() {
        // given
        InverseCosine result = new InverseCosine();
        double inputValue = -1;
        double expected = Math.acos(inputValue);

        // when
        double actual = result.inverseCosine(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseCosineTest3() {
        // given
        InverseCosine result = new InverseCosine();
        double inputValue = 0;
        double expected = Math.acos(inputValue);

        // when
        double actual = result.inverseCosine(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }
}