package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void sqrt1() {

        // given
        Sqrt result = new Sqrt();
        double inputValue1 = 2;
        double expected = Math.sqrt(inputValue1);

        // when
        double actual = result.sqrt(inputValue1);

        // then
        assertEquals(expected, actual, .00);
    }


    @Test
    public void sqrt2() {
        // given
        Sqrt result = new Sqrt();
        double inputValue1 = 7;
        double expected = Math.sqrt(inputValue1);

        // when
        double actual = result.sqrt(inputValue1);

        // then
        assertEquals(expected, actual, .00);
    }
}
