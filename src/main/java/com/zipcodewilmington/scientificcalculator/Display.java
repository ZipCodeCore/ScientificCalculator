package com.zipcodewilmington.scientificcalculator;

public class Display {
    public boolean checkState = true;
    public static double total = 0;
    public static double currentTotal = 0;
    public static boolean error;

    public void displayValue(double input){

        System.out.println(input);
    }

    public void displayCurrentValue(double input) {
        System.out.println(input);

    }

    public void clearDisplay() {
        checkState = true;
        total = 0;
        currentTotal = 0;
        displayValue(total);
        error = false;

    }
    public void changeNumberDisplay(double nextInput) {
        total = nextInput;
        System.out.println(total);
    }
    public void displayErr() {
        //if math calculations don't work, display 'Err')
        error = true;
        System.out.println("Err. Clear screen.");
    }

}
