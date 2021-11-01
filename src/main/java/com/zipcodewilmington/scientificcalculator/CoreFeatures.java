package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class CoreFeatures {
    public static void provideOptions() {

        System.out.println("Please select an option");
        System.out.println("clearDisplay  currrentDisplay  basicOperation\n" +
                " square  squareRoot  exponents  invert  +/- Scientific");
        Scanner scanner = new Scanner(System.in);
        String selection = String.valueOf(scanner.nextLine());
        userChoice(selection);
    }
    public static void userChoice(String selection){
        if(selection.equalsIgnoreCase("cleardisplay")){
            MainApplication.currentNumber = 0;
            System.out.println(MainApplication.currentNumber);
            MainApplication.getUserInput();
            provideOptions();
        }else if(selection.equalsIgnoreCase("currentdisplay")) {
            System.out.println(MainApplication.currentNumber);
            MainApplication.getUserInput();
            provideOptions();
        }else if(selection.equalsIgnoreCase("basicoperation")) {
            basicoperations();
        }else if(selection.equalsIgnoreCase("square")) {
            square();
        }else if(selection.equalsIgnoreCase("squareroot")) {
            squareroot();
        }else if(selection.equalsIgnoreCase("exponents")) {
            exponents();
        }else if(selection.equalsIgnoreCase("invert")) {
            invert();
        }else if(selection.equalsIgnoreCase("Scientific")){
            scientificFunctions.();
        }else if(selection.equalsIgnoreCase("+/-")){
            positivesign();
        } else{
            System.out.println("Invalid Choice, Please try again");
            provideOptions();
        }

    }
    public static void basicoperations(){
        System.out.println("Please enter an operation to use.");
        Scanner scanner = new Scanner(System.in);
        String selection = String.valueOf(scanner.nextLine());
        if(selection.equals("+")){
            double output = (MainApplication.currentNumber + MainApplication.getUserInput());
            MainApplication.printNumber(output);
            provideOptions();
        }else if(selection.equals("-")){
            double output = (MainApplication.currentNumber - MainApplication.getUserInput());
            MainApplication.printNumber((output));
            provideOptions();
        }else if(selection.equals("*")){
            double output = (MainApplication.currentNumber * MainApplication.getUserInput());
            MainApplication.printNumber((output));
            provideOptions();
        }else if(selection.equals("/")){
            double number2 = MainApplication.getUserInput();
            double output = (MainApplication.currentNumber / number2);
            MainApplication.printNumber((output));
            provideOptions();
        }else {
            System.out.println("invalid choice, please choose again");
            basicoperations();
        }

    }
    public static void square(){
        double output = (MainApplication.currentNumber * MainApplication.currentNumber);
        MainApplication.printNumber(output);

        provideOptions();
    }
    public static void squareroot(){
        double output = Math.sqrt(MainApplication.currentNumber);
        MainApplication.printNumber(output);

        provideOptions();
    }
    public static void exponents(){
        double output = Math.pow(MainApplication.currentNumber, MainApplication.getUserInput());
        MainApplication.printNumber(output);
        provideOptions();
    }
    public static void invert(){
        double output = (1/MainApplication.currentNumber);
        MainApplication.printNumber(output);
        provideOptions();
    }
    public static void positivesign(){
        double output = (MainApplication.currentNumber * (-1));
        MainApplication.printNumber(output);
        provideOptions();
    }
}
