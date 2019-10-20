package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        //initial setup
        Double currentDouble = 0.00;
        String currentString = "";
        BasicCalculator basicCalc = new BasicCalculator();
        String s = "";

        Console.println("Welcome to my calculator!\n" +
                        "Type 'help' for list of commands.\n" +
                         "What would you like to do?\n");

        while (s !="exit") {
            Console.getStringInput("");










        }

        /*
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
         */
    }
}
