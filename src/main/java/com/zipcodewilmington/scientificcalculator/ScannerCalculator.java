package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class ScannerCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static double displayValue = 0.0;
    public static double memoryValue = 0.0;
    public static final String ERROR_MESSAGE = "Err";

    // prints the current value of the display
    public static void getCurrentValue() {
        System.out.println("Current value: " + displayValue);
    }

    // clears the display
    public static void clearDisplay() {
        displayValue = 0.0;
        System.out.println("Display cleared");
    }
    public static void changeDisplayValue(double newValue) {
        displayValue = newValue;
        System.out.println("Display value changed to: " + displayValue);
    }

    // addition method
    public static void add(double value) {
        displayValue += value;
    }

    // subtraction method
    public static void subtract(double value) {
        displayValue -= value;
    }

    public static void multiply(double value) {
        displayValue *= value;
    }

    public static void divide(double value) {
        displayValue /= value;
    }

    public static void square(double value) {
         displayValue = Math.pow(displayValue, 2);
    }

    public static void squareRoot(double value) {
        if (displayValue < 0) {
            displayValue = Double.NaN;  //Indicates error for negative input
        } else {
            displayValue = Math.sqrt(displayValue);
         }
        }
    }