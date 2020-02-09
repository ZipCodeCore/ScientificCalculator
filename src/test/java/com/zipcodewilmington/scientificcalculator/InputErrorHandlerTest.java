package com.zipcodewilmington.scientificcalculator;

import jdk.internal.util.xml.impl.Input;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputErrorHandlerTest {
    @Test
    public void TestInputErrorHandlerNumber()
    {
        Boolean expected = true;
        InputErrorHandler TestInputErrorHandler = new InputErrorHandler();
        Boolean actual = TestInputErrorHandler.validNumber("500.505");

        assertEquals(expected, actual);
    }

    @Test
    public void TestInputErrorHandlerSecondNumber()
    {
        Boolean expected = true;
        InputErrorHandler TestInputErrorHandler = new InputErrorHandler();
        Boolean actual = TestInputErrorHandler.validNumber("500");

        assertEquals(expected, actual);
    }

    @Test
    public void TestInputErrorHandlerAdd()
    {
        Boolean expected = true;
        InputErrorHandler TestInputErrorHandler = new InputErrorHandler();
        Boolean actual = TestInputErrorHandler.validOp("+");

        assertEquals(expected, actual);
    }

    @Test
    public void TestInputErrorHandlerWrongAdd()
    {
        Boolean expected = false;
        InputErrorHandler TestInputErrorHandler = new InputErrorHandler();
        Boolean actual = TestInputErrorHandler.validOp("add");

        assertEquals(expected, actual);
    }

    @Test
    public void TestInputErrorHandlerSub()
    {
        Boolean expected = true;
        InputErrorHandler TestInputErrorHandler = new InputErrorHandler();
        Boolean actual = TestInputErrorHandler.validOp("-");

        assertEquals(expected, actual);
    }

    @Test
    public void TestInputErrorHandlerMode()
    {
        Boolean expected = true;
        InputErrorHandler TestInputErrorHandler = new InputErrorHandler();
        Boolean actual = TestInputErrorHandler.validOp("mode");

        assertEquals(expected, actual);
    }

    @Test
    public void TestInputErrorHandlerSqrt()
    {
        Boolean expected = true;
        InputErrorHandler TestInputErrorHandler = new InputErrorHandler();
        Boolean actual = TestInputErrorHandler.validOp("sqrt");

        assertEquals(expected, actual);
    }

    @Test
    public void TestInputErrorHandlerFoo()
    {
        Boolean expected = false;
        InputErrorHandler TestInputErrorHandler = new InputErrorHandler();
        Boolean actual = TestInputErrorHandler.validOp("foo");

        assertEquals(expected, actual);
    }
}