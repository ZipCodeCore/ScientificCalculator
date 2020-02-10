package com.zipcodewilmington.scientificcalculator;


import org.junit.Test;

import static org.junit.Assert.*;

public class TestOtherFunctions {

    @Test
    public void FactNegativeOne() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        Double actual;
        Double expected=0.0;
        actual= OtherFunctions.Fact(-1.0);
        assertEquals(expected,actual);

    }

    @Test
    public void FactZero() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        Double actual;
        Double expected= 1.0;
        actual = OtherFunctions.Fact(1.0);
        assertEquals(expected,actual);

    }

    @Test
    public void FactOne() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        Double actual;
        Double expected=1.0;
        actual= OtherFunctions.Fact(1.0);
        assertEquals(expected,actual);

    }

    @Test
    public void FactFive() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        Double actual;
        Double expected=120.0;
        actual= OtherFunctions.Fact(5.0);
        assertEquals(expected,actual);

    }

    ///////*******************           **************************////////////////

    @Test
    public void FibonNegativeOne() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        Double actual;
        Double expected = 0.0;
        actual = OtherFunctions.Fibon(-1.0);
        assertEquals(expected, actual);

    }

    @Test
    public void FibonZero() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        Double actual;
        Double expected=0.0;
        actual= OtherFunctions.Fibon(0.0);
        assertEquals(expected,actual);

    }

    @Test
    public void FibonOne() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        Double actual;
        Double expected=1.0;
        actual= OtherFunctions.Fibon(1.0);
        assertEquals(expected,actual);

    }

    @Test
    public void FibonTwo() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        Double actual;
        Double expected=1.0;
        actual= OtherFunctions.Fibon(2.0);
        assertEquals(expected,actual);

    }

    @Test
    public void FibonThree() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        Double actual;
        Double expected=2.0;
        actual= OtherFunctions.Fibon(3.0);
        assertEquals(expected,actual);

    }

    @Test
    public void FibonTen() {

        OtherFunctions OtherFunctionsTest = new OtherFunctions();
        Double actual;
        Double expected=55.0;
        actual= OtherFunctions.Fibon(10.0);
        assertEquals(expected,actual);

    }
}