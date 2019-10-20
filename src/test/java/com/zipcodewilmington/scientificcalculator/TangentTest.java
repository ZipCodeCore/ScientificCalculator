package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TangentTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void tangentTest1() {
        // given
        Tangent result = new Tangent();
        double inputValue = 45;
        double expected;
        if(inputValue < 0) {
            expected = Math.tan(-inputValue);
        } else {
            expected = Math.tan(inputValue);
        }

        // when
        double actual = result.tangent(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void tangentTest2() {
        // given
        Tangent result = new Tangent();
        double inputValue = 90;
        double expected;
        if(inputValue < 0) {
            expected = Math.tan(-inputValue);
        } else {
            expected = Math.tan(inputValue);
        }

        // when
        double actual = result.tangent(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void tangentTest3() {
        // given
        Tangent result = new Tangent();
        double inputValue = -180;
        double expected;
        if(inputValue < 0) {
            expected = Math.tan(-inputValue);
        } else {
            expected = Math.tan(inputValue);
        }

        // when
        double actual = result.tangent(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }
}