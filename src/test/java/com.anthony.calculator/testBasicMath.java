package com.anthony.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anthonyjones on 4/28/17.
 */
public class testBasicMath {

    @Test
    public void testAdd() {
        //given
        double number1 = 4;
        double number2 = 5;
        double expectedSum = number1 + number2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualSum = basicmather.add(number1, number2);

        //then
        Assert.assertEquals(expectedSum, actualSum, 0);

    }

    @Test
    public void testSubtract() {
        //given
        double number1 = 4;
        double number2 = 5;
        double expectedDifference = number1 - number2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualDifference = basicmather.subtract(number1, number2);

        //then
        Assert.assertEquals(expectedDifference, actualDifference, 0);
    }

    @Test
    public void testMultiply() {
        //given
        double number1 = 4;
        double number2 = 5;
        double expectedProduct = number1 * number2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualProduct = basicmather.multiply(number1, number2);

        //then
        Assert.assertEquals(expectedProduct, actualProduct, 0);
    }

    @Test
    public void testDivide() {
        //given
        double number1 = 4;
        double number2 = 5;
        double expectedQuotient = number1 / number2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualQuotient = basicmather.divide(number1, number2);

        //then
        Assert.assertEquals(expectedQuotient, actualQuotient, 1);
    }

    @Test
    public void testDivideByZero() {
        //given
        double number1 = 4;
        double number2 = 0;
        double expectedQuotient = number1 / number2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualQuotient = basicmather.divide(number1, number2);

        //then
        Assert.assertTrue(Double.isNaN(actualQuotient));
    }

    @Test
    public void testCalcSqrRoot() {
        //given
        double number1 = 4;
        double expectedRoot = 2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualRoot = basicmather.calcSqrRoot(number1);

        //then
        Assert.assertEquals(expectedRoot, actualRoot, 1);
    }

    @Test
    public void testCalcSquared() {
        //given
        double number1 = 6;
        double expectedExponent = 36;
        BasicMath basicmather = new BasicMath();

        //when
        double actualExponent = basicmather.calcSquared(number1);

        //then
        Assert.assertEquals(expectedExponent, actualExponent, 1);
    }

    @Test
    public void TestCalcFactorial() {
        //given
        double number1 = 4;
        double expectedSum = 24;
        BasicMath basicmather = new BasicMath();

        //when
        double actualFactorial = basicmather.calcFactorial(number1);

        //then
        Assert.assertEquals(expectedSum, actualFactorial, 1);
    }


    @Test
    public void TestCalcVariableExponent(){
        //given
        double number1 = 2;
        double number2 = 2;
        double expectedExponent = 4;
        BasicMath basicMather = new BasicMath();

        //when
        double actualExponent = basicMather.calcVariableExponent(number1,number2);

        //then
        Assert.assertEquals(expectedExponent,actualExponent,1);

    }


}
