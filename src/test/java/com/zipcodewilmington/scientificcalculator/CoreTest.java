package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoreTest {

    double delta = 0;
    Core core;

    @Before
    public void before() {
        core = new Core();
    }
    @Test
    public void addTest() {
        Assert.assertEquals(36, core.add(12,24), delta);
    }

    @Test
    public void subtractTest() {
        Assert.assertEquals(32, core.subtract(59,27), delta);
    }

    @Test
    public void multiplyTest() {
        Assert.assertEquals(169, core.multiply(13,11), delta);
    }

    @Test
    public void divideTest() {
        Assert.assertEquals(9, core.divide(72,8), delta);

    }

    @Test
    public void divideTest0() {
        Assert.assertEquals(Double.NaN, core.divide(0,0), delta);

    }

    @Test
    public void squareTest() {
        Assert.assertEquals(81,core.square(9), delta);
    }

    @Test
    public void squareRootTest() {
        Assert.assertEquals(8,core.squareRoot(64), delta);
    }

    @Test
    public void squareRootNegativeTest() {
        Assert.assertEquals(Double.NaN, core.squareRoot(-2), delta);
    }

    @Test
    public void exponentTest() {
        Assert.assertEquals(8192, core.exponent(2,13), delta);
    }

    @Test
    public void inverseTest() {
        Assert.assertEquals(0.25, core.inverse(4), delta);
    }

    @Test
    public void inverseTest0() {
        Assert.assertEquals(Double.NaN, core.inverse(0), delta);
    }

    @Test
    public void invertSignTestPositive() {
        Assert.assertEquals(20, core.invertSign(-20), delta);

    }

    @Test
    public void invertSignTestNegative() {
        Assert.assertEquals(-15, core.invertSign(15), delta);

    }

    @Test
    public void invertSignTest0() {
        Assert.assertEquals(0, core.invertSign(0), delta);

    }

//    @Test
//    public void clearTest() {
//       core.clear();
//    }

//    @Test
//    public void validOperator() {
//    }
}