package com.zcw.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisplayOperationsTest {

    @Test
    public void switchDisplayMode() {
    DisplayOperations displayOperations = new DisplayOperations();
        Assert.assertEquals("f",displayOperations.switchDisplayMode(15));
    }

    @Test
    public void switchDisplayMode1() {
        DisplayOperations displayOperations = new DisplayOperations();
        Assert.assertEquals("10",displayOperations.switchDisplayMode("binary",2));
    }
}