package com.zipcodewilmington.scientificcalculator;

import sun.applet.Main;

public class Display {
    public boolean checkState = true;
    public static boolean error = false;
    public int displayMode = 0;
    public int unitMode = 0;

    public void displayCurrentValue(double input) {
        System.out.println(input);

    }

    public void clearDisplay() {
        checkState = true;
        update(0);
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
            update(Double.parseDouble(ScientificCalc.Hexadecimal(intTotal)));
        }else if(mode.equalsIgnoreCase("binary")) {
            update(Double.parseDouble(ScientificCalc.Binary(intTotal)));
        }else if(mode.equalsIgnoreCase("octal")){
            update(Double.parseDouble(ScientificCalc.Octal(intTotal)));
        }else if(mode.equalsIgnoreCase("deci")){
            update(intTotal);
        }else{
            Display.displayErr();
        }
    }

    public void changeUnitDisplay(){

        switch (unitMode){
            case 0:
                update(ScientificCalc.radian(MainApplication.total));
                unitMode++;
                break;
            case 1:
                update(ScientificCalc.degree(MainApplication.total));
                unitMode = 0;
                break;
        }
    }

    public void changeUnitDisplay(String unit){

        if(unit.equalsIgnoreCase("rad")){
            update(ScientificCalc.radian(MainApplication.total));
        }else if(unit.equalsIgnoreCase("deg")){
            update(ScientificCalc.degree(MainApplication.total));
        }else {
            Display.displayErr();
        }
    }

    public static void displayErr() {
        //if math calculations don't work, display 'Err')
        error = true;
        System.out.println("Err. Clear screen.");
    }

    public void update(double update){
        String[][] calc = { {"C", " RD", "RD X ", " SIN", "invSin", "Off"},
                            {"+", "X^2", " Sqrt", " COS", "invCos", "   "},
                            {"-", "X^N", " 1/x ", " TAN", "invTan", "   "},
                            {"*", " M+", "Prime", " Log", "invLog", "   "},
                            {"/", " MC", "Year%", " Ln ", " invLn", "   "},
                            {"!", "MRC", " +/- ", "Mode", "Mode X", "   "}};

        String dis = String.format("|%27s| ", update);

        System.out.println("-----------------------------");
        System.out.println(dis);
        System.out.println("-----------------------------");
        for(int i = 0; i < calc.length; i++){
            for (int j = 0; j < calc.length; j++){
                System.out.print("|" + calc[i][j]);
            }
            System.out.print("|");
            System.out.println();
            System.out.println(" - --- ----- ---- ------ ---");
        }
    }
}
