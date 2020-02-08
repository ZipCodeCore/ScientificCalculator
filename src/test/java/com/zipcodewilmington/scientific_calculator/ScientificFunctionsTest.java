package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScientificFunctions;
import org.junit.Assert;
import org.junit.Test;

public class ScientificFunctionsTest {
    com.zipcodewilmington.scientificcalculator.ScientificFunctions ScientificFunctions = new ScientificFunctions();

    @Test
    public void positiveintegerAdderTest(){
        Double assumed = 2.;
        Double actual = ScientificFunctions.add(1. ,1.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void NegativeIntegerAdderTest(){
        Double assumed = -10.;
        Double actual = ScientificFunctions.add(0. ,-10.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void SubtractionTestPositiveReturn(){
        Double assumed = 1.;
        Double actual = ScientificFunctions.subtract(3. ,2.);
        Assert.assertEquals( assumed, actual);

    }

    @Test
    public void SubtractionTestZeroReturn(){
        Double assumed = 0.;
        Double actual = ScientificFunctions.subtract(3. ,3.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void SubtractionTestNegativeReturn(){
        Double assumed = -1.;
        Double actual = ScientificFunctions.subtract(3. ,4.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void MultiplicationPositiveReturn(){
        Double assumed = 9.;
        Double actual = ScientificFunctions.multiply(3. ,3.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void MultiplicationZeroReturn(){
        Double assumed = 0.;
        Double actual = ScientificFunctions.multiply(0. ,3.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void MultiplicationNegativeReturn(){
        Double assumed = -9.;
        Double actual = ScientificFunctions.multiply(-3. ,3.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void MultiplicationBothNegativeNumbers(){
        Double assumed = 9.;
        Double actual = ScientificFunctions.multiply(-3. ,-3.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void DivisionPositiveReturnWholeNumber(){
        Double assumed = 5.;
        Double actual = ScientificFunctions.divide(10. ,2.);
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void DivisionPositiveReturnDecimal(){
        Double assumed = 1.5;
        Double actual = ScientificFunctions.divide(3. ,2.);
        Assert.assertEquals( assumed, actual);
    }
    @Test
    public void squareRootReturnPositiveWholeNumber(){
        Double assumed = 3.;
        Double actual = ScientificFunctions.squareRoot(9. );
        Assert.assertEquals( assumed, actual);
    }

    @Test
    public void squareRootReturnPositiveDecimal(){
        Double assumed = 3.1622776601683795;
        Double actual = ScientificFunctions.squareRoot(10. );
        Assert.assertEquals( assumed, actual);
    }
/*
    @Test
    public void squareRootReturnZero(){
        String assumed = "Whatever logic my boys put";
        Double actual = ScientificFunctions.squareRoot(10. );
        Assert.assertEquals( assumed, actual);
    }*/

/*
    @Test
    public void squareRootReturnNegative(){
        String assumed = "Whatever logic my boys put";
        Double actual = ScientificFunctions.squareRoot(10. );
        Assert.assertEquals( assumed, actual);
    }*/


}
