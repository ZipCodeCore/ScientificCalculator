package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static void displayValue(double currentValue) {
        Console.println(">>>>>>>>   Display Value: %s <<<<<<<<<< \n", currentValue);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt, int rangeStart, int rangeStop) {

        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer inputValue = 0;

        while (true) {
            try {
                inputValue = Integer.valueOf(scanner.nextLine());
                if (inputValue >= rangeStart && inputValue <= rangeStop) {
                    break;
                }
                else {
                    println("Invalid Choice!");
                    println(prompt);
                }
            }
            catch(Exception e) {
                println("Invalid Integer Number!");
                println(prompt);
            }
        }

        return inputValue;
    }

    public static Double getDoubleInput(String prompt) {

        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Double inputValue = 0.0;

        while (true) {
            try {
                inputValue = Double.valueOf(scanner.nextLine());
                break;
            }
            catch(Exception e) {
                println("Invalid Double Number!");
                println(prompt);
            }
        }

        return inputValue;
    }
}
