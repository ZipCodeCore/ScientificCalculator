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
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Double userInput = scanner.nextDouble();
        return userInput;
    }

    /////Prompt Functions////
    /////////////////////////
     public static int corePrompt(){
        int response = Console.getIntegerInput("What sup bitch! what do you want \n" +
                "Choose your option: \n" +
                "1 - Addition \n" +
                "2 - Subtraction \n" +
                "3 - Multiplication \n" +
                "4 - Division \n" +
                "5 - Exponential \n" +
                "6 - Square \n" +
                "7 - Square Root \n" +
                "8 - Inverse \n" +
                "9 - Scientific Calculator \n" +
                "10 - Turn off Calculator \n");

        return response;
     }
}
