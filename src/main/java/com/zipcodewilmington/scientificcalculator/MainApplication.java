package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    private static String[] coreFunctions = {"set", "clear", "exit", "help"};
    private static String[] coreMath = {"add", "subtract", "multiply", "divide"};
//    private static String[] sciMath = {};
    private static boolean calcOn = true;

    private static String currentState = "0";
    private static String currentOperation = "none";
    private static double currentMemory = 0;
    private static String currentDisplayMode = "decimal";

    public static void main(String[] args) {
        startUpMessage(); // prints welcome message to console and awaits input

        while (calcOn == true) {
            setDisplay();
            // get operation from user input
            currentOperation = Console.getStringInput("Enter your operation: ");
            checkErrorInState();
            executeOperation(currentOperation);

            //check if currentState = "Err"
                // if true, lock calculator until currentState reset
        } // end while


    } // end main method

    public static void startUpMessage() {
        Console.println("Welcome to my CLI Calculator!");
        Console.println("\ttype 'help' for list of valid operations");
        Console.println("\ttype 'exit' to exit CLI Calculator");
        Console.getStringInput("press enter to begin");
    }

    public static void checkErrorInState() {
        if (currentState.equals("Err")) {
            setDisplay();
            Console.println("You must clear the error before continuing");
            Console.println("choose a new value to reset the number in the display");
            currentState = String.valueOf(Console.getDoubleInput("Please enter a valid number: "));
        }
    }

    public static void setDisplay() {
        String value = SciCalculator.convertNumberToMode(currentState, currentDisplayMode);
        Console.clear();
        Console.println("CLI Scientific Calculator");
        Console.println("Mode: \t\t\t\t" + currentDisplayMode);
        Console.println("Value:\t\t\t\t" + value);
        Console.println("Previous operation:\t" + currentOperation + "\n");
        // if help bool true, display more
    }

    public static void executeOperation(String operation) {
//        setDisplay(); //reset display so operation is displayed properly
        // set clear add subtract multiply divide square sqrt inverse invert_sign
        executeCoreOperation(operation);
        executeMathOperation(operation);
        executeSciOperation(operation);
    }

    public static void executeCoreOperation(String operation) {
        if (operation.equals("set")) {
            // prompt user to set currentState
            currentState = Console.getStringInput("Enter a number, x = ");
        }
        else if (operation.equals("clear")) {
            Console.clear();
        }
        else if (operation.equals("exit")) {
            calcOn = false;
        }
        else if (operation.equals("help")) {
            Console.println("\tset, clear, exit, help");
            Console.println("\tadd, subtract, multiply, divide, \n\t" +
                    "inverse, invert sign, square, sqrt, exp");
            Console.println("\tm+, mc, mrc");
            Console.println("\tdisp, disp bin, disp oct, disp dec, disp hex");
        }
        else if (operation.contains("disp")) {
            currentDisplayMode = SciCalculator.switchDisplayMode(currentDisplayMode, operation);
        }
    }

    public static void executeMathOperation(String operation) {
        double x;
        double y;

//        if (currentState.matches("[0-9]+")) {
        x = Double.valueOf(currentState);
//        }
//        else {
//            Console.println("invalid number input, try again");
//            x = Console.getDoubleInput("Enter a number, x = ");
//        }

        if (operation.equals("add")) {
            Console.println("f(y) = " + currentState + " + y");
            y = Console.getDoubleInput("y = ");
            currentState = Calculator.add(x, y);
        }
        else if (operation.equals("subtract")) {
            Console.println("f(y) = " + currentState + " - y");
            y = Console.getDoubleInput("y = ");
            currentState = Calculator.subtract(x, y);
        }
        else if (operation.equals("multiply")) {
            Console.println("f(y) = " + currentState + " * y");
            y = Console.getDoubleInput("y = ");
            currentState = Calculator.multiply(x, y);
        }
        else if (operation.equals("divide")) {
            Console.println("f(y) = " + currentState + " / y");
            y = Console.getDoubleInput("y = ");
            currentState = Calculator.divide(x, y);
        }
        else if (operation.equals("square")) {
            currentState = Calculator.square(x);
        }
        else if (operation.equals("sqrt")) {
            currentState = Calculator.sqrt(x);
        }
        else if (operation.equals("inverse")) {
            currentState = Calculator.inverse(x);
        }
        else if (operation.equals("invert sign")) {
            currentState = Calculator.invertSign(x);
        }
        else if (operation.equals("exp")) {
            Console.println("f(y) = " + currentState + "^y");
            y = Console.getDoubleInput("y = ");
            currentState = Calculator.exp(x, y);
        }
    }

    public static void executeSciOperation(String operation) {
        checkErrorInState();
        double x;
        x = Double.valueOf(currentState);

        // m+ currentMemory = currentState
        if (operation.equals("m+")) {
            Console.println(currentState + " saved to memory");
            currentMemory = Double.valueOf(currentState);
        }
        // mc currentMemory = 0
        else if (operation.equals("mc")) {
            Console.println("memory reset to zero");
            currentMemory = 0;
        }
        // mrc currentState = currentMemory
        else if (operation.equals("mrc")) {
            Console.println(currentMemory + " recalled from memory");
            currentState = String.valueOf(currentMemory);
        }
//        else if (operation.equals("m")) {
//            Console.println("Stored in memory: " + currentMemory);
//        }
        else if (operation.equals("sine")){
            currentState = SciCalculator.sine(x);
        }
        else if (operation.equals("cosine")){
            currentState = SciCalculator.cosine(x);
        }
        else if (operation.equals("tangent")){
            currentState = SciCalculator.tangent(x);
        }
        else if (operation.equals("csc")){
            currentState = SciCalculator.csc(x);
        }
        else if (operation.equals("sec")){
            currentState = SciCalculator.sec(x);
        }
        else if (operation.equals("cotan")){
            currentState = SciCalculator.cotan(x);
        }
    }

}
