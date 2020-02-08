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

    public static Double getDoubleInput(String prompt) {
        return null;
    }

    public static void BasicMenu(){

            System.out.printf("%-10s %-10s %-10s", "1 - Add |", "2 - Subtract |", "3 - Multiply \n");
            System.out.printf("%-10s %-10s %-10s", "4 - Divide |", "5 - Square |", "6 - Square Root \n");
            System.out.printf("%-10s %-10s %-10s", "7 - Exponent |", "8 - Inverse |", "9 - Inverse Sign");
    }
    public static void SciMenu(){
        System.out.println("Display");
        System.out.println("Trig Functions");
        System.out.printf("%-10s %-10s %-10s", "1 - Sine |", "2 - Cosine |", "3 - Tangent \n");
        System.out.printf("%-10s %-10s %-10s", "4 - Inverse Sine |", "5 - Inverse Cosine |", "6 - Inverse Tangent \n");
        System.out.println("Memory");
        System.out.printf("%-10s %-10s %-10s", "7 - M+ |", "8 - MC |", "9 - MRC \n");
    }
}
