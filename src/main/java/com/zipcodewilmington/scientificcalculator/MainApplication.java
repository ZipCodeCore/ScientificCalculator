package com.zipcodewilmington.scientificcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        // Initialize all required fields
        BasicCalculator basicCalc = new BasicCalculator();
        ScFunction scientificCalc = new ScFunction();
        Fibonacci fibo = new Fibonacci();

        double currentValue;
        int calculatorType;

        // Print Welcome Note
        Console.println("Welcome to Our Calculator!");

        // Get Calculator Type
        calculatorType = Console.getIntegerInput("Please select between 1) Basic Calculator and 2) Scientific Calculator", 1, 2);

        // Get First Number to start
        currentValue = Console.getDoubleInput("Please enter the number");
        Console.displayValue(currentValue);

        double operandValue = 0.0;

        // Creating infinite loop until user choose to exit
        while (true) {

            try {
                if (calculatorType == 1) {

                    int choice = Console.getIntegerInput("Please select from the options below\n " +
                            "1) Add \n " +
                            "2) Subtract\n " +
                            "3) Multiply \n " +
                            "4) Divison\n " +
                            "5) Invert\n" +
                            "6) Percentage\n" +
                            "7) Switch to Scientific Calculator\n" +
                            "8) Clear\n" +
                            "9) Exit", 1, 9);

                    if (choice >= 1 && choice <= 4) {
                        operandValue = Console.getDoubleInput("Please enter the operand number");
                    }

                    switch (choice) {
                        case 1:
                            currentValue = basicCalc.add(currentValue, operandValue);
                            Console.displayValue(currentValue);
                            break;
                        case 2:
                            currentValue = basicCalc.subtract(currentValue, operandValue);
                            Console.displayValue(currentValue);
                            break;
                        case 3:
                            currentValue = basicCalc.multiply(currentValue, operandValue);
                            Console.displayValue(currentValue);
                            break;
                        case 4:
                            currentValue = basicCalc.divide(currentValue, operandValue);
                            if (Double.isInfinite(currentValue)) {
                                Console.println(">>>>>>>>   Display Value: %s <<<<<<<<<< ", "Err");
                            }
                            currentValue = Console.getDoubleInput("Please enter the number");
                            Console.displayValue(currentValue);
                            break;
                        case 5:
                            currentValue = basicCalc.invertNumber(currentValue);
                            Console.displayValue(currentValue);
                            break;
                        case 6:
                            currentValue = basicCalc.percentage(currentValue);
                            Console.displayValue(currentValue);
                            break;
                        case 7:
                            calculatorType = 2;
                            Console.println("Switching to Scientific Calculator");
                            Console.displayValue(currentValue);
                            break;
                        case 8:
                            currentValue = 0.0;
                            Console.displayValue(currentValue);
                            currentValue = Console.getDoubleInput("Please enter the number");
                            Console.displayValue(currentValue);
                            break;
                    }

                    // Break the while loop when user choose to exit
                    if (choice == 9) {
                        break;
                    }
                } else {

                    int choice = Console.getIntegerInput("Please select from the options below\n " +
                            "1) degree\n" +
                            "2) natural log\n" +
                            "3) base log\n" +
                            "4) inverse log\n" +
                            "5) square root\n" +
                            "6) inverse\n" +
                            "7) square\n" +
                            "8) exponent\n" +
                            "9) change sign\n" +
                            "10) sine\n" +
                            "11) cos\n" +
                            "12) tan\n" +
                            "13) inverseCosine\n" +
                            "14) inverseTangent\n" +
                            "15) inverseSine\n" +
                            "16) radian\n" +
                            "17) factorial\n" +
                            "18) fibonacci\n" +
                            "19) Switch to Scientific Calculator\n" +
                            "20) Clear\n" +
                            "21) Exit", 1, 21);
                    switch (choice) {
                        case 1:

                        case 2:

                            break;
                        case 3:
                            //
                            break;
                        case 4:
                            //
                            break;
                        case 5:
                            currentValue = basicCalc.squareRoot(currentValue);
                            Console.displayValue(currentValue);
                            break;
                        case 6:
                            currentValue = basicCalc.inverse(currentValue);
                            Console.displayValue(currentValue);
                            break;
                        case 7:
                            currentValue = basicCalc.square(currentValue);
                            Console.displayValue(currentValue);
                            break;
                        case 18:
                            fibo.fib(currentValue);
                            currentValue = Console.getDoubleInput("\nPlease enter the number");
                            Console.displayValue(currentValue);
                            break;
                        case 19:
                            calculatorType = 1;
                            break;
                        case 20:
                            currentValue = 0.0;
                            Console.displayValue(currentValue);
                            currentValue = Console.getDoubleInput("Please enter the number");
                            Console.displayValue(currentValue);
                            break;
                    }

                    if (choice == 21) {
                        break;
                    }
                }
            }
            catch(Exception ex) {
                // Display error whenever this catch block is called & start again
                Console.println(">>>>>>>>   Display Value: %s <<<<<<<<<< ", "Err");
                currentValue = Console.getDoubleInput("Please enter the number");
                Console.displayValue(currentValue);
            }
        }

        Console.println("Exit! Thank you");
    }
}