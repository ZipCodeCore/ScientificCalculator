package com.anthony.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anthonyjones on 4/30/17.
 */
public class testTrigMath {

    @Test
    public void testSin() {
        //given
        double number1 = 50;
        double expectedValue = -0.2623748537;
        TrigMath trigMather = new TrigMath();

        //when
        double actualValue = trigMather.calcSine(number1);

        //then
        Assert.assertEquals(expectedValue,actualValue,.0001);
    }
}
