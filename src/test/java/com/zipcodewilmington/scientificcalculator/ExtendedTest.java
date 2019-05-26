package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExtendedTest {

    Extended extended;
    double delta = 0;

    @Before
    public void before()
    {
        extended = new Extended();
    }

    @Test
    public void switchDisplayModeRotateTest1() {
        extended.switchDisplayMode();
        Assert.assertEquals("hexadecimal",extended.getCurDisplayModeName());
    }
    @Test
    public void switchDisplayModeRotateTest2() {
    for (int i = 0; i < 2; i++) extended.switchDisplayMode();
        Assert.assertEquals("binary",extended.getCurDisplayModeName());
    }
    @Test
    public void switchDisplayModeRotateTest3() {
        for (int i = 0; i < 3; i++) extended.switchDisplayMode();
        Assert.assertEquals("octal",extended.getCurDisplayModeName());
    }
    @Test
    public void switchDisplayModeRotateTest4() {
        for (int i = 0; i < 4; i++) extended.switchDisplayMode();
        Assert.assertEquals("decimal",extended.getCurDisplayModeName());
    }


    @Test
    public void switchDisplayModeTestB() {
        extended.switchDisplayMode("binary");
        Assert.assertEquals("binary",extended.getCurDisplayModeName());
    }
    @Test
    public void switchDisplayModeTestO() {
        extended.switchDisplayMode("octal");
        Assert.assertEquals("octal",extended.getCurDisplayModeName());
    }
    @Test
    public void switchDisplayModeTestD() {
        extended.switchDisplayMode("decimal");
        Assert.assertEquals("decimal",extended.getCurDisplayModeName());
    }
    @Test
    public void switchDisplayModeTestH() {
        extended.switchDisplayMode("hexadecimal");
        Assert.assertEquals("hexadecimal",extended.getCurDisplayModeName());
    }


    @Test
    public void memClearTest() {
        extended.memClear();
        Assert.assertEquals(0,extended.memRecal(),delta);
    }

    @Test
    public void memPlusTest1() {
        extended.memPlus(20);
        Assert.assertEquals(20,extended.memRecal(),delta);
    }

    @Test
    public void memPlusTest2() {
        extended.memPlus(20);
        extended.memPlus(30);
        Assert.assertEquals(50,extended.memRecal(),delta);
    }

    @Test
    public void sineTest() {
        Assert.assertEquals(Math.sin(0),extended.sine(0),delta);
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
        Assert.assertEquals(2,extended.log(100),delta);
    }

    @Test
    public void invLogTest() {
        Assert.assertEquals(100000,extended.invLog(5),delta);
    }

    @Test
    public void lnTest() {
        Assert.assertEquals(1,extended.ln(Math.E),delta);
    }

    @Test
    public void invLnTest() {
    }

    @Test
    public void factorialTest() {
    }
}