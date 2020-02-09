package com.zipcodewilmington.scientificcalculator;

public class Display {
    public boolean checkState = true;
    public static boolean error = false;

    public void displayValue(double input){

        System.out.println(input);
    }

    public void displayCurrentValue(double input) {
        System.out.println(input);

    }

    public void clearDisplay() {
        checkState = true;
        displayValue(0);
        error = false;

    }
    public void changeNumberDisplay(double nextInput) {
//        total = nextInput;
//        System.out.println(total);
    }
    public static void displayErr() {
        //if math calculations don't work, display 'Err')
        error = true;
        System.out.println("Err. Clear screen.");
    }

}
