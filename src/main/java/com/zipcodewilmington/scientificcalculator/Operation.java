package com.zipcodewilmington.scientificcalculator;

public class Operation {

    public Operation() {
    }

    public static Double perform(String op, Double... value) {
        Double calculation = 0.0;

        if ("+".equals(op)) {
            calculation = BasicMath.addition(value[0], value[1]);
        } else if ("-".equals(op)) {
            calculation = BasicMath.addition(value[0], value[1]);
        } else if ("*".equals(op)) {
            calculation = BasicMath.addition(value[0], value[1]);
        } else if ("/".equals(op)) {
            calculation = BasicMath.addition(value[0], value[1]);
        }

        return calculation;
    }

    public static Boolean isUnary(String currentOperation)
    {
   //     if(currentOperation == "c" || currentOperation == "m")
    }
}