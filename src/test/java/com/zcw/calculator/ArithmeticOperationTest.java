package com.zcw.calculator;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticOperationTest {
    @Test
    public void sumTest() {
        ArithmeticOperations ao = new ArithmeticOperations();
        Assert.assertEquals("10",ao.sum(2,8));
    }
    //test fsafasf
}
