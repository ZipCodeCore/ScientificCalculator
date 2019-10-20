package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void factorialTest1() {
        // given
        Factorial result = new Factorial();
        double inputValue = 5;
        double expected = 1;
            for(int i = 1; i <= inputValue;i++){
                expected = expected * i;
            }

        // when
        Double actual = result.factorial(inputValue);

        // then
        assertEquals(expected, actual, 0);
    }

    @Test
    public void factorialTest2() {
        // given
        Factorial result = new Factorial();
        double inputValue = 10;
        double expected = 1;
        for(int i = 1; i <= inputValue;i++){
            expected = expected * i;
        }

        // when
        double actual = result.factorial(inputValue);

        // then
        assertEquals(expected, actual, 0);
    }

    @Test
    public void factorialTest3() {
        // given
        Factorial result = new Factorial();
        double inputValue = 1;
        double expected = 1;
        for(int i = 1; i <= inputValue;i++){
            expected = expected * i;
        }

        // when
        double actual = result.factorial(inputValue);

        // then
        assertEquals(expected, actual, 0);
    }
}