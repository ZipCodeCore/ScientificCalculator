package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Basic;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    @Test
    public void testAdd1(){
        Basic calculator = new Basic;
        Assert.assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAdd2(){
        Basic calculator = new Basic();
        Assert.assertEquals(15, calculator.add(7, 8));
    }
/*
    @Test
    public void testMinus1(){

    }

    @Test
    public void testMinus2(){

    }

    @Test
    public void testMultiply1(){

    }

    @Test
    public void testMultiply2(){

    }

    @Test
    public void testMultiplyByZero(){

    }

    @Test
    public void testDivide1(){

    }

    @Test
    public void testDivide2(){

    }

    @Test
    public void testDivideByZero(){

    }

    @Test
    public void testSquare1(){

    }

    @Test
    public void testSquare2(){

    }

    @Test
    public void testSquareRoot1(){

    }

    @Test
    public void testSquareRoot2(){

    }

    @Test
    public void testInverse1(){

    }

    @Test
    public void testInverse2(){

    }

    @Test
    public void testPosToNeg1(){

    }

    @Test
    public void testPosToNeg2(){

    }

    @Test
    public void testSine1(){

    }

    @Test
    public void testTestSine2(){

    }

    @Test
    public void testCosine1(){

    }

    @Test
    public void testCosine2(){

    }

    @Test
    public void testTangent1(){

    }

    @Test
    public void testTangent2(){

    }

    @Test
    public void testArcsine1(){

    }

    @Test
    public void testArcsine2(){

    }

    @Test
    public void testArccosine1(){

    }

    @Test
    public void testArccosine2(){

    }

    @Test
    public void testArctangent1(){

    }

    @Test
    public void testArctangent2(){

    }

    @Test
    public void testLog1(){

    }

    @Test
    public void testLog2(){

    }

    @Test
    public void testInverseLog1(){

    }

    @Test
    public void testInverseLog2(){

    }

    @Test
    public void testNaturalLog1(){

    }

    @Test
    public void testNaturalLog2(){

    }

    @Test
    public void testEPower1(){

    }

    @Test
    public void testEPower2(){

    }
*/
}
