package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static int firstInt;
    public static int secondInt;
    public static double firstDouble;
    public static double secondDouble;
    public static boolean on = true;

    public static void main(String[] args) {

        Console.println("Welcome to my calculator!");
        String name = Console.getStringInput("Please enter your name!");
        Console.println(name);
        firstDouble = Console.getDoubleInput("Please enter a number:");
        String operandPrompt = "Choose an operand: + , - , * , / , x^2 , sqrt , x^x , 1/x, c";
        while(on) {
            Console.getOperand(operandPrompt);
        }
    }
}

