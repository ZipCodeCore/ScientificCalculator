package com.zipcodewilmington.scientificcalculator;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    private String currentMode = "binary";
    private String currentUnit = "degrees";


    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);


    }

    //Following methods take a value (num1) for the log equations.
    //Logarithms
    public static double logarithm(double num1) {
        double newNum = Math.log10(num1);
        System.out.println(newNum);
        return newNum;
    }
    //Inverted Logs
    public double invLog(double num1) {
        double newNum = Math.pow(10,num1);
        System.out.println(newNum);
        return newNum;
    }
    //Natural Logs
    public double natLog(double num1) {
        double newNum = Math.log(num1);
        System.out.println(newNum);
        return newNum;
    }
    //Inverted Natural Logs
    public double invNatLog(double num1) {
        double newNum = Math.pow(Math.E,num1);
        System.out.println(newNum);
        return newNum;
    }


    //DISPLAY CHANGES

    public void getMode() {
        System.out.println(currentMode);
    }
    //public void setMode(String newMode){currentMode = newMode;}

    public String switchDisplayMode(){
        if (currentMode.equals("binary")) {
            currentMode = "octal";
            System.out.println("octal");
        } else if (currentMode.equals("octal")) {
            currentMode = "decimal";
            System.out.println("decimal");
        } else if (currentMode.equals("decimal")) {
            currentMode = "hexadecimal";
            System.out.println("hexadecimal");
        } else if (currentMode.equals("hexadecimal")) {
            currentMode = "binary";
            System.out.println("binary");
        } else System.out.println("Err");

    return currentMode;
    }

    public String switchDisplayMode(String mode) {
        if (mode.equals("binary")) {
            currentMode = "binary";
        } else if (mode.equals("octal")) {
            currentMode = "octal";
        } else if (mode.equals("decimal")) {
            currentMode = "decimal";
        } else if (mode.equals("hexadecimal")) {
            currentMode = "hexadecimal";
        } else mode = "Err";
        System.out.println(mode);
        return mode;
    }

    //UNIT CHANGES

    public void getUnit() {
        System.out.println(currentUnit);
    }

    public String switchUnitsMode(){
        if (currentUnit.equals("degrees")) {
            currentUnit = "radians";
            System.out.println("radians");
        } else if (currentUnit.equals("radians")) {
            currentUnit = "degrees";
            System.out.println("degrees");
        } else System.out.println("Err");

        return currentUnit;
    }

    public String switchUnitsMode(String mode) {
        if (mode.equals("degrees")) {
            currentUnit = "degrees";
        } else if (mode.equals("radians")) {
            currentUnit = "radians";
        } else mode = "Err";
            System.out.println(mode);
        return mode;
    }




}
