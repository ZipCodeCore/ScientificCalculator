package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationTest {

    @Test
    public void TestisSetting()
    {
        Boolean expected = true;
        Operation TestOperation = new Operation();
        Boolean actual = TestOperation.isSetting("c");

        assertEquals(expected, actual);
    }

    @Test
    public void TestisSettingAdd()
    {
        Boolean expected = false;
        Operation TestOperation = new Operation();
        Boolean actual = TestOperation.isSetting("+");

        assertEquals(expected, actual);
    }

    @Test
    public void TestisSettingBar()
    {
        Boolean expected = false;
        Operation TestOperation = new Operation();
        Boolean actual = TestOperation.isSetting("bar");

        assertEquals(expected, actual);
    }

    @Test
    public void TestisSettingMPlus()
    {
        Boolean expected = true;
        Operation TestOperation = new Operation();
        Boolean actual = TestOperation.isSetting("m+");

        assertEquals(expected, actual);
    }

    @Test
    public void TestisisUnary()
    {
        Boolean expected = true;
        Operation TestOperation = new Operation();
        Boolean actual = TestOperation.isUnary("nlog");

        assertEquals(expected, actual);
    }

    @Test
    public void TestisBinary()
    {
        Boolean expected = true;
        Operation TestOperation = new Operation();
        Boolean actual = TestOperation.isUnary("*");

        assertEquals(expected, actual);
    }
}