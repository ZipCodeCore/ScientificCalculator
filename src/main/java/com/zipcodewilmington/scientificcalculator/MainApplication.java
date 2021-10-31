package com.zipcodewilmington.scientificcalculator;

import java.util.Locale;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static int display = 0;
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        while(!(s.equals("kill")){
            String s = Console.getStringInput("What do you want to do?");
            //Double d1 = Console.getDoubleInput("Enter a double.");
            //Double d2 = Console.getDoubleInput("Enter another double.");
            //Console.println("The user input %s as a string", s);
            //Console.println("The user input %s as a d", d1);
            //Console.println("The user input %s as a d", d2);
            switch (s.toLowerCase()) {
                case "current number":
                    break;
                case "clear screen":
                    break;
                case "change current number":
                    break;
                case "add":
                    break;
                case "subtract":
                    break;
                case "multiply":
                    break;
                case "divide":
                    break;
                case "square":
                    break;
                case "square root":
                    break;
                case "variable exponent":
                    break;
                case "inverse":
                    break;
                case "switch display mode":
                    break;
                case "binary":
                    break;
                case "decimal":
                    break;
                case "octal":
                    break;
                case "hexadecimal":
                    break;
                case "add to memory":
                    break;
                case "clear memory":
                    break;
                case "replace memory":
                    break;
                case "sin":
                    break;
                case "cos":
                    break;
                case "tan":
                    break;
                case "inv sin":
                    break;
                case "inv cos":
                    break;
                case "inv tan":
                    break;
                case "switch units mode":
                    break;
                case "radians":
                    break;
                case "degrees":
                    break;
                case "log":
                    break;
                case "inv log":
                    break;
                case "ln":
                    break;
                case "inv ln":
                    break;
                case "factorial":
                    break;
                case "absolute value":
                    break;
                case "kill":
                    break;
                default:
                    System.println("Cannot compute. Please try again");
                    break;
            }
        }
    }
}
