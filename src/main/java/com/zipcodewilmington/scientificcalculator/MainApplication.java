package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        //String s = Console.getStringInput("Enter a string");
        //Double d = Console.getDoubleInput("Enter a double.");
        Integer i = Console.getIntegerInput("Please enter your first number or enter \"Memory\" for your stored value");

        Console.println("Please enter the operation you would like to perform:");
        Console.println("Current Number:                              %s\n",i);
        Console.println("Add      Subtract      Multiply      Divide   ");
        Console.println("Square   Square Root   Exponential   Inverse  ");
        Console.println("Log      Log-1         Ln            Ln-1     ");
        Console.println("Sine     Cosine        Tangent       Factorial");
        Console.println("Sine-1   Cosine-1      Tangent-1              ");
        String j = Console.getStringInput();



        //Console.println("The user input %s as a string", s);
        //Console.println("The user input %s as a d", d);
        //Console.println("The user input %s as a integer", i);

    }
}
