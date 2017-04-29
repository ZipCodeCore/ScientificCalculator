package com.anthony.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anthonyjones on 4/28/17.
 */
public class testCalculator {

    @Test
    public void doOperation() {
        //given
        Operation add = Operation.ADD;
        Calculator calculate = new Calculator();
        double expectedSum = 0;


        //when
        double actualSum = calculate.doOperation(add);

        //then
        Assert.assertEquals("Meant to get the Add position in the Enum", expectedSum, actualSum, 0);
    }
}
