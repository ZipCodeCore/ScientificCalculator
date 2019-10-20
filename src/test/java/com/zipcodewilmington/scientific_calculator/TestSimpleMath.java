package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.SimpleMath;
import org.junit.Assert;

public class TestSimpleMath {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception{

    }

    @org.junit.Test
    public void testSimpleMath(){

        SimpleMath add1 = new SimpleMath();
        Assert.assertEquals(20, add1.add(10,10), 0.00);
        Assert.assertEquals(56.50, add1.add(20.25, 36.25), 0.00);
        Assert.assertEquals(357, add1.add(206, 151), 0.00);
        Assert.assertEquals(652.27, add1.add(563.25, 89.02), 0.00);


        SimpleMath sub1 = new SimpleMath();
        Assert.assertEquals(15, sub1.subtract(20, 5), 0.00);


        SimpleMath mul1 = new SimpleMath();
        Assert.assertEquals(81, mul1.multiplication(9,9), 0.00);


        SimpleMath div1 = new SimpleMath();
        Assert.assertEquals(125, div1.division(250, 2), 0.00);




    }






}



