package com.zipcodewilmington.scientificcalculator;

public class AskNumber {

    // Ask for a Double

    public static double askDouble() {
        double d = 0;
        d = Console.getDoubleInput("Enter a double.");
        return d;
    }

    // Ask for an Operator

    public static String getOperation() {
        String operator = "";
        operator = Console.getStringInput("What would you like to do?\nPlease type one of the following \nAdd  Subtract  Multiply  Divide  Remainder  Square  SquareRoot VariableExpo\nClear");
        while(!operator.equalsIgnoreCase("Add")  && !operator.equalsIgnoreCase("Subtract")  && !operator.equalsIgnoreCase("Multiply")  && !operator.equalsIgnoreCase("Divide") && !operator.equalsIgnoreCase("Remainder") && !operator.equalsIgnoreCase("Square") && !operator.equalsIgnoreCase("SquareRoot") && !operator.equalsIgnoreCase("VariableExpo") && !operator.equalsIgnoreCase("Clear")){
            Console.println("You selected " + operator);
            operator = Console.getStringInput("Invalid Input! Please type one of the following \nAdd  Subtract  Multiply  Divide  Remainder  Square  SquareRoot VariableExpo Clear");
        }
        return operator;
    }
}
