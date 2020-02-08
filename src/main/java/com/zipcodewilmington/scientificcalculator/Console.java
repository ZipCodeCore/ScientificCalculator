package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.EmmaTestMethods.Addition;

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
    public static void SciMenuHome(){
        System.out.println("Rotate Display - 1");
        System.out.println("Memory - 2");
        System.out.println("Trig Functions - 3");
        System.out.println("Mode Change - 4");
        System.out.println("Log Functions - 5");
        System.out.println("Factorial Functions - 6");
        ForAllMenus();
    }
    public static void RotateDisplay(){
        System.out.println("Binary - 1");
        System.out.println("Octal - 2");
        System.out.println("Decimal - 3");
        System.out.println("Hexadecimal - 4");
        ForAllMenus();
    }
    public static void Memory(){
        System.out.println("M+ - 1");
        System.out.println("MC - 2");
        System.out.println("MRC - 3");
        ForAllMenus();
    }
    public static void TrigFunctions(){
        System.out.println("Sin - 1");
        System.out.println("Cos - 2");
        System.out.println("Tan - 3");
        System.out.println("Arcsin - 4");
        System.out.println("Arccos - 5");
        System.out.println("Arctan - 6");
        ForAllMenus();
    }
    public static void ModeChange(){
        System.out.println("Rotate Degrees - 1");
        System.out.println("Rotate Radius - 2");
        ForAllMenus();
    }
    public static void LogFunctions(){
        System.out.println("Log - 1");
        System.out.println("Inverse Log - 2");
        System.out.println("Ln - 3");
        System.out.println("e^x - 4");
        ForAllMenus();
    }
    public static void ForAllMenus() {
        System.out.println("Clear Error - a");
        System.out.println("Clear Display - b");
        System.out.println("Back - c");
        System.out.println("Main Menu - d");
        System.out.println("Exit - e");
    }

    public static void ExitCalc(){
        System.exit(0);
    }

    public static String Greeting(){
        Console.println("Welcome to my calculator!");
         String choice = Console.getStringInput("1 - Basic | 2 - Scientific | 3 - Exit");
        return choice;
    }


    }

 //System.out.printf("%-10s %-10s %-10s", "1 - Sine |", "2 - Cosine |", "3 - Tangent \n");
        // System.out.printf("%-10s %-10s %-10s", "4 - Inverse Sine |", "5 - Inverse Cosine |", "6 - Inverse Tangent \n");