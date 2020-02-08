package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CoreFunctions;
import org.junit.Assert;
import org.junit.Test;

public class CoreFunctionsTest {
    CoreFunctions coreFunctions = new CoreFunctions();

    @Test
    public void positiveintegerAdderTest(){
        int assumed = 2;
        int actual = coreFunctions.Add(1 ,1);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void NegativeIntegerAdderTest(){
        int assumed = -10;
        int actual = coreFunctions.Add(0 ,-10);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void adderTest3(){
        int assumed = 3;
        int actual = coreFunctions.Add(1 ,2);
        Assert.assertEquals( assumed, actual);
    }
}

