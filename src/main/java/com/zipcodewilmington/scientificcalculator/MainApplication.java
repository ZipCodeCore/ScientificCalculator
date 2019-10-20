package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        //initial setup of fields
        Double currentDouble = 0.00;
        String currentString = "";

        //creating instances of classes
        BasicCalculator basicCalc = new BasicCalculator();
        Console console = new Console();
        Display display = new Display();

        String s = "add";

        console.print("Welcome to my calculator!\n" +
                        "Type 'help' for list of commands.\n" +
                        "What would you like to do?");

        while (s !="exit") {
            s = console.getStringInput("");

            switch (s) {
                case "add":
                    basicCalc.add(currentDouble);
                    currentDouble = basicCalc.getDoubleResult();
                    console.print(basicCalc.getStringResult());//place holder for display
                    break;

                case "subtract":
                    basicCalc.subtract(currentDouble);
                    currentDouble = basicCalc.getDoubleResult();
                    console.print(basicCalc.getStringResult());//place holder for display
                    break;

                case "multiply":
                    basicCalc.multiply(currentDouble);
                    currentDouble = basicCalc.getDoubleResult();
                    console.print(basicCalc.getStringResult());//place holder for display
                    break;

                case "divide":
                    basicCalc.divide(currentDouble);
                    currentDouble = basicCalc.getDoubleResult();
                    console.print(basicCalc.getStringResult());//place holder for display
                    break;


                case "exit":
                    s = "exit";
                    break;

                default:

                    try {
                        currentDouble = Double.valueOf(s);
                    } catch (Exception e) {
                        console.print("I do not understand.");
                    }
                    break;

            }

            //currently empty method
            display.updatedisplay();

        }
        System.exit(0);
        /*
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
         */
    }
}
