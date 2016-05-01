package io.AlejandroLondono;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;


/**
 * Created by alejandrolondono on 4/29/16.
 */
public class KanyeSpecs {

    private double error;
    private Kanye kanye;
    private double inputOneTestValue;
    private double inputTwoTestValue;
    private double inputExp;
    private double theExp;

    @Before
    public void sandbox(){
        error = .01;
        kanye = new Kanye();
        inputOneTestValue = 50.0;
        kanye.equation(inputOneTestValue);
        inputTwoTestValue = 24.0;
        inputExp = 3.0;
        theExp = 3.0;
    }

    @Test
    public void EquationTest(){
//        Kanye kanye = new Kanye();
        double expectedValue = inputOneTestValue;
        kanye.equation(expectedValue);
        double actualValue = kanye.inputOne;
        assertEquals("Expected value should be " + expectedValue, expectedValue, actualValue, error);
    }

    @Test
    public void addTest(){

        double expectedValue = 74.0;
        double actualValue =  kanye.add(inputTwoTestValue);
        assertEquals("the result should be "+ expectedValue+"within a margin of error of "+error,expectedValue,actualValue,error);
    }

    @Test
    public void subtractTest(){

        double expectedValue = 26.0;
        double actualValue =  kanye.subtract(inputTwoTestValue);
        assertEquals("the result should be "+ expectedValue+"within a margin of error of "+error,expectedValue,actualValue,error);
    }

    @Test
    public void divideTest(){
        double expectedValue = 2.0833333333333335;
        double actualValue = kanye.divide(inputTwoTestValue);
        assertEquals("the expected quotient should be "+expectedValue, expectedValue, actualValue, error);
    }

    @Test
    public void expTest(){
//        inputExp

        double expectedValue = 27.0;
        kanye.equation(inputExp);
        double actualValue = kanye.exp(theExp);
        assertEquals("The power should be "+expectedValue, expectedValue, actualValue, error);
    }

    @Test
    public void SquareTest(){
        double expectedValue = 9.0;
        kanye.equation(inputExp);
        double actualValue = kanye.exp();
        assertEquals("The square should be "+expectedValue, expectedValue, actualValue, error);
    }

    @Test
    public void multiplyTest(){
        double expectedValue = 1200.0;
        double actualValue = kanye.multiply(inputTwoTestValue);
        assertEquals("the product should be "+expectedValue,expectedValue,actualValue,error);
    }

    @Test
    public void sqrtTest(){
        double expectedValue =7.0710678118654755;
        double actualValue = kanye.sqrt();
        assertEquals("the square root should be "+expectedValue,expectedValue,actualValue,error);
    }

    @Test
    public void switchSignTestPos(){
        double expectedValue = 50.0;
        kanye.equation(-50);
        double actualValue = kanye.switchSign();

        assertEquals("- to +:the sign should be positive rather than positive like this: "+expectedValue,expectedValue,actualValue,error);
    }

    @Test
    public void switchSignTestNeg(){
        double expectedValue = -50.0;
        double actualValue = kanye.switchSign();
        assertEquals("+ to -: the sign should be negative rather than positive like this: "+expectedValue,expectedValue,actualValue,error);
    }

    @Test
    public void inverseTest(){
        double expectedValue = 0.02;
        double actualValue= kanye.inverse();
        assertEquals("the inverse of "+ inputOneTestValue+" should be: "+expectedValue,expectedValue,actualValue,error);
    }

    @Test
    public void binaryModeTest(){

        String expectedBinaryString = "110010";
        String actualBinaryString = kanye.binaryMode();
        assertEquals("the binary string returned should be "+ expectedBinaryString +" converted from "+inputOneTestValue, expectedBinaryString, actualBinaryString);

    }

    @Test
    public void hexModeTest(){

        String expectedHexString = "32";
        String actualHexString = kanye.hexMode();
        assertEquals("The Hex String returned should be "+expectedHexString+" converted from "+inputOneTestValue, expectedHexString,actualHexString);
    }


