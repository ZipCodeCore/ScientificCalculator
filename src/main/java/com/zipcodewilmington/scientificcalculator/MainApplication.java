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
                        "What would you like to do?\n");

        while (s !="exit") {

            s = console.getStringInput("");

            switch (s) {
                case "add":

                    currentDouble = getInputs.getx(currentDouble, "First number: ");
                    currentString = Double.toString(currentDouble);
                    y = getInputs.gety(currentString + " + ");

                    basicCalc.add(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();

                    console.println(basicCalc.getStringResult());//place holder for display
                    break;

                case "subtract":

                    currentDouble = getInputs.getx(currentDouble,"First number: ");
                    currentString = Double.toString(currentDouble);
                    y = getInputs.gety(currentString + " - ");

                    basicCalc.subtract(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();
                    console.println(basicCalc.getStringResult());//place holder for display
                    break;

                case "multiply":

                    currentDouble = getInputs.getx(currentDouble,"First Number: ");
                    currentString = Double.toString(currentDouble);
                    y = getInputs.gety(currentString + " * ");

                    basicCalc.multiply(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();
                    console.println(basicCalc.getStringResult());//place holder for display
                    break;

                case "divide":

                    currentDouble = getInputs.getx(currentDouble,"First number");
                    currentString = Double.toString(currentDouble);
                    y = getInputs.gety(currentString + " / ");

                    while(y == 0){
                        y = Console.getDoubleInput("Please enter a non-zero denominator: ");
                    }

                    basicCalc.divide(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();
                    console.println(basicCalc.getStringResult());//place holder for display
                    break;

                case "Sine":
                    currentDouble = getInputs.getx(currentDouble,"sine of: ");
                    currentString = Double.toString(currentDouble);
                    sciencecalc.sine(currentDouble);
                    console.println(sciencecalc.getStringResult());
                    break;

                case "Cosine":
                    currentDouble = getInputs.getx(currentDouble,"cosine of: ");
                    currentString = Double.toString(currentDouble);
                    sciencecalc.cosine(currentDouble);
                    console.println(sciencecalc.getStringResult());
                    break;

                case "Tangent":
                    currentDouble = getInputs.getx(currentDouble,"tangent of: ");
                    currentString = Double.toString(currentDouble);
                    sciencecalc.tangent(currentDouble);
                    console.println(sciencecalc.getStringResult());
                    break;

                case "InverseSine":
                    currentDouble = getInputs.getx(currentDouble,"Inverse Sine of: ");
                    currentString = Double.toString(currentDouble);
                    sciencecalc.inverseSine(currentDouble);
                    console.println(sciencecalc.getStringResult());
                    break;

                case "InverseCosine":
                    currentDouble = getInputs.getx(currentDouble,"Inverse Cosine of: ");
                    currentString = Double.toString(currentDouble);
                    sciencecalc.inverseCosine(currentDouble);
                    console.println(sciencecalc.getStringResult());
                    break;

                case "InverseTangent":
                    currentDouble = getInputs.getx(currentDouble,"Inverse Tangent of: ");
                    currentString = Double.toString(currentDouble);
                    sciencecalc.inverseTangent(currentDouble);
                    console.println(sciencecalc.getStringResult());
                    break;
                case "exponent":

                    console.println(sciencecalc.getStringResult());

                    break;

                case "square":
                    currentDouble = getInputs.getx(currentDouble,"Square of: ");
                    currentString = Double.toString(currentDouble);
                    sciencecalc.square(currentDouble);
                    console.println(sciencecalc.getStringResult());
                    break;

                case "sqrt":
                    currentDouble = getInputs.getx(currentDouble,"Square root of: ");
                    currentString = Double.toString(currentDouble);
                    sciencecalc.squareRoot(currentDouble);
                    console.println(sciencecalc.getStringResult());
                    break;

                case "inverse":
                    currentDouble = getInputs.getx(currentDouble,"Inverse of: ");
                    currentString = Double.toString(currentDouble);
                    sciencecalc.inverse(currentDouble);
                    console.println(sciencecalc.getStringResult());
                    break;

                case "!":
                    currentDouble = getInputs.getx(currentDouble,"Factorial of: ");
                    currentString = Double.toString(currentDouble);
                    sciencecalc.factorial(currentDouble);
                    console.println(sciencecalc.getStringResult());
                    break;

                case "M+":
                    memoryandSettings.rememberthis(currentDouble);
                    break;

                case "MRC":
                    currentDouble = memoryandSettings.getRememberedNum();
                    currentString = Double.toString(currentDouble);
                    console.println(currentDouble + " was recalled.");
                    break;

                case "MC":
                    memoryandSettings.forgetthis();
                    break;

                case "settings":
                    memoryandSettings.select();
                    break;

                case "clear":
                    currentDouble = 0.0;
                    currentString = "0";
                    break;

                case "exit":
                    s = "exit";
                    break;

                default:

                    try {
                        currentDouble = Double.valueOf(s);
                        currentString = Double.toString(currentDouble);
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
