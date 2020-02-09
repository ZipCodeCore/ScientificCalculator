package com.zipcodewilmington.scientific_calculator;

import com.sun.corba.se.impl.interceptors.PICurrent;
import com.zipcodewilmington.scientificcalculator.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    @Test
    public void testAdd1(){
        Basic calculator = new Basic();
        assertEquals(5, calculator.add(2, 3), 0);
    }

    @Test
    public void testAdd2(){
        Basic calculator = new Basic();
        assertEquals(15, calculator.add(7, 8), 0);
    }

    @Test
    public void testMinus1(){
        Basic calculator = new Basic();
        assertEquals(15, calculator.subtract(19, 4), 0);
    }

    @Test
    public void testMinus2(){
        Basic calculator = new Basic();
        assertEquals(99, calculator.subtract(123, 24), 0);
    }

    @Test
    public void testMultiply1(){
        Basic calculator = new Basic();
        assertEquals(20, calculator.multiply(5, 4), 0);
    }

    @Test
    public void testMultiply2(){
        Basic calculator = new Basic();
        assertEquals(15, calculator.multiply(5, 3), 0);
    }

    @Test
    public void testMultiplyByZero(){
        Basic calculator = new Basic();
        assertEquals(0, calculator.multiply(5, 0), 0);
    }

    @Test
    public void testDivide1(){
        Basic calculator = new Basic();
        assertEquals(5, calculator.divide(10, 2), 0);
    }

    @Test
    public void testDivide2(){
        Basic calculator = new Basic();
        assertEquals(3.33, calculator.divide(10, 3), 0.01);
    }

    @Test
    public void testDivideByZero(){
        Basic calculator = new Basic();
        assertEquals(15, calculator.divide(5, 0), 0);
    }

    @Test
    public void testSquare1(){
        Basic calculator = new Basic();
        assertEquals(100, calculator.square(10), 0);
    }

    @Test
    public void testSquare2(){
        Basic calculator = new Basic();
        assertEquals(25, calculator.square(5), 0);
    }

    @Test
    public void testSquareRoot1(){
        Basic calculator = new Basic();
        assertEquals(5, calculator.squareRoot(25), 0);
    }

    @Test
    public void testSquareRoot2(){
        Basic calculator = new Basic();
        assertEquals(1.4142135, calculator.squareRoot(2), 0.1);
    }

    @Test
    public void testInverse1(){
        Basic calculator = new Basic();
        assertEquals(1/25, calculator.inverse(25), 0.1);
    }

    @Test
    public void testInverse2(){
        Basic calculator = new Basic();
        assertEquals(0.5, calculator.inverse(2), 0.1);
    }

    @Test
    public void testPosToNeg1(){
        Basic calculator = new Basic();
        assertEquals(-2, calculator.signChange(2), 0.1);
    }

    @Test
    public void testPosToNeg2(){
        Basic calculator = new Basic();
        assertEquals(12345, calculator.signChange(-12345), 0.1);
    }

    @Test
    public void testExponent1(){
        Basic calculator = new Basic();
        assertEquals(343, calculator.exponent(7, 3), 0.1);
    }
    @Test
    public void testExponent2() {
        Basic calculator = new Basic();
        assertEquals(343, calculator.exponent(0, 0), 0.1);
    }

    @Test
    public void testSine1(){
        Sci calculator = new Sci();
        assertEquals(1, calculator.sine(Math.PI/2), 0);
    }

    @Test
    public void testTestSine2(){
        Sci calculator = new Sci();
        assertEquals(-1, calculator.sine(Math.PI*3/2), 0);
    }

    @Test
    public void testCosine1(){
        Sci calculator = new Sci();
        assertEquals(0, calculator.cosine(Math.PI/2), 0);
    }

    @Test
    public void testCosine2(){
        Sci calculator = new Sci();
        assertEquals(-1, calculator.cosine(Math.PI), 0);
    }

    @Test
    public void testTangent1(){
        Sci calculator = new Sci();
        assertEquals(0, calculator.tangent(Math.PI), 0);
    }

    @Test
    public void testTangent2(){
        Sci calculator = new Sci();
        assertEquals(0, calculator.tangent(Math.PI*2), 0);
    }

    @Test
    public void testArcsine1(){
        Sci calculator = new Sci();
        assertEquals(Math.PI/2, calculator.inverseSine(1), 0);
    }

    @Test
    public void testArcsine2(){
        Sci calculator = new Sci();
        assertEquals(Math.PI/2, calculator.inverseSine(1), 0);
    }

    @Test
    public void testArccosine1(){
        Sci calculator = new Sci();
        assertEquals(0, calculator.inverseCosine(1), 0);
    }

    @Test
    public void testArccosine2(){
        Sci calculator = new Sci();
        assertEquals(0, calculator.inverseCosine(1), 0);
    }

    @Test
    public void testArctangent1(){
        Sci calculator = new Sci();
        assertEquals(Math.PI/4, calculator.inverseTangent(1), 0);
    }

    @Test
    public void testArctangent2(){
        Sci calculator = new Sci();
        assertEquals(Math.PI/4, calculator.inverseTangent(1), 0);
    }

    @Test
    public void testLog1(){
        Sci calculator = new Sci();
        assertEquals(0.77815, calculator.logarithm(6), 0.01);
    }

    @Test
    public void testLog2(){
        Sci calculator = new Sci();
        assertEquals(2, calculator.logarithm(100), 0.01);
    }

    @Test
    public void testInverseLog1(){
        Sci calculator = new Sci();
        assertEquals(1000, calculator.inverseLogarithm(10, 3), 0.01);
    }

    @Test
    public void testInverseLog2(){
        Sci calculator = new Sci();
        assertEquals(8, calculator.inverseLogarithm(2, 3), 0.01);
    }

    @Test
    public void testNaturalLog1(){
        Sci calculator = new Sci();
        assertEquals(1, calculator.naturalLogarithm(Math.E), 0.01);
    }

    @Test
    public void testNaturalLog2(){
        Sci calculator = new Sci();
        assertEquals(0, calculator.naturalLogarithm(1), 0.01);
    }

    @Test
    public void testEPower1(){
        Sci calculator = new Sci();
        assertEquals(1, calculator.inverseNaturalLogarithm(Math.E, 0), 0.01);
    }

    @Test
    public void testEPower2(){
        Sci calculator = new Sci();
        assertEquals(Math.E, calculator.inverseNaturalLogarithm(Math.E, 1), 0.01);
    }

    @Test
    public void testF2C(){
        Utilities calculator = new Utilities();
        assertEquals(100, calculator.switchFtoC(212), 0.1);
    }



}
