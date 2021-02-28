package com.zipcodewilmington.scientificcalculator;

// comments

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {
    public String currentMode="Decimal";
    //placeholder variable for for the number currently input into the calc
    public int a=0;
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
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        double userInput = scanner.nextDouble();
        return userInput;
    }


    /*switches the current display mode to the next from smallest to largest.
WARNING: Display modes other then decimal will cause the calculator to be
unable to display values less then zero.*/
    public void switchDisplayMode(){

        if (currentMode.equals("decimal")){
            currentMode="hexadecimal";
            println(Integer.toHexString(a));
        }else if(currentMode.equals("hexadecimal")){
            currentMode="binary";
            println(Integer.toBinaryString(a));
        }else if(currentMode.equals("binary")){
            currentMode="octal";
            println(Integer.toOctalString(a));
        }else if(currentMode.equals("octal")){
            currentMode="decimal";
            println(Integer.toString(a));
        }
    }
    //alternate switch display statement that lets the user manually change the display mode.
    public void switchDisplayMode(String mode){
        if (mode.equalsIgnoreCase("decimal")) {
            currentMode="decimal";
            println(Integer.toString(a));
        }else if (mode.equalsIgnoreCase("octal")) {
            currentMode="octal";
            println(Integer.toOctalString(a));
        }else if (mode.equalsIgnoreCase("binary")) {
            currentMode="binary";
            println(Integer.toBinaryString(a));
        }else if (mode.equalsIgnoreCase("hexadecimal")) {
            currentMode="hexadecimal";
            println(Integer.toHexString(a));
        }else
            println("Invalid command. Please pick binary, octal, decimal, or hexadecimal");
    }
    public static void helpDoc(){
        println("q      Will exit the calculator");
        println("+      Will add two numbers");
        println("-      Will subtract the first input from the next");
        println("*      Will multiply the first input from the next");
        println("/      Will divide the first input from the next");
        println("sq     Will calculate the square of a number");
        println("sqrt   Will calculate the square root of a number");
        println("expo   Will calculate the first input to the power of the second");
        println("inverse     Will calculate the value of 1 divided by the input");
        println("negation    Will calculate the input multiplied by -1");
    }
}
