package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Multiplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class MultiplicationTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void multiplyTest() {
        // given
        Multiplication product = new Multiplication();
        double inputValue1 = 2;
        double inputValue2 = 3;
        double expected = inputValue1 * inputValue2;

        // when
        double actual = product.multiply(inputValue1,inputValue2);

        // then
        assertEquals(expected, actual, .00);
    }


    @Test
    public void multiplyTest2() {
        // given
        Multiplication product = new Multiplication();
        double inputValue1 = 7;
        double inputValue2 = 3;
        double expected = inputValue1 * inputValue2;

        // when
        double actual = product.multiply(inputValue1,inputValue2);

        // then
        assertEquals(expected, actual, .00);
    }

    @Test
    public void testMultiply() {
    }
}

