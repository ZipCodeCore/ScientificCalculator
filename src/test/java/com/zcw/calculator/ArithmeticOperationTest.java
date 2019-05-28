package com.zcw.calculator;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticOperationTest {
    @Test
    public void sum() {
        ArithmeticOperations ao = new ArithmeticOperations();
        Assert.assertEquals("10",ao.sum(2,8));
    }
    @Test
    public void diff() {
        ArithmeticOperations ao = new ArithmeticOperations();
        Assert.assertEquals("10",ao.diff(20,10));
    }
    //test fsafasf
    @Test
    public void multi() {
        ArithmeticOperations ao = new ArithmeticOperations();
        Assert.assertEquals("16",ao.multi(2,8));
    }
    //test fsafasf
    @Test
    public void modulus() {
        ArithmeticOperations ao = new ArithmeticOperations();
        Assert.assertEquals("1",ao.modulus(4,3));
    }
    //test fsafasf
    @Test
    public void div() {
        ArithmeticOperations ao = new ArithmeticOperations();
        Assert.assertEquals("10",ao.div(20,2));
    }
}
