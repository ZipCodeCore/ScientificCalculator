package com.zipcodewilmington.scientificcalculator;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.math.BigInteger;
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

    public static Scanner scanner;

    public static String getStringInput(String prompt) {
        scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return "Hello there " + userInput + "!";
    }

    public static Integer getIntegerInput() {
        scanner = new Scanner(System.in);
        Integer userInput = scanner.nextInt();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        scanner = new Scanner(System.in);
        println(prompt);
        String nextNum = scanner.nextLine();
        double userInput;
        try{
            userInput = Double.parseDouble(nextNum);
            return userInput;
        }catch (Exception e) {
            return Console.getDoubleInput("Please enter a number:");
        }
    }

}
