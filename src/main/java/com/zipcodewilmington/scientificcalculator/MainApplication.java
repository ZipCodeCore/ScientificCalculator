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
        ScientificCalculator sciencecalc = new ScientificCalculator();
        MemoryAndSettings memoryandSettings = new MemoryAndSettings();
        GetInputs getInputs = new GetInputs();
        Console console = new Console();

        String s = "";

        console.print("Welcome to my calculator!\n" +
                        "Type 'help' for list of commands.\n" +
                        "What would you like to do?");

        while (s !="exit") {

            s = console.getStringInput("");

            switch (s) {
                case "add":

                    currentDouble = getInputs.getx(currentDouble, "First number: ");
                    y = getInputs.gety(" + ");

                    basicCalc.add(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();

                    console.print(basicCalc.getStringResult());//place holder for display
                    break;

                case "subtract":

                    currentDouble = getInputs.getx(currentDouble,"First number: ");
                    y = getInputs.gety(" - ");

                    basicCalc.subtract(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();
                    console.print(basicCalc.getStringResult());//place holder for display
                    break;

                case "multiply":

                    currentDouble = getInputs.getx(currentDouble,"First Number: ");
                    y = getInputs.gety(" * ");

                    basicCalc.multiply(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();
                    console.print(basicCalc.getStringResult());//place holder for display
                    break;

                case "divide":

                    currentDouble = getInputs.getx(currentDouble,"First number");
                    y = getInputs.gety(" / ");

                    while(y == 0){
                        y = Console.getDoubleInput("Please enter a non-zero denominator: ");
                    }

                    basicCalc.divide(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();
                    console.print(basicCalc.getStringResult());//place holder for display
                    break;

                case "Sine":
                    currentDouble = getInputs.getx(currentDouble,"sine of: ");
                    sciencecalc.sine(currentDouble);
                    break;

                case "Cosine":
                    currentDouble = getInputs.getx(currentDouble,"cosine of: ");
                    sciencecalc.cosine(currentDouble);
                    break;

                case "Tangent":
                    currentDouble = getInputs.getx(currentDouble,"tangent of: ");
                    sciencecalc.tangent(currentDouble);
                    break;

                case "InverseSine":
                    currentDouble = getInputs.getx(currentDouble,"Inverse of: ");
                    sciencecalc.inverse(currentDouble);
                    break;

                case "exponent":

                    break;

                case "square":

                    break;

                case "sqrt":

                    break;

                case "inverse":

                    break;

                case "!":

                    break;

                case "M+":
                    memoryandSettings.rememberthis(currentDouble);
                    break;

                case "MRC":
                    currentDouble = memoryandSettings.getRememberedNum();
                    currentString = Double.toString(currentDouble);
                    break;

                case "MC":
                    memoryandSettings.forgetthis();
                    break;

                case "settings":
                    memoryandSettings.select();
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
            //Console.updatedisplay();

        }
        System.exit(0);
    }

}
