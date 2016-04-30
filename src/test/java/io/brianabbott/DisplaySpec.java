package io.brianabbott;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by brianabbott on 4/29/16.
 */
public class DisplaySpec {

    @Test
    public void displayUpdateTest(){
        Display dispUpdate = new Display();
        int expectedValue = 5;
    }

    @Test
    public void storeMemoryTest(){
        Display memoryStorage = new Display();
        double expectedMemory = 10;
        memoryStorage.setCurrentValue(10);
        memoryStorage.storeMemory(memoryStorage.getCurrentValue());
        double actualMemory = memoryStorage.getMemory();
        assertEquals("Memory does not equal the prior value",expectedMemory,actualMemory,0);
    }

    @Test
    public void clearDisplayTest(){
        Display clearTest = new Display();
        double expectedCurrentValue = 0;
        clearTest.setCurrentValue(50);
        clearTest.clearDisplay();
        double actualCurrentValue = clearTest.getCurrentValue();
        assertEquals("Current Value should be clear after clearDisplay is called",expectedCurrentValue,actualCurrentValue,0);
    }

    @Test
    public void clearMemoryTest(){
        Display memoryClear = new Display();
        double expectedMemory = 0;
        memoryClear.setMemory(50);
        memoryClear.resetMemory();
        double actualMemory = memoryClear.getMemory();
        assertEquals("Memory was not cleared",expectedMemory,actualMemory,0);
    }



}
