package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Operations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationsTest {

    @Test
    public void addTestLarge() {
        //add big numbers
        Operations a = new Operations();
        long expected = 1000000000;
        long actual = Operations.add(500000000, 500000000);
        assertEquals(expected, actual);
    }
    @Test
    public  void addTestNeg(){
        //add negative numbers
        long expected = -1000000000;
        long actual = Operations.add(-500000000, -500000000);
        assertEquals(expected, actual);
    }

    @Test
    public void subtractTest(){
        long expected = 2000000000;
        long actual = Operations.subtract(1000000000, -1000000000);
        assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest(){
        long expected = 2000000000;
        long actual = Operations.multiply(40000, 50000);
        assertEquals(expected,  actual);
    }
}
