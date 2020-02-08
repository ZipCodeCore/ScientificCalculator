package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        //Without this object instance, no methods below would run. THIS IS CRUCIAL.
        CoreFunctions coreFunctions = new CoreFunctions();

        Console.println("Welcome to my calculator!");
        Double number1 = Console.getDoubleInput("What number do you want to start with? :  ");
            //coreFunctions.IsANumber(number1);

        String operator = Console.getStringInput("Please enter your desired operator : ");
        Double number2 = Console.getDoubleInput("Please enter a second number : ");

        if (operator.equals( "+")) {
            System.out.println(coreFunctions.Add(number1, number2));
        } else if (operator == "-") {
            System.out.println(coreFunctions.Subtract(number1, number2));
        } else if (operator == "*") {
            System.out.println(coreFunctions.Multiply(number1, number2));
        } else if (operator == "/") {
            System.out.println(coreFunctions.Divide(number1, number2));
        } else if (operator == "sqrt") {
            System.out.println(coreFunctions.SquareRoot(number1));
        } else {

        }

        Console.println("The user input %s as the first number.", number1);
        Console.println("The user input %s as the operator", operator);
        Console.println("The user input %s as the second number.", number2);


    }
}
