package io.robertcarroll;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DisplaySpec {

    Display display;
    Calculator calculator;
    @Before public void setUp(){
        display = new Display();
        calculator = new Calculator();
    }

    @Test
    public void convertToBinaryTest(){
        String expectedValue = "11001.0";
        String actualValue = display.convertToBinary(25);
        assertTrue(expectedValue.equals(actualValue));
    }

    @Test
    public void convertToOctalTest(){
        String expectedValue = "31.0";
        String actualValue = display.convertToOctal(25);
        assertTrue(expectedValue.equals(actualValue));
    }

    @Test
    public void convertToDecimalTest(){
        String expectedValue = "25.0";
        String actualValue = display.convertToDecimal(25);
        assertTrue(expectedValue.equals(actualValue));
    }

    @Test
    public void convertToHexadecimalTest(){
        String expectedValue = "a.0";
        String actualValue = display.convertToHexadecimal(10);
        assertTrue(expectedValue.equals(actualValue));
    }

    @Test
    public void checkErrorTest(){
        display.setStoredDecimalNumber(calculator.inverseSine(2));
        boolean value = display.checkError();
        assertTrue(value);
    }

    @Test
    public void clearDisplayTest() {
        display.setShownNumber(25);
        display.clearDisplay();
        String expectedValue = "0.0";
        String actualValue = display.getShownNumber();
        assertTrue("The expected value is 0", expectedValue.equals(actualValue));
    }
}
