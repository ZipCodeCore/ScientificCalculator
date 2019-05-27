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
    public void switchUnitsModeRotateTest1() {
        extended.switchUnitsMode();
        Assert.assertEquals("degrees", extended.getCurTrigUnitsName());
    }

    @Test
    public void switchUnitsModeRotateTest2() {
        extended.switchUnitsMode();
        extended.switchUnitsMode();
        Assert.assertEquals("radians", extended.getCurTrigUnitsName());
    }

    @Test
    public void switchUnitsModeTestR() {
        extended.switchUnitsMode("radians");
        Assert.assertEquals("radians", extended.getCurTrigUnitsName());

    }

    @Test
    public void switchUnitsModeTestD() {
        extended.switchUnitsMode("degrees");
        Assert.assertEquals("degrees", extended.getCurTrigUnitsName());

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
    public void invLnTest1() {
        Assert.assertEquals(Math.exp(10),extended.invLn(10),delta);
    }

    @Test
    public void invLnTest2() {
        Assert.assertEquals(Math.pow(Math.E,20),extended.invLn(20),delta);
    }


    @Test
    public void factorialTest() {
        Assert.assertEquals(3628800, extended.factorial(10),delta);
    }

    @Test
    public void fibTest1(){
        Assert.assertEquals("0 1 1 2 3 5",extended.fib((double)1,(double)6));
    }
}