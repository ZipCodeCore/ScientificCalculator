package com.anthony.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anthonyjones on 4/30/17.
 */
public class testTrigMath {

    @Test
    public void testCalcSine() {
        //given
        double number1 = 50;
        double expectedValue = -0.262374853703;
        TrigMath trigMather = new TrigMath();

        //when
        double actualValue = trigMather.calcSine(number1);

        //then
        Assert.assertEquals(expectedValue, actualValue, .0001);
    }

    @Test
    public void testCalcCosine() {
        //given
        double number1 = 50;
        double expectedValue = 0.9649660284921;
        TrigMath trigMather = new TrigMath();

        //when
        double actualValue = trigMather.calcCosine(number1);

        //then
        Assert.assertEquals(expectedValue, actualValue, .0001);
    }

    @Test
    public void testCalcTangent() {
        //given
        double number1 = 50;
        double expectedValue = -0.271900611997;
        TrigMath trigMather = new TrigMath();

        //when
        double actualValue = trigMather.calcTangent(number1);

        //then
        Assert.assertEquals(expectedValue, actualValue, .0001);
    }

    @Test
    public void testCalcInverseSine() {
        //given
        double number1 = 0.10;
        double expectedValue = 0.1001674211615;
        TrigMath trigMather = new TrigMath();

        //when
        double actualValue = trigMather.calcInverseSine(number1);

        //then
        Assert.assertEquals(expectedValue, actualValue, .0001);
    }

    @Test
    public void testCalcInverseCosine() {
        //given
        double number1 = 0.10;
        double expectedValue = 1.4706289056333;
        TrigMath trigMather = new TrigMath();

        //when
        double actualValue = trigMather.calcInverseCosine(number1);

        //then
        Assert.assertEquals(expectedValue, actualValue, .0001);
    }

    @Test
    public void testCalcInverseTangent() {
        //given
        double number1 = 0.10;
        double expectedValue = 0.0996686524911;
        TrigMath trigMather = new TrigMath();

        //when
        double actualValue = trigMather.calcInverseTangent(number1);

        //then
        Assert.assertEquals(expectedValue, actualValue, .0001);
    }


}
