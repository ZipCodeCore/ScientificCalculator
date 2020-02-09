package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class DisplayTest {
/* Goal format:
╔════════════════════════════════════════════════╗
║                                                ║
║                                          10100 ║
║  BIN                                           ║
╚════════════════════════════════════════════════╝

 */

    @Test
    public void TestUpdateInitValue()
    {
        String expected =
                                "╔════════════════════════════════════════════════╗\n" +
                                "║                                                ║\n" +
                                "║                                              0 ║\n" +
                                "║                                                ║\n" +
                                "╚════════════════════════════════════════════════╝\n";
        Display TestDisplay = new Display();
        String actual = TestDisplay.update();

        assertEquals(expected, actual);
    }

    @Test
    public void TestUpdateBinaryEight()
    {
        String expected =
                    "╔════════════════════════════════════════════════╗\n" +
                    "║                                                ║\n" +
                    "║                                           1000 ║\n" +
                    "║  BIN                                           ║\n" +
                    "╚════════════════════════════════════════════════╝\n";
        Display TestDisplay = new Display();
        TestDisplay.setDisplay(8.0);
        TestDisplay.setMode(Display.Modes.BINARY);
        String actual = TestDisplay.update();

        assertEquals(expected, actual);
    }

    @Test
    public void TestUpdateBinaryTwentyPointFive()
    {
        String expected =
                    "╔════════════════════════════════════════════════╗\n" +
                    "║                                                ║\n" +
                    "║                                          10100 ║\n" +
                    "║  BIN                                           ║\n" +
                    "╚════════════════════════════════════════════════╝\n";
        Display TestDisplay = new Display();
        TestDisplay.setDisplay(20.5);
        TestDisplay.setMode(Display.Modes.BINARY);
        String actual = TestDisplay.update();

        assertEquals(expected, actual);
    }

    @Test
    public void TestClear() {
        Double expected = 0.0;
        Display TestDisplay = new Display();
        Double actual;
        TestDisplay.setDisplay(99.99999);
        TestDisplay.clear();
        actual = TestDisplay.getDisplay();

        assertEquals(expected, actual);
    }

    @Test
    public void TestInvSign() {
        Double expected = -47.6;
        Display TestDisplay = new Display();
        TestDisplay.setDisplay(47.6);
        Double actual = TestDisplay.invSign();

        assertEquals(expected, actual);
    }

    @Test
    public void TestAbsoluteValueOfTen()
    {
        Double expected = 10.0;
        Display TestDisplay = new Display();
        TestDisplay.setDisplay(10.0);
        Double actual = TestDisplay.absoluteValue();

        assertEquals(expected, actual);
    }

    @Test
    public void TestAbsoluteValueOfNegFourtyFive()
    {
        Double expected = 45.0;
        Display TestDisplay = new Display();
        TestDisplay.setDisplay(-45.0);
        Double actual = TestDisplay.absoluteValue();

        assertEquals(expected, actual);
    }

    @Test
    public void TestAbsoluteValueOfZero()
    {
        Double expected = 0.0;
        Display TestDisplay = new Display();
        TestDisplay.setDisplay(0.0);
        Double actual = TestDisplay.absoluteValue();

        assertEquals(expected, actual);
    }

    @Test
    public void TestSetModeOCT()
    {
        Display.Modes expected = Display.Modes.OCTAL;
        Display TestDisplay = new Display();
        TestDisplay.setMode(Display.Modes.OCTAL);
        Display.Modes actual = TestDisplay.getMode();

        assertEquals(expected, actual);
    }

    @Test
    public void TestSetModeBINARY()
    {
        Display.Modes expected = Display.Modes.BINARY;
        Display TestDisplay = new Display();
        TestDisplay.setMode(Display.Modes.BINARY);
        Display.Modes actual = TestDisplay.getMode();

        assertEquals(expected, actual);
    }

    @Test
    public void TestSetModeDEC()
    {
        Display.Modes expected = Display.Modes.DEC;
        Display TestDisplay = new Display();
        TestDisplay.setMode(Display.Modes.DEC);
        Display.Modes actual = TestDisplay.getMode();

        assertEquals(expected, actual);
    }

    @Test
    public void TestSetModeCycleFiveTimes()
    {
        Display.Modes expected = Display.Modes.BINARY;
        Display TestDisplay = new Display();
        TestDisplay.setMode();
        TestDisplay.setMode();
        TestDisplay.setMode();
        TestDisplay.setMode();
        TestDisplay.setMode();
        Display.Modes actual = TestDisplay.getMode();

        assertEquals(expected, actual);
    }

    @Test
    public void TestToggleRadians()
    {
        Boolean expected = true;
        Display TestDisplay = new Display();
        TestDisplay.toggleRadians();
        Boolean actual = TestDisplay.getIsRadians();

        assertEquals(expected, actual);
    }

    @Test
    public void TestToggleRadiansFourHundredTimes()
    {
        Boolean expected = false;
        Display TestDisplay = new Display();
        for(int i = 0; i < 400; i++)
        {
            TestDisplay.toggleRadians();
        }
        Boolean actual = TestDisplay.getIsRadians();

        assertEquals(expected, actual);
    }

    @Test
    public void TestDisplayRadians()
    {
        String expected =
                        "╔════════════════════════════════════════════════╗\n" +
                        "║  RAD                                           ║\n" +
                        "║                                             90 ║\n" +
                        "║                                                ║\n" +
                        "╚════════════════════════════════════════════════╝\n";
        Display TestDisplay = new Display();
        TestDisplay.setDisplay(90.0);
        TestDisplay.toggleRadians();
        String actual = TestDisplay.update();
    }

    @Test
    public void TestNaNDisplaysError ()
    {
        String expected =
                "╔════════════════════════════════════════════════╗\n" +
                "║  ERR                                           ║\n" +
                "║                                            ERR ║\n" +
                "║  ERR                                           ║\n" +
                "╚════════════════════════════════════════════════╝\n";
        Display TestDisplay = new Display();
        TestDisplay.setDisplay(6.0/0.0);
        String actual = TestDisplay.update();

        assertEquals(expected, actual);
    }

    @Test
    public void TestClearVoidsError()
    {
        String expected =
                        "╔════════════════════════════════════════════════╗\n" +
                        "║                                                ║\n" +
                        "║                                              0 ║\n" +
                        "║                                                ║\n" +
                        "╚════════════════════════════════════════════════╝\n";
        Display TestDisplay = new Display();
        TestDisplay.setDisplay(6.0/0.0);
        TestDisplay.clear();
        String actual = TestDisplay.update();

        assertEquals(expected, actual);
    }

    @Test
    public void TestMaxDisplaySize()
    {
        String expected =
                        "╔════════════════════════════════════════════════╗\n" +
                        "║                                                ║\n" +
                        "║  100000000000000000000000000000000000000000000 ║\n" +
                        "║  BIN                                           ║\n" +
                        "╚════════════════════════════════════════════════╝\n";
        Display TestDisplay = new Display();
        TestDisplay.setDisplay(140737488355328.0);
        TestDisplay.setMode(Display.Modes.BINARY);
        String actual = TestDisplay.update();

        assertEquals(expected, actual);
    }

    @Test
    public void TestMaxDisplaySizeTwo()
    {
        String expected =
                "╔════════════════════════════════════════════════╗\n" +
                        "║                                                ║\n" +
                        "║  9.9999999999999999999999999999999999999999999 ║\n" +
                        "║                                                ║\n" +
                        "╚════════════════════════════════════════════════╝\n";

        Display TestDisplay = new Display();
        TestDisplay.setDisplay(9.9999999999999999999999999999999999999999999);
        String actual = TestDisplay.update();

        assertEquals(expected, actual);
    }

    @Test
    public void TextDisplayPi()
    {
        String expected =
                            "╔════════════════════════════════════════════════╗\n" +
                            "║                                                ║\n" +
                            "║                              3.141592653589793 ║\n" +
                            "║                                                ║\n" +
                            "╚════════════════════════════════════════════════╝\n";

        Display TestDisplay = new Display();
        TestDisplay.setDisplay(Math.PI);
        String actual = TestDisplay.update();

        assertEquals(expected, actual);

    }
}