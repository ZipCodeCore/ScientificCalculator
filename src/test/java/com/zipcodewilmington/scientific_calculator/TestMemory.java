package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Memory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestMemory {
    @Test
    public void TestSetMemoryToOneHundred()
    {
        Double expected = 100.00;
        Memory TestMemory = new Memory();
        TestMemory.setMemory(100.00);
        Double actual = TestMemory.getMemory();

        assertEquals(expected, actual);
    }

    @Test
    public void TestSetMemoryToNegativeFive()
    {
        Double expected = -5.0;
        Memory TestMemory = new Memory();
        TestMemory.setMemory(-5.0);
        Double actual = TestMemory.getMemory();

        assertEquals(expected, actual);
    }

    @Test
    public void TestSetMemoryToPointOne()
    {
        Double expected = 0.1;
        Memory TestMemory = new Memory();
        TestMemory.setMemory(0.1);
        Double actual = TestMemory.getMemory();

        assertEquals(expected, actual);
    }

    @Test
    public void TestResetMemory()
    {
        Double expected = 0.0;
        Memory TestMemory = new Memory();
        TestMemory.setMemory(-5.0);
        TestMemory.resetMemory();
        Double actual = TestMemory.getMemory();

        assertEquals(expected, actual);
    }

    @Test
    public void TestMemoryNaN()
    {
        Double expected = Double.NaN;
        Memory TestMemory = new Memory();
        Double actual = TestMemory.getMemory();

        assertNotEquals(expected, actual);
    }

    @Test
    public void TestResetMemoryNaN()
    {
        Double expected = Double.NaN;
        Memory TestMemory = new Memory();
        TestMemory.setMemory(7.0);
        TestMemory.resetMemory();
        Double actual = TestMemory.getMemory();

        assertNotEquals(expected, actual);
    }

    @Test
    public void TestMemoryNull()
    {
        Double expected = null;
        Memory TestMemory = new Memory();
        Double actual = TestMemory.getMemory();

        assertNotEquals(expected, actual);
    }

    @Test
    public void TestResetMemoryNull()
    {
        Double expected = null;
        Memory TestMemory = new Memory();
        TestMemory.setMemory(1979.0000);
        TestMemory.resetMemory();
        Double actual = TestMemory.getMemory();

        assertNotEquals(expected, actual);
    }
}
