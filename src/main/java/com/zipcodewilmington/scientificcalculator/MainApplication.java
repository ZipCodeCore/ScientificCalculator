package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    public static void main(String[] args) {
        boolean turnOn = true;
        //make a list of basic commands for calculator
        String[] basicCommands = {"1", "2"};
        //turn that array into a string
        List<String> basicCommandsList = Arrays.asList(basicCommands);
        //call the scanner
        Scanner scanner = new Scanner(System.in);



        while (turnOn) {
            System.out.println("Hello! Welcome to the calculator main menu!\nWould you care for a drink?\n\n");
            System.out.println("What would you like to do?");
            System.out.println("\"1\" - Run the Calculator");
            System.out.println("\"2\" - Turn off the Calculator");
            String userCommand = Console.getStringInput(": ");

            while (!basicCommandsList.contains(userCommand)) {
                if (basicCommandsList.contains(userCommand)) {
                    break;
                } else {
                    System.out.println("ERROR: Invalid command.\n");
                }
                System.out.println("What would you like to do?");
                userCommand = Console.getStringInput(": ");
            }

            switch (userCommand) {
                case "1":
                    Calculator calculator = new Calculator();
                    calculator.runCalculator();
                    break;
                case "2":
                    turnOn = false;
                    break;
            }
        }
        System.out.println("Goodbye! Have a nice day!");
    }
}