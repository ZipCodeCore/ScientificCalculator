package com.zipcodewilmington.scientific_calculator;

import com.sun.corba.se.impl.interceptors.PICurrent;
import com.zipcodewilmington.scientificcalculator.Basic;
import com.zipcodewilmington.scientificcalculator.Sci;
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
        Basic calculator = new Basic();
        Assert.assertEquals(5, calculator.add(2, 3), 0);
    }

    @Test
    public void testAdd2(){
        Basic calculator = new Basic();
        Assert.assertEquals(15, calculator.add(7, 8), 0);
    }

    @Test
    public void testMinus1(){
        Basic calculator = new Basic();
        Assert.assertEquals(15, calculator.subtract(19, 4), 0);
    }

    @Test
    public void testMinus2(){
        Basic calculator = new Basic();
        Assert.assertEquals(99, calculator.subtract(123, 24), 0);
    }

    @Test
    public void testMultiply1(){
        Basic calculator = new Basic();
        Assert.assertEquals(20, calculator.multiply(5, 4), 0);
    }

    @Test
    public void testMultiply2(){
        Basic calculator = new Basic();
        Assert.assertEquals(15, calculator.multiply(5, 3), 0);
    }

    @Test
    public void testMultiplyByZero(){
        Basic calculator = new Basic();
        Assert.assertEquals(0, calculator.multiply(5, 0), 0);
    }

    @Test
    public void testDivide1(){
        Basic calculator = new Basic();
        Assert.assertEquals(5, calculator.divide(10, 2), 0);
    }

    @Test
    public void testDivide2(){
        Basic calculator = new Basic();
        Assert.assertEquals(3.33, calculator.divide(10, 3), 0.01);
    }

    @Test
    public void testDivideByZero(){
        Basic calculator = new Basic();
        Assert.assertEquals(15, calculator.divide(5, 0), 0);
    }

    @Test
    public void testSquare1(){
        Basic calculator = new Basic();
        Assert.assertEquals(100, calculator.square(10), 0);
    }

    @Test
    public void testSquare2(){
        Basic calculator = new Basic();
        Assert.assertEquals(25, calculator.square(5), 0);
    }

    @Test
    public void testSquareRoot1(){
        Basic calculator = new Basic();
        Assert.assertEquals(5, calculator.squareRoot(25), 0);
    }

    @Test
    public void testSquareRoot2(){
        Basic calculator = new Basic();
        Assert.assertEquals(1.4142135, calculator.squareRoot(2), 0.1);
    }

    @Test
    public void testInverse1(){
        Basic calculator = new Basic();
        Assert.assertEquals(1/25, calculator.inverse(25), 0.1);
    }

    @Test
    public void testInverse2(){
        Basic calculator = new Basic();
        Assert.assertEquals(0.5, calculator.inverse(2), 0.1);
    }

    @Test
    public void testPosToNeg1(){
        Basic calculator = new Basic();
        Assert.assertEquals(-2, calculator.signChange(2), 0.1);
    }

    @Test
    public void testPosToNeg2(){
        Basic calculator = new Basic();
        Assert.assertEquals(12345, calculator.signChange(-12345), 0.1);
    }

    @Test
    public void testExponent1(){
        Basic calculator = new Basic();
        Assert.assertEquals(343, calculator.exponent(7, 3), 0.1);
    }
    @Test
    public void testExponent2() {
        Basic calculator = new Basic();
        Assert.assertEquals(343, calculator.exponent(0, 0), 0.1);
    }

    @Test
    public void testSine1(){
        Sci calculator = new Sci();
        Assert.assertEquals(1, calculator.sine(Math.PI), 0);
    }

    @Test
    public void testTestSine2(){
        Sci calculator = new Sci();
        Assert.assertEquals(1, calculator.sine(45), 0);
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
        Sci calculator = new Sci();
        Assert.assertEquals(0.77815, calculator.logarithm(6), 0.01);
    }

    @Test
    public void testLog2(){
        Sci calculator = new Sci();
        Assert.assertEquals(2, calculator.logarithm(100), 0.01);
    }

    @Test
    public void testInverseLog1(){
        Sci calculator = new Sci();
        Assert.assertEquals(1000, calculator.inverseLogarithm(10, 3), 0.01);
    }

    @Test
    public void testInverseLog2(){

    }

    @Test
    public void testNaturalLog1(){
        Sci calculator = new Sci();
        Assert.assertEquals(1, calculator.naturalLogarithm(5), 0.01);
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

}
