package io.robertcarroll;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MemorySpec {

    Memory memory;
    @Before public void setUp(){
        memory = new Memory();
    }

    @Test
    public void setMemoryTest(){
        memory.setStoredValue(25);
        double expectedValue = 25;
        double actualValue = memory.getStoredValue();
        assertEquals("The expected value is 25", expectedValue, actualValue, 1e-9);
    }

    @Test
    public void clearMemoryTest() {
        memory.setStoredValue(25);
        memory.clearMemory();
        double expectedValue = 0;
        double actualValue = memory.getStoredValue();
        assertEquals("The expected value is 0", expectedValue, actualValue, 1e-9);
    }
}
