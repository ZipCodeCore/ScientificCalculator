package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InverseTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void inverseTest1() {
        // given
        Inverse result = new Inverse();
        double inputValue = 4;
        double expected = 1 / inputValue;

        // when
        double actual = result.inverse(inputValue);

        // then
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseTest2() {
        // given
        Inverse result = new Inverse();
        double inputValue = 15;
        double expected = 1 / inputValue;

        // when
        double actual = result.inverse(inputValue);

        // then
        assertEquals(expected, actual, .00);
    }

    @After
    public void tearDown() throws Exception {
    }
}