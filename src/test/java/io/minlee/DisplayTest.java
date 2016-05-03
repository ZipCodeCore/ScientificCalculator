package io.minlee;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DisplayTest {

    Display binary, octal, decimal, hexadecimal, usd;

    @Before
    public void initialize() {
        this.binary = new Display(Display.DisplayType.BINARY);
        this.octal = new Display(Display.DisplayType.OCTAL);
        this.decimal = new Display(Display.DisplayType.DECIMAL);
        this.hexadecimal = new Display(Display.DisplayType.HEXADECIMAL);
        this.usd = new Display(Display.DisplayType.USD);
    }

    @Test
    public void getCorrectDisplayTest(){
        String expectedBinaryValue = "1010";
        String actualBinaryValue = binary.getCorrectDisplay(10);
        Assert.assertEquals("Expected value should be "+expectedBinaryValue,expectedBinaryValue,actualBinaryValue);
        String expectedOctalValue = "12";
        String actualOctalValue = octal.getCorrectDisplay(10);
        Assert.assertEquals("Expected value should be "+expectedOctalValue,expectedOctalValue,actualOctalValue);
        String expectedDecimalValue = "1000.0";
        String actualDecimalValue = decimal.getCorrectDisplay(1000);
        Assert.assertEquals("Expected value should be "+expectedDecimalValue,expectedDecimalValue,actualDecimalValue);
        String expectedHexadecimalValue = "3e8";
        String actualHexadecimalValue = hexadecimal.getCorrectDisplay(1000);
        Assert.assertEquals("Expected value should be "+expectedHexadecimalValue,expectedHexadecimalValue,actualHexadecimalValue);
        String expectedUSDValue = "$102,100.00";
        String actualUSDValue = usd.getCorrectDisplay(102100);
        Assert.assertEquals("Expected value should be "+expectedUSDValue,expectedUSDValue,actualUSDValue);
    }
    @Test
    public void switchDisplayModeTest(){
        String expectedValue = "OCTAL";
        binary.switchDisplayMode();
        String actualValue = binary.getDisplayMode();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue);
        expectedValue = "DECIMAL";
        octal.switchDisplayMode();
        actualValue = octal.getDisplayMode();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue);
        expectedValue = "HEXADECIMAL";
        decimal.switchDisplayMode();
        actualValue = decimal.getDisplayMode();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue);
        expectedValue = "BINARY";
        hexadecimal.switchDisplayMode();
        actualValue = hexadecimal.getDisplayMode();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue);
        expectedValue = "DECIMAL";
        usd.switchDisplayMode();
        actualValue = usd.getDisplayMode();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue);
    }
    @Test
    public void switchDisplayModeWithInputTest(){
        String expectedValue = "OCTAL";
        binary.switchDisplayMode("OCTAL");
        String actualValue = binary.getDisplayMode();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue);
        expectedValue = "DECIMAL";
        octal.switchDisplayMode("DECIMAL");
        actualValue = octal.getDisplayMode();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue);
        expectedValue = "HEXADECIMAL";
        decimal.switchDisplayMode("HEXADECIMAL");
        actualValue = decimal.getDisplayMode();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue);
        expectedValue = "BINARY";
        hexadecimal.switchDisplayMode("BINARY");
        actualValue = hexadecimal.getDisplayMode();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue);
        expectedValue = "USD";
        usd.switchDisplayMode("USD");
        actualValue = usd.getDisplayMode();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue);
    }
}
