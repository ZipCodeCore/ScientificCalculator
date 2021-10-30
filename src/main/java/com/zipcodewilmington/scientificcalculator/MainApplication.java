package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    double userInput;
    double savedNumber;
    static double currentNumber;

//how does git work

    public static void main(String[] args) {
        int startingNumber = 0;

        Console.println("Welcome to our calculator!");
        System.out.println(startingNumber);
        currentNumber = getUserInput();
        System.out.println(currentNumber);
        CoreFeatures.provideOptions();

    }
    public static double getUserInput() {
        System.out.println("Please input a number");
        Scanner scanner = new Scanner(System.in);
        Double userInput = Double.valueOf(scanner.nextLine());
        return userInput;
    }
    public static void printNumber(){

    }

    }


