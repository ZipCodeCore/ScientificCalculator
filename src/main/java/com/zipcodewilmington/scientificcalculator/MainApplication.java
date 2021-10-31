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
        while(!(s.equals("kill")){
            String s = Console.getStringInput("What do you want to do?");
            //Double d1 = Console.getDoubleInput("Enter a double.");
            //Double d2 = Console.getDoubleInput("Enter another double.");
            //Console.println("The user input %s as a string", s);
            //Console.println("The user input %s as a d", d1);
            //Console.println("The user input %s as a d", d2);
            switch (s.toLowerCase()) {
                case "current number":
                    //print current number
                    break;
                case "clear screen":
                    clearScreen();
                    break;
                case "change current number":
                    double newnum = 0;
                    //get user input;
                    display = newnum;
                    break;
                case "add":
                    double adder = 0;
                    //take user input here
                    add(adder);
                    break;
                case "subtract":
                    double subber = 0;
                    //take user input here
                    subtract(subber);
                    break;
                case "multiply":
                    double multer = 0;
                    //take user input here
                    multiply(multer);
                    break;
                case "divide":
                    //perfect spot for error testing
                    double divver = 0;
                    //take user input here
                    divide(divver);
                    break;
                case "square":
                    display*display;
                    break;
                case "square root":
                    Math.sqrt(display);
                    break;
                case "variable exponent":
                    double exponent = 0;
                    //take user input here
                    Math.pow(display,exponent);
                    break;
                case "inverse":
                    (float) 1/display;
                    break;
                case "switch display mode":
                    //how to have optional input?
                    switchDisplayMode();
                    break;
                case "binary":
                    switchDisplayMode("binary");
                    break;
                case "decimal":
                    switchDisplayMode("decimal");
                    break;
                case "octal":
                    switchDisplayMode("octal");
                    break;
                case "hexadecimal":
                    switchDisplayMode("hexadecimal");
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
                    System.println("Cannot compute. Please try again");
                    break;
            }
        }
    }
    public static void clearScreen() {}
    public static double add(double adder){return 0;}
    public static double subtract(double subber){return 0;}
    public static double multiply(double multer){return 0;}
    public static double divide(double divver){return 0;}
    //2 following functions should have OPTIONAL parameters (idk how to do this for now, but im pretty sure its possible)
    public static String switchDisplayMode(String mode){return null;}
    public static String switchUnitsMode(String mode){return null;}
    //not sure what a factorial function would take as parameter(s)
    public static double factorial(){return 0;}
}
