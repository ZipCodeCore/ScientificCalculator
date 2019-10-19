package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void subtractionTest1() {
        // given
        Subtraction product = new Subtraction();
        double inputValue1 = 2;
        double inputValue2 = 3;
        double expected = inputValue1 - inputValue2;

        // when
        double actual = product.subtract(inputValue1,inputValue2);

        // then
        assertEquals(expected, actual, .00);
    }


    @Test
    public void subtractionTest2() {
        // given
        Subtraction product = new Subtraction();
        double inputValue1 = 3;
        double inputValue2 = 2;
        double expected = inputValue1 - inputValue2;

        // when
        double actual = product.subtract(inputValue1,inputValue2);

        // then
        assertEquals(expected, actual, .00);
    }
}

