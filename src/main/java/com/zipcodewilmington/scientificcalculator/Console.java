package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    private static int displayMode;

    public static void setDisplayMode(int givenDisplayMode) {
        displayMode = givenDisplayMode;
    }

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static void displayValue(double currentValue) {
        Console.println(">>>>>>>>   Display Value (in %s): %s <<<<<<<<<< \n", displayMode, applyDisplayMode(currentValue, displayMode));
    }

    public static void displayValue(double currentValue, String unitMode) {
        Console.println(">>>>>>>>   Display Value (Mode: %s): %s <<<<<<<<<< \n", unitMode, currentValue);
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
        println(prompt + " (in %s): ", displayMode);
        Double inputValue = 0.0;

        while (true) {
            try {
                inputValue = Double.valueOf(applyDisplayMode(scanner.nextLine(), displayMode));
                break;
            }
            catch(Exception e) {
                println("Invalid Input!");
                println(prompt + "( in %s): ", displayMode);
            }
        }

        return inputValue;
    }

    public static String applyDisplayMode(double currentValue, int displayMode) {
        String output = null;
        switch (displayMode) {
            case 1:
                output = String.valueOf(currentValue);
                break;
            case 2:
                output = Integer.toBinaryString((int) Math.round(currentValue));
                break;
            case 3:
                output = Integer.toOctalString((int) Math.round(currentValue));
                break;
            case 4:
                output = Integer.toHexString((int) Math.round(currentValue));
                break;
        }
        return output;
    }

    public static Integer applyDisplayMode(String inputValue, int displayMode) {
        Integer output = null;
        switch (displayMode) {
            case 1:
                output = Integer.parseInt(inputValue, 10);
                break;
            case 2:
                output = Integer.parseInt(inputValue, 2);
                break;
            case 3:
                output = Integer.parseInt(inputValue, 8);
                break;
            case 4:
                output = Integer.parseInt(inputValue, 16);
                break;
        }
        return output;
    }

    public static String getDisplayMode() {
        String displayModeValue = null;
        switch (displayMode) {
            case 1:
                displayModeValue = "Decimal";
                break;
            case 2:
                displayModeValue = "Binary";
                break;
            case 3:
                displayModeValue = "Octal";
                break;
            case 4:
                displayModeValue = "HexaDecimal";
                break;
        }
        return displayModeValue;
    }
}
