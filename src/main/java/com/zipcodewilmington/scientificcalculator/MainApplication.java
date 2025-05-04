package com.zipcodewilmington.scientificcalculator;

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

        System.out.println(output);


    }

    }


