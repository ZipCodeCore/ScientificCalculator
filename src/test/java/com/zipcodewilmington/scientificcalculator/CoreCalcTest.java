package com.zipcodewilmington.scientificcalculator;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class CoreCalcTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void basicCalcs() {
        CoreCalc calc = new CoreCalc();

        assertEquals(19.0, calc.basicCalcs("+", 9,10),0);
        assertEquals(10.0,calc.basicCalcs("+",3,7),0);
        assertEquals(4.0,calc.basicCalcs("-",11,7),0);
        assertEquals(6.0,calc.basicCalcs("-",100,94),0);
        assertEquals(9.0,calc.basicCalcs("*",3,3),0);
        assertEquals(121.0,calc.basicCalcs("*",11,11),0);
        assertEquals(5.0,calc.basicCalcs("/",15,3),0);
        assertEquals(5.0,calc.basicCalcs("/",15,3),0);

    }

    @Test
    public void advancedCalcs() {
        CoreCalc calc = new CoreCalc();
        assertEquals(125.0,calc.advancedCalcs("exponentiation",5.0,3.0),0);


    }

    @Test
    public void advancedCalcs2() {
        CoreCalc calc = new CoreCalc();
        assertEquals(12.0,calc.advancedCalcs2("square root",144.0),0);
        assertEquals(144.0,calc.advancedCalcs2("sqaure",12.0),0);
        assertEquals(-99.0,calc.advancedCalcs2("invert",99.0),0);
        assertEquals(1.0/10.0,calc.advancedCalcs2("reciprocal",10.0),0);



    }
}
