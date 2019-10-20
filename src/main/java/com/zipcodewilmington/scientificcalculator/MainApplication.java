package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {



    public static void main(String[] args) {

        double result = 1.0;

        Console.println("Welcome to my calculator!");
        String operation = Console.getStringInput("Enter the operation you would like to perform.");
        Double num1 = Console.getDoubleInput("Enter your first number.");

        switch(operation) {
            case "+":
                Double num2 = Console.getDoubleInput("Enter your second.");
                return System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            case "-":
                Double num2 = Console.getDoubleInput("Enter your second number.");
                return System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case "x":
                Double num2 = Console.getDoubleInput("Enter your second number.");
                return System.out.println(num1 + " x " + num2 + " = " + result);
                break;
            case "/":
                Double num2 = Console.getDoubleInput("Enter your second number.");
                return System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            case "sq":
                return System.out.println(num1 + " squared is " + result);
                break;
            case "exp":
                return System.out.println(num1 + " to the power of " + num2 + " = " + result);
                break;
            case "sqrt":
                return System.out.println("The square root of " + num1 + " is " + result);
                break;
            case "inverse":
                return System.out.println("The inverse of " + num1 + " is " + result);
                break;
            case "log":
                return System.out.println("The inverse of " + num1 + " is " + result);
                break;
            case "sine":
                return System.out.println("The sine of " + num1 + " is " + result);
                break;
            case "cosine":
                return System.out.println("The cosine of " + num1 + " is " + result);
                break;
            case "tangent":
                return System.out.println("The tangent of " + num1 + " is " + result);
                break;
            default:
                return System.out.println("Your input was incorrect please type one of the following:\n" +
                        "+ for addition \n- for subtraction\nx for multiplication\n/ for division\n" +
                        "sq for squaring \nexp for exponent\nsqrt for squart root\ninv for inverse\n" +
                        "inv for invert\nlog for logarithms\nsin for sine\ncos for cosine\ntan for tangent\n");
                break;



        }


        //Double num1 = Console.getDoubleInput("Enter your first number.");
        //Double num2 = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", operation);
        Console.println("The user input %s as a integer", num1);
        Console.println("The user input %s as a d", num2);



    }

}
