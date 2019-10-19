package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemoryTest_2 {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void Memory_state1() {
        Double expected = 25d;
        ;

        ;
        Memory myMemory = new Memory();
        myMemory.memoryPlus(25d);
        Double actual = myMemory.getMemory();
        assertEquals(expected, actual);
    }

    @Test
    public void Memory_state2() {
        Double expected = 32d;
        ;

        ;
        Memory myMemory = new Memory();
        myMemory.memoryPlus(25d);
        myMemory.memoryPlus(32d);
        Double actual = myMemory.getMemory();
        assertEquals(expected, actual);
    }

    @Test
    public void Memory_state3() {
        Double expected = 25d;
        ;

        ;
        Memory myMemory = new Memory();
        myMemory.memoryPlus(25d);
        myMemory.memoryPlus(32d);
        Double actual = myMemory.getMemory();
        assertNotEquals(expected, actual);
    }

    @Test
    public void Memory_Reset1() {
        Double expected = 0.0d;
        ;

        ;
        Memory myMemory = new Memory();
        myMemory.memoryPlus(32d);
        myMemory.memoryReset();

        Double actual = myMemory.getMemory();
        assertEquals(expected, actual);
    }
    @Test
    public void Memory_Reset2() {
        Double expected = 0.0d;
        ;

        ;
        Memory myMemory = new Memory();
        myMemory.memoryPlus(32d);
        myMemory.memoryReset();

        Double actual = myMemory.getMemory();
        assertEquals(expected, actual);
    }

}

