package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class CoreFeatures {
    public static void provideOptions() {

        System.out.println("Please select an option");


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
    public static double flip(double firstNumber){
        double output = (firstNumber * (-1));
        return output;
    }
}
