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

    public static void getOperand(String prompt){

        Display display = new Display();
        scanner = new Scanner(System.in);
        println(prompt);
        String nextOperand = scanner.nextLine();
        Operations opp = new Operations();

        if(nextOperand.equals("+")){
            // call add method
            if(!Display.error) {
                MainApplication.secondDouble = Console.getDoubleInput("Please enter a number:");
                if(Display.checkState){
                    Display.currentTotal = (opp.add(MainApplication.firstDouble, MainApplication.secondDouble));
                    display.displayCurrentValue();
                    Display.total = Display.currentTotal;
                    Display.checkState = false;
                }else {
                    Display.currentTotal = (opp.add(Display.total, MainApplication.secondDouble));
                    display.displayValue(Display.currentTotal);
                    Display.total = Display.currentTotal;
                }
            }else {
                display.displayErr();
            }
        }else if(nextOperand.equals("-")){
            //call subtraction method
            if(!Display.error){
                MainApplication.secondDouble = Console.getDoubleInput("Please enter a number:");
                if(Display.checkState){
                    Display.currentTotal = (opp.subtract(MainApplication.firstDouble, MainApplication.secondDouble));
                    display.displayCurrentValue();
                    Display.total = Display.currentTotal;
                    Display.checkState = false;
                }else {
                    Display.currentTotal = (opp.subtract(Display.total, MainApplication.secondDouble));
                    display.displayValue(Display.currentTotal);
                    Display.total = Display.currentTotal;
                }
            }else {
                display.displayErr();
            }
        }else if(nextOperand.equals("*")){
            //call multiply method
            if(!Display.error) {
                MainApplication.secondDouble = Console.getDoubleInput("Please enter a number:");
                if(Display.checkState){
                    Display.currentTotal = (opp.multiply(MainApplication.firstDouble, MainApplication.secondDouble));
                    display.displayCurrentValue();
                    Display.total = Display.currentTotal;
                    Display.checkState = false;
                }else {
                    Display.currentTotal = (opp.multiply(Display.total, MainApplication.secondDouble));
                    display.displayValue(Display.currentTotal);
                    Display.total = Display.currentTotal;
                }
            }else {
                display.displayErr();
            }
        }else if(nextOperand.equals("/")){
            //call division method
            if(!Display.error) {
                MainApplication.secondDouble = Console.getDoubleInput("Please enter a number:");
                if(Display.checkState){
                    Display.currentTotal = (opp.divide(MainApplication.firstDouble, MainApplication.secondDouble));
                    display.displayCurrentValue();
                    Display.total = Display.currentTotal;
                    Display.checkState = false;
                }else {
                    Display.currentTotal = (opp.divide(Display.total, MainApplication.secondDouble));
                    display.displayValue(Display.currentTotal);
                    Display.total = Display.currentTotal;
                }
            }else {
                display.displayErr();
            }
        }else if(nextOperand.equalsIgnoreCase("x^2")){
            //call square method
            if(!Display.error) {
                if(Display.checkState){
                    Display.currentTotal = (opp.square(MainApplication.firstDouble));
                    display.displayCurrentValue();
                    Display.total = Display.currentTotal;
                    Display.checkState = false;
                }else {
                    Display.currentTotal = (opp.square(Display.total));
                    display.displayValue(Display.currentTotal);
                    Display.total = Display.currentTotal;
                }
            }else {
                display.displayErr();
            }
        }else if(nextOperand.equalsIgnoreCase("sqrt")){
            //call square root method
            if(!Display.error) {
                if(Display.checkState){
                    Display.currentTotal = (opp.squareRoot(MainApplication.firstDouble));
                    display.displayCurrentValue();
                    Display.total = Display.currentTotal;
                    Display.checkState = false;
                }else {
                    Display.currentTotal = (opp.squareRoot(Display.total));
                    display.displayValue(Display.currentTotal);
                    Display.total = Display.currentTotal;
                }
            }else {
                display.displayErr();
            }
        }else if(nextOperand.equalsIgnoreCase("x^x")){
            //call power method
            if(!Display.error) {
                MainApplication.secondDouble = Console.getDoubleInput("Please enter a number:");
                if(Display.checkState){
                    Display.currentTotal = (opp.exponent(MainApplication.firstDouble, MainApplication.secondDouble));
                    display.displayCurrentValue();
                    Display.total = Display.currentTotal;
                    Display.checkState = false;
                }else {
                    Display.currentTotal = (opp.exponent(Display.total, MainApplication.secondDouble));
                    display.displayValue(Display.currentTotal);
                    Display.total = Display.currentTotal;
                }
            }else {
                display.displayErr();
            }
        }else if(nextOperand.equalsIgnoreCase("1/x")){
            //call inverse method
            if(!Display.error) {
                if(Display.checkState){
                    Display.currentTotal = (opp.inverse(MainApplication.firstDouble));
                    display.displayCurrentValue();
                    Display.total = Display.currentTotal;
                    Display.checkState = false;
                }else {
                    Display.currentTotal = (opp.inverse(Display.total));
                    display.displayValue(Display.currentTotal);
                    Display.total = Display.currentTotal;
                }
            }else {
                display.displayErr();
            }
        }else if(nextOperand.equalsIgnoreCase("c")){
            display.clearDisplay();
        }else if(nextOperand.equalsIgnoreCase("off")){
            //call close method
            display.clearDisplay();
        }else{
            getDoubleInput(prompt);
        }
    }
}



