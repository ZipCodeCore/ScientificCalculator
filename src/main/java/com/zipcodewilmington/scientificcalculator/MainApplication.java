package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
//Initial command is entered here, along with initial value of numeric input and memory
        String s=Console.getStringInput("Enter an command:");
        double memory=0.0;
        double i = 0.0;
//q is calculator quit command, will keep prompting for commands until q is entered
        while (!(s.equalsIgnoreCase("q"))) {
//initialising second value if it's needed
            double d;
            double result;

            switch (s) {
                case "switch":
                    break;
                case "":
                    break;
                case "M+":
                    i = Console.getDoubleInput("Enter a value to add to memory");
                    CalculatorOperator.memAdd(i, memory);
                    break;
                case "M-":
                    i = Console.getDoubleInput("Enter a value to subtract from memory");
                    CalculatorOperator.memSub(i, memory);
                    break;
                case "M":
                    Console.println(Double.toString(memory));
                    break;
                case"Mc":
                    memory=0;
                    break;
                case "+":
                    i = Console.getDoubleInput("Enter a double");
                    d = Console.getDoubleInput("Enter a double.");
                    result =CalculatorOperator.addition(i, d);
                    Console.println(Double.toString(CalculatorOperator.addition(i, d)));
                    break;
                case "-":
                    i = Console.getDoubleInput("Enter a double");
                    d = Console.getDoubleInput("Enter a double.");
                    result=CalculatorOperator.subtraction(i, d);
                    Console.println(Double.toString(result));
                    break;
                case "*":
                    i = Console.getDoubleInput("Enter a double");
                    d = Console.getDoubleInput("Enter a double.");
                    Console.println(Double.toString(CalculatorOperator.multiplication(i, d)));
                    break;
                case "/":
                    i = Console.getDoubleInput("Enter a double");
                    d = Console.getDoubleInput("Enter a double.");
                    Console.println(Double.toString(CalculatorOperator.division(i, d)));
                    break;
                case "sq":
                    i = Console.getDoubleInput("Enter a double");
                    Console.println(Double.toString(CalculatorOperator.square(i)));
                    break;
                case "sqrt":
                    i = Console.getDoubleInput("Enter a double");
                    Console.println(Double.toString(CalculatorOperator.squareRoot(i)));
                    break;
                case "expo":
                    i = Console.getDoubleInput("Enter a double");
                    d = Console.getDoubleInput("Enter a double.");
                    Console.println(Double.toString(CalculatorOperator.exponents(i,d)));
                    break;
                case "inverse":
                    i = Console.getDoubleInput("Enter a double");
                    Console.println(Double.toString(CalculatorOperator.multiplicativeInverse(i)));
                    break;
                case "negation":
                    i = Console.getDoubleInput("Enter a double");
                    Console.println(Double.toString(CalculatorOperator.additiveInverse(i)));
                case "help":
                    Console.helpDoc();
                default:
                    Console.println("Invalid Command");
            }
            //lets the user enter a new command
            s=Console.getStringInput("Enter an command:");
        }
    }

}

