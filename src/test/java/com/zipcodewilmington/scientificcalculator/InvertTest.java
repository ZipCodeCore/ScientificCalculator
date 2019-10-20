package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvertTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void multiplicationTest1() {
        // given
        Invert result = new Invert();
        double inputValue = 2;
        double expected = -1 * inputValue;

        // when
        double actual = result.invert(inputValue);

        // then
        assertEquals(expected, actual, .00);
    }

    @Test
    public void multiplicationTest2() {
        // given
        Invert product = new Invert();
        double inputValue = 17;
        double expected = -1 * inputValue;

        // when
        double actual = product.invert(inputValue);

        // then
        assertEquals(expected, actual, .00);
    }
}