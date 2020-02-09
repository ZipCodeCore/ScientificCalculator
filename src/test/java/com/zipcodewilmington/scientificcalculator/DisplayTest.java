package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class DisplayTest {

    @Test
    public void TestUpdateInitValue()
    {
        String expected = "0";
        Display TestDisplay = new Display();
        String actual = TestDisplay.Update();

        assertEquals(expected, actual);
    }

    @Test
    public void TestClear() {
        Double expected = 0.0;
        Display TestDisplay = new Display();
        Double actual;
        TestDisplay.setDisplay(99.99999);
        TestDisplay.Clear();
        actual = TestDisplay.getDisplay();

        assertEquals(expected, actual);
    }

    @Test
    public void TestInvSign() {
        Double expected = -47.6;
        Display TestDisplay = new Display();
        TestDisplay.setDisplay(47.6);
        Double actual = TestDisplay.InvSign();

        assertEquals(expected, actual);
    }

    @Test
    public void TestAbsoluteValueOfTen()
    {
        Double expected = 10.0;
        Display TestDisplay = new Display();
        TestDisplay.setDisplay(10.0);
        Double actual = TestDisplay.AbsoluteValue();

        assertEquals(expected, actual);
    }

    @Test
    public void TestAbsoluteValueOfNegFourtyFive()
    {
        Double expected = 45.0;
        Display TestDisplay = new Display();
        TestDisplay.setDisplay(-45.0);
        Double actual = TestDisplay.AbsoluteValue();

        assertEquals(expected, actual);
    }

    @Test
    public void TestAbsoluteValueOfZero()
    {
        Double expected = 0.0;
        Display TestDisplay = new Display();
        TestDisplay.setDisplay(0.0);
        Double actual = TestDisplay.AbsoluteValue();

        assertEquals(expected, actual);
    }
}