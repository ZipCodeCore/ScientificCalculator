package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CoreFunctions;
import org.junit.Assert;
import org.junit.Test;

public class CoreFunctionsTest {
   public CoreFunctions coreFunctions = new CoreFunctions();

    @Test
    public void positiveintegerAdderTest(){
        Double assumed = 2.;
        Double actual = coreFunctions.Add(1. ,1.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void NegativeIntegerAdderTest(){
        Double assumed = -10.;
        Double actual = coreFunctions.Add(0. ,-10.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void SubtractionTestPositiveReturn(){
        Double assumed = 1.;
        Double actual = coreFunctions.Subtract(3. ,2.);
        Assert.assertEquals( assumed, actual);

    }

    @Test
    public void SubtractionTestZeroReturn(){
        Double assumed = 1.;
        Double actual = coreFunctions.Subtract(3. ,3.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void SubtractionTestNegativeReturn(){
        Double assumed = -1.;
        Double actual = coreFunctions.Subtract(3. ,4.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void MultiplicationPositiveReturn(){
        Double assumed = 9.;
        Double actual = coreFunctions.Multiply(3. ,3.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void MultiplicationZeroReturn(){
        Double assumed = 0.;
        Double actual = coreFunctions.Subtract(0. ,3.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void MultiplicationNegativeReturn(){
        Double assumed = -9.;
        Double actual = coreFunctions.Subtract(-3. ,3.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void MultiplicationBothNegativeNumbers(){
        Double assumed = 9.;
        Double actual = coreFunctions.Subtract(-3. ,-3.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void DivisionPositiveReturnWholeNumber(){
        Double assumed = 5.;
        Double actual = coreFunctions.Subtract(10. ,2.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void DivisionPositiveReturnDecimal(){
        Double assumed = 5.;
        Double actual = coreFunctions.Subtract(10. ,2.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void DivisionPositiveReturnDecimal(){
        Double assumed = 1.5;
        Double actual = coreFunctions.Subtract(3 ,2.);
        Assert.assertEquals( assumed, actual);
    }



}

