package com.zipcodewilmington.scientificcalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    static double currentNumber;

    static String mathToPerform;

//how does git work

    public static void main(String[] args) {
        int startingNumber;

        Console.println("Welcome to our calculator!");
        System.out.println(startingNumber);
        currentNumber = getUserInput();
        printNumber(currentNumber);

        System.out.println("Please select a mode you wish to use:");
        System.out.println("Core Features or Scientific");
        Scanner scanner = new Scanner(System.in);
        String selection = String.valueOf(scanner.nextLine());
         if(selection.equalsIgnoreCase("core features")){
             CoreFeatures.provideOptions();
         }else if (selection.equalsIgnoreCase("Scientific"));{
            scientificFunctions.functions(MainApplication.currentNumber);
        }


        }

        public static Void setMathToPerform(String input){
            mathToPerform = input;
            return null;
    }
    // if(selection = log) {
    // currentNumber = dothisfunction(currentnumber)
    //system.out.prntln("currentnumber")

    public static double getUserInput() {
        System.out.println("Please input a number");
        Scanner scanner = new Scanner(System.in);
        Double userInput = Double.valueOf(scanner.nextLine());
        return userInput;
    }
    public static void printNumber(double output){
        currentNumber = output;

        if (Math.round(output) != output) {
            double roundOff = Math.round(output * 10000.0) / 10000.0;
            System.out.println(roundOff);
        }else {
            System.out.println(modeSelection(Math.round(output)));
        }
    }
    public static String modeSelection(Long standard){
       int modified = standard.intValue();

        if(scientificFunctions.currentdisplayMode().equalsIgnoreCase("binary")){
            return Integer.toBinaryString(modified);
        }else if (scientificFunctions.currentdisplayMode().equalsIgnoreCase("octal")){
            return Integer.toOctalString(modified);
        }else if (scientificFunctions.currentdisplayMode().equalsIgnoreCase("hexadecimal")){
            return Integer.toHexString(modified);
        }else{
            return Long.toString(standard);
        }
    }



}


