package com.zipcodewilmington.scientificcalculator;

public class Display {
    public boolean checkState = true;
    public static boolean error = false;
    public int displayMode = 0;
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
    public void changeNumberDisplay() {

        String output;
        switch (displayMode){
            case 0:
                System.out.println(MainApplication.total);
                displayMode++;
                break;
            case 1:
                output = Double.toHexString(MainApplication.total);
                System.out.println(output);
                displayMode++;
                break;
            case 2:

                output = Integer.toBinaryString(MainApplication.total);
                System.out.println(output);
                displayMode++;
                break;
            case 3:

                break;
        }
    }

    public void changeNumberDisplay(String mode) {

    }

    public static void displayErr() {
        //if math calculations don't work, display 'Err')
        error = true;
        System.out.println("Err. Clear screen.");
    }

}
