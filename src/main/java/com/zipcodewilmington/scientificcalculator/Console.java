package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;
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

    public static Double getDoubleInput(String prompt) {
        // need to handle operator input gracefully
        Scanner scanner = new Scanner(System.in);

        Double userInput = scanner.nextDouble();

        return userInput;
    }

    public static String getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase(); //get input from user

        return Console.cleanInput(input);
    }

    public static String cleanInput(String userInput) {
        // three legit options: was input a command, operator, or number (checked by regEx)
        if (Arrays.asList(Calculator.COMMANDS).contains(userInput) || Arrays.asList(Calculator.OPERATORS).contains(userInput) || userInput.matches("-?\\d+(\\.\\d+)?")) {
            return userInput;
        } else {
            return "ERR";
        }
    }
}
