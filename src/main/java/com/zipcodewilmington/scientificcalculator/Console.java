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

    /////Prompt Functions///
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
    public static int scientificPrompt(){
        int response = Console.getIntegerInput("What sup bitch! what do you want \n" +
                "Choose your option: \n" +
                "1 - Sine \n" +
                "2 - Cosine \n" +
                "3 - Tangent \n" +
                "4 - Inverse Sine \n" +
                "5 - Inverse Cosine \n" +
                "6 - Inverse Tangent \n" +
                "7 - Log \n" +
                "8 - Inverse Log \n" +
                "9 - Ln \n" +
                "10 - Inverse Natural Log \n" +
                "11 - Factorial(!n)\n" +
                "12 - Switch modes \n" +
                "13 - Back to basic Calculator \n" +
                "14 - Turn Off\n");

        return response;
    }
    public static int switchMode(){
        int mode = Console.getIntegerInput("Which mode would you like?\n" +
                "1 - Radian\n" +
                "2 - Degrees\n");

        while(mode != 1 && mode != 2){
            System.out.println("Error!!");
            mode = Console.getIntegerInput("Which mode would you like?\n" +
                    "1 - Radian\n" +
                    "2 - Degrees\n");
        }
        return mode;
    }
}
