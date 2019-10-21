package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputCheckerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isNumericTest1() {
        boolean actual = InputChecker.isNumeric("213");
        assertTrue(actual);
    }
    @Test
    public void isNumericTest2() {
        boolean actual = InputChecker.isNumeric("pony");
        assertFalse(actual);
    }
}