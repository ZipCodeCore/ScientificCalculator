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
        Squared product = new Squared();
        double inputValue1 = 2;
        double expected = inputValue1 * inputValue1;

        // when
        double actual = product.squared(inputValue1);

        // then
        assertEquals(expected, actual, .00);
    }


    @Test
    public void multiplicationTest2() {
        // given
        Squared product = new Squared();
        double inputValue1 = 7;
        double expected = inputValue1 * inputValue1;

        // when
        double actual = product.squared(inputValue1);

        // then
        assertEquals(expected, actual, .00);
    }

    @After
    public void tearDown() throws Exception {
    }
}