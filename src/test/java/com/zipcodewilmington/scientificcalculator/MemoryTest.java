package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    //Test if memory plus method changes the objects state

    public void Memory_stateTest1() {
        Double expected = 25d;

        Memory myMemory = new Memory();
        myMemory.memoryPlus(25d);

        Double actual = myMemory.state;
        assertEquals(expected, actual);
    }

    @Test
    //Test if memory plus method changes the objects state more than once

    public void Memory_stateTest2() {
        Double expected = 32d;

        Memory myMemory = new Memory();
        myMemory.memoryPlus(25d);
        myMemory.memoryPlus(32d);
        Double actual = myMemory.state;
        assertEquals(expected, actual);
    }

    @Test
    //An assertnotequals Test if memory plus method changes the objects state

    public void Memory_stateTest3() {
        Double expected = 25d;

        Memory myMemory = new Memory();
        myMemory.memoryPlus(25d);
        myMemory.memoryPlus(32d);
        Double actual = myMemory.state;
        assertNotEquals(expected, actual);
    }

    @Test
    //Test if memory reset method changes the objects state back to 0.0

    public void Memory_ResetTest1() {
        Double expected = 0.0d;

        Memory myMemory = new Memory();
        myMemory.memoryPlus(32d);
        myMemory.memoryClear();

        Double actual = myMemory.memoryRecall();
        assertEquals(expected, actual);
    }
    @Test
    //Test if memory reset method changes the objects state more than once

    public void Memory_ResetTest2() {
        Double expected = 0.0d;

        Memory myMemory = new Memory();
        myMemory.memoryPlus(32d);
        myMemory.memoryClear();
        myMemory.memoryPlus(32d);
        myMemory.memoryClear();

        Double actual = myMemory.memoryRecall();
        assertEquals(expected, actual);
    }
    @Test
    //assertnotequals Test if memory reset method changes the objects state

    public void Memory_ResetTest3() {
        Double expected = 32d;

        Memory myMemory = new Memory();
        myMemory.memoryPlus(32d);
        myMemory.memoryClear();


        Double actual = myMemory.memoryRecall();
        assertNotEquals(expected, actual);
    }

    @Test
    //Test if memory recall method returns the objects state

    public void Memory_Recall_Test1() {
        Double expected = 25d;

        Memory myMemory = new Memory();
        myMemory.memoryPlus(25d);

        Double actual = myMemory.memoryRecall();
        assertEquals(expected, actual);
    }

    @Test
    //Test if memory recall method returns the objects state after its been changed twice

    public void Memory_Recall_Test2() {
        Double expected = 32d;

        Memory myMemory = new Memory();
        myMemory.memoryPlus(25d);
        myMemory.memoryPlus(32d);
        Double actual = myMemory.memoryRecall();
        assertEquals(expected, actual);
    }

    @Test
    //assertnotequals Test if memory recall method returns the objects state after its been changed twice

    public void Memory_Recall_Test3() {
        Double expected = 25d;

        Memory myMemory = new Memory();
        myMemory.memoryPlus(25d);
        myMemory.memoryPlus(32d);
        Double actual = myMemory.memoryRecall();
        assertNotEquals(expected, actual);
    }
}

