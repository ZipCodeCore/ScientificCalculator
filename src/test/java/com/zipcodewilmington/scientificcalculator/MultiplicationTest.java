package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.Multiplication;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MultiplicationTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void multiplicationTest1() {
        // given
        Multiplication result = new Multiplication();
        double inputValue1 = 2;
        double inputValue2 = 3;
        double expected = inputValue1 * inputValue2;

        // when
        double actual = result.multiply(inputValue1,inputValue2);

        // then
        assertEquals(expected, actual, .00);
    }


    @Test
    public void multiplicationTest2() {
        // given
        Multiplication result = new Multiplication();
        double inputValue1 = 7;
        double inputValue2 = 3;
        double expected = inputValue1 * inputValue2;

        // when
        double actual = result.multiply(inputValue1,inputValue2);

        // then
        assertEquals(expected, actual, .00);
    }
}

