package com.zipcodewilmington.scientificcalculator;

import sun.applet.Main;

public class Display {
    public boolean checkState = true;
    public static boolean error = false;
    public int displayMode = 0;
    public int unitMode = 0;
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
        }else if(mode.equalsIgnoreCase("deci")){
            System.out.println(intTotal);
        }else{
            Display.displayErr();
        }
    }

    public void changeUnitDisplay(){

        switch (unitMode){
            case 0:
                System.out.println(ScientificCalc.radian(MainApplication.total));
                unitMode++;
                break;
            case 1:
                System.out.println(ScientificCalc.degree(MainApplication.total));
                unitMode = 0;
                break;
        }
    }

    public void changeUnitDisplay(String unit){

        if(unit.equalsIgnoreCase("rad")){
            System.out.println(ScientificCalc.radian(MainApplication.total));
        }else if(unit.equalsIgnoreCase("deg")){
            System.out.println(ScientificCalc.degree(MainApplication.total));
        }else {
            Display.displayErr();
        }
    }

    public static void displayErr() {
        //if math calculations don't work, display 'Err')
        error = true;
        System.out.println("Err. Clear screen.");
    }

}
