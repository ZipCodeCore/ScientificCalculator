package io.AlejandroLondono;

import org.junit.Test;


import static org.junit.Assert.*;


/**
 * Created by alejandrolondono on 4/29/16.
 */
public class KanyeSpecs {

    double error = .01;

    Kanye kanye = new Kanye();
    double inputOneTest = 50.0;
    double inputTwoTest = 24.0;

    @Test
    public void startEqTest(){
        Kanye kanye = new Kanye();
        double expectedValue = 5.0;
        kanye.startEq(expectedValue);
        double actualValue = kanye.inputOne;

        assertEquals("Expected value should be " + expectedValue, expectedValue, actualValue, error);
    }

    @Test
    public void addTest(){

        double expectedValue = 74.0;
        kanye.startEq(inputOneTest);
        double actualValue =  kanye.add(inputTwoTest);
        assertEquals("the result should be "+ expectedValue+"within a margin of error of "+error,expectedValue,actualValue,error);
    }

    @Test
    public void subtractTest(){

        double expectedValue = 26.0;
        kanye.startEq(inputOneTest);
        double actualValue =  kanye.subtract(inputTwoTest);
        assertEquals("the result should be "+ expectedValue+"within a margin of error of "+error,expectedValue,actualValue,error);
    }

    @Test
    public void divideTest(){

    }
}
