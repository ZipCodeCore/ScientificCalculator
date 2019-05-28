package com.zipcodewilmington.scientificcalculator;

import javax.sound.midi.Soundbank;
import java.util.SortedMap;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {



    public static void main(String[] args) {

//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);


      //  run.runner();

        run();
    }

    public static void run() {
        System.out.println("\nWelcome To Our Calculator\n");
        Calculator calc = new Calculator();
        ScientificCalculator scientific = new ScientificCalculator();
        String mode = "core";
        mainScreen(mode);
        String input = Console.getStringInput("Enter x y operator or a menu command to begin\n");
        while (!input.equals("q")){
            switch (input) {
                case "q" :
                    break;
                case "clear":
                    calc = new Calculator();
                    scientific = new ScientificCalculator();
                    break;
                case "m" :
                    //add shenanigans
                    printOptions(mode);
                    break;
                case "sci":
                    mode = "sci";
                    break;
                case "core":
                    mode = "core";
                    break;
                default:
                    parseInput(mode, input, calc, scientific);
                    break;
            }
            if (mode.equals("sci")) {
                System.out.println(scientific.getSciState());
            } else {
                System.out.println(calc.getState());
            }

            mainScreen(mode);
            input = Console.getStringInput("Enter x y operator or a menu command to begin");
        }



    }

    public static void parseInput(String mode, String input, Calculator calc, ScientificCalculator scientific) {
        String[] inputList = input.split(" ");
        int length = inputList.length;

        if (length > 3) {
            System.out.println("Invalid input. Reformat or press [m] to see options");
        } else{
            if (mode.equals("sci")) {
                scientific.parse(inputList);
            }
            else
                calc.parse(inputList);
        }

    }

    public static void mainScreen(String mode) {
        System.out.println("Mode = " + mode);
        if(mode.equals("core"))
            System.out.println("Switch mode: [core] sci");
        else
            System.out.println("Switch mode: core [sci]");
        System.out.println("See operators [m]");
        System.out.println("Quit [q]\n");
    }

    public static void printOptions(String mode) {
        System.out.println("------Core Mode------ \n" + "Available Operations: " + "" +
                "| Add: + |  Subtract: - | Multiply: * | Divide: / | Square Root: sqrt | Square: sq | Exponent: exp | Inverse: inv | Negate: neg | Clear: clear\n" );
        if (mode.equals("sci")) {
            System.out.println("------Scientific Mode------ \n" + "Bonus Operations: \n " +
                    "Sine: sin |  Cosine: cos | Tangent: tan | ArcSin: asin | ArcCos: acos | ArcTan: atan | \n" + " Log: log | Inverse Log: invog | Natual Log: ln | Inverse Natual: invln | Factorial: factorial | Clear: clear\n" );
            System.out.println("See different bases [base]");

        }
    }
}
