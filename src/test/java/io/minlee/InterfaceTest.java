package io.minlee;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class InterfaceTest {

    Interface userInterface;
    double delta = 1e-15; //Variable to compare two doubles are close enough

    @Before
    public void initialize() {
        userInterface = new Interface();
    }
    @Test
    public void checkDisplayValueTest(){
        double expectedValue = 2;
        userInterface.setDisplayValue(2);
        double actualValue = userInterface.getDisplayValue();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void clearDisplayValueTest(){
        double expectedValue = 0;
        userInterface.clearDisplayValue();
        double actualValue = userInterface.getDisplayValue();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void setDisplayValueTest(){
        double expectedValue = 0;
        userInterface.setDisplayValue(0);
        double actualValue = userInterface.getDisplayValue();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void switchUnitsModeTest(){
        ScientificCalculator calc = new ScientificCalculator();
        calc.setIsInRadians(true);
        double expectedValue = 180;
        userInterface.setDisplayValue(Math.PI);
        userInterface.switchUnitsMode();
        double actualValue = userInterface.getDisplayValue();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
        calc.setIsInRadians(false);
        expectedValue = Math.PI;
        userInterface.setDisplayValue(180);
        userInterface.switchUnitsMode();
        actualValue = userInterface.getDisplayValue();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void switchUnitsModeWithInputTest(){
        ScientificCalculator calc = new ScientificCalculator();
        double expectedValue = 180;
        userInterface.setDisplayValue(Math.PI);
        userInterface.switchUnitsMode("DEGREES");
        double actualValue = userInterface.getDisplayValue();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
        calc.setIsInRadians(false);
        expectedValue = Math.PI;
        userInterface.setDisplayValue(180);
        userInterface.switchUnitsMode("RADIANS");
        actualValue = userInterface.getDisplayValue();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void setDisplayValueTest(){
        double expectedValue = 0;
        userInterface.setDisplayValue(0);
        double actualValue = userInterface.getDisplayValue();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
}