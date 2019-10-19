package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.Division;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void divideTest1() {
        // given
        Division result = new Division();
        double inputValue1 = 4;
        double inputValue2 = 2;
        double expected = inputValue1 / inputValue2;

        // when
        double actual = result.divide(inputValue1,inputValue2);

        // then
        assertEquals(expected, actual, .00);
    }

    @Test
    public void divideTest2() {
        // given
        Division result = new Division();
        double inputValue1 = 15;
        double inputValue2 = 5;
        double expected = inputValue1 / inputValue2;

        // when
        double actual = result.divide(inputValue1,inputValue2);

        // then
        assertEquals(expected, actual, .00);
    }
}
