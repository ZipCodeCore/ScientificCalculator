package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static boolean startLoop = true; // TURE OR FALSE
    private static String currentMode = "binary";//Binary Mode
    private static String currentUnit = "degrees";//Degrees Mode
    private static double currentValue = 0.0; // List Current Value
    private static double memoryValue = 0.0;  // List  Memory Value
    private static String displayValue = ""; //String.valueOf(currentValue)







    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
    }
}
