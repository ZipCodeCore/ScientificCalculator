package com.zipcodewilmington.scientificcalculator.Utilities;


import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;


public class MathCommandsTest {

    @Test
    public void TestHandleExpression() {
        ArrayList<String> input = new ArrayList<>();
        input.add("(");
        input.add("(");
        input.add("22");
        input.add("+");
        input.add("24");
        input.add(")");
        input.add("/");
        input.add("2");
        input.add(")");
        Double expected = 23.0;
        Double actual = MathCommands.handleExpression(input);
        assertEquals(expected, actual);
    }

    @Test
    public void TestHandleExpressionExampleA() {
        ArrayList<String> input = new ArrayList<>();
        input.add("(");
        input.add("1");
        input.add("+");
        input.add("(");
        input.add("(");
        input.add("2");
        input.add("+");
        input.add("3");
        input.add(")");
        input.add("*");
        input.add("(");
        input.add("4");
        input.add("*");
        input.add("5");
        input.add(")");
        input.add(")");
        input.add(")");
        Double expected = 101.0;
        Double actual = MathCommands.handleExpression(input);
        assertEquals(expected, actual);
    }

    @Test
    public void TestHandleExpressionExampleB() {
        ArrayList<String> input = new ArrayList<>();
        input.add("(");
        input.add("(");
        input.add("1");
        input.add("+");
        input.add("sqrt");
        input.add("(");
        input.add("5");
        input.add(")");
        input.add(")");
        input.add("/");
        input.add("2.0");
        input.add(")");
        Double expected = 1.618033988749895;
        Double actual = MathCommands.handleExpression(input);
        assertEquals(expected, actual);
    }

    @Test
    public void TestHandleExpressionWeirdInput() {
        ArrayList<String> input = new ArrayList<>();
        input.add("(");
        input.add("1");
        input.add("+");
        input.add("(");
        input.add("(");
        input.add("2");
        input.add("3");
        input.add("+");
        input.add(")");
        input.add("(");
        input.add("4");
        input.add("5");
        input.add("*");
        input.add(")");
        input.add("*");
        input.add(")");
        input.add("+");
        input.add(")");
        Double expected = 101.0;
        Double actual = MathCommands.handleExpression(input);
        assertEquals(expected, actual);
    }
}
