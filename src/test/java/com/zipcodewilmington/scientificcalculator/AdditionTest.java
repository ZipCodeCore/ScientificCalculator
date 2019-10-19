package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void additionTest() {
        // given
        additionTest product = new addition();
        double inputValue1 = 5;
        double inputValue2 = 5;
        double expected = inputValue1 + inputValue2;

        // when
        double actual = product.add(inputValue1,inputValue2);

        // then
        assertEquals(expected, actual, .00);
    }


    @Test
    public void additionTest2() {
        // given
        AdditionTest product = new AdditionTest() ;
        double inputValue1 = 10;
        double inputValue2 = 10;
        double expected = inputValue1 * inputValue2;

        // when
        double actual = product.add(inputValue1,inputValue2);

        // then
        assertEquals(expected, actual, .00);
    }

    @Test
    public void testAddition() {
    }
}