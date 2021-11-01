package com.zipcodewilmington.scientificcalculator;

import java.util.Locale;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static double display = 0; //ie current number
    public static String unitsMode = "degrees";
    public static String displayMode = "decimal";
    public static double memory = 0;
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        //THINGS TO ADD STILL: EXCEPTION/ERROR HANDLING FORCING A CLEAR;
        String s = "";
        while(!(s.equals("kill"))){
            s = Console.getStringInput("What do you want to do?");
            switch (s.toLowerCase()) {
                case "current number":
                    Console.println("The current number is: %s",displayPrint(display));
                    break;
                case "clear screen":
                    clearScreen();
                    break;
                case "change current number":
                    display = Console.getDoubleInput("Give me a new current number");
                    Console.println("The new number is %s.",displayPrint(display));
                    break;
                case "add":
                    double adder = Console.getDoubleInput("Give me the number to add to the display");
                    Console.println("The sum of %s and %s is %s.",displayPrint(display),displayPrint(adder),displayPrint(add(adder)));
                    break;
                case "subtract":
                    double subber = Console.getDoubleInput("Give me the number to subtract from the display");
                    Console.println("The difference of %s and %s is %s.",displayPrint(display),displayPrint(subber),displayPrint(subtract(subber)));
                    break;
                case "multiply":
                    double multer = Console.getDoubleInput("Give me the number to multiply the display by");
                    Console.println("The product of %s and %s is %s.",displayPrint(display),displayPrint(multer),displayPrint(multiply(multer)));
                    break;
                case "divide":
                    //perfect spot for error testing
                    double divver = Console.getDoubleInput("Give me the number to divide the display by");
                    Console.println("The quotient of %s and %s is %s.",displayPrint(display),displayPrint(divver),displayPrint(divide(divver)));
                    break;
                case "square":
                    Console.println("The square of %s is %s.",displayPrint(display),displayPrint(display * display));
                    break;
                case "square root":
                    Console.println("The square root of %s is %s.",displayPrint(display),displayPrint(Math.sqrt(display)));
                    break;
                case "variable exponent":
                    double exponent = Console.getDoubleInput("What power should I raise the display to?");
                    Console.println("%s to the %sth power is %s",displayPrint(display),displayPrint(exponent),displayPrint(Math.pow(display,exponent)));
                    break;
                case "inverse":
                    Console.println("The inverse of %s is %s",displayPrint(display), displayPrint((float) (1/ display)));
                    break;
                case "negate":
                    Console.println("The display number of %s has been negated to %s ",displayPrint(display),displayPrint(display * -1));
                case "switch display mode":
                    Console.println("The display mode is now: %s",switchDisplayMode());
                    Console.println("Loss of data is possible if you switch display modes, input data must be decimal");
                    break;
                case "binary":
                    Console.println("The display mode is now: %s",switchDisplayMode("binary"));
                    Console.println("Loss of data is possible if you switch display modes, input data must be decimal");
                    break;
                case "decimal":
                    Console.println("The display mode is now: %s",switchDisplayMode("decimal"));
                    Console.println("Loss of data is possible if you switch display modes, input data must be decimal");
                    break;
                case "octal":
                    Console.println("The display mode is now: %s",switchDisplayMode("octal"));
                    Console.println("Loss of data is possible if you switch display modes, input data must be decimal");
                    break;
                case "hexadecimal":
                    Console.println("The display mode is now: %s",switchDisplayMode("hexadecimal"));
                    Console.println("Loss of data is possible if you switch display modes, input data must be decimal");
                    break;
                case "add to memory":
                    memory = Console.getDoubleInput("Give me the number to memorize");
                    Console.println("The new memorized number is %s.",displayPrint(memory));
                    break;
                case "clear memory":
                    memory = 0;
                    break;
                case "recall memory":
                    Console.println("The memorized number is %s.",displayPrint(memory));
                    break;
                case "sin":
                    Console.println("The sine of %s is %s", displayPrint(display),displayPrint(Math.sin(unitter(display))));
                    break;
                case "cos":
                    Console.println("The cosine of %s is %s", displayPrint(display),displayPrint(Math.cos(unitter(display))));
                    break;
                case "tan":
                    Console.println("The tangent of %s is %s", displayPrint(display),displayPrint(Math.tan(unitter(display))));
                    break;
                case "inv sin":
                    Console.println("The inverse sine of %s is %s", displayPrint(display),displayPrint( (float)(1 / (Math.sin(unitter(display))))));
                    break;
                case "inv cos":
                    Console.println("The inverse cosine of %s is %s", displayPrint(display),displayPrint( (float)(1 / (Math.cos(unitter(display))))));
                    break;
                case "inv tan":
                    Console.println("The inverse tangent of %s is %s", displayPrint(display),displayPrint( (float)(1 / (Math.tan(unitter(display))))));
                    break;
                case "switch units mode":
                    Console.println("The units mode is now: %s",switchUnitsMode());
                    break;
                case "radians":
                    Console.println("The units mode is now: %s",switchUnitsMode("radians"));
                    break;
                case "degrees":
                    Console.println("The units mode is now: %s",switchUnitsMode("degrees"));
                    break;
                case "log":
                    Console.println("The log of %s is %s.",displayPrint(display),displayPrint(Math.log10(display)));
                    break;
                case "inv log":
                    Console.println("The inv log of %s is %s.",displayPrint(display),displayPrint(Math.pow(10,display)));
                    break;
                case "ln":
                    Console.println("The natural log of %s is %s.",displayPrint(display),displayPrint(Math.log(display)));
                    break;
                case "inv ln":
                    Console.println("The inv natural log of %s is %s.",displayPrint(display),displayPrint(Math.exp(display)));
                    break;
                case "factorial":
                    Console.println("The factorial of %s is %s.",displayPrint(display),displayPrint(factorial()));
                    break;
                    //extra function #1
                case "absolute value":
                    Console.println("The square of %s is %s.",displayPrint(display),displayPrint(Math.abs(display)));
                    break;
                    //extra function #2
                case "kill":
                    Console.println("The calculator will now exit...");
                    break;
                default:
                    Console.println("Cannot compute. Please try again");
                    break;
            }
        }
    }
    //I have no idea if this will work or not
    public static void clearScreen() {
        try{
            Runtime.getRuntime().exec("clear");
        }
        catch (final Exception e){
            System.exit(1);
        }
    }
    public static double add(double adder){
        return display + adder;
    }
    public static double subtract(double subber){
        return display - subber;
    }
    public static double multiply(double multer){
        return display * multer;
    }
    public static double divide(double divver){
        return display / divver;
    }
    public static String switchDisplayMode(){
        switch(displayMode){
            case "decimal":
                displayMode = "hexadecimal";
                return displayMode;
            case "hexadecimal":
                displayMode = "binary";
                return displayMode;
            case "binary":
                displayMode = "octal";
                return displayMode;
            case "octal":
                displayMode = "decimal";
                return displayMode;
            default:
                displayMode = "This should never be returned";
                return displayMode;
        }
    }
    public static String switchDisplayMode(String mode){
        switch(mode){
            case "decimal":
                displayMode = "decimal";
                return displayMode;
            case "hexadecimal":
                displayMode = "hexadecimal";
                return displayMode;
            case "binary":
                displayMode = "binary";
                return displayMode;
            case "octal":
                displayMode = "octal";
                return displayMode;
            default:
                displayMode = "This should never be returned";
                return displayMode;
        }
    }
    /**
    public static String displayPrint(int original){
        switch(displayMode){
            case "decimal":
                return Integer.valueOf(original).toString();
            case "hexadecimal":
                return Integer.toHexString(original);
            case "binary":
                return Integer.toBinaryString(original);
            case "octal":
                return Integer.toOctalString(original);
    }
     */
    public static String displayPrint(float original){
        int binoct = Math.toIntExact(Float.valueOf(original).longValue());
        switch(displayMode){
            case "decimal":
                return Float.valueOf(original).toString();
            case "hexadecimal":
                return Float.toHexString(original);
            case "binary":
                return Integer.toBinaryString(binoct);
            case "octal":
                return Integer.toOctalString(binoct);
            default:
                return "This should never be returned";
        }
    }
    public static String displayPrint(double original){
        //LOSS OF DATA IS POSSIBLE HERE
        int binoct = Math.toIntExact(Double.valueOf(original).longValue());
        switch(displayMode){
            case "decimal":
                return Double.valueOf(original).toString();
            case "hexadecimal":
                return Double.toHexString(original);
            case "binary":
                return Integer.toBinaryString(binoct);
            case "octal":
                return Integer.toOctalString(binoct);
            default:
                return "This should never be returned";
        }
    }
    public static double unitter(double angle) {
        if(unitsMode.equals("degrees")){
            return Math.toRadians(angle);
        }
        else{
            return angle;
        }
    }
    public static String switchUnitsMode(){
        if(unitsMode.equals("degrees")){
            unitsMode = "radians";
            return unitsMode;
        }
        else if (unitsMode.equals("radians")){
            unitsMode = "degrees";
        }
        return unitsMode;
    }

    public static String switchUnitsMode(String mode){
        if(mode.equals("degrees")){
            unitsMode = "degrees";
        }
        else if (mode.equals("radians")){
            unitsMode = "radians";
        }
        return unitsMode;
    }
    //not sure what a factorial function would take as parameter(s)
    public static double factorial(){
        double factoria = 0;
        for(int i = 1; i <= display;i++){
            factoria = factoria * i;
        }
        return factoria;
    }
}
