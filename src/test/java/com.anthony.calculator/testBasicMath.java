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
        Assert.assertEquals("Are you correct", expectedSum, actualSum, 0);

    }

    @Test
    public void testSubtract() {
        //given
        double number1 = 4;
        double number2 = 5;
        double expectedSum = number1 -number2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualSum = basicmather.subtract(number1, number2);

        //then
        Assert.assertEquals("Are you correct", expectedSum, actualSum, 0);
    }

    @Test
    public void testMultiply() {
        //given
        double number1 = 4;
        double number2 = 5;
        double expectedSum = number1 * number2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualSum = basicmather.multiply(number1, number2);

        //then
        Assert.assertEquals("Are you correct", expectedSum, actualSum, 0);
    }

    @Test
    public void testDivide() {
        //given
        double number1 = 4;
        double number2 = 5;
        double expectedSum = number1 / number2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualSum = basicmather.divide(number1, number2);

        //then
        Assert.assertEquals("Are you correct", expectedSum, actualSum, 1);
    }

    @Test
    public void testDivideByZero() {
        //given
        double number1 = 4;
        double number2 = 0;
        double expectedSum = number1 / number2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualSum = basicmather.divide(number1, number2);

        //then
        Assert.assertTrue(Double.isNaN(actualSum));
    }

    @Test
    public void calcSqrRoot() {
        //given
        double number1 = 4;

        double expectedSum = 2;
        BasicMath basicmather = new BasicMath();

        //when
        double actualSum = basicmather.calcSqrRoot(number1);

        //then
        Assert.assertEquals("Are you correct", expectedSum, actualSum, 1);
    }


}
