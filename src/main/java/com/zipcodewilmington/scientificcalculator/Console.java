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

    public String getFirstInput() {
        return getDoubleInput("Please enter your first number: ");
    }

    public String getOperatorInput() {
        return getDoubleInput("Please enter an operator");
    }

    public String getSecondInput() {
        return getDoubleInput("Please enter your first number: ");
    }


    public  String pickCalculator() {
        return getDoubleInput("Please choose basic or scientific calculator: ");

    }

    public void calcChoice(String calculatorChoice) {
        System.out.println("Please choose an option from the below Menu;\n" +
                "1) Addition\n" +
                "2) Subtraction\n" +
                "3) Multiplication\n" +
                "4) Divide \n");
        if(calculatorChoice.equals("scientific")){
            System.out.println("5) Square\n" +
                    "6) degree\n" +
                    "7) natural log\n" +
                    "8) base log\n" +
                    "9) inverse log\n" +
                    "10) square root\n" +
                    "11) inverse\n" +
                    "12) square\n" +
                    "13) exponent\n" +
                    "14) change sign\n" +
                    "15) sine\n" +
                    "15) cos\n" +
                    "15) tan\n");
        }

    }
}
