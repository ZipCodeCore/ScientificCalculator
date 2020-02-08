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
    public static Integer getIntInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;
    }



    //public static Double getDoubleInput(String prompt) {
    // return null;
    //}

    public static void BasicMenu(){

        System.out.printf("%-10s %-10s %-10s", "1 - Add |", "2 - Subtract |", "3 - Multiply \n");
        System.out.printf("%-10s %-10s %-10s", "4 - Divide |", "5 - Square |", "6 - Square Root \n");
        System.out.printf("%-10s %-10s %-10s", "7 - Exponent |", "8 - Inverse |", "9 - Pos <--> Neg \n");
        ForAllMenus();
    }
    public static void SciMenu(){
        System.out.println("Display");
        System.out.println("Trig Functions");
        System.out.printf("%-10s %-10s %-10s", "1 - Sine |", "2 - Cosine |", "3 - Tangent \n");
        System.out.printf("%-10s %-10s %-10s", "4 - Inverse Sine |", "5 - Inverse Cosine |", "6 - Inverse Tangent \n");
        ForAllMenus();
    }
    public static void ForAllMenus() {
        System.out.println("**********");
        System.out.println("Memory");
        System.out.println("**********");
        System.out.printf("%-10s %-10s %-10s", "a - M+ |", "b - MC |", "c - MRC \n");
        System.out.println("**********");
        System.out.println("Clear");
        System.out.println("**********");
        System.out.printf("%-10s %-10s", "d - Error |", "e - Display \n");
        System.out.println("**********");
        System.out.println("Back - f");
        System.out.println("**********");
        System.out.println("Main Menu - g");
        System.out.println("**********");
        System.out.println("Exit - h");
        System.out.println("**********");
    }

    public static void ExitCalc(){
        System.exit(0);
    }

    public static void GoToMainMenu(){
        System.exit(0);
    }
}
