package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestOtherFunctions {

    @Test
    public void FactNegativeOne() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        int actual;
        int expected=0;
        actual= OtherFunctions.Fact(-1);
        assertEquals(expected,actual);

    }

    @Test
    public void FactZero() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        int actual;
        int expected=1;
        actual= OtherFunctions.Fact(1);
        assertEquals(expected,actual);

    }

    @Test
    public void FactOne() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        int actual;
        int expected=1;
        actual= OtherFunctions.Fact(1);
        assertEquals(expected,actual);

    }

    @Test
    public void FactFive() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        int actual;
        int expected=120;
        actual= OtherFunctions.Fact(5);
        assertEquals(expected,actual);

    }

    ///////*******************           **************************////////////////

    @Test
    public void FibonNegativeOne() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        int actual;
        int expected = 0;
        actual = OtherFunctions.Fibon(-1);
        assertEquals(expected, actual);

    }

    @Test
    public void FibonZero() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        int actual;
        int expected=0;
        actual= OtherFunctions.Fibon(0);
        assertEquals(expected,actual);

    }

    @Test
    public void FibonOne() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        int actual;
        int expected=1;
        actual= OtherFunctions.Fibon(1);
        assertEquals(expected,actual);

    }

    @Test
    public void FibonTwo() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        int actual;
        int expected=1;
        actual= OtherFunctions.Fibon(2);
        assertEquals(expected,actual);

    }

    @Test
    public void FibonThree() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        int actual;
        int expected=2;
        actual= OtherFunctions.Fibon(3);
        assertEquals(expected,actual);

    }

    @Test
    public void FibonTen() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        int actual;
        int expected=55;
        actual= OtherFunctions.Fibon(10);
        assertEquals(expected,actual);

    }
}