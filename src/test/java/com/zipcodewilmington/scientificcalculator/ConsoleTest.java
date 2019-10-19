package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsoleTest {
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