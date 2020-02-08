package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Operations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationsTest {

    @Test
    public void addTest(){
        Operations a = new Operations();
        long expected = 1000000000;
        long actual = Operations.add(500000000, 500000000);
        assertEquals(expected, actual);

    }
}
