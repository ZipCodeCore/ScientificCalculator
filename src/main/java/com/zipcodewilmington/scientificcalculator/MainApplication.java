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
        //THINGS TO ADD STILL: NEGATIVE/POSITIVE; EXCEPTION/ERROR HANDLING FORCING A CLEAR;
        //STANDARDIZE THE PRINTING FORMAT FOR WHEN ANSWERS GET PUMPED OUT
        //Negative (Math.negateExact()?)
        String s = "";
        //
        while(!(s.equals("kill"))){
            s = Console.getStringInput("What do you want to do?");
            //Double d1 = Console.getDoubleInput("Enter a double.");
            //Double d2 = Console.getDoubleInput("Enter another double.");
            //Console.println("The user input %s as a string", s);
            switch (s.toLowerCase()) {
                case "current number":
                    Console.println("The current number is: %s",display);
                    //print current number
                    break;
                case "clear screen":
                    clearScreen();
                    break;
                case "change current number":
                    display = Console.getDoubleInput("Give me a new current number");
                    Console.println("The new number is %s.",display);
                    break;
                case "add":
                    double adder = Console.getDoubleInput("Give me the number to add to the display");
                    Console.println("The sum of %s and %s is %s.",display,adder,add(adder));
                    break;
                case "subtract":
                    double subber = Console.getDoubleInput("Give me the number to subtract from the display");
                    Console.println("The difference of %s and %s is %s.",display,subber,subtract(subber));
                    break;
                case "multiply":
                    double multer = Console.getDoubleInput("Give me the number to multiply the display by");
                    Console.println("The product of %s and %s is %s.",display,multer,multiply(multer));
                    break;
                case "divide":
                    //perfect spot for error testing
                    double divver = Console.getDoubleInput("Give me the number to divide the display by");
                    Console.println("The quotient of %s and %s is %s.",display,divver,divide(divver));
                    break;
                case "square":
                    Console.println("The square of %s is %s.",display,display * display);
                    break;
                case "square root":
                    Console.println("The square root of %s is %s.",display,Math.sqrt(display));
                    break;
                case "variable exponent":
                    double exponent = Console.getDoubleInput("What power should I raise the display to?");
                    Console.println("%s to the %sth power is %s",display,exponent,Math.pow(display,exponent));
                    break;
                case "inverse":
                    Console.println("The inverse of %s is %s",display,(float) (1/ display));
                    break;
                case "switch display mode":
                    //how to have optional input? (TRYING OVERLOADING)
                    Console.println("The display mode is now: %s",switchDisplayMode());
                    break;
                case "binary":
                    Console.println("The display mode is now: %s",switchDisplayMode("binary"));
                    break;
                case "decimal":
                    Console.println("The display mode is now: %s",switchDisplayMode("decimal"));
                    break;
                case "octal":
                    Console.println("The display mode is now: %s",switchDisplayMode("octal"));
                    break;
                case "hexadecimal":
                    Console.println("The display mode is now: %s",switchDisplayMode("hexadecimal"));
                    break;
                case "add to memory":
                    //have prompts here or in memorize
                    double memorize = 0;
                    //get user input here
                    memory = memorize;
                    break;
                case "clear memory":
                    memory = 0;
                    break;
                case "recall memory":
                    //print memory here
                    break;
                case "sin":
                    Math.sin(display);
                    break;
                case "cos":
                    Math.cos(display);
                    break;
                case "tan":
                    Math.tan(display);
                    break;
                case "inv sin":
                    1 / Math.sin(display);
                    break;
                case "inv cos":
                    1 / Math.cos(display);
                    break;
                case "inv tan":
                    1 / Math.tan(display);
                    break;
                case "switch units mode":
                    switchUnitsMode();
                    break;
                case "radians":
                    switchUnitsMode("radians");
                    break;
                case "degrees":
                    switchUnitsMode("degrees");
                    break;
                case "log":
                    Math.log10(display);
                    break;
                case "inv log":
                    Math.pow(10,display);
                    break;
                case "ln":
                    Math.log(display);
                    break;
                case "inv ln":
                    Math.exp(display);
                    break;
                case "factorial":
                    //there was no readily available factorial function I could find; for now we make our own
                    factorial();
                    break;
                case "absolute value":
                    Math.abs(display);
                    break;
                case "kill":
                    //Print kill message
                    break;
                default:
                    Console.println("Cannot compute. Please try again");
                    break;
            }
        }
    }
    //I have no idea if this will work or not
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
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
    public static String displayPrint(String original){
        switch(displayMode){
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

    public static String switchUnitsMode(String mode){return null;}
    //not sure what a factorial function would take as parameter(s)
    public static double factorial(){return 0;}
}