    @Test
    public void octalModeTest(){

        String expectedOctalString = "62";
        String actualOctalString = kanye.octalMode();
        assertEquals("the Octal String returned should be "+expectedOctalString+" converted from "+inputOneTestValue,expectedOctalString,actualOctalString);
    }

    @Test
    public void SwitchDisplayModeTest(){
        Kanye.Mode expectedMode = Kanye.Mode.BINARY;
        kanye.switchDisplayMode();
        Kanye.Mode actualMode = kanye.currentMode;
        assertEquals("the mode should have cycled from "+ Kanye.Mode.DECIMAL+" to "+ Kanye.Mode.BINARY, expectedMode,actualMode);
    }

    @Test
    public void convertDisplayModeTest(){
        Kanye.Mode expectedMode =Kanye.Mode.HEX;
        kanye.convertDisplayMode(expectedMode);
        Kanye.Mode actualMode = kanye.currentMode;
        assertEquals("The mode should have been set as "+expectedMode, expectedMode, actualMode);
    }

    @Test
    public void sineTest(){
        double expectedValue = -0.26237485370392877;
        double actualValue = kanye.sine();
        assertEquals("the value returned by the trig sine function should be "+expectedValue,expectedValue,actualValue,  error);
    }

    @Test
    public void CosineTest(){
        double expectedValue =  0.9649660284921133;
        double actualValue = kanye.cosine();
        assertEquals("the value returned by the trig cosine function should be"+expectedValue,expectedValue,actualValue,error);
    }

    @Test
    public void tangentTest(){
        double expectedValue = -0.27190061199763077;
        double actualValue = kanye.tangent();
        assertEquals("the value returned by the trig tangent function should be "+expectedValue,expectedValue,actualValue,error);
    }

    @Test
    public void arcSineTest(){
        kanye.equation(0.5);
        double expectedValue = 0.5235987755982989;
        double actualValue = kanye.arcSine();
        assertEquals("the value returned by the trig function arcsine should be "+expectedValue, expectedValue, actualValue, error);
    }

    @Test
    public void arcCosineTest(){
        kanye.equation(0.5);
        double expectedValue  = 1.0471975511965979;
        double actualValue = kanye.arcCosine();
        assertEquals("the value returned by the trig function arc cosin should be "+expectedValue,expectedValue,actualValue,error);
    }

    @Test
    public void arcTangentTest(){
        kanye.equation(0.5);
        double expectedValue = 0.4636476090008061;
        double actualValue = kanye.arcTangent();
        assertEquals("the vaule returned by the trig function arc tan should be: "+expectedValue,expectedValue,actualValue,error);
    }

    @Test
    public void switchUnitsModeTest(){
        Kanye.TrigUnit expectedTrigUnits = Kanye.TrigUnit.DEGREES;
        kanye.switchUnitsMode();
        Kanye.TrigUnit actualTrigUnits = kanye.currentTrigUnit;
        assertEquals("the trigonometric units should have switched from radians to degrees",expectedTrigUnits, actualTrigUnits);
    }

    @Test
    public void storeToMemoryTest(){
//        input1 --> 5
        double expectedMemoryAnswer = 50;
        kanye.storeToMemory(inputOneTestValue);
        double actualMemoryAnswer = kanye.memory;
        assertEquals("the memory should have stored "+expectedMemoryAnswer,expectedMemoryAnswer,actualMemoryAnswer,error);
    }

    @Test
    public void resetMemory(){
        double expectedMemory = 0;
        kanye.memory = 5;
        kanye.storeToMemory(inputTwoTestValue);
        kanye.resetMemory();
        double actualMemory = kanye.memory;
        assertEquals("changed memory to "+inputTwoTestValue+"if it was reset it should be "+expectedMemory,expectedMemory,actualMemory,error);
    }

    @Test
    public void recallMemory(){
        String expectedDisplay = Double.toString(inputOneTestValue);
        kanye.storeToMemory(inputOneTestValue);
        kanye.recallMemory();
        String actualDisplay = kanye.display;
        assertEquals("memory should have sent "+inputOneTestValue+" to the display",expectedDisplay, actualDisplay);
    }

}

