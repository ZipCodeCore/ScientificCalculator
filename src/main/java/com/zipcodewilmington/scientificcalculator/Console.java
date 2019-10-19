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

    public static String getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase(); //get input from user

        return Console.cleanInput(input);
    }

    public static String cleanInput(String userInput) {
        // three/four legit options: was input a command, operator (unary or binary), or number (checked by regEx)?
        if (Arrays.asList(Calculator.COMMANDS).contains(userInput) || Arrays.asList(Calculator.UNARYOPERATORS).contains(userInput) || Arrays.asList(Calculator.BINARYOPERATORS).contains(userInput) || userInput.matches("-?\\d+(\\.\\d+)?")) {
            return userInput;
        } else {
            return "ERR";
        }
    }
}
