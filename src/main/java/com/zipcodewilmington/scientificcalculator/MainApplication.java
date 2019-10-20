package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        //initial setup of fields
        Double currentDouble = 0.00;
        String currentString = "";
        Double y;

        //creating instances of classes
        BasicCalculator basicCalc = new BasicCalculator();
        //ScientificCalculator sciencecalc = new ScientificCalculator();
        MemoryAndSettings memoryandSettings = new MemoryAndSettings();
        Console console = new Console();

        String s = "";

        console.print("Welcome to my calculator!\n" +
                        "Type 'help' for list of commands.\n" +
                        "What would you like to do?");

        while (s !="exit") {
            s = console.getStringInput("");

            switch (s) {
                case "add":
                    if (currentDouble == 0) {
                        currentDouble = Console.getDoubleInput("First number: ");
                    }
                    y = Console.getDoubleInput(currentDouble + " + ");

                    basicCalc.add(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();

                    console.print(basicCalc.getStringResult());//place holder for display
                    break;

                case "subtract":
                    if (currentDouble == 0) {
                        currentDouble = Console.getDoubleInput("First number: ");
                    }
                    y = Console.getDoubleInput(currentDouble + " - ");

                    basicCalc.subtract(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();
                    console.print(basicCalc.getStringResult());//place holder for display
                    break;

                case "multiply":
                    if (currentDouble == 0) {
                        currentDouble = Console.getDoubleInput("First number: ");
                    }
                    y = Console.getDoubleInput(currentDouble + " * ");

                    basicCalc.multiply(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();
                    console.print(basicCalc.getStringResult());//place holder for display
                    break;

                case "divide":

                    if (currentDouble == 0) {
                        currentDouble = Console.getDoubleInput("First number: ");
                    }

                    y = Console.getDoubleInput(currentDouble + " / ");
                    while(y == 0){
                        y = Console.getDoubleInput("Please enter a non-zero denominator: ");
                    }

                    basicCalc.divide(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();
                    console.print(basicCalc.getStringResult());//place holder for display
                    break;


                case "M+":
                    memoryandSettings.rememberthis(currentDouble);
                    break;

                case "MRC":
                    memoryandSettings.forgetthis();
                    break;

                case "MC":
                    memoryandSettings.setRememberedNum(0.0);
                    memoryandSettings.setRememberedStr("0");
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
            //display.updatedisplay();

        }
        System.exit(0);
    }



}
