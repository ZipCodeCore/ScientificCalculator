package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositiveToNegativeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void multiplicationTest1() {
        // given
        PositiveToNegative product = new PositiveToNegative();
        double inputValue1 = 2;
        double expected = -1 * inputValue1;

        // when
        double actual = product.positiveToNegative(inputValue1);

        // then
        assertEquals(expected, actual, .00);
    }

    @Test
    public void multiplicationTest2() {
        // given
        PositiveToNegative product = new PositiveToNegative();
        double inputValue1 = 17;
        double expected = -1 * inputValue1;

        // when
        double actual = product.positiveToNegative(inputValue1);

        // then
        assertEquals(expected, actual, .00);
    }
}