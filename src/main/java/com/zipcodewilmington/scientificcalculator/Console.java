package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {
    private Double num1 = 0.0;
    private Double num2 = 0.0;
    private Double result = 0.0;
    private String userInput;

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
        return null;
    }

    public void run() {

        userInput = Console.getStringInput("0");
        while (!userInput.equalsIgnoreCase("q")) {

            if (Core.validOperator(userInput) == 1) {
                switch (userInput.toUpperCase()) {
                    case "M+": {

                    }
                    case "MC": {
                    }
                    case "MRC": {
                    }
                    case "SIN": {
                    }
                    case "COS": {
                    }
                    case "TAN": {
                    }
                    case "ASIN": {
                    }
                    case "ACOS": {
                    }
                    case "ATAN": {
                    }
                    case "LOG": {
                    }
                    case "LN": {
                    }
                    case "E^X": {
                    }
                    case "10^X": {
                    }
                    case "!": {
                    }
                    case "C": {
                    }
                    case "SQ": {
                    }
                    case "SQRT": {
                    }
                    case "INV": {
                    }
                    case "SIGN": {
                    }
                    default:
                }

            }

            else if (Core.validOperator(userInput) == 2) {
                switch (userInput.toUpperCase()) {
                    case "+": {
                        userInput = Console.getStringInput("+");
                        num2 = Double.parseDouble(userInput);
                        result = Core.add(num1, num2);
                        num1 = result;
                        break;
                    }
                    case "-": {
                    }
                    case "*": {
                    }
                    case "/": {
                    }
                    case "EXP": {
                    }
                    case "SWDR": {
                    }
                    case "SWD": {
                    }
                    default:
                }
            }
            else {
                num1 = Double.parseDouble(userInput);
            };

            userInput = Console.getStringInput(num1.toString());
        }

    }
}
