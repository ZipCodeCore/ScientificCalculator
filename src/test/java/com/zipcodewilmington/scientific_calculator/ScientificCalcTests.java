package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScientificCalculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class ScientificCalcTests {

    private ScientificCalculator sCalc;

    @Before
    public void setup(){
        sCalc = new ScientificCalculator();
    }

    @Test
    public void squareTest(){

        sCalc.square((double) 100);

        Assert.assertEquals(10000,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void squareTest2(){

        sCalc.square((double) 10);

        Assert.assertEquals(100,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void squareTest3(){

        sCalc.square((double) 5000);

        Assert.assertEquals(25000000,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void squareRootTest1(){

        sCalc.squareRoot((double) 100);

        Assert.assertEquals(10,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void squareRootTest2(){

        sCalc.squareRoot((double) 500);

        Assert.assertEquals(22.36067977,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void squareRootTest3(){

        sCalc.squareRoot((double) 1000);

        Assert.assertEquals(31.6227766,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void inverseTest1(){

        sCalc.inverse((double) 2);

        Assert.assertEquals(.5,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void inverseTest2(){

        sCalc.inverse((double) 10);

        Assert.assertEquals(.1,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void inverseTest3(){

        sCalc.inverse((double) 1000);

        Assert.assertEquals(.001,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void switchSignTest1(){

        sCalc.switchSign((double) 100);

        Assert.assertEquals(-100,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void switchSignTest2(){

        sCalc.switchSign((double) -10);

        Assert.assertEquals(10,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void switchSignTest3(){

        sCalc.switchSign((double) -5000);

        Assert.assertEquals(5000,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void sineTest1(){

        sCalc.sine((double) 10);

        Assert.assertEquals(.17364817,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void sineTest2(){

        sCalc.sine((double) 100);

        Assert.assertEquals(.984807753,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void sineTest3(){

        sCalc.sine((double) 1000);

        Assert.assertEquals(-.98480775,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void cosineTest1(){

        sCalc.cosine((double) 10);

        Assert.assertEquals(.984807753,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void cosineTest2(){

        sCalc.cosine((double) 100);

        Assert.assertEquals(-.173648177,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void cosineTest3(){

        sCalc.cosine((double) 1000);

        Assert.assertEquals(.173648177,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void tangentTest1(){

        sCalc.tangent((double) 10);

        Assert.assertEquals(.17632698,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void tangentTest2(){

        sCalc.tangent((double) 100);

        Assert.assertEquals(-5.67128181,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void tangentTest3(){

        sCalc.tangent((double) 1000);

        Assert.assertEquals(-5.6712818,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void inverseSineTest1(){

        sCalc.inverseSine((double) 100);

        Assert.assertEquals(10000,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void inverseSineTest2(){

        sCalc.inverseSine((double) 100);

        Assert.assertEquals(10000,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void inverseSineTest3(){

        sCalc.inverseSine((double) 100);

        Assert.assertEquals(10000,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void inverseCosineTest1(){

        sCalc.inverseCosine((double) 100);

        Assert.assertEquals(10000,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void inverseCosineTest2(){

        sCalc.inverseCosine((double) 100);

        Assert.assertEquals(10000,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void inverseCosineTest3(){

        sCalc.inverseCosine((double) 100);

        Assert.assertEquals(10000,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void inverseTangentTest1(){

        sCalc.inverseTangent((double) 100);

        Assert.assertEquals(10000,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void inverseTangentTest2(){

        sCalc.inverseTangent((double) 100);

        Assert.assertEquals(10000,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void inverseTangentTest3(){

        sCalc.inverseTangent((double) 100);

        Assert.assertEquals(10000,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void FactorialTest1(){

        sCalc.factorial((double) 10);

        Assert.assertEquals(3628800,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void FactorialTest2(){

        sCalc.factorial((double) 5);

        Assert.assertEquals(120,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void FactorialTest3(){

        sCalc.factorial((double) 8);

        Assert.assertEquals(40320,sCalc.getDoubleResult() , 0);

    }

}
