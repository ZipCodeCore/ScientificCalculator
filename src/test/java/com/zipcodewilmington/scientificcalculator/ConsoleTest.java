package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsoleTest {
    @Test
    public void cleanInput1() {
        assertEquals("ERR",Console.cleanInput("blargh"));
    }
}