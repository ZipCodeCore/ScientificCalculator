package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsoleTest {

    @Test
    public void printNumTest() {
        Calculator calculator = new Calculator();
        calculator.setDisplayMode(Calculator.dMode.BINARY);
        calculator.setDisplay(64.0);
        String expected = "1000000";
        String actual = Console.printNum(calculator.getDisplay(),calculator.getDisplayMode());
        assertTrue(expected.equals(actual));

        calculator.setDisplay(13.0);
        expected = "1101";
        actual = Console.printNum(calculator.getDisplay(),calculator.getDisplayMode());
        assertTrue(expected.equals(actual));

        calculator.setDisplay(13.3);
        expected = "1101";
        actual = Console.printNum(calculator.getDisplay(),calculator.getDisplayMode());
        assertTrue(expected.equals(actual));

        calculator.setDisplayMode(Calculator.dMode.OCTAL);
        calculator.setDisplay(64.0);
        expected = "100";
        actual = Console.printNum(calculator.getDisplay(),calculator.getDisplayMode());
        assertTrue(expected.equals(actual));

        calculator.setDisplay(13.0);
        expected = "15";
        actual = Console.printNum(calculator.getDisplay(),calculator.getDisplayMode());
        assertTrue(expected.equals(actual));

        calculator.setDisplay(13.3);
        expected = "15";
        actual = Console.printNum(calculator.getDisplay(),calculator.getDisplayMode());
        assertTrue(expected.equals(actual));

        calculator.setDisplayMode(Calculator.dMode.HEXADECIMAL);
        calculator.setDisplay(64.0);
        expected = "0x1.0p6";
        actual = Console.printNum(calculator.getDisplay(),calculator.getDisplayMode());
        assertTrue(expected.equals(actual));

        calculator.setDisplay(13.0);
        expected = "0x1.ap3";
        actual = Console.printNum(calculator.getDisplay(),calculator.getDisplayMode());
        assertTrue(expected.equals(actual));

        calculator.setDisplay(13.3);
        expected = "0x1.a99999999999ap3";
        actual = Console.printNum(calculator.getDisplay(),calculator.getDisplayMode());
        assertTrue(expected.equals(actual));

        calculator.setDisplayMode(Calculator.dMode.DECIMAL);
        calculator.setDisplay(64.0);
        expected = "64.0";
        actual = Console.printNum(calculator.getDisplay(),calculator.getDisplayMode());
        assertTrue(expected.equals(actual));

        calculator.setDisplay(13.0);
        expected = "13.0";
        actual = Console.printNum(calculator.getDisplay(),calculator.getDisplayMode());
        assertTrue(expected.equals(actual));

        calculator.setDisplay(13.3);
        expected = "13.3";
        actual = Console.printNum(calculator.getDisplay(),calculator.getDisplayMode());
        assertTrue(expected.equals(actual));

    }

    @Test
    public void cleanInputErrors() {
        assertEquals("ERR",Console.cleanInput("blargh"));
        assertEquals("ERR",Console.cleanInput("blargh"));
    }

    @Test
    public void cleanInputNumbers() {
        assertEquals("2.45",Console.cleanInput("2.45"));
        assertEquals("-2.45",Console.cleanInput("-2.45"));
        assertEquals("7",Console.cleanInput("7"));
    }

    @Test
    public void cleanInputOperators() {
        for (String operator : Calculator.UNARYOPERATORS) {
            assertEquals(operator,Console.cleanInput(operator));
        }
    }

    @Test
    public void cleanInputBinaryOperators() {
        for (String operator : Calculator.BINARYOPERATORS) {
            assertEquals(operator,Console.cleanInput(operator));
        }
    }

    @Test
    public void cleanInputCommands() {
        for (String command : Calculator.COMMANDS) {
            assertEquals(command,Console.cleanInput(command));
        }

    }
}