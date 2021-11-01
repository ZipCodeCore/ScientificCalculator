package com.zipcodewilmington.scientificcalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    double userInput;
    double savedNumber;
    static double currentNumber;
    static double output;

//how does git work

    public static void main(String[] args) {
        int startingNumber = 0;

        Console.println("Welcome to our calculator!");
        System.out.println(startingNumber);
        currentNumber = getUserInput();
        printNumber(currentNumber);
        CoreFeatures.provideOptions();

    }
    public static double getUserInput() {
        System.out.println("Please input a number");
        Scanner scanner = new Scanner(System.in);
        Double userInput = Double.valueOf(scanner.nextLine());
        return userInput;
    }
    public static void printNumber(double output){
        MainApplication.currentNumber = output;

        if (Math.round(output) != output) {
            double roundOff = Math.round(output * 10000.0) / 10000.0;
            System.out.println(roundOff);
        }else {
            System.out.println(modeSelection(Math.round(output)));
        }
    }
    public static String modeSelection(Long standard){
       int modified = standard.intValue();

        if(scientificFunction.switchDisplayMode.equalsIgnoreCase("binary")){
            return Integer.toBinaryString(modified);
        }else if (scientificFunction.switchDisplayMode.equalsIgnoreCase("octal")){
            return Integer.toOctalString(modified);
        }else if (scientificFunction.switchDisplayMode.equalsIgnoreCase("hexadecimal")){
            return Integer.toHexString(modified);
        }else{
            return Long.toString(standard);
        }
    } //scientificFunction.switchDisplayMode.equalsIgnoreCase("");

}


