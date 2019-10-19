package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExponentTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void exponent1() {

        // given
        Exponent product = new Exponent();
        double inputValue1 = 2;
        double inputValue2 = 3;
        double expected = Math.pow(inputValue1, inputValue2);

        // when
        double actual = product.exponent(inputValue1,inputValue2);

        // then
        assertEquals(expected, actual, .00);
    }


    @Test
    public void exponent2() {
        // given
        Exponent product = new Exponent();
        double inputValue1 = 7;
        double inputValue2 = 3;
        double expected = Math.pow(inputValue1, inputValue2);

        // when
        double actual = product.exponent(inputValue1,inputValue2);

        // then
        assertEquals(expected, actual, .00);
    }
}
