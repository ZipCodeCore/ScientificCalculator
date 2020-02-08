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

        double userInput;

        scanner = new Scanner(System.in);
        println(prompt);
        String nextNum = scanner.nextLine();

        try{
            userInput = Double.parseDouble(nextNum);
            return userInput;
        }catch (Exception e) {
            return Console.getDoubleInput("Please enter a number:");
        }
    }

    public static int getOperand(String prompt){

        scanner = new Scanner(System.in);
        println(prompt);
        String nextOperand = scanner.nextLine();

        if(nextOperand.equals("+")){
            // call add method
            return 0;
        }else if(nextOperand.equals("-")){
            //call subtraction method
            return 1;
        }else if(nextOperand.equals("*")){
            //call multiply method
            return 2;
        }else if(nextOperand.equals("/")){
            //call division method
            return 3;
        }else if(nextOperand.equals("x^2")){
            //call square method
            return 4;
        }else if(nextOperand.equals("sqrt")){
            //call square root method
            return 5;
        }else if(nextOperand.equals("x^x")){
            //call power method
            return 6;
        }else if(nextOperand.equals("1/x")){
            //call inverse method
            return 7;
        }else if(nextOperand.equals("=")){
            //call equal method
            return 8;
        }else if(nextOperand.equals("off")){
            //call close method
            return 7;
        }else{
            return getOperand(prompt);
        }
    }
}
