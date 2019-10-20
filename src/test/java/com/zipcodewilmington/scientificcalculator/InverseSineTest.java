package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InverseSineTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void inverseSineTest1() {
        // given
        InverseSine result = new InverseSine();
        double inputValue = 1;
        double expected = Math.asin(inputValue);

        // when
        double actual = result.inverseSine(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseSineTest2() {
        // given
        InverseSine result = new InverseSine();
        double inputValue = -1;
        double expected = Math.asin(inputValue);

        // when
        double actual = result.inverseSine(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseSineTest3() {
        // given
        InverseSine result = new InverseSine();
        double inputValue = 0;
        double expected = Math.asin(inputValue);

        // when
        double actual = result.inverseSine(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }
}
