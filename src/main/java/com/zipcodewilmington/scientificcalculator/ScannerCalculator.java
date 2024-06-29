package com.zipcodewilmington.scientificcalculator;

public class ScannerCalculator {
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
    // changes the value of the display
    public static void changeDisplayValue(double newValue) {
        displayValue = newValue;
    }

    // addition method
    public static void add(double value) {
        displayValue += value;
    }
}
