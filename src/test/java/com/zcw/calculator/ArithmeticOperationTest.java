package com.zcw.calculator;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticOperationTest {
    @Test
    public void Sum() {
        ArithmeticOperations ao = new ArithmeticOperations();
        Assert.assertEquals("10",ao.Sum(2,8));
    }
    @Test
    public void Diff() {
        ArithmeticOperations ao = new ArithmeticOperations();
        Assert.assertEquals("10",ao.Diff(20,10));
    }
    //test fsafasf
    @Test
    public void Multi() {
        ArithmeticOperations ao = new ArithmeticOperations();
        Assert.assertEquals("10",ao.Multi(2,8));
    }
    //test fsafasf
    @Test
    public void Modulus() {
        ArithmeticOperations ao = new ArithmeticOperations();
        Assert.assertEquals("1",ao.Modulus(4,3));
    }
    //test fsafasf
    @Test
    public void Div() {
        ArithmeticOperations ao = new ArithmeticOperations();
        Assert.assertEquals("10",ao.Div(20,2));
    }
}
