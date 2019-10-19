package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquaredTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void squaredTest1() {
        // given
        Squared result = new Squared();
        double inputValue = 2;
        double expected = inputValue * inputValue;

        // when
        double actual = result.squared(inputValue);

        // then
        assertEquals(expected, actual, .00);
    }


    @Test
    public void multiplicationTest2() {
        // given
        Squared result = new Squared();
        double inputValue = 7;
        double expected = inputValue * inputValue;

        // when
        double actual = result.squared(inputValue);

        // then
        assertEquals(expected, actual, .00);
    }

    @After
    public void tearDown() throws Exception {
    }
}