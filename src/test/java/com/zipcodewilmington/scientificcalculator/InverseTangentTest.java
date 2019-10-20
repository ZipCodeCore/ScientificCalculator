package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InverseTangentTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void inverseTangentTest1() {
        // given
        InverseTangent result = new InverseTangent();
        double inputValue = 90;
        double expected = Math.atan(inputValue);

        // when
        double actual = result.inverseTangent(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }
    @Test
    public void inverseTangentTest2() {
        // given
        InverseTangent result = new InverseTangent();
        double inputValue = 0;
        double expected = Math.atan(inputValue);

        // when
        double actual = result.inverseTangent(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }
    @Test
    public void inverseTangentTest3() {
        // given
        InverseTangent result = new InverseTangent();
        double inputValue = -180;
        double expected = Math.atan(inputValue);

        // when
        double actual = result.inverseTangent(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }
}