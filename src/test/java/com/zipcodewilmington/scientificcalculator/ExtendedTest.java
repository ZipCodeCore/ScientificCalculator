package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExtendedTest {

    Extended extended;
    double delta = 0;

    @Before
    private void before()
    {
        extended = new Extended();
    }

    @Test
    public void switchDisplayModeTest() {
    }

    @Test
    public void switchDisplayMode1Test() {
    }

    @Test
    public void memClearTest() {
    }

    @Test
    public void memPlusTest() {
    }

    @Test
    public void memRecalTest() {
    }

    @Test
    public void sineTest() {
//        Assert.assertEquals(Math.sin(0),extended.sine(0),delta);
    }
    @Test
    public void cosineTest() {
        Assert.assertEquals(Math.cos(0),extended.cosine(0),delta);
    }

    @Test
    public void tangentTest() {
        Assert.assertEquals(Math.tan(0),extended.tangent(0),delta);
    }

    @Test
    public void invSineTest() {
        Assert.assertEquals(Math.asin(0),extended.invSine(0),delta);    }

    @Test
    public void invCosineTest() {
        Assert.assertEquals(Math.acos(0),extended.invCosine(0),delta);
    }

    @Test
    public void invTanTest() {
        Assert.assertEquals(Math.atan(0),extended.invTan(0),delta);
    }

    @Test
    public void switchUnitsModeTest() {

    }

    @Test
    public void switchUnitsMode1Test() {
    }

    @Test
    public void logTest() {
        Assert.assertEquals(Math.log(0),extended.log(0),delta);
    }

    @Test
    public void invLogTest() {
        Assert.assertEquals(Math.cos(0),extended.cosine(0),delta);
    }

    @Test
    public void lnTest() {
    }

    @Test
    public void invLnTest() {
    }

    @Test
    public void factorialTest() {
    }
}