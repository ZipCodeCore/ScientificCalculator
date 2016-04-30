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
        kanye.startEq(inputOneTestValue);
        inputTwoTestValue = 24.0;
        inputExp = 3.0;
        theExp = 3.0;
    }

    @Test
    public void startEqTest(){
        Kanye kanye = new Kanye();
        double expectedValue = inputOneTestValue;
        kanye.startEq(expectedValue);
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
        kanye.startEq(inputExp);
        double actualValue = kanye.exp(theExp);
        assertEquals("The power should be "+expectedValue, expectedValue, actualValue, error);
    }

    @Test
    public void SquareTest(){
        double expectedValue = 9.0;
        kanye.startEq(inputExp);
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

}
