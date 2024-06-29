package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.ScannerCalculator.*;

/**
 * Created by leon on 2/9/18.
 */
public class Main{
    public static void main(String[] args) {
        /*Console.println("Welcome to grop b calculator version 1.0!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
        //Features Start = new Features();
        //System.out.println(Start.theAnswer(7,"*",4)); */


        Scanner scanner = new Scanner(System.in);

        //while loop to keep the program running until the user exits
        while (true) {
            //list of options for the user to choose from
            System.out.println("Curret value: " + displayValue);
            System.out.println("Choose operation");
            System.out.println("1- Get current value");
            System.out.println("2- Clear display");
            System.out.println("3- Change display value");
            System.out.println("4- Add");

            // a case statement to handle the user's choice as an integer
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    getCurrentValue();
                    break;
                case 2:
                    clearDisplay();
                    break;
                case 3:
                    System.out.println("Enter new value: ");
                case 4:
                    double addValue = scanner.nextDouble();
                    add(addValue);
            }
        }


    }
}

//branch test
//another branch test