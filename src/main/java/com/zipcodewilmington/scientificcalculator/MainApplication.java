package com.zipcodewilmington.scientificcalculator;


import static com.zipcodewilmington.scientificcalculator.Console.*;


/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("1 - Basic | 2 - Scientific | 3 - Exit");
        if(s.equals("1")) {
            BasicMenu();
            s = Console.getStringInput("Please select an option");
        }
        else if(s.equals("2")) {
            SciMenu();
            s = Console.getStringInput("Please select an option");
        }
        else if(s.equals("3")) {
            System.exit(0);
        }
        else {
            System.out.println("Please enter a valid response");
        }

       //Integer i = Console.getIntegerInput("1 - Basic | 2 - Scientific | 3 - Exit");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
//        System.out.printf("%-10s %-10s %-10s", "1 - Add |", "2 - Subtract |" , "3 - Multiply \n");
//        System.out.printf("%-10s %-10s %-10s", "4 - Divide |", "5 - Square |" , "6 - Square Root \n");
//        System.out.printf("%-10s %-10s %-10s", "7 - Exponent |", "8 - Inverse |" , "9 - Inverse Sign");
    }
}
