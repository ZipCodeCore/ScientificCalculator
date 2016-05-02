package io.brianabbott;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by brianabbott on 4/29/16.
 */
public class DisplaySpec {

    @Test
    public void displayModeUpdateByRotateTest(){
        Display dispUpdate = new Display();
        DisplayTypes expectedValue = DisplayTypes.HEXADECIMAL;
        dispUpdate.updateDisplayMode();
        DisplayTypes actualValue = dispUpdate.displayMode;
        assertEquals("The display mode should change to hexidecimal",expectedValue,actualValue);
    }

    @Test
    public void displayModeUpdateByArgTest(){
        Display displayArgUpdate = new Display();
        DisplayTypes expectedValue = DisplayTypes.OCTAL;
        displayArgUpdate.updateDisplayMode(DisplayTypes.OCTAL);
        DisplayTypes actualValue = displayArgUpdate.displayMode;
        assertEquals("The display mode should change to octal",expectedValue,actualValue);
    }

    @Test
    public void implementDisplayModeOctalTest(){
        Display octalTest = new Display();
        String expectedValue = "3400";
        octalTest.displayMode = DisplayTypes.OCTAL;
        String actualValue = octalTest.implementDisplayMode(1792);
        assertEquals("The octal form of 1792 should be 3400",expectedValue,actualValue);
    }

    @Test
    public void implementDisplayModeHexadecimalTest(){
        Display hexadecimalTest = new Display();
        String expectedValue = "700";
        hexadecimalTest.displayMode = DisplayTypes.HEXADECIMAL;
        String actualValue = hexadecimalTest.implementDisplayMode(1792);
        assertEquals("The hexadecimal form of 1792 should be 700",expectedValue,actualValue);

    }

    @Test
    public void implementDisplayModeBinaryTest(){
        Display binaryTest = new Display();
        String expectedValue = "11100000000";
        binaryTest.displayMode = DisplayTypes.BINARY;
        String actualValue = binaryTest.implementDisplayMode(1792);
        assertEquals("The hexadecimal form of 1792 should be 11100000000",expectedValue,actualValue);
    }

    @Test
    public void implementDisplayModeDecimalTest(){
        Display decimalTest = new Display();
        String expectedValue = "1792.0";
        decimalTest.displayMode = DisplayTypes.DECIMAL;
        String actualValue = decimalTest.implementDisplayMode(1792);
        assertEquals("The hexadecimal form of 1792 should be 1792",expectedValue,actualValue);

    }

    @Test
    public void storeMemoryTest(){
        Display memoryStorage = new Display();
        double expectedMemory = 10;
        memoryStorage.setBaseValue(10);
        memoryStorage.storeMemory();
        double actualMemory = memoryStorage.getMemory();
        assertEquals("Memory does not equal the prior value",expectedMemory,actualMemory,0);
    }

    @Test
    public void clearDisplayBaseValTest(){
        Display clearTest = new Display();
        double expectedCurrentValue = 0;
        clearTest.setBaseValue(50);
        clearTest.clearDisplay();
        double actualCurrentValue = clearTest.getNewValue();
        assertEquals("Current Value should be clear after clearDisplay is called",expectedCurrentValue,actualCurrentValue,0);
    }

    @Test
    public void clearDisplayModeTest(){
        Display clearModeTest = new Display();
        DisplayTypes expectedCurrentValue = DisplayTypes.DECIMAL;
        clearModeTest.displayMode = DisplayTypes.HEXADECIMAL;
        clearModeTest.clearDisplay();
        DisplayTypes actualCurrentValue = clearModeTest.displayMode;
        assertEquals("Display mode should be Decimal after clearDisplay is called",expectedCurrentValue,actualCurrentValue);
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

    @Test
    public void recallMemoryTest(){
        Display recallMemory = new Display();
        double expectedMemory = 22;
        recallMemory.setBaseValue(15);
        recallMemory.setMemory(22);
        recallMemory.recallMemory();
        double actualMemory = recallMemory.getBaseValue();
        assertEquals("Memory value was not diplayed",expectedMemory,actualMemory,0);
    }


}
