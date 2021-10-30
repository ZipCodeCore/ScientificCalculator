package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class CoreFeatures {
    public static void provideOptions() {

        System.out.println("Please select an option");
        System.out.println("clearDisplay  currrentDisplay  basicOperation\n" +
                " square  squareRoot  exponents  invert");
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
        }

    }
    public static void basicoperations(){
        System.out.println("Please enter an operation to use.");
        Scanner scanner = new Scanner(System.in);
        String selection = String.valueOf(scanner.nextLine());
        if(selection.equals("+")){
            System.out.println(MainApplication.currentNumber + MainApplication.getUserInput());
            provideOptions();
        }else if(selection.equals("-")){

        }else if(selection.equals("*")){

        }else if(selection.equals("/")){

        }

    }
    public static void square(){

    }
    public static void squareroot(){

    }
    public static void exponents(){

    }
    public static void invert(){

    }
}
