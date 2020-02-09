package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLogarithm {

    ////*********      ***********////////////////////

    @Test
    public void logNegative() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 0.0;
        actual= Logarithm.Log(-1.0);
        assertEquals(expected,actual);

    }

    @Test
    public void logZero() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 0.0;
        actual= Logarithm.Log(0.0);
        assertEquals(expected,actual);

    }

    @Test
    public void logOne() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 0.0;
        actual= Logarithm.Log(1.0);
        assertEquals(expected,actual);

    }

    @Test
    public void logDecimal() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 0.17609125905568124;
        actual= Logarithm.Log(1.5);
        assertEquals(expected,actual);

    }

    @Test
    public void logThousand() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 3.0;
        actual= Logarithm.Log(1000.0);
        assertEquals(expected,actual);

    }


    ////*********      ***********////////////////////

    @Test
    public void invLogNegative() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 0.001;
        actual= Logarithm.InvLog(-3.0);
        assertEquals(expected,actual);

    }

    @Test
    public void invLogZero() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 1.0;
        actual= Logarithm.InvLog(0.0);
        assertEquals(expected,actual);

    }

    @Test
    public void invLogThree() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 1000.0;
        actual= Logarithm.InvLog(3.0);
        assertEquals(expected,actual);

    }

    @Test
    public void invLogDecimal() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 1584.893192461114;
        actual= Logarithm.InvLog(3.2);
        assertEquals(expected,actual);

    }

    ////*********      ***********////////////////////

    @Test
    public void NLogNegative() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 0.0;
        actual= Logarithm.NLog(-1.0);
        assertEquals(expected,actual);
    }
    @Test
    public void NLogZero() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 0.0;
        actual= Logarithm.NLog(0.0);
        assertEquals(expected,actual);
    }

    @Test
    public void NLogOne() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 0.0;
        actual= Logarithm.NLog(1.0);
        assertEquals(expected,actual);
    }

    @Test
    public void NLogDecimal() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 1.1314021114911006;
        actual= Logarithm.NLog(3.1);
        assertEquals(expected,actual);
    }

    @Test
    public void invNLogNegative() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 0.36787944117144233;
        actual= Logarithm.InvNLog(-1.0);
        assertEquals(expected,actual);
    }

    @Test
    public void invNLogZero() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 1.0;
        actual= Logarithm.InvNLog(0.0);
        assertEquals(expected,actual);
    }

    @Test
    public void invNLogOne() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 2.718281828459045;
        actual= Logarithm.InvNLog(1.0);
        assertEquals(expected,actual);
    }

    @Test
    public void invNLogDecimal() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 0.33287108369807955;
        actual= Logarithm.InvNLog(-1.1);
        assertEquals(expected,actual);
    }

    @Test
    public void invNLogFour() {

        Logarithm TestLogarithm = new Logarithm();
        Double actual;
        Double expected = 54.59815003314423;
        actual= Logarithm.InvNLog((double)4);
        assertEquals(expected,actual);
    }
}