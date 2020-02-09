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

        int intTotal = (int) Math.round(MainApplication.total);
        switch (displayMode){
            case 0:
                System.out.println(intTotal);
                displayMode++;
                break;
            case 1:
                System.out.println(ScientificCalc.Hexadecimal(intTotal));
                displayMode++;
                break;
            case 2:
                System.out.println(ScientificCalc.Octal(intTotal));
                displayMode++;
                break;
            case 3:
                System.out.println(ScientificCalc.Binary(intTotal));
                displayMode = 0;
                break;
        }
    }

    public void changeNumberDisplay(String mode) {

        int intTotal = (int) Math.round(MainApplication.total);
        if(mode.equalsIgnoreCase("hexa")){
            System.out.println(ScientificCalc.Hexadecimal(intTotal));
        }else if(mode.equalsIgnoreCase("binary")) {
            System.out.println(ScientificCalc.Binary(intTotal));
        }else if(mode.equalsIgnoreCase("octal")){
            System.out.println(ScientificCalc.Octal(intTotal));
        }else{
            System.out.println(intTotal);
        }
    }

    public static void displayErr() {
        //if math calculations don't work, display 'Err')
        error = true;
        System.out.println("Err. Clear screen.");
    }

}
