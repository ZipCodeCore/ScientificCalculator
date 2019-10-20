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
        Console console = new Console();
        BasicCalculator basicCalc = new BasicCalculator();
        ScientificCalculator sciencecalc = new ScientificCalculator();
        MemoryAndSettings memoryandSettings = new MemoryAndSettings();
        Display display = new Display();

        String s = "";

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


                case "M+":
                    memoryandSettings.rememberthis();
                    break;

                case "MRC":
                    memoryandSettings.forgetthis();
                    break;

                case "MC":
                    memoryandSettings.recallthis();
                    break;

                case "settings":

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
    }
}
