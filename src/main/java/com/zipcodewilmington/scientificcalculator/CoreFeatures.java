package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class CoreFeatures {
    public static void provideOptions() {

        System.out.println("Please select an option");
        System.out.println("clearDisplay  currrentDisplay  basicOperation\n" +
                " square  squareRoot  exponents  invert  +/-");
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

        }else if(selection.equals("-")){

        }else if(selection.equals("*")){

        }else if(selection.equals("/")){

        }else {
            System.out.println("invalid choice, please choose again");
            basicoperations();
        }

    }
    public static double addition(double firstNumber, double secondNumber){
        double result = (firstNumber + secondNumber);
        return result;
    }
    public static double subtraction(double firstNumber, double secondNumber){
        double result = (firstNumber - secondNumber);
        return result;
    }
    public static double division(double firstNumber, double secondNumber){
        double result = (firstNumber / secondNumber);
        return result;
    }
    public static double multiplication(double firstNumber, double secondNumber){
        double result = (firstNumber * secondNumber);
        return result;
    }


    public static double square(double firstNumber){
    double result = firstNumber * firstNumber;
    return result;
    }
    public static double squareroot(double firstNumber){
        double result = Math.sqrt(firstNumber);
        return result;
    }
    public static double exponents(double firstNumber, double secondNumber){
        double output = Math.pow(firstNumber, secondNumber);
        return output;
    }
    public static double invert(double firstNumber){
        double output = (1/firstNumber);
        return output;
    }
    public static double positivesign(double firstNumber){
        double output = (firstNumber * (-1));
        return output;
    }
}
