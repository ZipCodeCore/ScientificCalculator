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

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }



    public static String getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static String getFirstInput() {
        return getDoubleInput("Please enter your first number: ");
    }

    public static String getOperatorInput() {
        return getDoubleInput("Please enter an operator");
    }

    public static String getSecondInput() {
        return getDoubleInput("Please enter your first number: ");
    }



    public static String pickCalculator() {
        return getDoubleInput("Please choose basic or scientific calculator: ");

    }

    int status = 0;

    /*while (status = 0) {
        if (calculatorChoice.equals('basic')) {

        }
    }*/
}
