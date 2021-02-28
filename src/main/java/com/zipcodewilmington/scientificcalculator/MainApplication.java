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
//initialising second value if it's needed, result needs to initialize to zero in case of switch or base
            double d;
            double result=0;

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
                    result=CalculatorOperator.addition(i, d);
                    Console.println(Double.toString(result));
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
                    result=CalculatorOperator.multiplication(i, d);
                    Console.println(Double.toString(result));
                    break;
                case "/":
                    i = Console.getDoubleInput("Enter a double");
                    d = Console.getDoubleInput("Enter a double.");
                    result=CalculatorOperator.division(i, d);
                    Console.println(Double.toString(result));
                    break;
                case "sq":
                    i = Console.getDoubleInput("Enter a double");
                    result=CalculatorOperator.square(i);
                Console.println(Double.toString(result));
                    break;
                case "sqrt":
                    i = Console.getDoubleInput("Enter a double");
                    result=CalculatorOperator.squareRoot(i);
                    Console.println(Double.toString(result));
                    break;
                case "expo":
                    i = Console.getDoubleInput("Enter a double");
                    d = Console.getDoubleInput("Enter a double.");
                    result=CalculatorOperator.exponents(i,d);
                    Console.println(Double.toString(result));
                    break;
                case "inverse":
                    i = Console.getDoubleInput("Enter a double");
                    result=CalculatorOperator.multiplicativeInverse(i);
                    Console.println(Double.toString(result));
                    break;
                case "negation":
                    i = Console.getDoubleInput("Enter a double");
                    result=CalculatorOperator.additiveInverse(i);
                    Console.println(Double.toString(result));
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

