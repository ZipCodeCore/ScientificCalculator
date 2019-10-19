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
    public void sineTest1() {
        // given
        Sine result = new Sine();
        double inputValue = 90;
        double expected;
        if(inputValue < 0) {
            expected = Math.sin(-inputValue);
        } else {
            expected = Math.sin(inputValue);
        }

        // when
        double actual = result.sine(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }
    @Test
    public void sineTest2() {
        // given
        Sine result = new Sine();
        double inputValue = 45;
        double expected;
        if(inputValue < 0) {
            expected = Math.sin(-inputValue);
        } else {
            expected = Math.sin(inputValue);
        }
        // when
        double actual = result.sine(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void sineTest3() {
        // given
        Sine result = new Sine();
        double inputValue = -180;
        double expected;
        if(inputValue < 0) {
            expected = Math.sin(-inputValue);
        } else {
            expected = Math.sin(inputValue);
        }
        // when
        double actual = result.sine(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }
}